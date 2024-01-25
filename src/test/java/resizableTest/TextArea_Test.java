package resizableTest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class TextArea_Test extends Hooks {

    @Test
    void testTextArea() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        // Click on the Textarea button
        pages.getWebAutomationPage().clickOnTextAreaLink();

        // Enlarge the text area
        pages.getTextAreaPage().enlargeTheTextAreaForSpecificDimension(750, 250);

        // Enter some text into the text field
        pages.getTextAreaPage().enterSomeText();

        // Reduce the size of the text area until the navigation bar becomes visible
        pages.getTextAreaPage().shrinkTheTextAreaForSpecificDimension(-500, -150);

        // Scroll down in the text field
        pages.getTextAreaPage().scrollDownOnText();

        // Scroll up in the text field
        pages.getTextAreaPage().scrollUpOnText();
    }
}