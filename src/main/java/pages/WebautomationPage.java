package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebautomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autocomplateButton;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizeableLink;


    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnTheAutoComplateLink() {
        autocomplateButton.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnResizeableLink() {
        resizeableLink.click();
    }

}
