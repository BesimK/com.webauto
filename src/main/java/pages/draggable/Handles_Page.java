package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {
    @FindBy(css = "#draggable13>p")
    private WebElement bigHandle;

    @FindBy(xpath = "//p[contains(text(),'but you')]")
    private WebElement smallHandle;

    @FindBy(css = "#draggable13")
    private WebElement boxWithBigHandle;

    @FindBy(id = "draggable14")
    private WebElement boxWithSmallHandle;

    @FindBy(xpath = "//div[@xpath='1']")
    private WebElement outerFrame;

    @FindBy(css = "#draggable14>p")
    private WebElement dragMeAround;

    public Handles_Page() {
        super();
    }

    public void dragByBigHandle(int xOffset, int yOffset) {
        actions.moveToElement(bigHandle).dragAndDropBy(bigHandle, xOffset, yOffset).build().perform();
    }

    public int[] getLocationOfBoxWithBigHandle() {
        int[] coordinates = new int[2];
        coordinates[0] = boxWithBigHandle.getLocation().getX();
        coordinates[1] = boxWithBigHandle.getLocation().getY();
        return coordinates;
    }

    public void dragBoxWithBigHandleWithoutUsingHandle(int xOffset, int yOffset) {
        actions.moveToElement(boxWithBigHandle, 0, 33).dragAndDropBy(boxWithSmallHandle, xOffset, yOffset).build().perform();
    }

    public void dragBySmallHandle(int xOffset, int yOffset) {
        actions.moveToElement(smallHandle).dragAndDropBy(smallHandle, xOffset, yOffset).build().perform();
    }

    public int[] getLocationOfBoxWithSmallHandle() {
        int[] coordinates = new int[2];
        coordinates[0] = boxWithSmallHandle.getLocation().getX();
        coordinates[1] = boxWithSmallHandle.getLocation().getY();
        return coordinates;
    }

    public void dragBoxWithSmallHandleWithoutUsingHandle(int xOffset, int yOffset) {
        actions.moveToElement(dragMeAround).dragAndDropBy(dragMeAround, xOffset, yOffset).build().perform();
    }
}