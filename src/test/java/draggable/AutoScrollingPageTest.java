package draggable;

import baseTest.Hooks;
import org.testng.asserts.SoftAssert;
import utils.Pages;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AutoScrollingPageTest extends Hooks {

	Pages pages = new Pages();

	@Test
	void testAutoScrollingDraggable() {
		SoftAssert softAssertions = new SoftAssert();

		pages.getWebautomationPage().clickOnDraggableLink();

		pages.getDraggablePage().clickOnAutoScrollingButton();

		pages.getAutoScrollingPage().dragAndDrop(pages.getAutoScrollingPage().getFirstDraggable(), 215, 0);
		pages.getAutoScrollingPage().dragAndDrop(pages.getAutoScrollingPage().getThirdDraggable(), -215, 0);

		int finalX1 = pages.getAutoScrollingPage()
			.getLocalOfDraggableX(pages.getAutoScrollingPage().getFirstDraggable());
		int finalX2 = pages.getAutoScrollingPage()
			.getLocalOfDraggableX(pages.getAutoScrollingPage().getSecondDraggable());
		int finalX3 = pages.getAutoScrollingPage()
			.getLocalOfDraggableX(pages.getAutoScrollingPage().getThirdDraggable());

		// You can not use SoftAssertion methods here
		softAssertions.assertTrue(finalX1 > finalX2);
		softAssertions.assertTrue(finalX2 > finalX3);

		softAssertions.assertAll();
	}

}
