package progressbar;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadDialogPageTest extends Hooks {

	@BeforeMethod
	void navigateToDownloadDialogPage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnTheProgressbarLink();
		pages.getProgressbarPage().clickOnTheDownLoadDialogLink();
	}

	@AfterMethod
	void goToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void isDownloadingFrameVisibleTest() {
		// Click on the Start Download button
		pages.getDownLoadDialogPage().clickOnTheStartDownloadButton();

		// Click on the start download button
		pages.getDownLoadDialogPage().clickOnTheStartDownloadButton();

		// Verify the downloading frame is visible
		boolean isVisible = pages.getDownLoadDialogPage().isDownloadFrameVisible();
		Assert.assertTrue(isVisible, "Downloading frame is not visible!");
	}

	@Test
	void isDownloadingProgressValueValidTest() {
		// Click on the Start Download button
		pages.getDownLoadDialogPage().clickOnTheStartDownloadButton();

		// Click on the start download button
		pages.getDownLoadDialogPage().clickOnTheStartDownloadButton();

		boolean isCurrentValueValid = pages.getDownLoadDialogPage().isDownloadingProgressValueValid();
		Assert.assertTrue(isCurrentValueValid, "Invalid current downloading value!");
	}

}
