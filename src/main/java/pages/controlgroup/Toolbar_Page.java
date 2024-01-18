package pages.controlgroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static java.lang.Integer.parseInt;

public class Toolbar_Page extends BasePage {
    @FindBy(xpath = "//select[@title='Color']")
    private WebElement colorOptionsDropDown;

    @FindBy(xpath = "//select[@title='Background color']")
    private WebElement highLightOptionsDropDown;

    @FindBy(xpath = "(//select[@class='form-select me-2 bg-primary text-fifth fs-4'])[1]")
    private WebElement zoomOptionsDropDown;

    @FindBy(xpath = "//button[text()='B']")
    private WebElement bOption;

    @FindBy(xpath = "//button[text()='I']")
    private WebElement iOption;

    @FindBy(xpath = "//button[text()='U']")
    private WebElement uOption;

    @FindBy(xpath = "//button[text()='Print']")
    private WebElement printOption;

    @FindBy(id = "page") // //div/h1[text()='Yazdır']
    private WebElement textArea;

    public Toolbar_Page() {
        super();
    }

    private Select getInstanceOfSelectClass(WebElement element) {
        return new Select(element);
    }

    public void changeZoomOptionTo(String zoom) {
        getInstanceOfSelectClass(zoomOptionsDropDown).selectByVisibleText(zoom);
    }

    public void changeHighlightOptionTo(String highlight) {
        getInstanceOfSelectClass(highLightOptionsDropDown).selectByVisibleText(highlight);
    }

    public void changeColorOptionTo(String color) {
        getInstanceOfSelectClass(colorOptionsDropDown).selectByVisibleText(color);
    }

    public void clickOnBOption() {
        actions.moveToElement(bOption).click().perform();
    }

    public void clickOnIOption() {
        actions.moveToElement(iOption).click().perform();
    }

    public void clickOnUOption() {
        actions.moveToElement(uOption).click().perform();
    }

    public void clickOnPrintOption() {
        actions.moveToElement(printOption).click().perform();
    }

    public boolean isZoomOptionMatch(int zoom) { // if zoom option is selected as 200%, css value equals to 2
        String zoomOption = textArea.getCssValue("zoom");
        return parseInt(zoomOption) == (zoom / 100);
    }

    public boolean isColorOptionMatch(String color) { // each color has a value in that manner rgba(128, 128, 37, 1)
        Map<String, String> colorCssValue = storeCssValueForColor();
        String colorOption = textArea.getCssValue("color");
        return colorOption.equalsIgnoreCase(colorCssValue.get(color));
    }

    public boolean isHighLightOptionMatch(String color) {
        Map<String, String> colorCssValue = storeCssValueForColor();
        String highlightOption = textArea.getCssValue("background-color");
        return highlightOption.equalsIgnoreCase(colorCssValue.get(color));
    }

    public boolean isBOptionActive() { // bold option = 700 ; normal option = 400
        String boldOption = textArea.getCssValue("font-weight");
        return parseInt(boldOption) == 700;
    }

    public boolean isIOptionActive() { // italic option = italic ; normal option = normal
        String italicOption = textArea.getCssValue("font-style");
        return italicOption.equalsIgnoreCase("italic");
    }

    public boolean isUOptionActive() { // underline option = underline solid ... ; normal option = none solid ...
        String underlineOption = textArea.getCssValue("text-decoration");
        return underlineOption.startsWith("underline");
    }

    public boolean isPrintOptionActive() {
        Set<String> openTabs = DRIVER.getWindowHandles();
        for (String handle : openTabs) {
            DRIVER.switchTo().window(handle).getTitle();
        }
        DRIVER.quit();
        return openTabs.size() == 2;
    }

    private Map<String, String> storeCssValueForColor() {
        Map<String, String> colorCss = new HashMap<>();
        colorCss.put("Black", "rgba(33, 37, 41, 1)");
        colorCss.put("White", "rgba(255, 255, 255, 1)");
        colorCss.put("Red", "rgba(255, 0, 0, 1)");
        colorCss.put("Yellow", "rgba(255, 255, 0, 1)");
        colorCss.put("Green", "rgba(0, 128, 0, 1)");
        colorCss.put("Blue", "rgba(0, 0, 255, 1)");
        colorCss.put("Grey", "rgba(128, 128, 128, 1)");
        colorCss.put("Purple", "rgba(128, 0, 128, 1)");
        colorCss.put("Orange", "rgba(255, 165, 0, 1)");
        return colorCss;
    }
}