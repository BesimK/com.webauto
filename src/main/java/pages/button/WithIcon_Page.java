package pages.button;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class WithIcon_Page extends BasePage {

    @FindBy(xpath = "//div[@class='widget']/child::button")
    private List<WebElement> listOfWidgetElements;

    @FindBy(xpath = "//div[@class='css']/child::button")
    private List<WebElement> listOfCssElements;

    public WithIcon_Page() {
        super();
    }

    public void clickOnAllWidgetElementsRespectively() throws ElementNotInteractableException {

        for (int i = 0; i < listOfWidgetElements.size(); i++) {

            try {
                wait.until(ExpectedConditions.elementToBeClickable(listOfWidgetElements.get(i)));
                actions.click(listOfWidgetElements.get(i)).perform();
                BrowserUtils.wait(1);
            } catch (ElementNotInteractableException ex) {
                System.out.println("\nWe came across an element that is not interactable!");
            }
        }
    }

    public void clickOnAllCssElementsRespectively() throws ElementNotInteractableException {

        for (int i = 0; i < listOfCssElements.size(); i++) {

            try {
                wait.until(ExpectedConditions.elementToBeClickable(listOfCssElements.get(i)));
                actions.click(listOfCssElements.get(i)).perform();
                BrowserUtils.wait(1);
            } catch (ElementNotInteractableException ex) {
                System.out.println("\nWe came across an element that is not interactable!");
            }
        }
    }
}