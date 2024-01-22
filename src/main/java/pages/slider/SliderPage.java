package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SliderPage extends BasePage {
    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrementLink;

    public void clickOnTheSnapToIncrementLink(){
        snapToIncrementLink.click();
    }
}
