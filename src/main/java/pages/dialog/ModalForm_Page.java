package pages.dialog;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import java.util.ArrayList;
import java.util.List;

public class ModalForm_Page extends BasePage {

    @FindBy(xpath = "//table[@class='ui-widget ui-widget-content mb-4']/tbody/tr/child::td")
    private List<WebElement> usersData;

    @FindBy(xpath = "(//button/span[@class='ui-button-icon ui-icon ui-icon-closethick'])[3]")
    private WebElement basicDialogCloseButton;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "surname")
    private WebElement surnameInputField;

    @FindBy(id = "email")
    private WebElement emailInputField;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    private List<String> userData = new ArrayList<>();

    public ModalForm_Page() {
        super();
    }

    public void clickOnBasicDialogCloseButton() {
        basicDialogCloseButton.click();
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void enterName(String name) {
        nameInputField.clear();
        nameInputField.sendKeys(name);
        userData.add(name); // store users data for checking submit process
    }

    public void enterSurname(String surname) {
        surnameInputField.clear();
        surnameInputField.sendKeys(surname);
        userData.add(surname);
    }

    public void enterEmail(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
        userData.add(email);
    }

    public boolean isInputFieldEmpty() {
        String name = nameInputField.getText();
        return name.isEmpty();
    }

    public boolean isDialogCloseButtonFunctionsProperly() throws ElementNotInteractableException{
            return !submitButton.isDisplayed();
    }

    public boolean areUsersDataSubmittedCorrectly() {
        for (int i = 3; i < usersData.size(); i++) {
            if(!usersData.get(i).getText().equalsIgnoreCase(userData.get(i-3))){
                return false;
            }
        }
        return true;
    }
}