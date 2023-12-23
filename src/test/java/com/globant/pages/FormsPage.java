package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsPage extends BasePage {
    // Locators for various form elements (text fields, buttons, etc.)
    // Example:
    @AndroidFindBy(id = "name_field_id") // Replace with actual locator
    private WebElement nameField;

    @AndroidFindBy(id = "submit_button_id") // Replace with actual locator
    private WebElement submitButton;

    public FormsPage(AppiumDriver driver) {
        super(driver);
    }

    // Methods for interacting with form elements
    // Example:
    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    // Assertions for verifying form completion or errors (if applicable)
}

