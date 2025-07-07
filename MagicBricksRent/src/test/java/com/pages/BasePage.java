//package com.pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BasePage {
//WebDriver driver;
//WebDriverWait wait;
// 
//BasePage(WebDriver driver)
//{
//	this.driver=driver;
//	PageFactory.initElements(driver, this);
//}
// 
//public void waitUntilWebElementIsVisible(WebElement element)
//{
//	wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//	wait.until(ExpectedConditions.visibilityOf(element));
//}
// 
//public void waitUntilElementIsClickable(WebElement element)
//{
//	wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//	wait.until(ExpectedConditions.elementToBeClickable(element));
//}
//}

package com.pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitUntilWebElementIsVisible(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementIsClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public WebElement waitUntilElementIsClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
}
