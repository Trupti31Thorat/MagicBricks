package com.setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

/*public class BaseSteps {
    private static WebDriver driver;

    public static void initDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:\\drivers");
    	WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.magicbricks.com/");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) driver.quit();
    }
}*/

public class BaseSteps {
	protected static WebDriver driver;
    private static final String BASE_URL = "https://www.magicbricks.com"; // Set your base URL directly
 
    @Before
    public void setUp() {
        if (driver == null) {
            System.out.println(" Launching browser without config file...");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
 
    @After
    public void tearDown() {
        if (driver != null) {
        	
        	try {
        		Thread.sleep(5000);
        	}catch(InterruptedException e)
        	{
        		e.printStackTrace();
        	}
            System.out.println(" Cleaning up browser...");
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