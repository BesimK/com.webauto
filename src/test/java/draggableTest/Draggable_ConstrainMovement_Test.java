package draggableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Draggable_ConstrainMovement_Test extends Hooks {

    @Test
    void testConstrainMovement() {

        // 1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        // 3. Click on the constrain movement button
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        // 4. Drag the verticallyMovedBox to the right and drop
        int initialXValueOfVerticallyMovedBox = pages.getConstrainMovementPage().getLocationOfVerticallyMovedBoxByX();
        pages.getConstrainMovementPage().dragVerticallyMovedBoxByXOffset(300);

        // 5. Verify that verticallyMovedBox do not move
        int updatedXValueOfVerticallyMovedBox = pages.getConstrainMovementPage().getLocationOfVerticallyMovedBoxByX();
        Assertions.assertEquals(initialXValueOfVerticallyMovedBox, updatedXValueOfVerticallyMovedBox);

        // 6. Drag the verticallyMovedBox to the down and drop
        int initialYValueOfVerticallyMovedBox = pages.getConstrainMovementPage().getLocationOfVerticallyMovedBoxByY();
        pages.getConstrainMovementPage().dragVerticallyMovedBoxByYOffset(100);

        // 7. Verify that verticallyMovedBox moves to down
        int updatedYValueOfVerticallyMovedBox = pages.getConstrainMovementPage().getLocationOfVerticallyMovedBoxByY();
        Assertions.assertNotEquals(initialYValueOfVerticallyMovedBox, updatedYValueOfVerticallyMovedBox);

        // 8. Drag the horizontallyMovedBox to the right and drop
        int initialXValueOfHorizontallyMovedBox = pages.getConstrainMovementPage().getLocationOfHorizontallyMovedBoxByX();
        pages.getConstrainMovementPage().dragHorizontallyMovedBoxByXOffset(400);

        // 9. Verify that horizontallyMovedBox moves to the right
        int updatedXValueOfHorizontallyMovedBox = pages.getConstrainMovementPage().getLocationOfVerticallyMovedBoxByX();
        Assertions.assertNotEquals(initialXValueOfHorizontallyMovedBox, updatedXValueOfHorizontallyMovedBox);

        // 10. Drag the horizontallyMovedBox to the down and drop
        int initialYValueOfHorizontallyMovedBox = pages.getConstrainMovementPage().getLocationOfHorizontallyMovedBoxByY();
        pages.getConstrainMovementPage().dragHorizontallyMovedBoxByYOffset(100);

        // 11. Verify that horizontallyMovedBox do not move
        int updatedYValueOfHorizontallyMovedBox = pages.getConstrainMovementPage().getLocationOfHorizontallyMovedBoxByY();
        Assertions.assertEquals(initialYValueOfHorizontallyMovedBox, updatedYValueOfHorizontallyMovedBox);

        // 12. Verify that the functionality of the verticallyMovedBox is correct
        boolean movement = pages.getConstrainMovementPage().isFunctionalityOfVerticallyMovedBoxValid(150, 150);
        assertTrue(movement);

        // 13.Try to drag the boxWithinBigBox out of the big box
        int initialXValueOfBoxWithinBigBox = pages.getConstrainMovementPage().getLocationOfBoxWithinBigBoxByX();
        pages.getConstrainMovementPage().dragBoxWithinBigBoxByXOffset(500);

        pages.getConstrainMovementPage().dragBoxWithinBigBoxByXOffset(-600);
        int finalXValueOfBoxWithinBigBox = pages.getConstrainMovementPage().getLocationOfBoxWithinBigBoxByX();

        // 14.Verify that the boxWithinBigBox do not move out of the big box
        assertEquals(initialXValueOfBoxWithinBigBox, finalXValueOfBoxWithinBigBox);

        // 15.Try to drag the boxWithinSmallBox out of the small box
        pages.getConstrainMovementPage().dragBoxWithinSmallBoxByXOffset(-100);
        int initialXValueOfBoxWithinSmallBox = pages.getConstrainMovementPage().getLocationOfBoxWithinSmallBoxByX();

        pages.getConstrainMovementPage().dragBoxWithinSmallBoxByXOffset(300);
        pages.getConstrainMovementPage().dragBoxWithinSmallBoxByXOffset(-400);
        int finalXValueOfBoxWithinSmallBox = pages.getConstrainMovementPage().getLocationOfBoxWithinSmallBoxByX();

        // 16.Verify that the boxWithinSmallBox do not move out of the small box
        assertEquals(initialXValueOfBoxWithinSmallBox, finalXValueOfBoxWithinSmallBox);
    }
}