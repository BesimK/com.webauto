package sortableTest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class IncludeExcludeItems_Test extends Hooks {

    @Test
    void testIncludeExcludeItems() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnSortableLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnIncludeExcludeItemsLink();

        // Get the value of Item1InFirstPackage
        String featureOfItem1InFirstPackage = pages.getIncludeExcludeItemsPage().getAttributeOfItem1InFirstPackage();

        // verify that it is sortable
        boolean isSortable = pages.getIncludeExcludeItemsPage().isSortable(featureOfItem1InFirstPackage);
        softAssertions.assertThat(isSortable).as("Item1InFirstPackage should be true").isTrue();

        // Get the value of Item4InFirstPackage
        String featureOfItem4InFirstPackage = pages.getIncludeExcludeItemsPage().getAttributeOfItem4InFirstPackage();

        // verify that it is sortable
        isSortable = pages.getIncludeExcludeItemsPage().isSortable(featureOfItem4InFirstPackage);
        softAssertions.assertThat(isSortable).as("Item4InFirstPackage should be true").isTrue();

        // Get the value of Item1InSecondPackage
        String featureOfItem1InSecondPackage = pages.getIncludeExcludeItemsPage().getAttributeOfItem1InSecondPackage();

        // verify that it is sortable
        isSortable = pages.getIncludeExcludeItemsPage().isSortable(featureOfItem1InSecondPackage);
        softAssertions.assertThat(isSortable).as("Item1InSecondPackage should be true").isTrue();

        // Get the value of Item4InSecondPackage
        String featureOfItem4InSecondPackage = pages.getIncludeExcludeItemsPage().getAttributeOfItem4InSecondPackage();

        // verify that it is sortable
        isSortable = pages.getIncludeExcludeItemsPage().isSortable(featureOfItem4InSecondPackage);
        softAssertions.assertThat(isSortable).as("Item4InSecondPackage should be true").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}