package datepicker;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectDateRangePageTest extends Hooks {

    @Test
    public void areFromAndDateSelectedCorrectly() {
        //Navigate to SelectDateRangePage
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnTheDatepickerLink();
        pages.getDatepickerPage().clickOnTheSelectedDateRange();

        //Select the from date
        pages.getSelectDateRangePage().selectFromDate(2, 17, 2024);

        //Verify that the selected from date is selected correctly
        String expectedResult = "02/17/2024";
        String actualResult = pages.getSelectDateRangePage().getFromDate();
        Assert.assertEquals(actualResult, expectedResult, "Selected from date should be displayed correctly!");

        //Select the to date
        pages.getSelectDateRangePage().selectToDate(4, 19, 2024);

        //Verify that the selected to date is selected correctly
        expectedResult = "04/19/2024";
        actualResult = pages.getSelectDateRangePage().getToDate();
        Assert.assertEquals(actualResult, expectedResult, "Selected to date should be displayed correctly!");
    }

}
