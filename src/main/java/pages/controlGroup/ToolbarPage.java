package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class ToolbarPage extends BasePage {

   @FindBy(xpath = "//div[@class = 'toolbar']/div/select")
    private List<WebElement> zoomHighLightColorButton;

   @FindBy(xpath = "//div[@class = 'toolbar']/div/button")
    private List<WebElement> BUIButtons;

   @FindBy(id = "page")
   private WebElement textArea;

   public void selectTheZoomValue(String zoomValue){
       Select select = new Select(zoomHighLightColorButton.get(0));
       select.selectByVisibleText(zoomValue);
   }

   public boolean isZoomValueSelectedCorrectly(String zoomValue){
       return textArea.getAttribute("style").contains(zoomValue);
   }

   public void selectTheHighLightValue(String heightLightValue){
       Select select = new Select(zoomHighLightColorButton.get(1));
       select.selectByVisibleText(heightLightValue);
   }

    public boolean isHighLightValueSelectedCorrectly(String heightLightValue){
        return textArea.getAttribute("style").contains("background-color: " + heightLightValue.toLowerCase());
    }

   public void selectTheColorValue(String colorValue){
       Select select = new Select(zoomHighLightColorButton.get(2));
       select.selectByVisibleText(colorValue);
   }

    public boolean isColorValueSelectedCorrectly(String colorValue){
        return textArea.getAttribute("style").contains("color: " + colorValue.toLowerCase());
    }

   public void clickOnTheBoldButton(){
       BUIButtons.get(0).click();
   }

   public boolean isBButtonSelected(){
       return textArea.getAttribute("style").contains("bold");
   }

   public void clickOnTheItalicButton(){
       BUIButtons.get(1).click();
   }

    public boolean isIButtonSelected(){
        return textArea.getAttribute("style").contains("italic");
    }

   public void clickOnTheUnderLineButton(){
       BUIButtons.get(2).click();
   }

    public boolean isUButtonSelected(){
        return textArea.getAttribute("style").contains("underline");
    }

    public void clickOnThePrintButton(){
       BUIButtons.get(3).click();
    }

    public boolean isPrintButtonWorkingCorrectly(){
       return "about:blank".equals(DRIVER.getCurrentUrl());
    }
}
