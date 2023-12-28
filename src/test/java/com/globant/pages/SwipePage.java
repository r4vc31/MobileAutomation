package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwipePage extends BasePage {
    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").index(0).textContains(\"Swipe\")")
    private WebElement titleSwipePage;
    @AndroidFindBy(uiAutomator = ".className(\"android.view.ViewGroup\").index(0).description(\"card\")")
    private List<WebElement> cards;


    public SwipePage(AndroidDriver driver) {
        super(driver);
    }

    public void navigateToSwipePage() {
        WebElement element = this.getSwipeIcon();
        waitForElementToBeVisible(element);
        tapElement(element);
        waitForElementToBeVisible(titleSwipePage);
    }

    public void swipeCardsToRight() {
        do{
            if (cards.size() == 2){
                swipeRight(cards.get(0));
            }else{
                swipeRight(cards.get(1));
            }
        }while (cards.size() > 2);
    }
    public void swipeCardsToLeft() {
        do{
            swipeLeft(cards.get(1));
        }while (cards.size() > 2);
    }

}
