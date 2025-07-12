package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Property_Valuation extends BasePage {


	Properties prop;
	Robot robot;
	public Property_Valuation(WebDriver driver) {
		super(driver);
		

		
	}

	
	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
	WebElement mbAdviceMenu;      
	
	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[1]/a")
	WebElement PropertyValuation ;   
	
	@FindBy(xpath = "//*[@id=\"requestValuationCta\"]/a")
	WebElement DownloadPage ; 
	
	  public void launchMagicBricks() {
	    	
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

	  
	  public void navigateProperty() {
		    Actions actions = new Actions(driver);
		    actions.moveToElement(mbAdviceMenu)
		           .pause(Duration.ofSeconds(1))
		           .moveToElement(PropertyValuation)
		           .click().build().perform();
		}
		
	  public void ClickOnPropertyReport() throws InterruptedException
		{
//			Thread.sleep(5000);
//			waitUntilWebElementIsClickable(DownloadPage);
//			click(DownloadPage);
		  
		  //driver.findElement(By.xpath("//*[@id=\\\"requestValuationCta\\\"]/a")).click();
			
			
		}
	  
	  public void moveAndClick1() throws InterruptedException {
		  
		  
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
	    	
	    	 try {
		            robot = new Robot();
		        } catch (AWTException e) {
		            e.printStackTrace();
		        }
	    	 
	    	 
	        robot.mouseMove(150,500);
	        Thread.sleep(500);
	        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
	        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
	        Thread.sleep(500);
	    }

	
}
