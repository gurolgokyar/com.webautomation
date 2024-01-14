package pages.resizeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ResizeablePage extends BasePage {

	@FindBy(linkText = "Synchronus Resize")
	private WebElement synchronusResizeLink;

	@FindBy(linkText = "Textarea")
	private WebElement textAreaLink;

	public void clickOnSynchronusResizeLink() {
		synchronusResizeLink.click();
	}

	public void clickOnTextAreaLink() {
		textAreaLink.click();
	}

}
