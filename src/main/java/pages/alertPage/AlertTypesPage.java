package pages.alertPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypesPage extends BasePage {

	Alert alert;

	@FindBy(xpath = "//button[text() = 'Show Alert']")
	private WebElement showAlertLink;

	@FindBy(xpath = "//button[text() = 'Show Confirm']")
	private WebElement showConfirmLink;

	@FindBy(xpath = "//button[text() = 'Show Prompt']")
	private WebElement showPromptLink;

	public void clickOnTheShowAlertLink() {
		showAlertLink.click();
	}

	public void clickOnTheShowConfirmLink() {
		showConfirmLink.click();
	}

	public void clickOnTheShowPromptLink() {
		showPromptLink.click();
	}

	public void switchToAlert() {
		alert = DRIVER.switchTo().alert();
	}

	public void confirmTheAlert() {
		switchToAlert();
		alert.accept();
	}

	public void rejectTheAlert() {
		switchToAlert();
		alert.dismiss();
	}

	public String getTheText() {
		switchToAlert();
		return alert.getText();
	}

	public void sendTheKeyToAlert(String message) {
		switchToAlert();
		alert.sendKeys(message);
	}

}
