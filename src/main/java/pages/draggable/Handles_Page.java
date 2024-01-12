package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;
    @FindBy(id = "draggable13")
    private WebElement twelfthNonDraggable;
    @FindBy(xpath = "//p[contains(text(),'I can be dragged only by this handle')]")
    private WebElement twelfthDraggable;
    @FindBy(id = "draggable14")
    private WebElement thirteenthDraggable;
    @FindBy(xpath = "//p[contains(text(),'…but you can't drag me by this handle.')]")
    private WebElement thirteenthNonDraggable;
    public void clickHandlesLink(){
        handlesLink.click();
    }
    public void testTwelfthNonDraggable(){
        actions.moveToElement(twelfthNonDraggable,50,50).perform();
    }
    public void testTwelfthDraggable(){
        actions.moveToElement(twelfthDraggable,50,50).perform();
    }
    public void testThirteenthDraggable(){
        actions.moveToElement(thirteenthDraggable,50,50).perform();
    }
    public void testThirteenthNonDraggable(){
        actions.moveToElement(thirteenthNonDraggable,50,50).perform();
    }
    public int getLocationOfTwelfthDraggableX(){
        return twelfthDraggable.getLocation().getX();
    }
    public int getLocationOfTwelfthDraggableY(){
        return twelfthDraggable.getLocation().getY();
    }
    public int getLocationOfThirteenthDraggableX(){
        return twelfthDraggable.getLocation().getX();
    }
    public int getLocationOfThirteenthDraggableY(){
        return twelfthDraggable.getLocation().getY();
    }
}
