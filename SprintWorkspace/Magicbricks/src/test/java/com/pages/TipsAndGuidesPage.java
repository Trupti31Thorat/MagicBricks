package com.pages;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TipsAndGuidesPage extends BasePage {

    public TipsAndGuidesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()=\"Tips and Guides\"]")
    WebElement tipsAndGuidesLink;

    @FindBy(id="locExplore")
    WebElement citySearchBar;

    @FindBy(xpath = "//input[@value=\"Explore\"]")
    WebElement exploreButton;

    public void clickTipsAndGuides() {
        click(tipsAndGuidesLink);
    }

    public void enterCity(String city) throws InterruptedException {
        waitUntilVisible(citySearchBar);
        citySearchBar.clear();
        citySearchBar.sendKeys(city);
        Thread.sleep(2000);
        
        
        // Using Actions to select the specific locality from the below options available.
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    }

    public void clickExplore() {
        click(exploreButton);
    }
    
    public void verifyUserIsOnResultsPage() {
    	verifyCurrentURL("tipsAndGuides.urlPart");
    }

//    public boolean isOnResultsPage() {
//        String currentUrl = driver.getCurrentUrl();
//        return currentUrl.contains("Overview");
//    }
}