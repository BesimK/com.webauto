package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {
    @FindBy(id = "datepicker-multiple-months")
    private WebElement dateDisplayField;

    @FindBy(xpath = "(//p[@class='text-fifth'])[4]")
    private WebElement dateDisplayFieldGeneral;

    @FindBy(xpath = "//button[text()='Today']")
    private WebElement todayButton;

    @FindBy(xpath = "//button[text()='Done']")
    private WebElement doneButton;

    @FindBy(xpath = "//span[text()='Prev']")
    private WebElement prevButton;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//div[@class='ui-datepicker-title']")
    private List<WebElement> listOfThreeDateTitle;

    @FindBy(xpath = "//table/tbody/tr/td/a[@data-date='14']")
    private List<WebElement> listOfSelectedDayForEachMonth;

    public DisplayMultipleMonths_Page() {
        super();
    }

    private WebElement selectADayForMiddleMonth(int day) {
        return DRIVER.findElement(By.xpath("(//table/tbody/tr/td/a[@data-date='" + day + "'])[1]"));
    }

    public void selectASpecificDateForFirstMonth(int day) {
        WebElement chosenDay = selectADayForMiddleMonth(day);
        actions.moveToElement(chosenDay).click().build().perform();
        chosenDay.getAttribute("data-date");
    }

    public void clickOnDateDisplayField() {
        actions.click(dateDisplayField).perform();
    }

    public void clickOnNextButtonToSeeUpcomingMonths(int times) {
        for (int i = 0; i < times; i++) {
            actions.click(nextButton).perform();
            BrowserUtils.wait(1);
        }
    }

    public String getDateShownOnDateField() {
        return dateDisplayField.getAttribute("value");
    }

    public String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public void clickOnTodayButton() {
        dateDisplayField.clear();
        actions.click(todayButton).perform();
    }

    public void clickOnDoneButton() {
        actions.click(doneButton).perform();
    }

    public void clickOnPrevButtonToSeePassingMonths(int times) {
        for (int i = 0; i < times; i++) {
            actions.click(prevButton).perform();
            BrowserUtils.wait(1);
        }
    }

    public void displayTitle() {
        for (int i = 0; i < listOfThreeDateTitle.size(); i++) {
            System.out.println(listOfThreeDateTitle.get(i).getText() + " ");
        }
    }
}