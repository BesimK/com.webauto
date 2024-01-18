package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

/**
 * 1.Open Url and navigate to automation page
 * 2.Navigate to AutoComplete tab
 * 3.Navigate to Accent Folding tab
 * 4.Send "Jo" to the text field
 * 5.Assert Dropdown menu has 2 elements John and Jörn
 * 6.Send "Jö" to the text field
 * 7.Assert Dropdown menu has 1 element Jörn
 */
public class accentFoldingTest extends Hooks {

    @Test
    public void AccentFoldingTest(){
        // 1.Open Url and navigate to automation page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2.Navigate to AutoComplete tab
         pages.getWebAutomationPage().clickAutoCompleteLink();

        // 3.Navigate to Accent Folding tab
        pages.getAutoCompletePage().clickAccentFoldingLink();

        // 4.Send "Jo" to the text field
        List<WebElement> dropdown = pages.getAccentFoldingPage().checkDropDownMenu("Jo");

        // 5.Assert Dropdown menu has 2 elements John and Jörn
        Assertions.assertEquals(2,dropdown.size());
        Assertions.assertEquals("Jörn",dropdown.get(0).getText().split(" ")[0]);
        Assertions.assertEquals("John",dropdown.get(1).getText().split(" ")[0]);

        //6.Send "Jö" to the text field
        dropdown = pages.getAccentFoldingPage().checkDropDownMenu("Jö");

        // 7.Assert Dropdown menu has 1 element John
        Assertions.assertEquals(1,dropdown.size());
        Assertions.assertEquals("Jörn",dropdown.get(0).getText().split(" ")[0]);
    }
}
