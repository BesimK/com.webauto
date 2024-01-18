package pages.autocomplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class AccentFoldingPage extends BasePage {
    @FindBy(xpath = "//a[text()=\"Accent Folding\"]")
    private WebElement accentFoldingTab;
    @FindBy(css = "#ui-id-40 .ui-menu-item")
    private List<WebElement> dropdownMenu;

    @FindBy(id = "developer-accentFolding")
    private WebElement textField;

    @FindBy(xpath = "(//a[@href=\"/\"])[1]")
    private WebElement homePageLink;

    public void clickAccentFoldingTab(){
        accentFoldingTab.click();
    }
    public List<WebElement> checkDropDownMenu(String input){
        textField.clear();
        textField.sendKeys(input);
        BrowserUtils.wait(3.0);
        return dropdownMenu;
    }
    public void navigateToHomePage(){
        homePageLink.click();
    }
}
