package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.Driver;

public class NormalIframePage extends BasePage {

	@FindBy(id = "nestedIframe")
	private WebElement iframe;

	@FindBy(linkText = "More information...")
	private WebElement moreInformationLink;

	public void switchToIframe() {
		DRIVER.switchTo().frame(iframe);
	}

	public String getLinkText() {
		switchToIframe();
		return moreInformationLink.getText();
	}

}
