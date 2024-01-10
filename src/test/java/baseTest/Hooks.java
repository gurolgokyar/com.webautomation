package baseTest;

import org.inar.utils.Driver;
import org.inar.utils.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hooks {
    protected static WebDriver driver;

    protected static Pages pages = new Pages();
    Actions actions = new Actions(driver);
    @BeforeAll
    public static void setUp(){
        driver = Driver.getDriver();
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }
    @AfterAll
    public static void tearDown(){
        Driver.closeDriver();
    }
}

