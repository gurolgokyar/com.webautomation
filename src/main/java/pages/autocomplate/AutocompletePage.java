package pages.autocomplate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AutocompletePage extends BasePage {

	@FindBy(linkText = "Accent Folding")
	private WebElement accentFoldingLink;

	public void clickOnTheAccentFoldingLink() {
		accentFoldingLink.click();
	}

}
