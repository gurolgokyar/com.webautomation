package pages.datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DatepickerPage extends BasePage {


    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonths;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;

    public void clickOnTheDisplayMultipleMonthsLink() {
        displayMultipleMonths.click();
    }

    public void clickOnTheSelectedDateRange() {
        selectDateRangeLink.click();
    }

}
