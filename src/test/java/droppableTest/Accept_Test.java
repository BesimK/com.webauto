package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Accept_Test extends Hooks {

    @Test
    void testAccept() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnAcceptLink();

        // Drag the unDroppableBox to the acceptingBox and release
        pages.getAcceptPage().dragUnDroppableBoxToTheAcceptingBox();

        // Verify that the unDroppableBox can not be dropped
        String actualStatus = pages.getAcceptPage().getCurrentStatusOfAcceptingBox();
        String expectedStatus = "accept: '#draggable'";
        Assertions.assertEquals(expectedStatus, actualStatus);

        // Remove the unDroppableBox out of the acceptingBox
        pages.getAcceptPage().dragUnDroppableBoxByXOffset(300);

        // Drag the droppableBox to the acceptingBox and release
        pages.getAcceptPage().dragDroppableBoxToTheAcceptingBox();

        // Verify that the unDroppableBox can not be dropped
        String actual = pages.getAcceptPage().getCurrentStatusOfAcceptingBox();
        String expected = "Dropped!";
        Assertions.assertEquals(expected, actual);
    }
}