package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframe_Page extends BasePage {
    @FindBy(id = "nestedIframe")
    private WebElement nestedIframe;

    @FindBy(tagName = "h1")
    private WebElement headerOfNestedIframe;

    @FindBy(xpath = "//div/p/a[contains(text(),'More information...')]")
    private WebElement moreInformationLink;

    public void switchToNormalIframe() {
        DRIVER.switchTo().frame(nestedIframe);
    }

    public String getHeaderOfNormalIframe() {
        switchToNormalIframe();
        return headerOfNestedIframe.getText();
    }

    public void clickOnMoreInformationLink() {
        actions.moveToElement(moreInformationLink).click().build().perform();
    }

    public String getUrlNavigatedByMoreInformationLink() {
        return DRIVER.getCurrentUrl();
    }
}