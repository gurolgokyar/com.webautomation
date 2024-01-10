package org.inar.pages.droppable;

import org.inar.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcceptPage extends BasePage {

    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement unDroppableBox;

    @FindBy(id = "draggable-accept")
    private WebElement droppableBox;

    @FindBy(id = "droppable-accept")
    private WebElement bigBox;

    @FindBy(xpath = "//*[@id='droppable-accept']/p")
    private WebElement textAreaInBigBox;

    public void dragUnDroppableBox(){
        actions.dragAndDrop(unDroppableBox, bigBox).build().perform();
    }

    public void dragDroppableBox(){
        actions.dragAndDrop(droppableBox, bigBox).build().perform();
    }

    public String getTextInBigBox(){
        return textAreaInBigBox.getText();
    }

}
