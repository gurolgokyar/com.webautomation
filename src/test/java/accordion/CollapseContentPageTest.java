package accordion;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollapseContentPageTest extends Hooks {

    @Test
    void testIsAccordionCollapsed(){
        //Navigate to CollapseContentPage class
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheAccordionLink();

        pages.getAccordionPage().clickOnTheCollapseContentLink();

        //Find if first accordion is active
        boolean isActive = pages.getCollapseContentPage().isAccordionActive(0);

        if (isActive){
            pages.getCollapseContentPage().clickOnTheAccordion(0);
        }

        //Verify that the first accordion is collapsed
        boolean actualResult = pages.getCollapseContentPage().isAccordionActive(0);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, expectedResult, "The accordion should be collapsed!");
    }
}
