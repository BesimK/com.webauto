package checkboxradiotest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class ProductSelectorTest extends Hooks {

    @Test
    void testProductSelector() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Droppable button
        pages.getWebAutomationPage().clickOnCheckboxRadioLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnProductSelectorLink();

        // Click on Brand 3 option
        pages.getProductSelectorPage().clickOnSelectedBrandAs("Brand 3");

        // Verify whether the selected option is applied
        String actualText = pages.getProductSelectorPage().getTextThatVisibleOnPreviewInstance();
        softAssertions.assertThat(actualText).as("Since we have chosen Brand 3, the actual value should be the same.").isEqualTo("Brand 3");

        // Click on Circle option
        pages.getProductSelectorPage().clickOnSelectedShapeAs("Circle");

        // Verify whether the selected option is applied
        boolean isCorrectShape = pages.getProductSelectorPage().isShapeThatVisibleOnPreviewInstanceCorrectFor("Circle");
        softAssertions.assertThat(isCorrectShape).as("Since we have chosen a Circle, the actual value should be the same.").isTrue();

        // Click on Shadow option
        pages.getProductSelectorPage().clickOnSelectedStyleAs("Shadow");

        // Verify whether the selected option is applied for Shadow
        boolean isAppliedForShadow = pages.getProductSelectorPage().isShadowOptionVisibleOnPreviewInstance();
        softAssertions.assertThat(isAppliedForShadow).as("Since we have chosen Shadow option, the actual value should be the same.").isTrue();

        // Click on Border option
        pages.getProductSelectorPage().clickOnSelectedStyleAs("Border");

        // Verify whether the selected option is applied for Border
        boolean isAppliedForBorder = pages.getProductSelectorPage().isBorderOptionVisibleOnPreviewInstance();
        softAssertions.assertThat(isAppliedForBorder).as("Since we have chosen Border option, the actual value should be the same.").isTrue();

        // Click on Background Color option
        pages.getProductSelectorPage().clickOnSelectedStyleAs("Background Color");

        // Verify whether the selected option is applied for Background Color
        boolean isAppliedForBackgroundColor = pages.getProductSelectorPage().isBackgroundOptionVisibleOnPreviewInstance();
        softAssertions.assertThat(isAppliedForBackgroundColor).as("Since we have chosen Background Color option, the actual value should be the same.").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}