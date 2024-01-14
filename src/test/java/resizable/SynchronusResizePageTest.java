package resizable;

import baseTest.Hooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SynchronusResizePageTest extends Hooks {

	int initialWidthOfResizeable1, initialHeightOfResizeable1;

	int finalWidthOfResizeable1, finalHeightOfResizeable1;

	int initialWidthOfResizeable2, initialHeightOfResizeable2;

	int finalWidthOfResizeable2, finalHeightOfResizeable2;

	@BeforeMethod
	void navigateToSynchronusResizePage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnResizeableLink();
		pages.getResizeablePage().clickOnSynchronusResizeLink();
	}

	@AfterMethod
	void navigateToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void testResizeResizeable1WithItsRightEdge() {
		initialWidthOfResizeable1 = pages.getSynchronusResizePage().getWidthOfResizeable1();

		pages.getSynchronusResizePage().setWidthOfResizeable1(30, 0);

		finalWidthOfResizeable1 = pages.getSynchronusResizePage().getWidthOfResizeable1();

		assertTrue(finalWidthOfResizeable1 > initialWidthOfResizeable1, "Size of resizeable1 should grow in length");

	}

	@Test
	void testWidthOfResizeable2WhenResizeable1GrowedInWidth() {
		initialWidthOfResizeable2 = pages.getSynchronusResizePage().getWidthOfResizeable2();

		pages.getSynchronusResizePage().setWidthOfResizeable1(30, 0);

		finalWidthOfResizeable2 = pages.getSynchronusResizePage().getWidthOfResizeable2();

		assertTrue(finalWidthOfResizeable2 > initialWidthOfResizeable2, "Size of resizeable2 should grow in length");
	}

	@Test
	void testResizeResizeable1WithItsBottomEdge() {
		initialHeightOfResizeable1 = pages.getSynchronusResizePage().getHeightOfResizeable1();

		pages.getSynchronusResizePage().setHeightOfResizeable1(0, 30);

		finalHeightOfResizeable1 = pages.getSynchronusResizePage().getHeightOfResizeable1();

		assertTrue(finalHeightOfResizeable1 > initialHeightOfResizeable1, "Size of resizeable1 should grow in height");
	}

	@Test
	void testHeightOfResizeable2WhenResizeable1GrowedInHeight() {
		initialHeightOfResizeable2 = pages.getSynchronusResizePage().getHeightOfResizeable2();

		pages.getSynchronusResizePage().setHeightOfResizeable1(0, 30);

		finalHeightOfResizeable2 = pages.getSynchronusResizePage().getHeightOfResizeable2();

		assertTrue(finalHeightOfResizeable2 > initialHeightOfResizeable2, "Size of resizeable2 should grow in height");
	}

}
