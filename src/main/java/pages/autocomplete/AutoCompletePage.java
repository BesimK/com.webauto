package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AutoCompletePage extends BasePage {
    @FindBy(xpath = "//a[text()=\"Accent Folding\"]")
    private WebElement accentFoldingTab;

    public void clickAccentFoldingLink(){
        accentFoldingTab.click();
    }
}
