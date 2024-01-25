package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SortablePage extends BasePage {

    @FindBy(linkText = "Include / exclude items")
    private WebElement includeExcludeItemsLink;

    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGridLink;

    public void clickOnTheIncludeExcludeItemsLink(){
        includeExcludeItemsLink.click();
    }

    public void clickOnTheDisplayAsGridLink(){
        displayAsGridLink.click();
    }
}
