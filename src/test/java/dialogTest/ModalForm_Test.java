package dialogtest;

import basetest.Hooks;
import org.junit.jupiter.api.Test;

public class ModalForm_Test extends Hooks {

    @Test
    void testModalForm(){

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Dialog button
        pages.getWebAutomationPage().clickOnDialogLink();

        // Click on the Accept button
        pages.getWebAutomationPage().clickOnModalFormLink();

        // Click on the Create Account button
        pages.getModalFormPage().clickOnCreateAccountButton();

        // Enter a name into name input field
        pages.getModalFormPage().enterName("Inar");

        // Enter a surname into surname input field
        pages.getModalFormPage().enterSurname("Academy");

        // Enter an email into email input field
        pages.getModalFormPage().enterEmail("inar@academy.com");

        // Click on the submit button
        pages.getModalFormPage().clickOnSubmitButton();

        // Verify that users' data is stored correctly
        boolean isSubmittedCorrectly = pages.getModalFormPage().areUsersDataSubmittedCorrectly();
        softAssertions.assertThat(isSubmittedCorrectly).as("Users' data is stored correctly but it is not").isTrue();

        // Click on the Create Account button
        pages.getModalFormPage().clickOnCreateAccountButton();

        // Verify that the input fields in the Basic Dialog Box are clean
        boolean isEmpty = pages.getModalFormPage().isInputFieldEmpty();
        softAssertions.assertThat(isEmpty).as("Input fields in the Basic Dialog Box should be clean but they are not").isTrue();

        // Click on the close button of Dialog Box
        pages.getModalFormPage().clickOnBasicDialogCloseButton();

        // Verify that close button functions properly
        boolean isCloseButtonFunctionsProperly = pages.getModalFormPage().isDialogCloseButtonFunctionsProperly();
        softAssertions.assertThat(isCloseButtonFunctionsProperly).as("Close button should close the dialog box but it is not").isTrue();

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}