package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class HomeInteriorBasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public HomeInteriorBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void click(WebElement elm) {
        wait.until(ExpectedConditions.elementToBeClickable(elm)).click();
    }

    protected void type(WebElement elm, String text) {
        wait.until(ExpectedConditions.visibilityOf(elm)).clear();
        elm.sendKeys(text);
    }

    protected void scrollIntoView(WebElement elm) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
    }

    protected boolean isDisplayed(WebElement elm) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(elm)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
}