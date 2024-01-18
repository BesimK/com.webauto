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

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;

    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Control Group")
    private WebElement controlGroupLink;

    @FindBy(linkText = "Toolbar")
    private WebElement toolbarLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datepickerLink;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;

    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;

    @FindBy(linkText = "Modal Form")
    private WebElement modalFormLink;

    @FindBy(linkText = "Menu")
    private WebElement menuLink;

    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(css = ".frame-container .btn-success")
    private WebElement showConfirmLink;

    @FindBy(css = ".frame-container .btn-warning")
    private WebElement showPromptLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickOnRevertDraggablePositionLink() {
        revertDraggablePositionLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSynchronusResizeLink() {
        synchronusResizeLink.click();
    }

    public void clickOnTextAreaLink() {
        textAreaLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnNormalIframe() {
        normalIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnShowConfirmLink() {
        showConfirmLink.click();
    }

    public void clickOnShowPromptLink() {
        showPromptLink.click();
    }

    public void clickOnSerializeLink() {
        serializeLink.click();
    }

    public void clickOnAutocompleteLink() {
        autocompleteLink.click();
    }

    public void clickOnAccentFoldingLink() {
        accentFoldingLink.click();
    }

    public void clickOnMenuLink() {
        menuLink.click();
    }

    public void clickOnIconsLink() {
        iconsLink.click();
    }

    public void clickOnProgressBarLink() {
        progressBarLink.click();
    }

    public void clickOnDownloadDialogLink() {
        downloadDialogLink.click();
    }

    public void clickOnDatepickerLink() {
        datepickerLink.click();
    }

    public void clickOnDisplayMultipleMonthsLink() {
        displayMultipleMonthsLink.click();
    }

    public void clickOnSelectDateRangeLink() {
        selectDateRangeLink.click();
    }

    public void clickOnDialogLink() {
        dialogLink.click();
    }

    public void clickOnModalFormLink() {
        modalFormLink.click();
    }

    public void clickOnControlGroupLink() {
        controlGroupLink.click();
    }

    public void clickOnToolbarLink() {
        toolbarLink.click();
    }
}