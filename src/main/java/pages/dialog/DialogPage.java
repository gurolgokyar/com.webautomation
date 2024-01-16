package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DialogPage extends BasePage {

    @FindBy(linkText = "Modal Form")
    private WebElement modelFormLink;

    public void clickOnTheModelFormLink(){
        modelFormLink.click();
    }
}
