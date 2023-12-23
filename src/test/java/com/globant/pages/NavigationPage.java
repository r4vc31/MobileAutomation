package com.globant.pages;

// NavigationPage.java
import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPage extends BasePage {
    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    private By menuIcons = By.xpath("//android.view.ViewGroup[@content-desc='Bottom navigation']/android.widget.ImageButton");
    private By sectionTitle = By.xpath("//android.view.View[@content-desc='Section title']");

    public void navigateToSection(String sectionName) {
        // Find the icon for the specified section and click it
        // ...
    }

    public boolean isSectionDisplayed(String sectionName) {
        // Check for the presence of the section title or other indicators
        // ...
        return true;
    }
}
