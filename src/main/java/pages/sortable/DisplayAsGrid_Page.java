package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayAsGrid_Page extends BasePage {

    @FindBy(xpath = "(//div/ul[@id='sortable-disp-as-grid']/child::li)")
    private List<WebElement> listOfNumbersInGrid;

    public DisplayAsGrid_Page() {
        super();
    }

    public void sendSelectedNumberNextToTwo(int sourceNumber) {
        actions.dragAndDropBy(listOfNumbersInGrid.get(sourceNumber - 1), 250, 0).perform();
    }

    public int getActualNumberHoldByGrid(int number) {
        return Integer.parseInt(listOfNumbersInGrid.get(number - 1).getText());
    }
}