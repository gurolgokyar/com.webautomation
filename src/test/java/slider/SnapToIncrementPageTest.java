package slider;

import baseTest.Hooks;
import org.testng.annotations.Test;

public class SnapToIncrementPageTest extends Hooks {

    @Test
    void testDonationAmount(){

        //Navigate to SnapToIncrementPage
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheSliderLink();

        pages.getSliderPage().clickOnTheSnapToIncrementLink();

        //Slide the slider to (0, 0) position
        pages.getSnapToIncrementPage().slideToSliderToRight(-200);

        //Verify that the slider is on the starter position
        String actualResult = pages.getSnapToIncrementPage().getTextInDonationAmount();
        String expectedResult = "$0";
        softAssert.assertEquals(expectedResult, actualResult, "Wrong position!");

        //Slide the slider to (50, 0) position
        pages.snapToIncrementPage.slideToSliderToRight(100);

        //Verify that the slider is on the (50, 0) position
        actualResult = pages.getSnapToIncrementPage().getTextInDonationAmount();
        expectedResult = "$0";
        softAssert.assertEquals(expectedResult, actualResult, "Wrong position!");

    }
}
