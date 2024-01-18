package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ShowConfirm_Page extends BasePage {

    Alert alert;

    public ShowConfirm_Page() {
        super();
    }

    public void flowIntoAlert() {
        alert = DRIVER.switchTo().alert();
    }

    public void dismiss() {
        alert.dismiss();
    }

    public void accept() {
        alert.accept();
    }

    public void sendKeys(String text) {
        alert.sendKeys(text);
    }

    public String getText() {
        return alert.getText();
    }

    public boolean isAlertMessageDisappeared() {

        try {
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (TimeoutException ex) {
            System.out.println(ex.getMessage() + " \nThe alert message is disappeared.");
            return true;
        }
        return false;
    }
}