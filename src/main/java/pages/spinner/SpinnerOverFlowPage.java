package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverFlowPage extends BasePage {

    @FindBy(id = "spinner-overflow")
    private WebElement textArea;

    @FindBy(xpath = "//div[5]/div/div/div/p/span/a[1]")
    private WebElement spinnerUp;

    @FindBy(xpath = "//div[5]/div/div/div/p/span/a[2]")
    private WebElement spinnerDown;

    public String getValueOfTextArea(){
        return textArea.getAttribute("aria-valuenow");
    }

    public void clickOnTheSpinnerUp(int numberOfClick){
        for (int i = 0; i < numberOfClick; i++){
            actions.moveToElement(spinnerUp).click().perform();
        }
    }

    public void clickOnTheSpinnerDown(int numberOfClick){
        for (int i = 0; i < numberOfClick; i++){
            actions.moveToElement(spinnerDown).click().perform();
        }
    }

    public void setTheTextAreaToZero(){
        textArea.clear();
    }

    public boolean isBetweenZeroAndTen(){
        int currentValue = Integer.parseInt(getValueOfTextArea());
        return currentValue >= -10 && currentValue <= 10;
    }

}
