package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class CollapseContentPage extends BasePage {

    @FindBy(css = "#accordion-2-cc > h3")
    private List<WebElement> accordions;

    public void clickOnTheAccordion(int index){
        accordions.get(index).click();
    }

    public boolean isAccordionActive(int index) {
        return accordions.get(index).getAttribute("class").contains("active");
    }

    public boolean isAccordionCollapsed(int index) {
        return accordions.get(index).getAttribute("class").contains("collapsed");
    }
}
