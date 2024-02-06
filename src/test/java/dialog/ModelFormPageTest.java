package dialog;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModelFormPageTest extends Hooks {


	@Test
	void testModelFormWithValidInputs() {
		// Navigate to ModelFormPage
		pages.getHomePage().clickWebAutomation();
		pages.getWebautomationPage().clickOnTheDialogLink();
		pages.getDialogPage().clickOnTheModelFormLink();
		pages.getModelFormPage().clickOnTheCreateAccountButton();

		// Create an account
		pages.getModelFormPage().createAccount("Emily", "Johnson", "emily.johnson@gmail.com");

		//Click on the submit button
		pages.getModelFormPage().clickOnTheSubmitButton();

		// Get the number of account
		int numberOfAccount = pages.getModelFormPage().getNumberOfSubmittedAccount();

		// Verify the create account process is as expected
		Assert.assertTrue(numberOfAccount == 2,
				"Creating account progress should be performed correctly!");
	}

	@Test(priority = 1)
	void testModelFormWithValidInputs2(){
		//click on the create account button
		pages.getModelFormPage().clickOnTheCreateAccountButton();

		pages.getModelFormPage().clearTextAreas();

		// Create an account
		pages.getModelFormPage().createAccount("Alexander", "Rabinson", "alexander.robinson@gmail.com");

		//Click on the submit button
		pages.getModelFormPage().clickOnTheSubmitButton();

		// Get the number of account
		int numberOfAccount = pages.getModelFormPage().getNumberOfSubmittedAccount();

		// Verify the create account process is as expected
		Assert.assertTrue(numberOfAccount == 3,
				"Creating account progress should be performed correctly!");
	}

	@Test(priority = 2)
	void testModelFormWithInvalidInputs(){
		//click on the create account button
		pages.getModelFormPage().clickOnTheCreateAccountButton();

		pages.getModelFormPage().clearTextAreas();

		// Create an account
		pages.getModelFormPage().createAccount("Olivia", "Harris", "olivia.harris.com");

		//Click on the submit button
		pages.getModelFormPage().clickOnTheSubmitButton();

		// Get the number of account
		int numberOfAccount = pages.getModelFormPage().getNumberOfSubmittedAccount();

		// Verify the create account process is as expected
		Assert.assertTrue(numberOfAccount == 3,
				"Creating account progress should not be performed!");
	}


}
