package draggable;

import baseTest.Hooks;
import org.testng.asserts.SoftAssert;
import utils.Pages;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ConstantMovementPageTest extends Hooks {

	Pages pages = new Pages();

	SoftAssert softAssertions = new SoftAssert();

	@Test
	public void testConstantMovementPage() throws InterruptedException {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnDraggableLink();
		pages.getDraggablePage().clickOnTheConstantButton();

		// Firstly find if the draggable1's x-coordinate is same after attempted to drag
		// right
		int initialX = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getDraggable1());

		pages.getConstantMovementPage().dragAndDrop(pages.getConstantMovementPage().getDraggable1(), 10, 0);

		int finalX = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getDraggable1());

		softAssertions.assertEquals(initialX, finalX, "1");

		// Find if draggable2's y-coordinate is same after attempted to grag down
		int initialY = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getDraggable2());

		pages.getConstantMovementPage().dragAndDrop(pages.getConstantMovementPage().getDraggable1(), 0, 10);

		int finalY = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getDraggable2());

		softAssertions.assertEquals(finalY, initialY, "2");

		// find if draggable3 is already in the biggestBox after attempted to drag that
		// out of bounds
		int widthOfBiggestBox = pages.getConstantMovementPage().getBiggestBox().getSize().getWidth();
		int heightOfBiggestBox = pages.getConstantMovementPage().getBiggestBox().getSize().getHeight();

		// actions.keyDown(Keys.PAGE_DOWN).release().perform();
		// Thread.sleep(5000);
		pages.getConstantMovementPage()
			.dragAndDrop(pages.getConstantMovementPage().getDraggable3(), -30, -50);

		int XOfBiggestBox = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getBiggestBox());

		int finalXOfDraggable3 = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getDraggable3());

		softAssertions.assertTrue(XOfBiggestBox < finalXOfDraggable3, "3");

		int YOfBiggestBox = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getBiggestBox());

		int finalYOfDraggable3 = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getDraggable3());

		softAssertions.assertTrue(YOfBiggestBox < finalYOfDraggable3, "4");

		// Normally we should attempt drag the draggable3 to right and low

		// Now let's find if draggable4 is already inside the draggable5 after attempted
		// to drag out of bounds
		int widthOfDraggable5 = pages.getConstantMovementPage().getDraggable5().getSize().getWidth();
		int heightOfDraggable5 = pages.getConstantMovementPage().getDraggable5().getSize().getHeight();
		int widthOfDraggable4 = pages.getConstantMovementPage().getDraggable4().getSize().getWidth();

		// Drag the element right and up
		Thread.sleep(2000);
		pages.getConstantMovementPage()
			.dragAndDrop(pages.getConstantMovementPage().getDraggable4(), -widthOfDraggable5, -heightOfDraggable5);

		int finalXOfDraggable4 = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getDraggable4()) + widthOfDraggable4;
		int XOfDraggable5 = pages.getConstantMovementPage()
			.getLocateOfDraggableX(pages.getConstantMovementPage().getDraggable5()) + widthOfDraggable5;

		softAssertions.assertTrue(XOfDraggable5 > finalXOfDraggable4, "5");

		int finalYOfDraggable4 = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getDraggable4());
		int upperYOfDraggable5 = pages.getConstantMovementPage()
			.getLocateOfDraggableY(pages.getConstantMovementPage().getDraggable5());

		softAssertions.assertTrue(upperYOfDraggable5 < finalYOfDraggable4, "6");

		softAssertions.assertAll();
	}

}
