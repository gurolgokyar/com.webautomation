package alertsTest;

import baseTest.Hooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertsTypePageTest extends Hooks {

	@BeforeMethod
	void navigateAlertsTypePage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnTheAlertsLink();
		pages.getAlertPage().clickOnTheAlertLink();
	}

	@AfterMethod
	void navigateToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void testIsConfirmed() {
		pages.getAlertTypesPage().clickOnTheShowConfirmLink();

		pages.getAlertTypesPage().confirmTheAlert();

		String isConfirmed = pages.getAlertTypesPage().getTheText();

		assertEquals("Confirmed!", isConfirmed, "Wrong message!");

		pages.getAlertTypesPage().confirmTheAlert();
	}

	@Test
	void testShowPrompt() {
		pages.getAlertTypesPage().clickOnTheShowPromptLink();

		pages.getAlertTypesPage().sendTheKeyToAlert("Gurol Gokyar");

		pages.getAlertTypesPage().confirmTheAlert();

		String actualMessage = pages.getAlertTypesPage().getTheText();

		assertEquals("Hello, Gurol Gokyar!", actualMessage, "Wrong message!");

		pages.getAlertTypesPage().confirmTheAlert();

	}

}
