package pages.draggable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class Cursor_Style_Page extends BasePage {
    @FindBy(id = "draggable9")
    private WebElement eighthDraggable;
    @FindBy(id = "draggable10")
    private WebElement ninthDraggable;
    @FindBy(id = "draggable11")
    private WebElement tenthDraggable;

    public Point checkEighthDraggable(int xOffset, int yOffset){
        actions.dragAndDropBy(eighthDraggable,xOffset,yOffset);
        BrowserUtils.wait(1);
        org.openqa.selenium.Point currentPosition = DRIVER.switchTo().activeElement().getLocation();
        actions.perform();
        DRIVER.switchTo().defaultContent();
        return currentPosition;
    }
    public Dimension getSize8(){
        return eighthDraggable.getSize();
    }
    public Point checkNinthDraggable(int xOffset, int yOffset){
        actions.dragAndDropBy(ninthDraggable,xOffset,yOffset);
        BrowserUtils.wait(1);
        org.openqa.selenium.Point currentPosition = DRIVER.switchTo().activeElement().getLocation();
        actions.perform();
        DRIVER.switchTo().defaultContent();
        return currentPosition;
    }
    public Point checkTenthDraggable(int xOffset, int yOffset){
        actions.dragAndDropBy(tenthDraggable,xOffset,yOffset);
        BrowserUtils.wait(1);
        org.openqa.selenium.Point currentPosition = DRIVER.switchTo().activeElement().getLocation();
        actions.perform();
        DRIVER.switchTo().defaultContent();
        return currentPosition;
    }

    public int getLocationOfEighthDraggableX() {
        return eighthDraggable.getLocation().getX();
    }
    public int getLocationOfEighthDraggableY() {
        return eighthDraggable.getLocation().getY();
    }
    public int getLocationOfNinthDraggableX() {
        return ninthDraggable.getLocation().getX();
    }
    public int getLocationOfNinthDraggableY() {
        return ninthDraggable.getLocation().getY();
    }

    public int getLocationOfTenthDraggableX() {
        return tenthDraggable.getLocation().getX();
    }
    public int getLocationOfTenthDraggableY() {
        return tenthDraggable.getLocation().getY();
    }


}
