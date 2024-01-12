package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;
import utils.Pages;

import java.awt.*;

public class Cursor_Style_Page_Test extends Hooks {
    Pages pages = new Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    void cursorStylePageTest(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the cursor style button
        pages.getWebAutomationPage().clickOnCursorStyleLink();

        //4.Get eighth draggable coordinates
        int initialX = pages.getCursorStylePage().getLocationOfEighthDraggableX();
        int initialY = pages.getCursorStylePage().getLocationOfEighthDraggableY();

        //5.Drag Eighth draggable
        Point cursorPosition = pages.getCursorStylePage().checkEighthDraggable(100,100);
        int finalX = pages.getCursorStylePage().getLocationOfEighthDraggableX();
        int finalY = pages.getCursorStylePage().getLocationOfEighthDraggableY();

        //6.Assert Element is moved and cursor is located at the right place
        Assertions.assertThat(finalX).isGreaterThan(initialX);
        Assertions.assertThat(finalY).isGreaterThan(initialY);

        //Fake Assertion For Testing Cursor's Center Position
        //Assertions.assertThat(cursorPosition.getX()).isEqualTo(finalX);
        //Assertions.assertThat(cursorPosition.getY()).isEqualTo(finalY);

        //6.Drag Ninth Draggable
        cursorPosition = pages.getCursorStylePage().checkNinthDraggable(100,100);

        finalX = pages.getCursorStylePage().getLocationOfNinthDraggableX();
        finalY = pages.getCursorStylePage().getLocationOfNinthDraggableY();

        //Fake Assertion For Testing
        //Assertions.assertThat(cursorPosition.getX()).isEqualTo(finalX-5);
        //Assertions.assertThat(cursorPosition.getY()).isEqualTo(finalY-5);

        //7.Drag Tenth Draggable
        cursorPosition = pages.getCursorStylePage().checkTenthDraggable(100,100);

        finalX = pages.getCursorStylePage().getLocationOfTenthDraggableX();
        finalY = pages.getCursorStylePage().getLocationOfTenthDraggableY();

        //Fake Assertion For Testing
        //Assertions.assertThat(cursorPosition.getX()).isEqualTo(finalX-5);
        //Assertions.assertThat(cursorPosition.getY()).isEqualTo(finalY-5);
    }

}
