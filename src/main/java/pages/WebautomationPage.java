package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

public class WebautomationPage extends BasePage {

	@FindBy(linkText = "Draggable")
	private WebElement draggableLink;

	@FindBy(linkText = "Autocomplete")
	private WebElement autocomplateButton;

	@FindBy(linkText = "Droppable")
	private WebElement droppableLink;

	@FindBy(linkText = "Resizable")
	private WebElement resizeableLink;

	@FindBy(linkText = "Selectable")
	private WebElement selectableLink;

	@FindBy(linkText = "Alerts")
	private WebElement alertsLink;

	@FindBy(linkText = "Iframe")
	private WebElement iframeLink;

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

	public void clickOnSelectableLink() {
		selectableLink.click();
	}

	public void clickOnTheAlertsLink() {
		alertsLink.click();
	}

	public void clickOnTheIframeLink() {
		BrowserUtils.scrollDownWithPageDown();
		BrowserUtils.wait(1);
		iframeLink.click();
		BrowserUtils.scrollDownWithPageUp();
		BrowserUtils.wait(1);

	}

}
