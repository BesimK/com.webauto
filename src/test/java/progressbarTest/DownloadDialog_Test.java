package progressbarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class DownloadDialog_Test extends Hooks {

    @Test
    void testDownloadDialog() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnProgressBarLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnDownloadDialogLink();

        // Click on the Start Download button
        pages.getDownloadDialogPage().clickOnStartDownloadButton();

        // Verify that Download process started
        boolean isProcessStarted = pages.getDownloadDialogPage().isDownloadBoxDisplayed();
        softAssertions.assertThat(isProcessStarted).as("File Download box should be displayed").isTrue();

        // Verify that CurrentProgressBarFunctionsProperly
        boolean isProgressBarShifted = pages.getDownloadDialogPage().isCurrentProgressBarFunctionsProperly();
        softAssertions.assertThat(isProgressBarShifted).as("Current Progress Bar should be shifting").isTrue();

        // Click the cancel button to stop the process
        pages.getDownloadDialogPage().clickOnCancelButton();
        BrowserUtils.wait(2);

        // Verify that cancel button functions properly
        boolean doesProcessContinue = pages.getDownloadDialogPage().isDownloadBoxDisplayed();
        softAssertions.assertThat(doesProcessContinue).as("Download process should not be continue").isFalse();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}