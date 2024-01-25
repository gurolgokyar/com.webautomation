package pages.checkboxRadioButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CheckboxRadiobuttonPage extends BasePage {

    @FindBy(linkText = "Product Selector")
    private WebElement productSelectorLink;

    public void clickOnTheProductSelectorLink(){
        productSelectorLink.click();
    }
}
