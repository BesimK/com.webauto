package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accept_Page extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement unDroppableBox;

    @FindBy(id = "draggable-accept")
    private WebElement droppableBox;

    @FindBy(id = "droppable-accept")
    private WebElement acceptingBox;

    @FindBy(css = "#droppable-accept>p")
    private WebElement statusOfAcceptingBox;

    public Accept_Page() {
        super();
    }

    public void dragUnDroppableBoxToTheAcceptingBox() {
        actions.dragAndDrop(unDroppableBox, acceptingBox).perform();
    }

    public String getCurrentStatusOfAcceptingBox() {
        return statusOfAcceptingBox.getText();
    }

    public void dragDroppableBoxToTheAcceptingBox() {
        actions.dragAndDrop(droppableBox, acceptingBox).perform();
    }

    public void dragUnDroppableBoxByXOffset(int xOffset) {
        actions.dragAndDropBy(unDroppableBox, xOffset, 0).perform();
    }
}