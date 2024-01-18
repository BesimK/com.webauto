package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePosition_Page extends BasePage {
    @FindBy(id = "draggable-revert-draggable")
    private WebElement revertWhenDropped;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement revertWhenNotDropped;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement acceptingBox;

    @FindBy(css = "#droppable-revert-draggable>p")
    private WebElement statusOfAcceptingBox;

    public RevertDraggablePosition_Page() {
        super();
    }

    public int[] getLocationOfRevertWhenDropped() {
        int[] result = new int[2];
        result[0] = revertWhenDropped.getLocation().getX();
        result[1] = revertWhenDropped.getLocation().getY();
        return result;
    }

    public int[] getLocationOfRevertWhenNotDropped() {
        int[] result = new int[2];
        result[0] = revertWhenNotDropped.getLocation().getX();
        result[1] = revertWhenNotDropped.getLocation().getY();
        return result;
    }

    public boolean isItStable(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public void dragRevertWhenDroppedToTheAcceptingBox() {
        actions.dragAndDrop(revertWhenDropped, acceptingBox).perform();
    }

    public void dragRevertWhenDroppedSomewhereElse(int xOffset, int yOffset) {
        actions.dragAndDropBy(revertWhenDropped, xOffset, yOffset).perform();
    }

    public void dragRevertWhenNotDroppedToTheAcceptingBox() {
        actions.dragAndDrop(revertWhenNotDropped, acceptingBox).perform();
    }

    public void dragRevertWhenNotDroppedSomewhereElse(int xOffset, int yOffset) {
        actions.dragAndDropBy(revertWhenNotDropped, xOffset, yOffset).perform();
    }
}