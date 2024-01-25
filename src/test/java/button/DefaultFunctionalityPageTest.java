package button;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultFunctionalityPageTest extends Hooks {
    @Test
    void testAreAllButtonsClickable() {
        //Navigate to DefaultFunctionalityPage
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheButtonLink();

        pages.getButtonPage().clickOnTheDefaultFunctionalityLink();

        //Verify that all of the elements are clickable
        try {
            pages.getButtonDefaultFunctionalityPage().areButtonsClickable();
        } catch (RuntimeException ex) {
            Assert.assertTrue(false, "Buttons should be clickable");
        }
    }
}
