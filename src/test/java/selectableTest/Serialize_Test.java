package selectableTest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class Serialize_Test extends Hooks {

    @Test
    void testSerialize() {

        // Get Home Page and click on WebAutomationLink
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on SelectableLink
        pages.getWebAutomationPage().clickOnSelectableLink();

        // Click on SerializeLink
        pages.getWebAutomationPage().clickOnSerializeLink();

        // Click on item #5
        pages.getSerializePage().clickOnElementByIndex(5);

        // Verify that selected item is correct
        String actualItem = pages.getSerializePage().getSelectedItem();
        softAssertions.assertThat(actualItem).isEqualTo("#5");

        // Click on Item 1, Item 3 and item 6 by holding down the Ctrl key
        pages.getSerializePage().clickOnElementWithControl(1, 3, 6);

        // Verify that selected items are correct
        String actualItems = pages.getSerializePage().getSelectedItem();
        softAssertions.assertThat(actualItems).isEqualTo("#1 #3 #5 #6");

        // Click on Item 1 and drag the mouse to the Item 3
        pages.getSerializePage().clickElementsByDraggingMouse(1, 3);

        // Verify that selected items are correct
        actualItems = actualItems = pages.getSerializePage().getSelectedItem();
        softAssertions.assertThat(actualItems).isEqualTo("#1 #2 #3");

        // Ensure that the assertAll() method is called at the end of your test method
        softAssertions.assertAll();
    }
}