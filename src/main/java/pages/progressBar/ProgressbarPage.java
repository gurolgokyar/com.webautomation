package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ProgressbarPage extends BasePage {

	@FindBy(linkText = "Download Dialog")
	private WebElement downloadDialogLink;

	public void clickOnTheDownLoadDialogLink() {
		downloadDialogLink.click();
	}

}
