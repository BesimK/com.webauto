package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverflow_Page extends BasePage {

    @FindBy(id = "spinner-overflow")
    private WebElement selectedValue;

    @FindBy(xpath = "(//a[@tabindex='-1']/child::span)[21]")
    private WebElement incrementButton;

    @FindBy(xpath = "(//a[@tabindex='-1']/child::span)[23]")
    private WebElement decrementButton;

    public SpinnerOverflow_Page(){
        super();
    }

    /**
     * @param times it refers to the number of clicks you want to activate
     */

    public void clickOnIncrementButtonForTimes(int times){
        for (int i = 0; i < times; i++) {
            incrementButton.click();
        }
    }

    public void clickOnDecrementButtonForTimes(int times){
        for (int i = 0; i < times; i++) {
            decrementButton.click();
        }
    }

    public String getSelectedValue(){
        return selectedValue.getAttribute("aria-valuenow");
    }

    public void setSelectedValue(String number){
        selectedValue.clear();
        selectedValue.sendKeys(number);
    }
}