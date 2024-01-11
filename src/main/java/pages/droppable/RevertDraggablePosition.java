package pages.droppable;
import pages.BasePage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RevertDraggablePosition extends BasePage {

    @FindBy(id = "draggable-revert-draggable")
    private WebElement firstBox;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement secondBox;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement bigBox;

    @FindBy(xpath = "//*[@id='droppable-revert-draggable']/p")
    private WebElement messageInBigBox;

    public void dragFirstBoxInBigBox() {
        actions.dragAndDrop(firstBox, bigBox).build().perform();
    }

    public void dragFirstBoxButNotInBigBox(int XOffset, int YOffset) {
        actions.dragAndDropBy(firstBox, XOffset, YOffset).build().perform();
    }

    public void dragSecondBoxInBigBox() {
        actions.dragAndDrop(secondBox, bigBox).build().perform();
    }

    public void dragSecondBoxButNotInBigBox(int XOffset, int YOffset) {
        actions.dragAndDropBy(secondBox, XOffset, YOffset).build().perform();
    }

    public Point getLocationOfFirstBox() {
        return firstBox.getLocation();
    }

    public Point getLocationOfSecondBox() {
        return secondBox.getLocation();
    }

    public String getMessageInBigBox() {
        return messageInBigBox.getText();
    }

    public boolean isNegligibleDifference(Point initialPosition, Point finalPosition){
        int x = initialPosition.getX()-finalPosition.getX();
        int y = initialPosition.getY()-finalPosition.getY();
        return (x > -2 && x < 2) && (y > -2 && y < 2);
    }
}
