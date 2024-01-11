package droppableTest;

import baseTest.Hooks;
import utils.Pages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AcceptPageTest extends Hooks {
    Pages pages = new Pages();
    @BeforeEach
    public void navigateToAcceptPage(){
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnDroppableLink();
        pages.getDroppablePage().clickOnAcceptLink();
    }

    @AfterEach
    void navigateToHomePage(){
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }


    @Test
    void testUnDroppableBox(){
        pages.getAcceptPage().dragUnDroppableBox();

        String messageInBigBox = pages.getAcceptPage().getTextInBigBox();

        assertEquals("accept: '#draggable'", messageInBigBox, "The message in the big box is not as expected!");
    }

    @Test
    void testDroppableBox(){
        pages.getAcceptPage().dragDroppableBox();

        String messageInBigBox = pages.getAcceptPage().getTextInBigBox();

        assertEquals("Dropped!", messageInBigBox, "The message in the big box is not as expected!");
    }


}
