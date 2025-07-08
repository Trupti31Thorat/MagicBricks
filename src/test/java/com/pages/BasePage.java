package com.pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
    Properties prop;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.prop = new Properties();
       // loadProperties();
    }

  
    // Wait until element is visible
    public void waitUntilWebElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until element is clickable
    public void waitUntilWebElementIsClickable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(element));
    }

    // Click helper
    public void click(WebElement element) {
        waitUntilWebElementIsClickable(element);
        element.click();
    }

    // Send text helper
    public void sendKeys(WebElement element, String text) {
        waitUntilWebElementIsVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
