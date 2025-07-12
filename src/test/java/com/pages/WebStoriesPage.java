package com.pages;

<<<<<<< HEAD

import static org.junit.Assert.*;
=======
<<<<<<< HEAD

import static org.junit.Assert.*;
=======
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
<<<<<<< HEAD
=======
=======

import org.apache.commons.io.FileUtils;
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
public class WebStoriesPage extends BasePage{


	Properties prop;
	public WebStoriesPage(WebDriver driver) {
		super(driver);
		
	
<<<<<<< HEAD
=======
=======
public class WebStoriesPage {

	
	
	WebDriver driver;
	Properties prop;
	public WebStoriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\PropertyFiles\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
	}
	

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[7]/a") // adjust if needed
	WebElement WebStories;
	
	

	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
	WebElement mbAdviceMenu;  
	
	public void launchMagicBricks() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
		
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\PropertyFiles\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		driver.get(prop.getProperty("url"));
	}
	

	

	public void scrollToDropdown() throws InterruptedException {
		Thread.sleep(2000);

		// Get the current window handle
		String originalWindow = driver.getWindowHandle();

		// Wait for new window to open
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

	
	}
<<<<<<< HEAD
=======
=======
		driver.get(prop.getProperty("url"));
	}
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice



public void hoverAndClickWebDriver() 
{
	Actions action = new Actions(driver);
	action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).moveToElement(WebStories).click().build()
			.perform();
}
public void scrollWithRobotPageDown() {
    try {
        Robot robot = new Robot();
        robot.delay(1000); // small wait before scrolling
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
     
    } catch (AWTException e) {
        throw new RuntimeException("Failed to scroll using Robot", e);
    }
}


public void takesScreen() throws IOException
{
	TakesScreenshot screen1=(TakesScreenshot)driver;
	File src1= screen1.getScreenshotAs(OutputType.FILE);
<<<<<<< HEAD
	String filename = "Web_Stories"+System.currentTimeMillis()+".png";
=======
<<<<<<< HEAD
	String filename = "Web_Stories"+System.currentTimeMillis()+".png";
=======
<<<<<<< HEAD
	String filename = "Web_Stories"+System.currentTimeMillis()+".png";
=======
	String filename = "WebStories"+System.currentTimeMillis()+".png";
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
	String destination ="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\Screenshots\\"
	+filename;
	
	File dest = new File(destination);
   FileUtils.copyFile(src1, dest);
   

	
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice


//Add at the end of your class


public void verifyWebStoriesPageOpened() {
 String title = driver.getTitle();
assertTrue("Web Stories page title mismatch. Actual: " + title,title.contains("web-stories"));
}

<<<<<<< HEAD
=======
=======
<<<<<<< HEAD

=======
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
}
