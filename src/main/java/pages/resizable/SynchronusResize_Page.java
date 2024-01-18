package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronusResize_Page extends BasePage {

    @FindBy(css = "#resizable-synchr-resize > .ui-resizable-e")
    private WebElement rightSideOfPuppeteer;

    @FindBy(css = "#resizable-synchr-resize > .ui-resizable-s")
    private WebElement bottomOfPuppeteer;

    @FindBy(css = "#resizable-synchr-resize > .ui-resizable-se")
    private WebElement cornerOfPuppeteer;

    @FindBy(css = "#resizable-synchr-resize")
    private WebElement puppeteer;

    @FindBy(css = "#also-synchr-resize > .ui-resizable-e")
    private WebElement rightSideOfPuppet;

    @FindBy(css = "#also-synchr-resize > .ui-resizable-s")
    private WebElement bottomOfPuppet;

    @FindBy(css = "#also-synchr-resize > .ui-resizable-se")
    private WebElement cornerOfPuppet;

    @FindBy(css = "#also-synchr-resize")
    private WebElement puppet;

    public SynchronusResize_Page() {
        super();
    }

    public boolean isClickAndHoldToDownChangeWidthOfPuppeteer(int xOffset, int yOffset) {
        int initialValueOfWidth = puppeteer.getSize().getWidth();
        actions.clickAndHold(bottomOfPuppeteer).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfWidth = puppeteer.getSize().getWidth();

        if (initialValueOfWidth != updatedValueOfWidth) {
            return true;
        }
        return false;
    }

    public boolean isClickAndHoldToRightChangeHeightOfPuppeteer(int xOffset, int yOffset) {
        int initialValueOfHeight = puppeteer.getSize().getHeight();
        actions.clickAndHold(rightSideOfPuppeteer).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfHeight = puppeteer.getSize().getHeight();

        if (initialValueOfHeight != updatedValueOfHeight) {
            return true;
        }
        return false;
    }

    public boolean isClickAndHoldByCornerChangeDimensionsOfPuppeteer(int xOffset, int yOffset) {
        int initialValueOfWidth = puppeteer.getSize().getWidth();
        int initialValueOfHeight = puppeteer.getSize().getHeight();
        actions.clickAndHold(cornerOfPuppeteer).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfWidth = puppeteer.getSize().getWidth();
        int updatedValueOfHeight = puppeteer.getSize().getHeight();

        if ((initialValueOfWidth != updatedValueOfWidth) && (initialValueOfHeight != updatedValueOfHeight)) {
            return true;
        }
        return false;
    }

    public boolean isClickAndHoldToDownChangeWidthOfPuppet(int xOffset, int yOffset) {
        int initialValueOfWidth = puppet.getSize().getWidth();
        actions.clickAndHold(bottomOfPuppet).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfWidth = puppet.getSize().getWidth();

        if (initialValueOfWidth != updatedValueOfWidth) {
            return true;
        }
        return false;
    }

    public boolean isClickAndHoldToRightChangeHeightOfPuppet(int xOffset, int yOffset) {
        int initialValueOfHeight = puppet.getSize().getHeight();
        actions.clickAndHold(rightSideOfPuppet).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfHeight = puppet.getSize().getHeight();

        if (initialValueOfHeight != updatedValueOfHeight) {
            return true;
        }
        return false;
    }

    public boolean doesHavePuppeteerAnyPowerToManipulatePuppet(int xOffset, int yOffset) {
        int initialValueOfHeight = puppet.getSize().getHeight();
        int initialValueOfWidth = puppet.getSize().getWidth();

        actions.clickAndHold(cornerOfPuppeteer).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfWidth = puppet.getSize().getWidth();
        int updatedValueOfHeight = puppet.getSize().getHeight();

        if ((initialValueOfWidth != updatedValueOfWidth) && (initialValueOfHeight != updatedValueOfHeight)) {
            return true;
        }
        return false;
    }

    public boolean doesHavePuppetAnyPowerToManipulatePuppeteer(int xOffset, int yOffset) {
        int initialValueOfHeight = puppeteer.getSize().getHeight();
        int initialValueOfWidth = puppeteer.getSize().getWidth();

        actions.clickAndHold(cornerOfPuppet).moveByOffset(xOffset, yOffset).release().build().perform();
        int updatedValueOfWidth = puppeteer.getSize().getWidth();
        int updatedValueOfHeight = puppeteer.getSize().getHeight();

        if ((initialValueOfWidth != updatedValueOfWidth) && (initialValueOfHeight != updatedValueOfHeight)) {
            return true;
        }
        return false;
    }
}