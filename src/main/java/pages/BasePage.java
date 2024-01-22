package pages;

import utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

	protected WebDriver driver = Driver.getDriver();

	protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public Actions actions = new Actions(driver);

	public BasePage() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
