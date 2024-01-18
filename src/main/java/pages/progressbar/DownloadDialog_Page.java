package pages.progressbar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class DownloadDialog_Page extends BasePage {
    @FindBy(id = "downloadButton-download-dialog")
    private WebElement downloadButton;

    @FindBy(id = "ui-id-82")
    private WebElement fileDownloadButton;

    @FindBy(css = ".ui-dialog-titlebar .ui-button")
    private WebElement fileDownloadCloseButton;

    @FindBy(css = "#progressbar-download-dialog .ui-progressbar-value")
    private WebElement currentProgressBar;

    @FindBy(xpath = "//button[contains(text(),'Cancel Download')]")
    private WebElement cancelDownloadButton;

    public DownloadDialog_Page() {
        super();
    }

    public void clickOnStartDownloadButton() {
        actions.click(downloadButton).perform();
    }

    public boolean isDownloadBoxDisplayed() {
        return fileDownloadButton.isDisplayed();
    }

    public boolean isCurrentProgressBarFunctionsProperly() {
        BrowserUtils.wait(1);
        String initValue = currentProgressBar.getAttribute("style");
        BrowserUtils.wait(2);
        String finalValue = currentProgressBar.getAttribute("style");
        return !initValue.equals(finalValue);
    }

    public void clickOnCancelButton() {
        actions.moveToElement(cancelDownloadButton).click().build().perform();
    }
}