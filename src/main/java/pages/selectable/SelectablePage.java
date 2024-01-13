package pages.selectable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SelectablePage extends BasePage {

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    public void clickOnSerializeLink(){
        serializeLink.click();
    }
}
