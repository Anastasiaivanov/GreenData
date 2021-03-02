package ru.gdcloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void inputTextToField(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public boolean isElementPresent(WebElement element) {
        return element.isDisplayed();
    }

    public void pause() throws InterruptedException {
        Thread.sleep(5000);
    }
}
