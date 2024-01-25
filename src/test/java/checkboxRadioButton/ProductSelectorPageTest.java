package checkboxRadioButton;

import baseTest.Hooks;
import org.testng.annotations.Test;

public class ProductSelectorPageTest extends Hooks {

    @Test
    void isClickedButtonSelected(){
        //Navigate to  ProductSelectorPage
        pages.getHomePage().clickWebAutomation();

        pages.getWebautomationPage().clickOnTheCheckboxRadioButton();

        pages.getCheckboxRadiobuttonPage().clickOnTheProductSelectorLink();

        //click on the an element on the first row
        pages.productSelectorPage.clickOnTheButtonsOnARow(0, 3);

        //Verify that clicked button is selected
        softAssert.assertTrue(pages.getProductSelectorPage().isButtonClicked(0, 3));

        //click on the an element on the first row
        pages.productSelectorPage.clickOnTheButtonsOnARow(1, 1);

        //Verify that clicked button is selected
        softAssert.assertTrue(pages.getProductSelectorPage().isButtonClicked(1, 1));

        //click on two button on the last row
        pages.productSelectorPage.clickOnTheButtonsOnARow(2, 2);
        pages.productSelectorPage.clickOnTheButtonsOnARow(2, 0);

        //Verify that clicked buttons are selected
        softAssert.assertTrue(pages.getProductSelectorPage().isButtonClicked(2, 2) &&
                pages.getProductSelectorPage().isButtonClicked(2, 0));

        softAssert.assertAll();

    }
}
