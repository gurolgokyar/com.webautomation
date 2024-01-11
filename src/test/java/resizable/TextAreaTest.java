package resizable;

import baseTest.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextAreaTest extends Hooks {

    @BeforeEach
    void navigateToTextAreaPage(){
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnResizeableLink();
        pages.getResizeablePage().clickOnTextAreaLink();
    }

    @AfterEach
    void navigateToHomePage(){
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @Test
    void testIsTextAreaContainsTheSandedMessage(){
        pages.getTextAreaPage().sendMessageInTextArea("Hello world!");
        String expectedMessage = "Hello world!";
        String actualMessage = pages.getTextAreaPage().getTextFromTextArea();
        assertEquals(expectedMessage, actualMessage, "Wrong message !");
    }

    @Test
    void testResizabilityOfTextArea(){
        int initialWidth = pages.getTextAreaPage().getWidthOfTextArea();
        int initialHeight = pages.getTextAreaPage().getHeightOfTextArea();

        pages.getTextAreaPage().setTextArea(30, 30);

        int finalWidth = pages.getTextAreaPage().getWidthOfTextArea();
        int finalHeight = pages.getTextAreaPage().getHeightOfTextArea();

        assertTrue(finalWidth > initialWidth, "Width of text area should grow in length!");
        assertTrue(finalHeight > initialHeight, "Height of test area should grow in height!");
    }
}
