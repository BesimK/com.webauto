package alertstest;

import basetest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowPrompt_Test extends Hooks {

    @Test
    void testShowPrompt() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Alerts Link
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();

        // Click on the Show Confirm Link
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnShowPromptLink();

        // Switch to Alert and enter a message
        pages.getShowPromptPage().switchIntoAlertMessage();
        pages.getShowPromptPage().sendKeys("Inar Academy");

        // Accept the alert
        pages.getShowPromptPage().accept();

        // Get the message of website
        String actualMessage = pages.getShowPromptPage().getText();

        // Verify the message is correct!
        Assertions.assertEquals("Hello, Inar Academy!", actualMessage);

        // Accept the alert
        pages.getShowPromptPage().accept();
    }
}