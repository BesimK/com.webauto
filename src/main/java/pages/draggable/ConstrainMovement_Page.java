package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {

    @FindBy(id = "draggable5")
    private WebElement verticallyMovedBox;

    @FindBy(id = "draggable6")
    private WebElement horizontallyMovedBox;

    @FindBy(id = "draggable7")
    private WebElement boxWithinBigBox;

    @FindBy(id = "draggable8")
    private WebElement boxWithinSmallBox;

    @FindBy(id = "containment-wrapper")
    private WebElement bigBox;

    @FindBy(css = "#containment-wrapper > div:nth-child(2)")
    private WebElement smallBox;

    public ConstrainMovement_Page() {
        super();
    }

    // verticallyMovedBox
    public int getLocationOfVerticallyMovedBoxByX() {
        return verticallyMovedBox.getLocation().getX();
    }

    public int getLocationOfVerticallyMovedBoxByY() {
        return verticallyMovedBox.getLocation().getY();
    }

    public void dragVerticallyMovedBoxByXOffset(int xOffset) {
        actions.dragAndDropBy(verticallyMovedBox, xOffset, 0).perform();
    }

    public void dragVerticallyMovedBoxByYOffset(int yOffset) {
        actions.dragAndDropBy(verticallyMovedBox, 0, yOffset).perform();
    }

    // horizontallyMovedBox
    public int getLocationOfHorizontallyMovedBoxByX() {
        return horizontallyMovedBox.getLocation().getX();
    }

    public int getLocationOfHorizontallyMovedBoxByY() {
        return horizontallyMovedBox.getLocation().getY();
    }

    public void dragHorizontallyMovedBoxByXOffset(int xOffset) {
        actions.dragAndDropBy(horizontallyMovedBox, xOffset, 0).perform();
    }

    public void dragHorizontallyMovedBoxByYOffset(int yOffset) {
        actions.dragAndDropBy(horizontallyMovedBox, 0, yOffset).perform();
    }

    public boolean isFunctionalityOfVerticallyMovedBoxValid(int xOffset, int yOffset) {

        int initialXValue = verticallyMovedBox.getLocation().getX();
        int initialYValue = verticallyMovedBox.getLocation().getY();
        actions.dragAndDropBy(verticallyMovedBox, xOffset, 0).perform();
        int updatedXValue = verticallyMovedBox.getLocation().getX();
        actions.dragAndDropBy(verticallyMovedBox, 0, yOffset).perform();
        int updatedYValue = verticallyMovedBox.getLocation().getY();

        if ((initialXValue == updatedXValue) && initialYValue != updatedYValue) {
            return true;
        }
        return false;
    }

    // bigBox
    public int getLocationsOfBigBoxByX() {
        return bigBox.getLocation().getX();
    }

    public int getWidthOfBigBox() {
        return bigBox.getSize().width;
    }

    public int getHeightOfBigBox() {
        return bigBox.getSize().height;
    }

    // smallBox
    public int getWidthOfSmallBox() {
        return smallBox.getSize().width;
    }

    public int getHeightOfSmallBox() {
        return smallBox.getSize().height;
    }

    // boxWithinBigBox
    public void dragBoxWithinBigBoxByXOffset(int xOffset) {
        actions.dragAndDropBy(boxWithinBigBox, xOffset, 0).perform();
    }

    public void dragBoxWithinBigBoxByYOffset(int yOffset) {
        actions.dragAndDropBy(boxWithinBigBox, 0, yOffset).perform();
    }

    public int getLocationOfBoxWithinBigBoxByX() {
        return boxWithinBigBox.getLocation().getX();
    }

    public int getLocationOfBoxWithinBigBoxByY() {
        return boxWithinBigBox.getLocation().getY();
    }

    // boxWithinSmallBox
    public void dragBoxWithinSmallBoxByXOffset(int xOffset) {
        actions.dragAndDropBy(boxWithinSmallBox, xOffset, 0).perform();
    }
    public int getLocationOfBoxWithinSmallBoxByX() {
        return boxWithinSmallBox.getLocation().getX();
    }
}
