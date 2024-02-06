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

	@FindBy(linkText = "Menu")
	private WebElement menuLink;

	@FindBy(linkText = "Dialog")
	private WebElement dialogLink;

	@FindBy(linkText = "Control Group")
	private WebElement controlGroupLink;

	@FindBy(linkText = "Progress Bar")
	private WebElement progressbarLink;

	@FindBy(linkText = "Slider")
	private WebElement sliderLink;

	@FindBy(linkText = "Spinner")
	private WebElement spinnerLink;

	@FindBy(linkText = "Sortable")
	private WebElement sortableLink;

	@FindBy(linkText = "Accordion")
	private WebElement accordionLink;

	@FindBy(linkText = "Button")
	private WebElement buttonLink;

	@FindBy(linkText = "Checkbox Radio")
	private WebElement checkboxRadioLink;

	@FindBy(linkText = "Datepicker")
	private  WebElement datepickerLink;


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
		BrowserUtils.scrollUpWithPageUp();
		BrowserUtils.wait(1);
	}

	public void clickOnTheMenuLink() {
		menuLink.click();
	}

	public void clickOnTheDialogLink() {
		dialogLink.click();
	}

	public void clickOnTheControlGroupPage() {
		controlGroupLink.click();
	}

	public void clickOnTheProgressbarLink() {
		progressbarLink.click();
	}

	public void clickOnTheSliderLink(){
		sliderLink.click();
	}

	public void clickOnTheSpinnerLink(){
		spinnerLink.click();
	}

	public void clickOnTheSortableLink(){
		sortableLink.click();
	}

	public void clickOnTheAccordionLink(){
		accordionLink.click();
	}

	public void clickOnTheButtonLink(){
		buttonLink.click();
	}

	public void clickOnTheCheckboxRadioButton(){
		checkboxRadioLink.click();
	}

	public void clickOnTheDatepickerLink() {
		datepickerLink.click();
	}
}
