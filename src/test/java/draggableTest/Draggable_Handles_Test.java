package draggableTest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class Draggable_Handles_Test extends Hooks {
    @Test
    void testingDraggableByHandles() {

        // Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        // Click on the Handles button
        pages.getWebAutomationPage().clickOnHandlesLink();

        // Get the location of box with big handle before action
        int[] initLocation = pages.getHandlesPage().getLocationOfBoxWithBigHandle();

        // Drag the box by grabbing it from its big handle
        pages.getHandlesPage().dragByBigHandle(350, 150);

        // Get the location of box with big handle after action
        int[] finalLocation = pages.getHandlesPage().getLocationOfBoxWithBigHandle();

        // Verify that the big handle functions properly and moves the box to its new place
        softAssertions.assertThat(finalLocation).doesNotContain(initLocation);

        // Get the location of box with big handle before action
        initLocation = pages.getHandlesPage().getLocationOfBoxWithBigHandle();

        // Drag the box NOT by grabbing it from its big handle
        pages.getHandlesPage().dragBoxWithBigHandleWithoutUsingHandle(0, 100);

        // Get the location of box with big handle after action
        finalLocation = pages.getHandlesPage().getLocationOfBoxWithBigHandle();

        // Verify that the box with big handle does not move without using its handle
        softAssertions.assertThat(finalLocation).containsExactly(initLocation);

        // Get the location of box with small handle before action
        initLocation = pages.getHandlesPage().getLocationOfBoxWithSmallHandle();

        // Drag the box by grabbing it from its small handle
        pages.getHandlesPage().dragBySmallHandle(350, 150);

        // Get the location of box with small handle after action
        finalLocation = pages.getHandlesPage().getLocationOfBoxWithSmallHandle();

        // Verify that the small handle functions properly and does not move the box to its new place
        softAssertions.assertThat(finalLocation).containsExactly(initLocation);

        // Get the location of box with small handle before action
         initLocation = pages.getHandlesPage().getLocationOfBoxWithSmallHandle();

        // Drag the box NOT by grabbing it from its small handle
        pages.getHandlesPage().dragBoxWithSmallHandleWithoutUsingHandle(350, 150);

        // Get the location of box with small handle after action
         finalLocation = pages.getHandlesPage().getLocationOfBoxWithSmallHandle();

        // Verify that the box with small handle functions properly and changes its place without using handle
        softAssertions.assertThat(finalLocation).doesNotContain(initLocation);
        softAssertions.assertAll();
    }
}