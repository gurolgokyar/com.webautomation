package pages.button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class WithIconPage extends BasePage {

    @FindBy(css = ".m-2")
    private List<WebElement> buttons;

    public void areButtonsClickable(){
        buttons.stream().forEach(button -> {
            button.click();
        });
    }

}
