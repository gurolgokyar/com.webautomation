package sortable;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.Driver;
import utils.Pages;

public class includeExcludeItemsPageTest {

    protected WebDriver driver;

    protected Pages pages;
    protected SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        pages = new Pages();
        driver = Driver.getDriver();
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }


    @Test(dataProvider = "inputs")
    public void testWitchElementsAreSortable(int indexOfElement, int coefficient, boolean isSortable,
                                             String errorMessage) {
        //Navigate to include / exclude items page
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheSortableLink();

        pages.getSortablePage().clickOnTheIncludeExcludeItemsLink();

        int yOffset = pages.getIncludeExcludeItemsPage().heightOfAnElement();

        //Drag and drop the each element in the first section(rowsWithUnDropableAndUnsortable)
        int initialLocation = pages.getIncludeExcludeItemsPage().getYCoordinateOfTheElement(
                "rowsWithUnDropableAndUnsortable", indexOfElement);
        pages.getIncludeExcludeItemsPage().dragAndDropAnElement("rowsWithUnDropableAndUnsortable", indexOfElement,
                yOffset * coefficient);
        int finalLocation = pages.getIncludeExcludeItemsPage().getYCoordinateOfTheElement(
                "rowsWithUnDropableAndUnsortable", indexOfElement);

        //Final coordinate of the element must be greater than initial for Item 1
        //Final coordinate of the element must be shorter than initial for Item 4
        //Final coordinate of the element must be equal to initial for Item 2 and 3
        boolean isSortable1 = finalLocation > initialLocation;
        Assert.assertEquals(isSortable1, isSortable, errorMessage);
    }

    @Test(dataProvider = "inputs2")
    public void testWitchElementsAreSortableAndDraggable(int indexOfElement, int coefficient, boolean isSortable,
                                                         String errorMessage) {
        //Navigate to include / exclude items page
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheSortableLink();

        pages.getSortablePage().clickOnTheIncludeExcludeItemsLink();

        int yOffset = pages.getIncludeExcludeItemsPage().heightOfAnElement();

        //Drag and drop the each element in the first section(rowsWithUnDropable)
        int initialLocation = pages.getIncludeExcludeItemsPage().getYCoordinateOfTheElement(
                "rowsWithUnDropable", indexOfElement);
        pages.getIncludeExcludeItemsPage().dragAndDropAnElement("rowsWithUnDropable", indexOfElement,
                yOffset * coefficient);
        int finalLocation = pages.getIncludeExcludeItemsPage().getYCoordinateOfTheElement(
                "rowsWithUnDropable", indexOfElement);

        //Final coordinate of the element must be greater than initial for Item 1
        //Final coordinate of the element must be shorter than initial for Item 4
        //Final coordinate of the element must be equal to initial for Item 2 and 3
        boolean isSortable1 = finalLocation > initialLocation;
        Assert.assertEquals(isSortable1, isSortable, errorMessage);

    }

    @DataProvider(name = "inputs")
    public Object[][] inputs() {
        return new Object[][]{
                {0, 4, true, "The element should be sortable!"},
                {1, 3, false, "The element should not be sortable!"},
                {2, 3, false, "The element should not be sortable!"},
                {3, -4, false, "The element should be sortable!"}
        };
    }

    @DataProvider(name = "inputs2")
    public Object[][] Inputs2() {
        return new Object[][]{
                {0, 2, true, "The element should be sortable!"},
                {1, 2, false, "The element should not be sortable!"},
                {2, 2, false, "The element should not be sortable!"},
                {3, -2, false, "The element should be sortable!"}
        };
    }
}
