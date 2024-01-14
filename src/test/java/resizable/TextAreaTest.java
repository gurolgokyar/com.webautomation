package resizable;

import baseTest.Hooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TextAreaTest extends Hooks {

	@BeforeMethod
	void navigateToTextAreaPage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnResizeableLink();
		pages.getResizeablePage().clickOnTextAreaLink();
	}

	@AfterMethod
	void navigateToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void testIsTextAreaContainsTheSandedMessage() {
		pages.getTextAreaPage().sendMessageInTextArea("Hello world!");
		String expectedMessage = "Hello world!";
		String actualMessage = pages.getTextAreaPage().getTextFromTextArea();
		assertEquals(expectedMessage, actualMessage, "Wrong message !");
	}

	@Test
	void testResizabilityOfTextArea() {
		int initialWidth = pages.getTextAreaPage().getWidthOfTextArea();
		int initialHeight = pages.getTextAreaPage().getHeightOfTextArea();

		pages.getTextAreaPage().setTextArea(30, 30);

		int finalWidth = pages.getTextAreaPage().getWidthOfTextArea();
		int finalHeight = pages.getTextAreaPage().getHeightOfTextArea();

		assertTrue(finalWidth > initialWidth, "Width of text area should grow in length!");
		assertTrue(finalHeight > initialHeight, "Height of test area should grow in height!");
	}

}
