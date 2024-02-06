package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayMultipleMonthsPage extends BasePage {

    @FindBy(id = "datepicker-multiple-months")
    private WebElement selectedDateField;

    @FindBy(className = "ui-datepicker-month")
    private List<WebElement> monthNames;

    @FindBy(xpath = "//span[text() = 'Prev']")
    private WebElement prevButton;

    @FindBy(xpath = "//span[text() = 'Next']")
    private WebElement nextButton;
    //tr>td[data-handler = 'selectDay']

    @FindBy(css = "[data-handler = 'selectDay']")
    private List<WebElement> daysOfMonths;

    public void clickOnTheSelectedDateField() {
        selectedDateField.click();
    }

    public boolean isPrevButtonFunctional(String monthName) {
        for (int i = 0; i < 9; i++) {
            if (monthNames.stream().anyMatch(name -> name.getText().equals(monthName))) {
                return true;
            } else {
                prevButton.click();
            }
        }
        return false;
    }

    public boolean isNextButtonFunctional(String monthName) {
        for (int i = 0; i < 9; i++) {
            if (monthNames.stream().anyMatch(name -> name.getText().equals(monthName))) {
                return true;
            } else {
                nextButton.click();
            }
        }
        return false;
    }

    public void clickADate(int month, int dayOfMonth, int year){
        for (WebElement day: daysOfMonths){
            if (day.getAttribute("data-month").equals((month - 1) + "") &&
                day.findElement(By.tagName("a")).getAttribute("data-date").equals(dayOfMonth + "") &&
                day.getAttribute("data-year").equals(year + "")){
                day.click();
                break;
            }
        }
    }

    public String getSelectedDate(){
        String month =  "", selectedDay = "", year = "";
        for (WebElement day : daysOfMonths){
            if (day.findElement(By.tagName("a")).getAttribute("aria-current").equals("true")){
                month = (Integer.parseInt(day.getAttribute("data-month")) + 1) + "";
                selectedDay =  day.findElement(By.tagName("a")).getAttribute("data-date");
                year =   day.getAttribute("data-year");
                break;
            }
        }
        if (month.length() == 1){
            month = 0 + month;
        }

        if (selectedDay.length() == 1){
            selectedDay = 0 + selectedDay;
        }

        return month + "/" + selectedDay + "/" + year;
    }

}
