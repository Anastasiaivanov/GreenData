package ru.gdcloud.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.gdcloud.pages.MainPageHelper;

public class LoginTests extends TestBase {

    MainPageHelper mainPage;

    WebElement loggedUserPage;
    WebElement errorCredential;

    @BeforeMethod
    public void initTest() {
        mainPage = PageFactory.initElements(driver, MainPageHelper.class);
    }

    @Test
    public void loginRegisteredUser() throws InterruptedException {
        mainPage.loginUser("tester", "K35G3U");
        mainPage.pause();
        loggedUserPage = driver.findElement(By.id("userName"));
        Assert.assertTrue(mainPage.isElementPresent(loggedUserPage));
    }

    @Test
    public void loginUnregisteredUser() throws InterruptedException {
        mainPage.loginUser("Anastasia", "Qwerty0");
        mainPage.pause();
        errorCredential = driver.findElement(By.id("error"));
        Assert.assertTrue(mainPage.isElementPresent(errorCredential));
    }

    @Test
    public void loginWithWrongPassword() throws InterruptedException {
        mainPage.loginUser("tester", "ZX5CV6BN");
        mainPage.pause();
        errorCredential = driver.findElement(By.id("error"));
        Assert.assertTrue(mainPage.isElementPresent(errorCredential));
    }
}
