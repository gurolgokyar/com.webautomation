package selectable;

import baseTest.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SerializePageTest extends Hooks {
    Pages pages = new Pages();

    @BeforeEach
    void navigateTheSerializePage(){
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnSelectableLink();
        pages.getSelectablePage().clickOnSerializeLink();
    }

    @AfterEach
    void navigateTheHomePage(){
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @Test
    void testClickOnARow(){
        pages.getSerializePage().clickOnARow(3);

        boolean isSelected = pages.getSerializePage().isSelected(3);

        assertTrue(isSelected, "Element should be selected!");
    }

    @Test
    void testClickOnRowsWithCtrl(){
        pages.getSerializePage().clickOnRowsWithCtrl(4, 1, 5);

        String actualMessage = pages.getSerializePage().getSelectedRows();

        String expectedMessage = "#1 #4 #5";

        assertEquals(expectedMessage, actualMessage, "The message is wrong!");
    }

    @Test
    void testClickOnRowsWithMouse(){
        pages.getSerializePage().clickWidthMouse(5, 6);

        boolean isSelectedRow5 =  pages.getSerializePage().isSelected(5);
        boolean isSelectedRow6 =  pages.getSerializePage().isSelected(6);

        assertTrue(isSelectedRow5 && isSelectedRow6, "Row 5 and 6 should be selected!");

    }
}
