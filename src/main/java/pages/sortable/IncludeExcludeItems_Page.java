package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class IncludeExcludeItems_Page extends BasePage {

    @FindBy(id = "sortable-inc-exc-1")
    private WebElement sortableElements;

    @FindBy(xpath = "(//li[text()='Item 1'])[10]")
    private WebElement item1InFirstPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[11]")
    private WebElement item1InSecondPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[8]")
    private WebElement item4InFirstPackage;

    @FindBy(xpath = "(//li[text()='Item 1'])[9]")
    private WebElement item4InSecondPackage;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[1]")
    private WebElement firstNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[2]")
    private WebElement secondNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[3]")
    private WebElement thirdNonSortableElement;

    @FindBy(xpath = "(//li[contains(text(),'drop')])[4]")
    private WebElement fourthNonSortableElement;

    public IncludeExcludeItems_Page() {
        super();
    }

    public String getAttributeOfItem1InFirstPackage() {
        return item1InFirstPackage.getAttribute("class");
    }

    public String getAttributeOfItem1InSecondPackage() {
        return item1InSecondPackage.getAttribute("class");
    }

    public String getAttributeOfItem4InFirstPackage() {
        return item4InFirstPackage.getAttribute("class");
    }

    public String getAttributeOfItem4InSecondPackage() {
        return item4InSecondPackage.getAttribute("class");
    }

    public String getAttributeOfFirstNonSortableElement() {
        return firstNonSortableElement.getAttribute("class");
    }

    public String getAttributeOfSecondNonSortableElement() {
        return secondNonSortableElement.getAttribute("class");
    }

    public String getAttributeOfThirdNonSortableElement() {
        return thirdNonSortableElement.getAttribute("class");
    }

    public String getAttributeOfFourthNonSortableElement() {
        return fourthNonSortableElement.getAttribute("class");
    }

    public boolean isSortable(String attribute) {
        return attribute.contains("sortable");
    }
}