package com.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parameters.ConfigReader;


public class HomePage extends BasePage {

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // BUY menu (for hover)
    @FindBy(xpath = "//a[@id=\"buyheading\"]")
    private WebElement buyMenu;

    // Ready To Move option (under Buy dropdown)
    @FindBy(xpath = "//a[text()=\"Ready to Move\"]")
    private WebElement readyToMoveOption;

    // Hover on Buy
    public void hoverOnBuyMenu() {
        waitUntilVisible(buyMenu);
        hover(buyMenu);
    }

    // Click Ready to Move
    public void clickReadyToMove() {
        waitUntilClickable(readyToMoveOption);
        readyToMoveOption.click();
    }

    // (Optional) Get current page title for assertion
//    public String getPageTitle() {
//        return driver.getTitle();
//    }
    public void validateReadyToMovePage() {
        // Step 1: Switch to new tab
        String parentWindow = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Step 2: Read expected URL part from home.properties
        String expectedUrlPart = ConfigReader.getProperty("home.properties", "readyToMove.UrlPart");

        // Step 3: Wait until the expected URL appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean urlMatches = wait.until(d ->
            d.getCurrentUrl().toLowerCase().contains(expectedUrlPart.toLowerCase())
        );

        if (!urlMatches) {
            throw new AssertionError("Navigation failed! Current URL: " + driver.getCurrentUrl());
        }
    }

    //  Get current URL for assertion
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}