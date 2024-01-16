package dialog;

import baseTest.Hooks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModelFormPageTest extends Hooks {


    @DataProvider(name = "createAccountProvider")
    public Object[][] provideCreateAccountCredentials() {
        return new Object[][]{
                {"Emily", "Johnson", "emily.johnson@gmail.com", 2},
                {"Alexander", "Rabinson", "alexander.robinson@gmail.com", 3},
                {"Olivia", "Harris", "olivia.harris.com", 3}
        };
    }

    @Test(dataProvider = "createAccountProvider")
    void testModelForm(String name, String surname, String emailAddress, int expectedNumberOfAccount) {
        //Navigate to ModelFormPage
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnTheDialogLink();
        pages.getDialogPage().clickOnTheModelFormLink();
        pages.getModelFormPage().clickOnTheCreateAccountButton();

        //Create an account
        pages.getModelFormPage().createAccount(name, surname, emailAddress);

        //Get the number of account
        int numberOfAccount = pages.getModelFormPage().getNumberOfSubmittedAccount();

        //Verify the create account process is as expected
        Assert.assertTrue(numberOfAccount == expectedNumberOfAccount , "Creating account progress should not be " +
                "submitted!");
    }

}
