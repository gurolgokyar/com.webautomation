package controlGroupTest;

import baseTest.Hooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ToolBarPageTest extends Hooks {

	@BeforeMethod
	void navigateToToolbarPage() {
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnTheControlGroupPage();
		// pages.getControlGroupPage().clickOnTheToolbarLink();
	}

	@AfterMethod
	void navigateToHomePage() {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
	}

	@Test
	void selectTheZoomValue() {
		// click on the zoom button
		pages.getToolbarPage().selectTheZoomValue("150%");

		// verify the correct value(150%) is selected
		boolean isSelected = pages.getToolbarPage().isZoomValueSelectedCorrectly("150%");
		assertTrue(isSelected, "Wrong zoom value!");
	}

	@Test
	void selectTheHighLight() {
		// Click on the highLight button
		pages.getToolbarPage().selectTheHighLightValue("Yellow");

		// verify the correct value(Yellow) is selected
		boolean isSelected = pages.getToolbarPage().isHighLightValueSelectedCorrectly("Yellow");
		assertTrue(isSelected, "Wrong highLight value!");
	}

	@Test
	void selectTheColor() {
		// Select the Green as a color value
		pages.getToolbarPage().selectTheColorValue("Green");

		// verify the correct value(Green) is selected
		boolean isSelected = pages.getToolbarPage().isColorValueSelectedCorrectly("Green");
		assertTrue(isSelected, "Wrong color value!");

	}

}
