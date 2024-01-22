package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MenuPage extends BasePage {

	@FindBy(linkText = "Icons")
	private WebElement iconsLink;

	public void clickOnTheIconsLink() {
		iconsLink.click();
	}

}
