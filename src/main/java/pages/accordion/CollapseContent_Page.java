package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.HashMap;
import java.util.Map;

public class CollapseContent_Page extends BasePage {

    @FindBy(id = "ui-id-9")
    private WebElement firstAccordionElement;

    @FindBy(id = "ui-id-10")
    private WebElement firstAccordionElementContentPane;

    @FindBy(id = "ui-id-11")
    private WebElement secondAccordionElement;

    @FindBy(id = "ui-id-12")
    private WebElement secondAccordionElementContentPane;

    @FindBy(id = "ui-id-13")
    private WebElement thirdAccordionElement;

    @FindBy(id = "ui-id-14")
    private WebElement thirdAccordionElementContentPane;

    @FindBy(id = "ui-id-15")
    private WebElement fourthAccordionElement;

    @FindBy(id = "ui-id-16")
    private WebElement fourthAccordionElementContentPane;

    public CollapseContent_Page() {
        super();
    }

    public void clickOnFirstAccordionElement() {
        firstAccordionElement.click();
        BrowserUtils.wait(1);
    }

    public void clickOnSecondAccordionElement() {
        secondAccordionElement.click();
        BrowserUtils.wait(1);
    }

    public void clickOnThirdAccordionElement() {
        thirdAccordionElement.click();
        BrowserUtils.wait(1);
    }

    public void clickOnFourthAccordionElement() {
        fourthAccordionElement.click();
        BrowserUtils.wait(1);
    }

    public boolean isDisplay() {
        return firstAccordionElementContentPane.isDisplayed();
    }

    public boolean isContentPaneOpenFor(String numberOfElement) {
        return webElementProvider().get(numberOfElement).isDisplayed();
    }

    private Map<String, WebElement> webElementProvider() {
        Map<String, WebElement> provider = new HashMap<>();
        provider.put("firstElement", firstAccordionElementContentPane);
        provider.put("secondElement", secondAccordionElementContentPane);
        provider.put("thirdElement", thirdAccordionElementContentPane);
        provider.put("fourthElement", fourthAccordionElementContentPane);
        return provider;
    }
}