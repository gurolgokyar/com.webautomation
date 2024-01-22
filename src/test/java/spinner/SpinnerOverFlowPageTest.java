package spinner;

import baseTest.Hooks;
import org.testng.annotations.Test;

public class SpinnerOverFlowPageTest extends Hooks {

    @Test
    void testIsTextAreaBetween0And10AfterClickedToSpinnerUp(){
        //Navigate to spinner page
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheSpinnerLink();

        pages.getSpinnerPage().clickOnTheSpinnerOverflowLink();

        //Set to text area to 0
        pages.getSpinnerOverFlowPage().setTheTextAreaToZero();

        //Click on the spinnerUp 11 times
        pages.getSpinnerOverFlowPage().clickOnTheSpinnerUp(11);

        //Verify that the value of the text area is already between -10 ant 10
        softAssert.assertTrue(pages.getSpinnerOverFlowPage().isBetweenZeroAndTen(), "The value should be 10 and -10");
    }

    @Test(priority = 1)
    void testIsTextAreaBetween0And10AfterClickedToSpinnerDown(){
        //Set to text area to 0
        pages.getSpinnerOverFlowPage().setTheTextAreaToZero();

        //Click on the spinnerDown 11 times
        pages.getSpinnerOverFlowPage().clickOnTheSpinnerUp(-11);

        //Verify that the value of the text area is already between -10 ant 10
        softAssert.assertTrue(pages.getSpinnerOverFlowPage().isBetweenZeroAndTen(), "The value should be 10 and -10");
    }

}
