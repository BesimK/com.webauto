package pages.datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import java.util.List;

public class SelectDateRange_Page extends BasePage {
    @FindBy(id = "from-selectDateRange")
    private WebElement fromInputField;

    @FindBy(id = "to-selectDateRange")
    private WebElement toInputField;

    @FindBy(xpath = "//div[@class='ui-datepicker-title']/child::select")
    private WebElement dropDownOfMonths;

    @FindBy(css = ".ui-datepicker-header .ui-datepicker-title")
    private List<WebElement> threeTitlesOfSelectedMonths;

    public SelectDateRange_Page() {
        super();
    }

    public void clickOnFromInputField() {
        actions.click(fromInputField).perform();
    }

    public void clickOnToInputField() {
        actions.click(toInputField).perform();
    }

    public void selectStartMonthFromDropDownMenu(String month) {
        Select select = new Select(dropDownOfMonths);
        select.selectByVisibleText(month);
    }

    public boolean isTitleOfMonthsChangingCorrectlyAccordingToTheSelectedMonth(String firstUpcoming, String secondUpcoming) {
        char[] ch1 = threeTitlesOfSelectedMonths.get(1).getText().toCharArray();
        String month1 = eliminateTheYear(ch1);
        char[] ch2 = threeTitlesOfSelectedMonths.get(2).getText().toCharArray();
        String month2 = eliminateTheYear(ch2);
        return firstUpcoming.equalsIgnoreCase(month1) && secondUpcoming.equalsIgnoreCase(month2);
    }

    private String[] defineUpcomingMonthsAccordingTheSelectedMonth(String month) throws NullPointerException {
        String[] upcomingMonths = new String[2];
        switch (month) {
            case "Jan":
                upcomingMonths[0] = "February ";
                upcomingMonths[1] = "March ";
                break;
            case "Feb":
                upcomingMonths[0] = "March ";
                upcomingMonths[1] = "April ";
                break;
            case "Mar":
                upcomingMonths[0] = "April ";
                upcomingMonths[1] = "May ";
                break;
            case "Apr":
                upcomingMonths[0] = "May ";
                upcomingMonths[1] = "June ";
                break;
            case "May":
                upcomingMonths[0] = "June ";
                upcomingMonths[1] = "July ";
                break;
            case "Jun":
                upcomingMonths[0] = "July ";
                upcomingMonths[1] = "August ";
                break;
            case "Jul":
                upcomingMonths[0] = "August ";
                upcomingMonths[1] = "September ";
                break;
            case "Aug":
                upcomingMonths[0] = "September ";
                upcomingMonths[1] = "October ";
                break;
            case "Sep":
                upcomingMonths[0] = "October ";
                upcomingMonths[1] = "November ";
                break;
            case "Oct":
                upcomingMonths[0] = "November ";
                upcomingMonths[1] = "December ";
                break;
            case "Nov":
                upcomingMonths[0] = "December ";
                upcomingMonths[1] = "January ";
                break;
            case "Dec":
                upcomingMonths[0] = "January ";
                upcomingMonths[1] = "February ";
                break;
        }
        return upcomingMonths;
    }

    private String eliminateTheYear(char[] ch) {
        String str = "";
        for (int i = 0; i < ch.length - 5; i++) {
            str += ch[i];
        }
        return str;
    }
}