package baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import utils.Driver;
import utils.Pages;

public class Hooks {

	protected WebDriver driver;

	protected Pages pages;

	protected SoftAssert softAssert = new SoftAssert();

	//@Parameters("browser")
	@BeforeClass
	public void setUp() {
		driver = Driver.getDriver("chrome");
		pages = new Pages();
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@AfterClass
	public void tearDown() {
		Driver.closeDriver();
	}

}
