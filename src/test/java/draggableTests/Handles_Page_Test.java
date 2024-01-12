package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Handles_Page_Test extends Hooks {
    @Test
    void testHandles(){
        //1.Open URl
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Navigate to draggable tab
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3.Navigate to events tab
        pages.getHandlesPage().clickHandlesLink();

        //Assert 12th NonDraggable
        try {
            pages.getHandlesPage().testTwelfthNonDraggable();
            Assertions.fail();
        }catch (Exception ex){
            Assertions.assertTrue(true);
        }

        //Assert 13th NonDraggable
        try {
            pages.getHandlesPage().testThirteenthNonDraggable();
            Assertions.fail();
        }catch (Exception ex){
            Assertions.assertTrue(true);
        }
        //Assert 12th Draggable
        int initialX = pages.getHandlesPage().getLocationOfTwelfthDraggableX();
        int initialY = pages.getHandlesPage().getLocationOfTwelfthDraggableY();
        pages.getHandlesPage().testTwelfthDraggable();
        int finalX = pages.getHandlesPage().getLocationOfTwelfthDraggableX();
        int finalY = pages.getHandlesPage().getLocationOfTwelfthDraggableY();
        Assertions.assertTrue(finalX>initialX);
        Assertions.assertTrue(finalY>initialY);

        //Assert 13th Draggable
        initialX = pages.getHandlesPage().getLocationOfThirteenthDraggableX();
        initialY = pages.getHandlesPage().getLocationOfThirteenthDraggableY();
        pages.getHandlesPage().testThirteenthDraggable();
        finalX = pages.getHandlesPage().getLocationOfThirteenthDraggableX();
        finalY = pages.getHandlesPage().getLocationOfThirteenthDraggableY();
        Assertions.assertTrue(finalX>initialX);
        Assertions.assertTrue(finalY>initialY);

    }
}
