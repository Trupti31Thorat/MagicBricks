/*package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LocalityPage extends BasePage {

    public LocalityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "rentheading")
    public WebElement rentTag;

  //  @FindBy(xpath = "//a[text()='Localities']")
    @FindBy(xpath="//a[text()=\"Localities\"]")
    public WebElement localitiesLink;

   // @FindBy(xpath = "//input[@placeholder='Search for Localities']")
    @FindBy(xpath="//*[@id=\"cityLocalityInput\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@class='sbct']//li[1]") // Top suggestion item
    public WebElement firstSuggestion;

    public void openLocalitiesPage() {
        waitUntilWebElementIsVisible(rentTag);
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTag).perform();
        waitUntilWebElementIsVisible(localitiesLink);
        localitiesLink.click();
    }

    public void searchAndSelectCity(String city) {
        waitUntilWebElementIsVisible(searchBox);
        searchBox.clear();
        searchBox.sendKeys(city);
        waitUntilWebElementIsVisible(firstSuggestion);
        firstSuggestion.click();
    }

    public void scrollResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
*/


package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LocalityPage extends BasePage {

    public LocalityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "rentheading")
    public WebElement rentMenu;

    @FindBy(xpath = "//a[text()='Localities']")
    public WebElement localitiesOption;

  //  @FindBy(xpath = "//*[@id='cityLocalityInput']")
    @FindBy(id = "cityLocalityInput")
    public WebElement citySearchInput;

    @FindBy(xpath = "//li[contains(@class,'suggestion') or contains(@class,'sbct')]")
    public WebElement citySuggestionClick;

    // Hover on Rent and click on Localities
    public void clickLocalitiesFromRent() {
        waitUntilWebElementIsVisible(rentMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(rentMenu).perform();
        waitUntilWebElementIsVisible(localitiesOption);
        localitiesOption.click();
    }

    // Enter city name in search box
    public void enterLocalityCity(String cityName) {
        waitUntilWebElementIsVisible(citySearchInput);
        citySearchInput.clear();
        citySearchInput.click();
        citySearchInput.sendKeys(cityName);
    }

    // Click on first suggestion from dropdown
    public void selectLocalityCityFromList() {
        waitUntilWebElementIsVisible(citySuggestionClick);
        citySuggestionClick.click();
    }

    // Scroll results
    public void scrollLocalityResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
    }
}