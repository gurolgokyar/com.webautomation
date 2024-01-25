package button;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithIconPageTest extends Hooks {

    @Test
    void testAreAllButtonsClickable() {
        //Navigate to DefaultFunctionalityPage
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheButtonLink();

        pages.getButtonPage().clickOnTheWithIconLink();

        //Verify that all buttons are clickable
        try {
            pages.getWithIconPage().areButtonsClickable();
        } catch (RuntimeException ex) {
            Assert.assertTrue(false, "The buttons should be clickable!");
        }
    }
}
