package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebViewPage extends BasePage {
    @AndroidFindBy(id = "webview_element_id") // Replace with actual locator
    private WebElement webviewElement;

    // Locators for other elements within the WebView (if applicable)

    public WebViewPage(AppiumDriver driver) {
        super(driver);
    }

    public void assertWebViewContentVisible() {
        Assert.assertTrue(webviewElement.isDisplayed());
    }

    // Methods for interacting with elements within the WebView (if needed)
    // For example:
    // public void tapWebViewElement(String elementId) {
    //     // Use context switching or other techniques to interact within the WebView
    // }
}


