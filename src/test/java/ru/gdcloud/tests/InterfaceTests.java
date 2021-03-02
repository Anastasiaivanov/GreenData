package ru.gdcloud.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.gdcloud.pages.MainPageHelper;

public class InterfaceTests extends TestBase{

    MainPageHelper mainPage;

    @BeforeMethod
    public void initTest() {
        mainPage = PageFactory.initElements(driver, MainPageHelper.class);
    }

    @Test
    public void logoNameOnMainPageTest(){
        mainPage.isLogoIsDisplayed();
        mainPage.isLogoTextIsDisplayed();
    }

    @Test
    public void allDataOnRegistrationFormTest(){
        mainPage.isUsernameFieldIsDisplayed();
        mainPage.isPasswordFieldIsDisplayed();
        mainPage.isCheckboxIsDisplayed();
        mainPage.isSubmitButtonIsDisplayed();
        mainPage.isSubmitButtonDomainUserIsDisplayed();
        mainPage.isSubmitButtonCurrentUserIsDisplayed();
    }
}
