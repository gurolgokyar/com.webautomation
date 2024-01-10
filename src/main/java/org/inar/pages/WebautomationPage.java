package org.inar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebautomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autocomplateButton;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;




    public void clickOnDraggableButton(){
        draggableLink.click();
    }

    public void clickOnTheAutoComplateButton(){
        autocomplateButton.click();
    }

    public void clickOnDroppableButton(){
        droppableLink.click();
    }

}
