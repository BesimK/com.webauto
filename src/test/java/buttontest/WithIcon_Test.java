package buttontest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class WithIcon_Test extends Hooks {

    @Test
    void testWithIcon() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnButtonLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnWithIconLink();

        // Click on widget elements respectively
        pages.getWithIconPage().clickOnAllWidgetElementsRespectively();

        // Click on css elements respectively
        pages.getWithIconPage().clickOnAllCssElementsRespectively();
    }
}