package iframe;

import baseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NormalIframePageTest extends Hooks {

	@Test
	void isNormalIFrameVisible() {
		// Navigate to WeborderHomePage
		pages.getHomePage().clickWebAutomation();

		// Go to normal iframe
		pages.getWebautomationPage().clickOnTheIframeLink();

		// click on the normal iframe link
		//pages.getIframePage().clickOnNormalIframeLink();

		// Switch to normal iframe
		// verify the normal iframe is visible
		String actualLinkText = pages.getNormalIframePage().getLinkText();

		String expectedLinkText = "More information...";

		assertEquals(expectedLinkText, actualLinkText, "Wrong link text and the normal iframe is not visible!");
	}

}
