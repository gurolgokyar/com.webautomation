package menuPageTest;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IconsPageTest extends Hooks {

    @BeforeMethod
    void navigateToIconsPage() {
        //Navigate to Icons page
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnTheMenuLink();
        pages.getMenuPage().clickOnTheIconsLink();
    }

    @BeforeMethod
    void navigateToHomePage() {
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @Test
    void testIsNotElementSelectable() {
        //click on the Zoom In row
        pages.getIconsPage().clickOnARow(2);

        //Verify the Zoom in row is not converted into selectable menu items.
        boolean actualResult = pages.getIconsPage().isRowInSelectableItems(2);

        Assert.assertFalse(actualResult, "The web element should be converted into selectable menu items");

    }

    @Test
    void testIsElementSelectable() {
        //click on the Playback row
        pages.getIconsPage().clickOnARow(5);

        //Verify the Playback row is converted into selectable menu items.
        boolean actualResult = pages.getIconsPage().isRowInSelectableItems(5);

        Assert.assertTrue(actualResult, "The web element should be converted into selectable menu items");

    }
}
