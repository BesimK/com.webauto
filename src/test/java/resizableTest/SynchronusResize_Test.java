package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The box with 'green' line has control over the 'other' box. (Let's refer to the 'other' box as the puppet and the box with the 'green' line as the puppeteer.)
 * Verify that the puppet does not have the power to manipulate the puppeteer.
 * Verify that each box has three specific movement directions.(take puppeteer as a model)
 */
public class SynchronusResize_Test extends Hooks {

    @Test
    void testSynchronusResize() throws InterruptedException {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        // Click on the SynchronusResize button
        pages.getWebAutomationPage().clickOnSynchronusResizeLink();

        // Verify that clickAndHold the Puppeteer downward does not change its width.
        boolean currentStatus = pages.getSynchronusResizePage().isClickAndHoldToDownChangeWidthOfPuppeteer(100,100);
        Assertions.assertFalse(currentStatus);

        // Verify that clickAndHold the Puppeteer rightward does not change its height.
        boolean status = pages.getSynchronusResizePage().isClickAndHoldToRightChangeHeightOfPuppeteer(100,100);
        Assertions.assertFalse(status);

        // Verify that clickAndHold the Puppeteer at the corner causes some changes in its dimensions.
        boolean causeChange = pages.getSynchronusResizePage().isClickAndHoldByCornerChangeDimensionsOfPuppeteer(100,100);
        Assertions.assertTrue(causeChange);
        Thread.sleep(1000);

        // Verify that the puppeteer has the power to manipulate the puppet.
        boolean hasPower = pages.getSynchronusResizePage().doesHavePuppeteerAnyPowerToManipulatePuppet(-150,-150);
        Assertions.assertTrue(hasPower);

        // Verify that the puppet does not have the power to manipulate the puppeteer.
        hasPower = pages.getSynchronusResizePage().doesHavePuppetAnyPowerToManipulatePuppeteer(100,100);
        Assertions.assertFalse(hasPower);
    }
}