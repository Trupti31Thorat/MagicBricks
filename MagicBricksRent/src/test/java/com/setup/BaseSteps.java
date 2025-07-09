package com.setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.parameters.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {
    protected static WebDriver driver;
    private static final String BASE_URL = ConfigReader.getProperty("url");
    private static final String BROWSER = ConfigReader.getProperty("browser");
 
    @Before
    public void setUp() {
        if (driver == null) {
            System.out.println("Launching browser as per config file...");
            if (BROWSER.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
            } else if (BROWSER.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver(options);
            } else {
                throw new RuntimeException("Unsupported browser: " + BROWSER);
            }
 
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
 
    @After
    public void tearDown() {
        if (driver != null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Cleaning up browser...");
            driver.quit();
            driver = null;
        }
    }
 
    public static WebDriver getDriver() {
        return driver;
    }
 
    public static String getBaseUrl() {
        return BASE_URL;
    }
}