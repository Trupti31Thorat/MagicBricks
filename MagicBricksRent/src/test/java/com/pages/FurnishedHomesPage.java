package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FurnishedHomesPage extends BasePage {

    public FurnishedHomesPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(id = "rentheading")
    @FindBy(xpath="//*[@id=\"rentheading\"]")
    public WebElement rentTag;

   // @FindBy(xpath = "//a[contains(text(),'Furnished Homes')]")
  //  @FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[2]/div/div/div[1]/ul/li[3]/a")
   // @FindBy(xpath="/html/body/header/section[2]/div/ul/li[2]/div/div/div[1]/ul/li[3]/a")
   //@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href='javascript:void(0);'][data-category='furnishedHomes']")
    //@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href*='furnished-homes']")
   // @FindBy(xpath = "//*[@id='commercialIndex']/header/section[2]/div/ul/li[2]/div/div/div[1]/ul/li[3]/a")
    //@FindBy(css = "a[onclick*='openRentUrlInNewTab'][data-target*='furnished-homes']")
    //@FindBy(css = "a[href*='/furnished-homes']")
   // @FindBy(xpath = "//*[@id=\"propertysrp\"]/div[1]/div/div/div[1]/div[3]/div/div/div[1]/ul/li[3]/a")
    @FindBy(xpath="//a[text()=\"Furnished Homes\"]")

    public WebElement furnishedHomesOption;

   // @FindBy(xpath = "//label[contains(text(),'1 BHK')]")
    @FindBy(xpath="//*[@id=\"body\"]/div[5]/div/div/div[1]/div[10]/div/div/div[2]/div[1]/label")
    public WebElement bhk1Option;

    public void clickFurnishedHomes() {
        waitUntilWebElementIsVisible(rentTag);
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTag).perform();
        waitUntilWebElementIsVisible(furnishedHomesOption);
        furnishedHomesOption.click();
    }

    public void click1BHKOption() {
        waitUntilWebElementIsVisible(bhk1Option);
        waitUntilElementIsClickable(bhk1Option);
        bhk1Option.click();
    }

    public void switchToNewestWindow() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }
    
    public void scrollWithRobotPageDown() {
        try {
            Robot robot = new Robot();
            robot.delay(1000); // wait before scroll

            // Scroll 3 times for better visibility
            for (int i = 0; i < 2; i++) {
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                robot.delay(1000);
            }
        } catch (AWTException e) {
            throw new RuntimeException("Failed to scroll using Robot", e);
        }
    }
    
    
    
}

