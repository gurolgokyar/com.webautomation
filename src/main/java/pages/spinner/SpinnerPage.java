package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerPage extends BasePage {

    @FindBy(linkText = "Spinner Overflow")
    private WebElement spinnerOverflowLink;

    public void clickOnTheSpinnerOverflowLink(){
        spinnerOverflowLink.click();
    }
}
