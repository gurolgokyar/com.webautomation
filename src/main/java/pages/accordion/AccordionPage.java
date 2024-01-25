package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AccordionPage extends BasePage {

    @FindBy(linkText = "Collapse Content")
    private WebElement collapseContentLink;

    public void clickOnTheCollapseContentLink(){
        collapseContentLink.click();
    }
}
