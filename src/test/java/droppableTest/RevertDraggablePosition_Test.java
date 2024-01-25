package droppabletest;

import basetest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RevertDraggablePosition_Test extends Hooks {

    @Test
    void testRevertDraggablePosition() throws InterruptedException {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        // Click on the RevertDraggablePosition button
        pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

        // Drag the revertWhenDropped box into the acceptingBox
        int[] initOffsets = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDropped();
        pages.getRevertDraggablePositionPage().dragRevertWhenDroppedToTheAcceptingBox();

        Thread.sleep(1000);
        int[] lastOffsets = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDropped();

        // Verify that the revertWhenDropped box returns its initial place
        boolean isStable = pages.getRevertDraggablePositionPage().isItStable(initOffsets, lastOffsets);
        Assertions.assertTrue(isStable);

        // Drag the revertWhenDropped box to a location other than the acceptingBox
        int[] initOffsets1 = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDropped();
        pages.getRevertDraggablePositionPage().dragRevertWhenDroppedSomewhereElse(550,150);

        Thread.sleep(1000);
        int[] lastOffsets1 = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDropped();

        // Verify that the revertWhenDropped box does not return its initial place
        boolean isStable1 = pages.getRevertDraggablePositionPage().isItStable(initOffsets1, lastOffsets1);
        Assertions.assertFalse(isStable1);

        // Drag the revertWhenNotDropped box to a location other than the acceptingBox
        int[] startOffsets = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDropped();
        pages.getRevertDraggablePositionPage().dragRevertWhenNotDroppedSomewhereElse(550,150);

        Thread.sleep(1000);
        int[] finalOffsets = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDropped();

        // Verify that the revertWhenNotDropped box returns its initial place
        boolean isStable2 = pages.getRevertDraggablePositionPage().isItStable(startOffsets, finalOffsets);
        Assertions.assertTrue(isStable2);

        // Drag the revertWhenNotDropped box into the acceptingBox
        int[] startOffsets1 = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDropped();
        pages.getRevertDraggablePositionPage().dragRevertWhenNotDroppedToTheAcceptingBox();

        Thread.sleep(1000);
        int[] finalOffsets1 = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDropped();

        // Verify that the revertWhenNotDropped box does not return its initial place
        boolean isStable3 = pages.getRevertDraggablePositionPage().isItStable(startOffsets1, finalOffsets1);
        Assertions.assertFalse(isStable3);
    }
}