package datepicker;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayMultipleMonthsPageTest extends Hooks {

    @Test
    public void isSelectedDateInSelectedDateField() {
        //Navigate to DisplayMultipleMonthsPage
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnTheDatepickerLink();
        pages.getDatepickerPage().clickOnTheDisplayMultipleMonthsLink();

        //Click on the selected date field
        pages.getDisplayMultipleMonthsPage().clickOnTheSelectedDateField();

        //Select a date
        pages.getDisplayMultipleMonthsPage().clickADate(4, 17, 2024);

        //Verify that the selected date is in the selected date field
        String expectedResult = "04/17/2024";
        pages.getDisplayMultipleMonthsPage().clickOnTheSelectedDateField();
        String actualResult = pages.getDisplayMultipleMonthsPage().getSelectedDate();

        Assert.assertEquals(actualResult, expectedResult, "Selected date should be displayed in the selected date " +
                "field!");
    }

    @Test(priority = 1)
    public void testNextButtonsFunctionality(){
        //Click on the selected date field
        pages.getDisplayMultipleMonthsPage().clickOnTheSelectedDateField();

        boolean isNextButtonFunctional = pages.displayMultipleMonthsPage.isNextButtonFunctional("July");
        Assert.assertTrue(isNextButtonFunctional, "The next button should be functional!");
    }

    @Test(priority = 2)
    public void testPrevButtonsFunctionality(){
        //Click on the selected date field
        pages.getDisplayMultipleMonthsPage().clickOnTheSelectedDateField();

        boolean isPrevButtonFunctional = pages.displayMultipleMonthsPage.isPrevButtonFunctional("January");
        Assert.assertTrue(isPrevButtonFunctional, "The prev button should be functional!");
    }


}
