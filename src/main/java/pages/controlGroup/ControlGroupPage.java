package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ControlGroupPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Toolbar']")
    private WebElement toolbarLink;

    public void clickOnTheToolbarLink(){
        toolbarLink.click();
    }

}
