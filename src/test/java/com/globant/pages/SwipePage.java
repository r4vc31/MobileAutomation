package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class SwipePage extends BasePage {
    // Locators for elements involved in swipe actions
    // Example:
    @AndroidFindBy(id = "swipe_element_id") // Replace with actual locator
    private WebElement swipeElement;

    public SwipePage(AppiumDriver driver) {
        super(driver);
    }

    // Methods for performing different swipe actions
    public void swipeLeft() {
        swipe(0.8, 0.5, 0.2, 0.5); // Adjust coordinates as needed
    }

    public void swipeRight() {
        swipe(0.2, 0.5, 0.8, 0.5); // Adjust coordinates as needed
    }

    public void swipeUp() {
        swipe(0.5, 0.8, 0.5, 0.2); // Adjust coordinates as needed
    }

    public void swipeDown() {
        swipe(0.5, 0.2, 0.5, 0.8); // Adjust coordinates as needed
    }

    // Helper method for performing swipe actions
    private void swipe(double startX, double startY, double endX, double endY) {
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int startXPixel = (int) (screenWidth * startX);
        int startYPixel = (int) (screenHeight * startY);
        int endXPixel = (int) (screenWidth * endX);
        int endYPixel = (int) (screenHeight * endY);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startXPixel, startYPixel))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endXPixel, endYPixel))
                .release()
                .perform();
    }

    // Assertions for verifying the effects of swipe actions (if applicable)
}

