package accordiontest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class CollapseContent_Test extends Hooks {

    @Test
    void testCollapseContent() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnAccordionLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnCollapseContentLink();

        // Verify that first elements content is open
        boolean isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("firstElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since the firstElements content is open").isTrue();

        // Click on second element to open its content pane
        pages.getCollapseContentPage().clickOnSecondAccordionElement();

        // Verify that second elements content is open
        isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("secondElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since we click on the secondElement its content should be open").isTrue();

        // Verify that first elements content is not open
        isContentPaneOpen = pages.getCollapseContentPage().isContentPaneOpenFor("firstElement");
        softAssertions.assertThat(isContentPaneOpen).as("Since we click on the secondElement first elements content should not be open").isFalse();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}