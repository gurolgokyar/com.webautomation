package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SerializePage extends BasePage {

	@FindBy(css = "#selectable-serialize > li")
	private List<WebElement> rows;

	@FindBy(id = "select-result")
	private WebElement selectResult;

	public void clickOnARow(int i) {
		rows.get(i - 1).click();
	}

	public void clickOnRowsWithCtrl(int i1, int i2, int i3) {
		actions.keyDown(Keys.CONTROL)
			.click(rows.get(i1 - 1))
			.click(rows.get(i2 - 1))
			.click(rows.get(i3 - 1))
			.keyUp(Keys.CONTROL)
			.perform();
	}

	public void clickWidthMouse(int i1, int i2) {
		actions.clickAndHold(rows.get(i1 - 1)).moveToElement(rows.get(i2 - 1)).release().perform();
	}

	public String getSelectedRows() {
		return selectResult.getText();
		// return selectedResult.getAttribute("value");
	}

	public boolean isSelected(int i) {
		return rows.get(i - 1).getAttribute("class").contains("ui-selected");
	}

}
