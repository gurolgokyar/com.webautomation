package pages.button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ButtonPage extends BasePage {

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "With Icon")
    private WebElement withIconLink;

    public void clickOnTheDefaultFunctionalityLink(){
        defaultFunctionalityLink.click();
    }

    public void clickOnTheWithIconLink(){
        withIconLink.click();
    }
}
