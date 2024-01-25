package sortableTest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class DisplayAsGrid_Test extends Hooks {

    @Test
    void testDisplayAsGrid() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnSortableLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnDisplayAsGridLink();

        // Send number "5" to the place of number "7"
        pages.getDisplayAsGridPage().sendSelectedNumberNextToTwo(5);

        // Verify that the number "5" has moved on into "7"
        int actualNumber = pages.getDisplayAsGridPage().getActualNumberHoldByGrid(7);
        softAssertions.assertThat(actualNumber).as("Since we replace 5 with 7, actual value should be 5").isEqualTo(5);
    }
}