package pages.draggable;

import pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlesPage extends BasePage {

	@FindBy(xpath = "//p[text() = 'I can be dragged only by this handle']")
	private WebElement draggableAreaInFirstDraggable;

	@FindBy(id = "draggable13")
	private WebElement draggable1;

	@FindBy(id = "draggable14")
	private WebElement draggable2;

	//
	@FindBy(xpath = "//*[@id=\"draggable14\"]/p[2]")
	private WebElement unDraggableAreaInSecondDraggable;

	@FindBy(xpath = "//*[@id=\"draggable14\"]/p[1]")
	private WebElement draggableAreInSecondDraggable;

	public void dragAndDropFirstDraggableWithDraggableArea(int XOffset, int YOffset) {
		actions.dragAndDropBy(draggableAreaInFirstDraggable, XOffset, YOffset).perform();
	}

	public void dragAndDropFirstDraggableWithUnDraggableArea(int XOffset, int YOffset) {
		int heightOfDraggableAreaInDraggable1 = draggableAreaInFirstDraggable.getSize().getHeight();
		actions.moveToElement(draggable1, 0, heightOfDraggableAreaInDraggable1)
			.clickAndHold()
			.moveByOffset(XOffset, YOffset)
			.release()
			.perform();
	}

	public void dragAndDropSecondDraggableWithDraggableArea(int XOffset, int YOffset) {
		actions.moveToElement(draggableAreInSecondDraggable).clickAndHold().moveByOffset(XOffset, YOffset).release().perform();
	}

	public void dragAndDropSecondDraggableWithUnDraggableArea(int XOffset, int YOffset) {
		actions.dragAndDropBy(unDraggableAreaInSecondDraggable, XOffset, YOffset).build().perform();
	}

	public int getLocalOfDraggableX(WebElement draggable) {
		return draggable.getLocation().getX();
	}

	public int getLocalOfDraggableY(WebElement draggable) {
		return draggable.getLocation().getY();
	}

	public WebElement getDraggable1() {
		return draggable1;
	}

	public WebElement getDraggable2() {
		return draggable2;
	}

}
