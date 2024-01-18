package pages.alerts;

import org.openqa.selenium.Alert;
import pages.BasePage;

public class ShowPrompt_Page extends BasePage {
    Alert alert;

    public ShowPrompt_Page() {
        super();
    }

    public void switchIntoAlertMessage() {
        alert = DRIVER.switchTo().alert();
    }

    public void accept() {
        switchIntoAlertMessage();
        alert.accept();
    }

    public void dismiss() {
        switchIntoAlertMessage();
        alert.dismiss();
    }

    public String getText() {
        switchIntoAlertMessage();
        return alert.getText();
    }

    public void sendKeys(String text) {
        switchIntoAlertMessage();
        alert.sendKeys(text);
    }
}