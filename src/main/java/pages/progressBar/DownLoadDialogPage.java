package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.BrowserUtils;

public class DownLoadDialogPage extends BasePage {

	@FindBy(id = "downloadButton-download-dialog")
	private WebElement startDownloadButton;

	@FindBy(id = "ui-id-82")
	private WebElement downloadingFrame;

	@FindBy(id = "progressbar-download-dialog")
	private WebElement downloadingProgress;

	public void clickOnTheStartDownloadButton() {
		startDownloadButton.click();
	}

	public boolean isDownloadFrameVisible() {
		try {
			wait.until(ExpectedConditions.visibilityOf(downloadingFrame));
			wait.until(ExpectedConditions.invisibilityOf(downloadingFrame));
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}

	public boolean isDownloadingProgressValueValid() {
		BrowserUtils.wait(3);
		int valueNow = Integer.parseInt(downloadingProgress.getAttribute("aria-valuenow"));
		return valueNow >= 0 && valueNow <= 100;
	}

}
