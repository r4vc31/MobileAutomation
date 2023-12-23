package com.globant.tests;

import com.globant.pages.HomePage;
import com.globant.pages.WebViewPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationTest {
    private AppiumDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "5554");
        capabilities.setCapability("app", "path/to/WDIO-dummy-app.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void testNavigation() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToWebView();
        WebViewPage webViewPage = new WebViewPage(driver);
        webViewPage.assertWebViewContentVisible();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

