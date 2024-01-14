package pages.alertPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Base64;

public class AlertPage extends BasePage {

	@FindBy(linkText = "Alert Types")
	private WebElement alertTypeLink;

	public void clickOnTheAlertLink() {
		alertTypeLink.click();
	}

}
