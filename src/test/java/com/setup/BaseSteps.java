package com.setup;
 
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class BaseSteps {
 
public static WebDriver driver;

public static WebDriver initializeBrowser() {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	return driver;
}
 
public static void closeBrowser() {
    if (driver != null) {
        driver.quit();
    }
}
 
}