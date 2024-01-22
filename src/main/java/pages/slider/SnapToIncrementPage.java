package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrementPage extends BasePage {
    @FindBy(id = "amount-snap-to-increments")
    private WebElement donationAmount;

    @FindBy(xpath = "//div[@id = 'slider-snap-to-increments'] / span")
    private WebElement slider;

    public void slideToSliderToRight(int xOffset){
        actions.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();
        //actions.dragAndDropBy(slider, xOffset, 0).perform();
    }

    public String getTextInDonationAmount(){
        return donationAmount.getAttribute("value");
    }
}
