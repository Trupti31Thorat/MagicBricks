package com.setup;
 
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class BaseSteps {
 
public static WebDriver driver;

<<<<<<< HEAD
public static WebDriver initializeBrowser() {
=======
public static void initializeBrowser() {
>>>>>>> origin/MbAdvice

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
<<<<<<< HEAD
	return driver;
=======
	

>>>>>>> origin/MbAdvice
}
 
public static void closeBrowser() {
    if (driver != null) {
        driver.quit();
    }
}
 
}