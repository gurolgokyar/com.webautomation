package sortable;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayAsGridPageTest extends Hooks {

    @Test
    void testIsABoxDragged() {
        //Navigate to include / exclude items page
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheSortableLink();

        pages.getSortablePage().clickOnTheDisplayAsGridLink();

        //Drag end drop a box
        pages.getDisplayAsGridPage().dragAndDropAnElement(0, 6);

        String actualResult = pages.getDisplayAsGridPage().getLeftElementOfTheDraggedElement(6);
        String expectedResult = "5";

        //Verify that draggable element is dragged
        Assert.assertEquals(expectedResult, actualResult, "WebElement should be dragged!");
    }
}
