package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class ModelFormPage extends BasePage {

    @FindBy(xpath = "//button[text() = 'Create Account']")
    private WebElement createAccountButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "surname")
    private WebElement surNameField;

    @FindBy(id = "email")
    private WebElement emailAddressField;

    @FindBy(xpath = "//button[text() = 'Submit']")
    private WebElement submitButton;

    @FindBy(css = ".ui-widget > tbody > tr")
    private List<WebElement>  submittedAccounts;

    public void clickOnTheCreateAccountButton(){
        createAccountButton.click();
    }

    public void sendName(String name) {
        nameField.sendKeys(name);
        BrowserUtils.wait(1);
    }

    public void sendSurName(String surname) {
        nameField.sendKeys(surname);
        BrowserUtils.wait(1);
    }

    public void sendEmailAddress(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
        BrowserUtils.wait(1);
    }

    public void createAccount(String name, String surname, String emailAddress){
        sendName(name);
        sendSurName(surname);
        sendEmailAddress(emailAddress);
    }

    public void clickOnTheSubmitButton(){
        submitButton.click();
    }

    public int getNumberOfSubmittedAccount(){
        return submittedAccounts.size();
    }

}
