package pages.resizable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextArea_Page extends BasePage {

    @FindBy(id = "resizable-text-area-res")
    private WebElement textAreaInputField;

    @FindBy(css = ".ui-wrapper > .ui-resizable-e")
    private WebElement rightHandleOfTheTextArea;

    @FindBy(css = ".ui-wrapper > .ui-resizable-s")
    private WebElement bottomHandleOfTheTextArea;

    @FindBy(css = ".ui-wrapper > .ui-resizable-se")
    private WebElement edgeHandleOfTheTextArea;

    public TextArea_Page() {
        super();
    }

    public void enterSomeText() {
        String text = "The novel opens with Aunt Dete taking her niece, Heidi, to stay with the young girl’s grandfather, a goatherd who lives alone in the Swiss Alps. " +
                "Dete, who has taken care of Heidi since she was orphaned as a baby, has a new job and can no longer care for the child. " +
                "However, villagers express concern about Heidi living with her grandfather. " +
                "He is a bitter old man who has become reclusive and has rejected religion. " +
                "Nevertheless, Heidi is left with him, and the odd couple—after some initial reluctance on the grandfather’s part—are happy together. " +
                "Away from her aunt’s oppression, the little girl’s spirits soar, and her goodness and faith soften the old man’s heart. " +
                "She quickly comes to love life on the mountain and makes friends with Peter the goatherd and his blind grandmother, among others.";
        textAreaInputField.clear();
        textAreaInputField.sendKeys(text);
    }

    public void enlargeTheTextAreaForSpecificDimension(int xOffset, int yOffset) {
        actions.clickAndHold(edgeHandleOfTheTextArea).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void shrinkTheTextAreaForSpecificDimension(int xOffset, int yOffset) {
        actions.clickAndHold(edgeHandleOfTheTextArea).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void scrollDownOnText() {
        actions.moveToElement(textAreaInputField).click().build().perform();
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
    }

    public void scrollUpOnText() {
        actions.moveToElement(textAreaInputField).click().build().perform();
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
        }
    }
}