package controlgroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class Toolbar_Test extends Hooks {

    @Test
    void testToolbar() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Control Group button
        pages.getWebAutomationPage().clickOnControlGroupLink();

        // Click on the Toolbar button
        pages.getWebAutomationPage().clickOnToolbarLink();

        // Select the zoom option as 200%
        pages.getToolbarPage().changeZoomOptionTo("200%");

        // Verify that whether selected zoom option is matched
        boolean isZoomMatch = pages.getToolbarPage().isZoomOptionMatch(200);
        softAssertions.assertThat(isZoomMatch).as("Expected result for zoom option is 200 but actual result is different").isTrue();

        // Select the color option as Purple
        pages.getToolbarPage().changeColorOptionTo("Purple");

        // Verify that whether selected color option is matched
        boolean isColorMatch = pages.getToolbarPage().isColorOptionMatch("Purple");
        softAssertions.assertThat(isColorMatch).as("Expected result for color option is Purple but actual result is different").isTrue();

        // Select the highlight option as Orange
        pages.getToolbarPage().changeHighlightOptionTo("Orange");

        // Verify that whether selected highlight option is matched
        boolean isHighLightMatch = pages.getToolbarPage().isHighLightOptionMatch("Orange");
        softAssertions.assertThat(isHighLightMatch).as("Expected result for highlight option is Orange but actual result is different").isTrue();

        // Select the bold option
        pages.getToolbarPage().clickOnBOption();

        // Verify that whether selected bold option
        boolean isBOptionActive = pages.getToolbarPage().isBOptionActive();
        softAssertions.assertThat(isBOptionActive).as("Expected result for bold option is active but actual result is not").isTrue();

        // Select the italic option
        pages.getToolbarPage().clickOnIOption();

        // Verify that whether selected italic option
        boolean isIOptionActive = pages.getToolbarPage().isIOptionActive();
        softAssertions.assertThat(isIOptionActive).as("Expected result for italic option is active but actual result is not").isTrue();

        // Select the underline option
        pages.getToolbarPage().clickOnUOption();

        // Verify that whether selected italic option
        boolean isUOptionActive = pages.getToolbarPage().isUOptionActive();
        softAssertions.assertThat(isUOptionActive).as("Expected result for underline option is active but actual result is not").isTrue();

        // Select the print option
        pages.getToolbarPage().clickOnPrintOption();

        // Verify that whether print option functions properly
        boolean isPrintOptionActive = pages.getToolbarPage().isPrintOptionActive();
        softAssertions.assertThat(isPrintOptionActive).as("Expected result for print option is active but actual result is not").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}