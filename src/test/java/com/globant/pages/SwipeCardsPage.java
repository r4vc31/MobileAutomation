package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SwipeCardsPage extends BasePage {
    // Replace placeholders with actual locators from the WDIO dummy app
    private By cardContainer = By.id("card_container");
    private By firstCard = By.xpath("first_card_locator"); // If applicable
    private By secondCard = By.xpath("second_card_locator"); // If applicable

    public SwipeCardsPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void swipeCardRight() {
        // Assuming horizontal swipe to the right using TouchAction
        new TouchAction(driver)
                .press(PointOption.point(50, 50)) // Adjust coordinates for card location
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(80, 50)) // Adjust distance for swipe length
                .release()
                .perform();
    }

    public void swipeCardLeft() {
        // Assuming horizontal swipe to the left
        new TouchAction(driver)
                .press(PointOption.point(80, 50))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(50, 50))
                .release()
                .perform();
    }





}
