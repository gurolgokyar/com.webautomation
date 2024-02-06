package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SelectDateRangePage extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromButton;

    @FindBy(id = "to-selectDateRange")
    private WebElement toButton;

    @FindBy(css = "[data-handler = 'selectDay']")
    private List<WebElement> daysOfMonths;

    public void clickOnTheFromButton() {
        fromButton.click();
    }

    public void clickOnTheToButton() {
        toButton.click();
    }

    public void selectFromDate(int month, int dayOfMonth, int year) {
        clickOnTheFromButton();
        for (WebElement day: daysOfMonths){
            if (day.getAttribute("data-month").equals((month - 1) + "") &&
                    day.findElement(By.tagName("a")).getAttribute("data-date").equals(dayOfMonth + "") &&
                    day.getAttribute("data-year").equals(year + "")){
                day.click();
                break;
            }
        }
    }

    public void selectToDate(int month, int dayOfMonth, int year) {
        clickOnTheToButton();
        for (WebElement day: daysOfMonths){
            if (day.getAttribute("data-month").equals((month - 1) + "") &&
                    day.findElement(By.tagName("a")).getAttribute("data-date").equals(dayOfMonth + "") &&
                    day.getAttribute("data-year").equals(year + "")){
                day.click();
                break;
            }
        }
    }

    public String getFromDate() {
        clickOnTheFromButton();

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

    public String getToDate (){
        clickOnTheToButton();

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
