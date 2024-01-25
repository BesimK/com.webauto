package pages.checkboxradio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSelectorPage extends BasePage {

    @FindBy(css = ".brand-options > label")
    private List<WebElement> listOfBrandOptions;

    @FindBy(css = ".shape-options > label")
    private List<WebElement> listOfShapeOptions;

    @FindBy(css = ".toggle-options > label")
    private List<WebElement> listOfToggleOptions;

    @FindBy(css = ".preview > div")
    private WebElement instanceOfPreview;

    public ProductSelectorPage() {
        super();
    }

    public void clickOnSelectedBrandAs(String selectedBrand) {
        Map<String, Integer> brandNumber = getSelectedBrand();
        actions.click(listOfBrandOptions.get(brandNumber.get(selectedBrand))).perform();
    }

    public void clickOnSelectedShapeAs(String selectedShape) {
        Map<String, Integer> brandNumber = getSelectedShape();
        actions.click(listOfShapeOptions.get(brandNumber.get(selectedShape))).perform();
    }

    public void clickOnSelectedStyleAs(String selectedStyle) {
        Map<String, Integer> brandNumber = getSelectedStyle();
        actions.click(listOfToggleOptions.get(brandNumber.get(selectedStyle))).perform();
    }

    public String getTextThatVisibleOnPreviewInstance() {
        return instanceOfPreview.getText();
    }

    public boolean isShapeThatVisibleOnPreviewInstanceCorrectFor(String selectedShape) {
        String str = instanceOfPreview.getAttribute("class");
        return str.contains(selectedShape.toLowerCase());
    }

    public boolean isBackgroundOptionVisibleOnPreviewInstance() {
        String actual = instanceOfPreview.getAttribute("class");
        String expected = "Background-Color";
        return actual.contains(expected.toLowerCase());
    }

    public boolean isBorderOptionVisibleOnPreviewInstance() {
        String actual = instanceOfPreview.getAttribute("class");
        String expected = "Border";
        return actual.contains(expected.toLowerCase());
    }

    public boolean isShadowOptionVisibleOnPreviewInstance() {
        String actual = instanceOfPreview.getAttribute("class");
        String expected = "Shadow";
        return !actual.contains(expected.toLowerCase());
    }

    // PRIVATE METHODS

    private Map<String, Integer> getSelectedBrand() {
        Map<String, Integer> brandNumber = new HashMap<>();
        brandNumber.put("Brand 1", 0);
        brandNumber.put("Brand 2", 1);
        brandNumber.put("Brand 3", 2);
        brandNumber.put("Brand 4", 3);
        return brandNumber;
    }

    private Map<String, Integer> getSelectedShape() {
        Map<String, Integer> brandNumber = new HashMap<>();
        brandNumber.put("Square", 0);
        brandNumber.put("Rectangle", 1);
        brandNumber.put("Circle", 2);
        brandNumber.put("Pill", 3);
        return brandNumber;
    }

    private Map<String, Integer> getSelectedStyle() {
        Map<String, Integer> brandNumber = new HashMap<>();
        brandNumber.put("Shadow", 0);
        brandNumber.put("Border", 1);
        brandNumber.put("Background Color", 2);
        return brandNumber;
    }
}