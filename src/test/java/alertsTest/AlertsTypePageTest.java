package alertsTest;

import baseTest.Hooks;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertsTypePageTest extends Hooks {

    @BeforeEach
    void navigateAlertsTypePage(){
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnTheAlertsLink();
        pages.getAlertPage().clickOnTheAlertLink();
    }

    @AfterEach
    void navigateToHomePage(){
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @Test
    void testIsConfirmed(){
        pages.getAlertTypesPage().clickOnTheShowConfirmLink();

        pages.getAlertTypesPage().confirmTheAlert();

        String isConfirmed = pages.getAlertTypesPage().getTheText();

        assertEquals("Confirmed!", isConfirmed, "Wrong message!");

        pages.getAlertTypesPage().confirmTheAlert();
    }

    @Test
    void testShowPrompt(){
        pages.getAlertTypesPage().clickOnTheShowPromptLink();

        pages.getAlertTypesPage().sendTheKeyToAlert("Gurol Gokyar");

        pages.getAlertTypesPage().confirmTheAlert();

        String actualMessage = pages.getAlertTypesPage().getTheText();

        assertEquals("Hello, Gurol Gokyar!", actualMessage, "Wrong message!");

        pages.getAlertTypesPage().confirmTheAlert();

    }


}
