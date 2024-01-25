package slidertest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class SnapToIncrement_Test extends Hooks {

    @Test
    void testSnapToIncrement() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnSliderLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnSnapToIncrementLink();

        // Slide the handle to the right for a specific value
        pages.getSnapToIncrementsPage().holdOnSlidingHandleAndDragToTheRightOrLeft(980);

        // Slide the handle to the left for a specific value
        pages.getSnapToIncrementsPage().holdOnSlidingHandleAndDragToTheRightOrLeft(-500);

        // Get the value of Donation Amount shown by "Donation amount ($50 increments):"
        boolean isDonationAmountMachWithIncrementAmount = pages.getSnapToIncrementsPage().isDonationAmountMachWithIncrementAmount(200);
        softAssertions.assertThat(isDonationAmountMachWithIncrementAmount).isTrue().as("Donation amount does not match with the increment amount provided");

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}