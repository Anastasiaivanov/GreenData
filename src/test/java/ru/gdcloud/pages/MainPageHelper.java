package ru.gdcloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPageHelper extends PageBase {

    public MainPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "remember")
    WebElement checkBoxRemember;

    @FindBy(id = "login_button")
    WebElement submitButton;

    @FindBy(id = "login_button_domain")
    WebElement submitButtonDomainUser;

    @FindBy(id = "login_button_current")
    WebElement submitButtonCurrentUser;

    @FindBy(className = "login-logo")
    WebElement logo;

    @FindBy(className = "login_corp")
    WebElement logoText;

    public void loginUser(String fillUsername, String fillPassword) {
        inputTextToField(username, fillUsername);
        inputTextToField(password, fillPassword);
        checkBoxRemember.click();
        submitButton.click();
    }

    public void isCheckboxIsDisplayed() {
        isElementPresent(checkBoxRemember);
    }

    public void isLogoIsDisplayed() {
        isElementPresent(logo);
    }

    public void isLogoTextIsDisplayed() {
        isElementPresent(logoText);
    }

    public void isSubmitButtonIsDisplayed() {
        isElementPresent(submitButton);
    }

    public void isSubmitButtonCurrentUserIsDisplayed() {
        isElementPresent(submitButtonCurrentUser);
    }

    public void isSubmitButtonDomainUserIsDisplayed() {
        isElementPresent(submitButtonDomainUser);
    }

    public void isUsernameFieldIsDisplayed(){
        isElementPresent(username);
    }

    public void isPasswordFieldIsDisplayed(){
        isElementPresent(password);
    }
}
