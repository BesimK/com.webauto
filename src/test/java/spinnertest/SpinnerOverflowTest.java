package spinnertest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class SpinnerOverflowTest extends Hooks {

    @Test
    void testSpinnerOverflow(){

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnSpinnerLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnSpinnerOverflowLink();

        // Define the selected value as "10"
        pages.getSpinnerOverflowPage().setSelectedValue("10");

        // Click on increment button for one time
        pages.getSpinnerOverflowPage().clickOnIncrementButtonForTimes(1);

        // Verify that value return to the number "-10"
        String selectedValue = pages.getSpinnerOverflowPage().getSelectedValue();
        softAssertions.assertThat(selectedValue).as("upcoming number after 10 should be -10").isEqualTo("-10");

        // Click on decrement button for "22" times
        pages.getSpinnerOverflowPage().clickOnDecrementButtonForTimes(22);

        // Verify that value return to the number "10"
        selectedValue = pages.getSpinnerOverflowPage().getSelectedValue();
        softAssertions.assertThat(selectedValue).as("upcoming number after -10 should be 10").isEqualTo("10");

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}