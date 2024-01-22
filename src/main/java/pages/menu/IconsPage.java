package pages.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class IconsPage extends BasePage {

	@FindBy(css = "#menu-w-icons > li")
	private List<WebElement> rows;

	public void clickOnARow(int index) {
		rows.get(index - 1).click();
	}

	public boolean isRowInSelectableItems(int index) {
		List<WebElement> elementsInTheRow = rows.get(index - 1).findElements(By.cssSelector(" ul > li"));
		return !elementsInTheRow.isEmpty();
	}

}
