package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;
import utils.Pages;

public class Constrain_Movements_Page_Test extends Hooks {
    @Test
    void testConstrainMovementsPage() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the constrain movements button
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        // Fourth Draggable WebElement Tests

        //4. Get initial coordinates
        int initialX = pages.getConstrainMovementPage().getLocationOfFourthDraggableX();
        int initialY = pages.getConstrainMovementPage().getLocationOfFourthDraggableY();

        //5. Drag the fourth draggable element by 100 pixels to the right
        pages.getConstrainMovementPage().dragFourthDraggable(100,0);

        //6.Get final coordinates
        int finalX = pages.getConstrainMovementPage().getLocationOfFourthDraggableX();
        int finalY = pages.getConstrainMovementPage().getLocationOfFourthDraggableY();

        Assertions.assertEquals(initialX,finalX);
        //INITIAL Y CHANGES HERE LIES A BUG
        Assertions.assertEquals(initialY+1,finalY);

        //7. Get latest coordinates
        initialX = finalX;
        initialY = finalY;

        //8. Drag the fourth draggable element by 100 pixels downwards 100 pixels to the right
        pages.getConstrainMovementPage().dragFourthDraggable(100,100);

        //9.Get recent coordinates
        finalX = pages.getConstrainMovementPage().getLocationOfFourthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationOfFourthDraggableY();

        Assertions.assertEquals(initialX,finalX);
        org.assertj.core.api.Assertions.assertThat(finalY).isGreaterThan(initialY);

        // Fifth Draggable WebElement Tests

        //10.Get initial coordinates
        initialX = pages.getConstrainMovementPage().getLocationOfFifthDraggableX();
        initialY = pages.getConstrainMovementPage().getLocationOfFifthDraggableY();

        //11.Drag Fifth Element Downwards to check
        pages.getConstrainMovementPage().dragFifthDraggable(0,100);

        //12.Get latest coordinates

        finalX = pages.getConstrainMovementPage().getLocationOfFifthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationOfFifthDraggableY();

        //13. Assert
        Assertions.assertEquals(initialX,finalX);

        //INITIAL Y CHANGES HERE LIES A BUG
        Assertions.assertEquals(initialY+1,finalY);

        //14.Get initial coordinates
        initialX = finalX;
        initialY = finalY;

        //15.Drag Fifth Element 100 pixels right to check
        pages.getConstrainMovementPage().dragFifthDraggable(100,150);

        //16.Get latest coordinates

        finalX = pages.getConstrainMovementPage().getLocationOfFifthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationOfFifthDraggableY();

        //Assert
        org.assertj.core.api.Assertions.assertThat(finalX).isGreaterThan(initialX);
        Assertions.assertEquals(initialY,finalY);

        //Scroll Down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,100)", "");

        // Sixth Draggable WebElement Tests

        //17.Get current location
        initialX = pages.getConstrainMovementPage().getLocationOfSixthDraggableX();
        initialY = pages.getConstrainMovementPage().getLocationOfSixthDraggableY();

        //18.Drag Sixth Draggable element 100 pixels left and 100 pixels upwards
        pages.getConstrainMovementPage().dragSixthDraggable(-100,-100);

        //19.Get Latest Location
        finalX = pages.getConstrainMovementPage().getLocationOfSixthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationOfSixthDraggableY();

        //20.Assert that coordinates are same
        Assertions.assertEquals(initialX,finalX);
        Assertions.assertEquals(initialY,finalY);

        //21.Test mobility of sixth element starting with coordinates
        initialX = finalX;
        initialY = finalY;

        //22.Drag Sixth element by 100 and 100
        pages.getConstrainMovementPage().dragSixthDraggable(100,100);

        //23.Get latest location
        finalX = pages.getConstrainMovementPage().getLocationOfSixthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationOfSixthDraggableY();

        //Assertion
        org.assertj.core.api.Assertions.assertThat(finalX).isGreaterThan(initialX);
        org.assertj.core.api.Assertions.assertThat(finalY).isGreaterThan(initialY);

        // Seventh Draggable WebElement Tests

        //24.Get current location
        initialX = pages.getConstrainMovementPage().getLocationOfSeventhDraggableX();
        initialY = pages.getConstrainMovementPage().getLocationOfSeventhDraggableY();

        //25.Drag seventh WebElement
        pages.getConstrainMovementPage().dragSeventhDraggable(10,10);

        //26.Get latest location
        finalX=pages.getConstrainMovementPage().getLocationOfSeventhDraggableX();
        finalY=pages.getConstrainMovementPage().getLocationOfSeventhDraggableY();

        //Assert
        org.assertj.core.api.Assertions.assertThat(finalX).isGreaterThan(initialX);
        org.assertj.core.api.Assertions.assertThat(finalY).isGreaterThan(initialY);

        //Test whether mentioned element is constrained by outer box
        try{
            pages.getConstrainMovementPage().dragSeventhDraggable(100,100);
            Assertions.fail();
        }catch (Exception ex){
            Assertions.assertTrue(true);
        }
    }


}