package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Driver;
import utils.Pages;

public class Hooks {

	protected static WebDriver driver;

	protected static Pages pages = new Pages();

	static Actions actions;

	@BeforeClass
	public static void setUp() {
		driver = Driver.getDriver();
		actions = new Actions(driver);
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@AfterClass
	public static void tearDown() {
		Driver.closeDriver();
	}

}
