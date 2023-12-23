package com.globant.pages;

// SignupPage.java
import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;

public class SignupPage extends BasePage {
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    private By emailField = By.id("email_field");
    private By passwordField = By.id("password_field");
    private By signupButton = By.id("signup_button");
    private By welcomeMessage = By.xpath("//android.widget.TextView[@text='Welcome']");

    public void enterEmailAndPassword(String email, String password) {
        // Fill in email and password fields
        // ...
    }

    public void submitForm() {
        // Click the signup button
        // ...
    }

    public boolean isSignupSuccessful() {
        // Check for the presence of the welcome message or other indicators
        // ...
        return true;
    }
}

