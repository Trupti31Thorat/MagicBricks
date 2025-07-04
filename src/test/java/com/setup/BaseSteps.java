package com.setup;
 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class BaseSteps {
 
public static WebDriver driver;
 
public static void initializeBrowser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
 
public static void closeBrowser() {
    if (driver != null) {
        driver.quit();
    }
}
 
}