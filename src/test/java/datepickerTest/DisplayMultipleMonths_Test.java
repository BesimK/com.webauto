package datepickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class DisplayMultipleMonths_Test extends Hooks {

    @Test
    void testDisplayMultipleMonths() {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Date picker button
        pages.getWebAutomationPage().clickOnDatepickerLink();

        // Click on the DisplayMultipleMonths button
        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();

        // Click on the date field to open date picker
        pages.getDisplayMultipleMonthsPage().clickOnDateDisplayField();

        // Click on the next button for four "4" times to cycle through the upcoming months
        pages.getDisplayMultipleMonthsPage().clickOnNextButtonToSeeUpcomingMonths(4);

        // Click on the prev button for four "5" times to cycle through the past months
        pages.getDisplayMultipleMonthsPage().clickOnPrevButtonToSeePassingMonths(5);

        // Select a day of from the middle month
        pages.getDisplayMultipleMonthsPage().selectASpecificDateForFirstMonth(19);

        // Verify that selected date is shown correctly on the date field
        String dateSelectedFromDatePicker = pages.getDisplayMultipleMonthsPage().getDateShownOnDateField();
        String dateExpected = "12/19/2023";
        softAssertions.assertThat(dateSelectedFromDatePicker).isEqualTo(dateExpected);

        // Click on the Date display field, today and the done buttons respectively
        pages.getDisplayMultipleMonthsPage().clickOnDateDisplayField();
        pages.getDisplayMultipleMonthsPage().clickOnTodayButton();
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();

        // Verify today button functions properly
        String currentDate = pages.getDisplayMultipleMonthsPage().getCurrentDate(); // Get the date of the current day in a specific format (MM/dd/yyyy)
        String actualDate = pages.getDisplayMultipleMonthsPage().getDateShownOnDateField();
        softAssertions.assertThat(actualDate).isEqualTo(currentDate);

        // Collect all failures if they occur
        softAssertions.assertAll();
    }
}