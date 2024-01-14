package AutocomplateTest;

import baseTest.Hooks;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class AccentFoldingPageTest extends Hooks {

	@Test
	void accentFoldingTest() {
		// Navigate to weborderPage
		pages.getHomePage().clickWebAutomation();

		// Go to accent folding page
		pages.getWebautomationPage().clickOnTheAutoComplateLink();

		pages.getAutocompletePage().clickOnTheAccentFoldingLink();

		// Send J letter to text area
		pages.getAccentFoldingPage().sendLetter("j");

		// Obtain the names
		List<String> actualResult = pages.getAccentFoldingPage().getNames();

		// Verify the actual names are equal to expected names
		String[] expectedNames = { "Jörn Zaefferer", "John Resig" };
		List<String> expectedResult = Arrays.stream(expectedNames).toList();

		expectedResult.stream().forEach(expectedName -> {
			assertEquals(expectedName, actualResult.get(expectedResult.indexOf(expectedName)), "Wrong Name!");
		});

	}

}
