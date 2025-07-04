package com.setup;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.time.Duration;
//
//public class HomeInteriorBaseSteps {
//    protected static final WebDriver driver;
//
//    static {
//        // 1. Bootstrap ChromeDriver once when this class is first loaded
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        
//        // 2. Register a shutdown hook so the browser quits when JVM exits
//        Runtime.getRuntime()
//               .addShutdownHook(new Thread(() -> {
//                   if (driver != null) {
//                       driver.quit();
//                   }
//               }));
//    }
//
//    /** 
//     * @return the shared WebDriver instance 
//     */
//    public static WebDriver getDriver() {
//        return driver;
//    }
//
//    /** 
//     * @return the base URL for MagicBricks 
//     */
//    public static String getBaseUrl() {
//        return "https://www.magicbricks.com/";
//    }
//}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class HomeInteriorBaseSteps {
    protected static WebDriver driver;

    static {
        setupChromeDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (driver != null) {
                driver.quit();
            }
        }));
    }

    private static void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "incognito", "disable-notifications", "disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(getBaseUrl());
    }

    public static void setupEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized", "incognito", "disable-notifications", "disable-popup-blocking");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(getBaseUrl());
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getBaseUrl() {
        return "https://www.magicbricks.com/";
    }
}
