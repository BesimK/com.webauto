package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import java.util.List;

public class Serialize_Page extends BasePage {

    @FindBy(id = "select-result")
    private WebElement selectedResult;

    @FindBy(css = "#selectable-serialize > li")
    private List<WebElement> itemList;

    public Serialize_Page() {
        super();
    }

    public void clickOnElementByIndex(int index) {
        actions.moveToElement(itemList.get(index - 1)).click().build().perform();
    }

    public void clickOnElementWithControl(int item1, int item2, int item3) {
        actions.keyDown(Keys.CONTROL).moveToElement(itemList.get(item1 - 1)).click().
                moveToElement(itemList.get(item2 - 1)).click().
                moveToElement(itemList.get(item3 - 1)).click().keyUp(Keys.CONTROL).build().perform();
    }

    public void clickElementsByDraggingMouse(int item1, int item2) {
        actions.clickAndHold(itemList.get(item1 - 1)).moveToElement(itemList.get(item2 - 1)).release().build().perform();
    }

    public String getSelectedItem() {
        return selectedResult.getText();
    }
}