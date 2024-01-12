package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Cursor Style")
    private WebElement cursorStylelink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    public void clickOnCursorStyleLink(){
    cursorStylelink.click();
    }
    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }
    public void clickOnConstrainMovementLink(){
        constrainMovementLink.click();
    }
    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnResizableLink(){
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink(){
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink(){
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality(){
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink(){
        iframeLink.click();
    }

    public void clickOnNestedIframe(){
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink(){
        alertsLink.click();
    }

    public void clickOnAnimateLink(){
        animateLink.click();
    }
}
