package pages.resizeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronusResizePage extends BasePage {

	@FindBy(id = "resizable-synchr-resize")
	private WebElement resizeable1;

	@FindBy(css = "#resizable-synchr-resize .ui-resizable-e")
	WebElement rightEdgeOfResizeable1;

	@FindBy(css = "#resizable-synchr-resize .ui-resizable-s")
	private WebElement bottomEdgeOfResizeable1;

	@FindBy(css = "#resizable-synchr-resize .ui-resizable-se")
	private WebElement rightBottomCornerOfResizeable1;

	@FindBy(id = "also-synchr-resize")
	private WebElement getResizeable2;

	@FindBy(css = "#also-synchr-resize .ui-resizable-e")
	WebElement rightEdgeOfResizeable2;

	@FindBy(css = "#also-synchr-resize .ui-resizable-s")
	private WebElement bottomEdgeOfResizeable2;

	@FindBy(css = "#also-synchr-resize .ui-resizable-se")
	WebElement rightBottomCornerOfResizeable2;

	public void setWidthOfResizeable1(int xOffset, int yOffset) {
		actions.clickAndHold(rightEdgeOfResizeable1).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void setHeightOfResizeable1(int xOffset, int yOffset) {
		actions.clickAndHold(bottomEdgeOfResizeable1).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void setRightBottomCornerOfResizeable1(int xOffset, int yOffset) {
		actions.clickAndHold(rightBottomCornerOfResizeable1).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void setRightEdgeOfResizeable2(int xOffset, int yOffset) {
		actions.clickAndHold(rightEdgeOfResizeable2).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void setBottomEdgeOfResizeable2(int xOffset, int yOffset) {
		actions.clickAndHold(bottomEdgeOfResizeable2).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void setRightBottomCornerOfResizeable2(int xOffset, int yOffset) {
		actions.clickAndHold(rightBottomCornerOfResizeable2).moveByOffset(xOffset, yOffset).release().perform();
	}

	public int getWidthOfResizeable1() {
		return resizeable1.getSize().getWidth();
	}

	public int getHeightOfResizeable1() {
		return resizeable1.getSize().getHeight();
	}

	public int getWidthOfResizeable2() {
		return resizeable1.getSize().getWidth();
	}

	public int getHeightOfResizeable2() {
		return resizeable1.getSize().getHeight();
	}

}
