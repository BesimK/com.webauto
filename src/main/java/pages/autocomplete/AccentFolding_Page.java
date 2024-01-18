package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFolding_Page extends BasePage {
    @FindBy(id = "developer-accentFolding")
    private WebElement inputField;

    @FindBy(css = "#ui-id-40 .ui-menu-item")
    private List<WebElement> suggestionList;

    public AccentFolding_Page() {
        super();
    }

    public void enterString(String input) {
        inputField.clear();
        inputField.sendKeys(input);
    }

    public boolean checkSuggestionListWhetherCorrectFor(String str) {
        if (str.equalsIgnoreCase("jo")) {
            if (suggestionList.get(1).getText().startsWith("John") && suggestionList.get(0).getText().startsWith("Jörn")) {
                return true;
            }
        } else if (str.equalsIgnoreCase("jö")) {
            if (suggestionList.get(0).getText().startsWith("Jörn") && suggestionList.size() == 1) {
                return true;
            }
        }
        return false;
    }
}