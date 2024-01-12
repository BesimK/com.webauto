package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Constrain_Movements_Page extends BasePage {
    @FindBy(id = "draggable5")
    private WebElement fourthDraggable;
    @FindBy(id = "draggable6")
    private WebElement fifthDraggable;
    @FindBy(id = "draggable7")
    private WebElement sixthDraggable;
    @FindBy(id = "draggable8")
    private WebElement seventhDraggable;

    public void dragFourthDraggable(int xOffset,int yOffset) {
        actions.dragAndDropBy(fourthDraggable, xOffset, yOffset).perform();
    }
    public void dragFifthDraggable(int xOffset,int yOffset) {
        actions.dragAndDropBy(fifthDraggable, xOffset, yOffset).perform();
    }
    public void dragSixthDraggable(int xOffset,int yOffset) {
        actions.dragAndDropBy(sixthDraggable, xOffset, yOffset).perform();
    }
    public void dragSeventhDraggable(int xOffset,int yOffset) {
        actions.dragAndDropBy(seventhDraggable, xOffset, yOffset).perform();
    }
    public int getLocationOfFourthDraggableX() {
        return fourthDraggable.getLocation().getX();
    }
    public int getLocationOfFourthDraggableY() {
        return fourthDraggable.getLocation().getY();
    }

    public int getLocationOfFifthDraggableX() {
        return fifthDraggable.getLocation().getX();
    }
    public int getLocationOfFifthDraggableY() {
        return fifthDraggable.getLocation().getY();
    }

    public int getLocationOfSixthDraggableX() {
        return sixthDraggable.getLocation().getX();
    }
    public int getLocationOfSixthDraggableY() {
        return sixthDraggable.getLocation().getY();
    }

    public int getLocationOfSeventhDraggableX() {
        return seventhDraggable.getLocation().getX();
    }
    public int getLocationOfSeventhDraggableY() {
        return seventhDraggable.getLocation().getY();
    }
}
