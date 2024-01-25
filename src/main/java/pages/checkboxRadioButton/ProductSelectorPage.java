package pages.checkboxRadioButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ProductSelectorPage extends BasePage {
    @FindBy(css = ".brand-options > label")
    private List<WebElement> firstRowButtons;

    @FindBy(css = ".shape-options > label")
    private List<WebElement> secondRowButtons;

    @FindBy(css = ".toggle-options> label")
    private List<WebElement> thirdRowButtons;


    public void clickOnTheButtonsOnARow(int rowIndex, int buttonIndex) {
        List<WebElement> list = getRow(rowIndex);
        list.get(buttonIndex).click();
    }

    public List<WebElement> getRow(int rowIndex) {
        return rowIndex == 0 ? firstRowButtons : rowIndex == 1 ? secondRowButtons : thirdRowButtons;
    }

    public boolean isButtonClicked(int rowIndex, int buttonIndex) {
        List<WebElement> list = getRow(rowIndex);
        return list.get(buttonIndex).isEnabled();

    }

}
