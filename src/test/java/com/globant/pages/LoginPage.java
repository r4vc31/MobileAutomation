package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {
    @AndroidFindBy(id = "username_field_id") // Replace with actual locator
    private WebElement usernameField;

    @AndroidFindBy(id = "password_field_id") // Replace with actual locator
    private WebElement passwordField;

    @AndroidFindBy(id = "login_button_id") // Replace with actual locator
    private WebElement loginButton;

    // Locators for error messages (if applicable)
    @AndroidFindBy(id = "error_message_id") // Example for error message
    private WebElement errorMessage;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void assertLoginSuccessful() {
        // Assertions for successful login (replace with actual checks)
        // Example: Check for presence of a specific element on the home page
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("home_page_element_id")));
    }

    public void assertErrorMessageVisible(String expectedErrorMessage) {
        // Assert if an error message is displayed (if applicable)
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertEquals(errorMessage.getText(), expectedErrorMessage);
    }

    // Implemented method for checking element presence
    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

