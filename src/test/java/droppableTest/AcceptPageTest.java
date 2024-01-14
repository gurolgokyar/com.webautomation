package droppableTest;

import baseTest.Hooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Pages;

import static org.testng.Assert.*;


public class AcceptPageTest extends Hooks {

	Pages pages = new Pages();

	@BeforeMethod
	public void navigateToAcceptPage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnDroppableLink();
		pages.getDroppablePage().clickOnAcceptLink();
	}

	@AfterMethod
	void navigateToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void testUnDroppableBox() {
		pages.getAcceptPage().dragUnDroppableBox();

		String messageInBigBox = pages.getAcceptPage().getTextInBigBox();

		assertEquals("accept: '#draggable'", messageInBigBox, "The message in the big box is not as expected!");
	}

	@Test
	void testDroppableBox() {
		pages.getAcceptPage().dragDroppableBox();

		String messageInBigBox = pages.getAcceptPage().getTextInBigBox();

		assertEquals("Dropped!", messageInBigBox, "The message in the big box is not as expected!");
	}

}
