package org.inar.pages.droppable;

import org.inar.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {
    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    public void clickOnAcceptLink(){
        acceptLink.click();
    }

    public void clickOnRevertDraggablePositionLink(){
        revertDraggablePositionLink.click();
    }
}
