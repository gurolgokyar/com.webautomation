package pages.resizeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextAreaPage extends BasePage {

    @FindBy(id = "resizable-text-area-res")
    private WebElement textArea;

    @FindBy(css = ".ui-wrapper > .ui-icon")
    private WebElement resizeAbleHandle;

    public void sendMessageInTextArea(String message) {
        textArea.clear();
        textArea.sendKeys(message);
    }

    public void setTextArea(int xOffset, int yOffset){
        actions.clickAndHold(resizeAbleHandle).moveByOffset(xOffset, yOffset).release().perform();
    }

    public String getTextFromTextArea() {
        return textArea.getAttribute("value");
    }

    public int getHeightOfTextArea() {
        return textArea.getSize().getHeight();
    }

    public int getWidthOfTextArea(){
        return textArea.getSize().getWidth();
    }
}
