package pages.autocomplate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFoldingPage extends BasePage {

	@FindBy(id = "developer-accentFolding")
	private WebElement textArea;

	@FindBy(xpath = "/html/body/ul[2]/li")
	private List<WebElement> names;

	public void sendLetter(String letter) {
		textArea.sendKeys(letter);
	}

	public List<String> getNames() {
		return names.stream().map(name -> name.getText()).toList();
	}

}
