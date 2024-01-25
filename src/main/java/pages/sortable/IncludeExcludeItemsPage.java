package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class IncludeExcludeItemsPage extends BasePage {

    @FindBy(css = "#sortable-inc-exc-1 > li")
    private List<WebElement> rowsWithUnDropableAndUnsortable;

    @FindBy(css = "#sortable-inc-exc-2 > li")
    private List<WebElement> rowsWithUnDropable;

    public void dragAndDropAnElement(String listName, int index, int yOffset) {
        List<WebElement> list = getList(listName);
        actions.clickAndHold(list.get(index)).moveByOffset(0, yOffset).release().build().perform();
    }

    public List<WebElement> getList(String listName) {
        return listName.compareTo("rowsWithUnDropable") == 0 ? rowsWithUnDropable : rowsWithUnDropableAndUnsortable;
    }

    public int heightOfAnElement() {
        return rowsWithUnDropable.get(0).getSize().getHeight();
    }

    public int getYCoordinateOfTheElement(String listName, int index) {
        return getList(listName).get(index).getLocation().getY();
    }
}
