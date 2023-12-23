package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    @AndroidFindBy(id = "webview_icon") // Replace with actual locator
    private WebElement webviewIcon;

    @AndroidFindBy(id = "login_icon") // Replace with actual locator
    private WebElement loginIcon;

    @AndroidFindBy(id = "forms_icon") // Replace with actual locator
    private WebElement formsIcon;

    @AndroidFindBy(id = "swipe_icon") // Replace with actual locator
    private WebElement swipeIcon;

    @AndroidFindBy(id = "drag_icon") // Replace with actual locator
    private WebElement dragIcon;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public void navigateToWebView() {
        tapElement(webviewIcon);
    }

    public void navigateToLogin() {
        tapElement(loginIcon);
    }

    public void navigateToForms() {
        tapElement(formsIcon);
    }

    public void navigateToSwipe() {
        tapElement(swipeIcon);
    }

    public void navigateToDrag() {
        tapElement(dragIcon);
    }

    // Add assertions for elements visible on the Home Page (Optional)
    // public void assertHomePageElementsVisible() {
    //     // ... add assertions for specific elements on the Home Page
    // }
}

