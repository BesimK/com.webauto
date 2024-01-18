package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowConfirm_Test extends Hooks {

    @Test
    void testShowConfirm() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Alerts Link
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();

        // Click on the Show Confirm Link
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnShowConfirmLink();

        // Switch to Alert and get the text
        pages.getShowConfirmPage().flowIntoAlert();
        String actualMessage = pages.getShowConfirmPage().getText();

        // Verify the message
        String expectedMessage = "Are you sure?";
        Assertions.assertEquals(expectedMessage, actualMessage);

        // Accept the message and get the new text
        pages.getShowConfirmPage().accept();
        String actualConfirmMessage = pages.getShowConfirmPage().getText();

        // Verify the message and accept it
        String expectedConfirmMessage = "Confirmed!";
        Assertions.assertEquals(expectedConfirmMessage, actualConfirmMessage);
        pages.getShowConfirmPage().accept();

        // Renew the steps to Dismiss confirm message
        pages.getWebAutomationPage().clickOnShowConfirmLink();
        pages.getShowConfirmPage().flowIntoAlert();
        pages.getShowConfirmPage().dismiss();

        // Verify that alert message is disappeared
        pages.getShowConfirmPage().isAlertMessageDisappeared();
        boolean isAlertMessageDisappeared = pages.getShowConfirmPage().isAlertMessageDisappeared();
        Assertions.assertTrue(isAlertMessageDisappeared);
    }
}