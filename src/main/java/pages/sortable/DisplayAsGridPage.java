package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class DisplayAsGridPage extends BasePage {
    @FindBy(css = "#sortable-disp-as-grid > li")
    private List<WebElement> boxes;

    public void dragAndDropAnElement(int firstElement, int secondElement) {
        int yOffset = boxes.get(secondElement).getLocation().getY() - boxes.get(firstElement).getLocation().getY();
        int xOffset = boxes.get(secondElement).getLocation().getX() - boxes.get(firstElement).getLocation().getX();
        actions.clickAndHold(boxes.get(firstElement)).moveByOffset(xOffset -2, yOffset -2).release().build().perform();
        BrowserUtils.wait(2);
//        boxes.get(firstElement).getLocation().x = boxes.get(secondElement).getLocation().x;
//        boxes.get(firstElement).getLocation().y = boxes.get(secondElement).getLocation().y;
//        BrowserUtils.wait(2);
    }

    public String getLeftElementOfTheDraggedElement(int indexOfDraggedElement){
        return boxes.get(indexOfDraggedElement - 1).getText();
    }
}
