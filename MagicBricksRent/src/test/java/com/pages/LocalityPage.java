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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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

    @FindBy(id = "cityLocalityInput")
    public WebElement citySearchInput;

    @FindBy(xpath = "//*[@id='cityLocalityValue']/div/div/div")
    public WebElement crossButton;

    // Hover on Rent and click Localities
    public void clickLocalitiesFromRent() {
        waitUntilWebElementIsVisible(rentMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(rentMenu).perform();
        waitUntilWebElementIsVisible(localitiesOption);
        localitiesOption.click();
    }

    // Clear previous city using cross button
    public void clearSearchBoxIfPresent() {
        try {
            waitUntilWebElementIsVisible(crossButton);
            waitUntilElementIsClickable(crossButton);
            crossButton.click();
        } catch (Exception e) {
            System.out.println("Cross button not visible, skipping clear.");
        }
    }

    // Enter city using Robot
    public void enterCityWithRobot(String city) throws AWTException {
        waitUntilWebElementIsVisible(citySearchInput);
        citySearchInput.click(); // focus inside box

        Robot robot = new Robot();
        robot.setAutoDelay(150);

        // Type each character of the city
        for (char c : city.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(Character.toUpperCase(c));
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }

        robot.delay(1000); // Wait for suggestions to load
        robot.keyPress(KeyEvent.VK_DOWN); // Select first suggestion
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER); // Enter to confirm
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    // Scroll results
    public void scrollLocalityResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
    }
}
