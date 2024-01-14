package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

public class IframePage {

	@FindBy(linkText = "Normal Iframe")
	private WebElement normalIframeLink;

	@FindBy(linkText = "Nested Iframe")
	private WebElement nestedIframeLink;

//	public void clickOnNormalIframeLink() {
//		BrowserUtils.scrollDownWithPageUp();
//		BrowserUtils.wait(1);
//		normalIframeLink.click();
//	}

	public void clickOnNestedIframeLink() {
		BrowserUtils.scrollDownWithPageUp();
		BrowserUtils.wait(1);
		nestedIframeLink.click();
	}

}
