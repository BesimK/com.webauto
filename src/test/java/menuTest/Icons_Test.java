package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class Icons_Test extends Hooks {

    @Test
    void testIcons() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnMenuLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnIconsLink();

        // Check the "Save" icon if selectable
        boolean isSelectable = pages.getIconsPage().hoverOnIcon("Save");
        softAssertions.assertThat(isSelectable).as("Save should be selectable").isTrue();

        // Check the "Zoom In" icon if selectable
        isSelectable = pages.getIconsPage().hoverOnIcon("Zoom In");
        softAssertions.assertThat(isSelectable).as("Zoom In should be selectable").isTrue();

        // Check the "Zoom Out" icon if selectable
        isSelectable = pages.getIconsPage().hoverOnIcon("Zoom Out");
        softAssertions.assertThat(isSelectable).as("Zoom Out should be selectable").isTrue();

        // Check the "Print" icon if selectable
        isSelectable = pages.getIconsPage().hoverOnIcon("Print");
        softAssertions.assertThat(isSelectable).as("Print should not be selectable").isFalse();

        // Check the "Playback" icon if selectable
        isSelectable = pages.getIconsPage().hoverOnIcon("Playback");
        softAssertions.assertThat(isSelectable).as("Playback should be selectable").isTrue();

        // Check the "Learn more about this menu" icon if selectable
        isSelectable = pages.getIconsPage().hoverOnIcon("Learn more about this menu");
        softAssertions.assertThat(isSelectable).as("\"Learn more about this menu\" should be selectable").isTrue();

        // Check the "Play" icon if selectable
        isSelectable = pages.getIconsPage().isSelectable("Play");
        softAssertions.assertThat(isSelectable).as("Play should be selectable").isTrue();

        // Check the "Prev" icon if selectable
        isSelectable = pages.getIconsPage().isSelectable("Prev");
        softAssertions.assertThat(isSelectable).as("Prev should be selectable").isTrue();

        // Check the "Stop" icon if selectable
        isSelectable = pages.getIconsPage().isSelectable("Stop");
        softAssertions.assertThat(isSelectable).as("Stop should be selectable").isTrue();

        // Check the "Next" icon if selectable
        isSelectable = pages.getIconsPage().isSelectable("Next");
        softAssertions.assertThat(isSelectable).as("Next should be selectable").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}