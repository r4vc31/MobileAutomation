package com.globant.utils.basePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Common methods for finding elements with explicit waits
    public WebElement findElementWithWait(By locator) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Common methods for tapping elements (using TouchAction for reliability)
    public void tapElement(WebElement element) {
        // Implement tapping logic using TouchAction
    }

    // Common methods for scrolling to elements (if needed)
    public void scrollToElement(WebElement element) {
        // Implement scrolling logic using TouchAction or other methods
    }
}




