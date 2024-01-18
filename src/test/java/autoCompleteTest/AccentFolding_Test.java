package autocompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class AccentFolding_Test extends Hooks {

    @Test
    void testAccentFolding() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnAutocompleteLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnAccentFoldingLink();

        // Enter "Jo" to see "John" and "Jörn"
        pages.getAccentFoldingPage().enterString("Jo");

        // Check the Suggestion List Whether Include "John" and "Jörn"
        boolean isInclude = pages.getAccentFoldingPage().checkSuggestionListWhetherCorrectFor("Jo");
        softAssertions.assertThat(isInclude).as("Check if the isInclude is true.").isTrue();

        // Enter "Jo" to see only "Jörn"
        pages.getAccentFoldingPage().enterString("Jö");
        BrowserUtils.wait(3);

        // Check the Suggestion List Whether Include "John" and "Jörn"
        isInclude = pages.getAccentFoldingPage().checkSuggestionListWhetherCorrectFor("Jö");
        softAssertions.assertThat(isInclude).as("Check if the isInclude is true.").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}