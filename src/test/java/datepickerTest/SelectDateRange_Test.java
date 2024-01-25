package datepickertest;

import basetest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class SelectDateRange_Test extends Hooks {

    @Test
    void testSelectDateRange(){

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on the Date picker button
        pages.getWebAutomationPage().clickOnDatepickerLink();

        // Click on the SelectDateRange button
        pages.getWebAutomationPage().clickOnSelectDateRangeLink();

        // Click on the input field in front of the "From"
        pages.getSelectDateRangePage().clickOnFromInputField();
        BrowserUtils.wait(1);

        // Select a month from dropdown menu as an example "May"
        pages.getSelectDateRangePage().selectStartMonthFromDropDownMenu("May");

        // Verify that upcoming months are shown by the title as "June" and "July" respectively
        boolean isCorrect = pages.getSelectDateRangePage().isTitleOfMonthsChangingCorrectlyAccordingToTheSelectedMonth("June","July");
        Assertions.assertTrue(isCorrect,"Upcoming months should be June and July");
    }
}