package pages.draggable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;

public class Events_Page extends BasePage {
    @FindBy(linkText = "Events")
    private WebElement eventsLink;
    @FindBy(id = "draggable12")
    private WebElement eleventhDraggable;

    public void clickEventsLink(){
        eventsLink.click();
    }
    public int getLocationOfEleventhDraggableX() {
       return eleventhDraggable.getLocation().getX();
    }
    public int getLocationOfEleventhDraggableY() {
        return eleventhDraggable.getLocation().getY();
    }
    public ArrayList<String> controlEleventhDraggable(int xOffset, int yOffset){
        ArrayList<String> result = new ArrayList<>();
        String s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[1]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[2]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[3]")).getText();
        result.add(s);

        actions.dragAndDropBy(eleventhDraggable,xOffset,yOffset).perform();
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[1]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[2]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[3]")).getText();
        result.add(s);

        actions.dragAndDropBy(eleventhDraggable,-1*xOffset,-1*yOffset).perform();
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[1]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[2]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[3]")).getText();
        result.add(s);

        actions.clickAndHold(eleventhDraggable).moveByOffset(xOffset,yOffset).moveByOffset(-1*xOffset,-1*yOffset).perform();
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[1]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[2]")).getText();
        result.add(s);
        s = DRIVER.findElement(By.xpath("(//span[@class=\"count\"])[3]")).getText();
        result.add(s);

        return result;
    }
}
