

	package com.pages;
	import static org.junit.Assert.*;
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ViewReportPage extends BasePage{

	
		Properties prop;
		Robot robot;
		public ViewReportPage(WebDriver driver) {
			super(driver);
			

			
		}

		

		@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
		WebElement mbAdviceMenu;           
		
		@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
		WebElement ReserchIn;	
		
		
		@FindBy(xpath = "//*[@id=\"root\"]/div/section[3]/div/div[1]/div[1]/div/div/div/div[2]/div[2]/button[1]")
		WebElement Report;	
		
	    
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


	public void navigateInsights() {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(mbAdviceMenu)
	           .pause(Duration.ofSeconds(1))
	           .moveToElement(ReserchIn)
	           .click().build().perform();
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

		// Reload and scroll in the new window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("location.reload()");
		Thread.sleep(2000); // Wait for reload to complete
		js.executeScript("window.scrollBy(0,700)");
	}

	public void ClickOnViewReport() throws InterruptedException
	{
		Thread.sleep(5000);
		waitUntilWebElementIsClickable(Report);
		click(Report);
		
		
	}



	    public void moveAndClick(int x, int y) throws InterruptedException {
	    	
	    	 try {
		            robot = new Robot();
		        } catch (AWTException e) {
		            e.printStackTrace();
		        }
	    	 
	    	 
	        robot.mouseMove(x, y);
	        Thread.sleep(500);
	        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
	        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
	        Thread.sleep(500);
	    }

	    public void typeText(String text) {
	        for (char c : text.toCharArray()) {
	            typeChar(c);
	            robot.delay(100);
	        }
	    }

	    private void typeChar(char c) {
	        try {
	            boolean upperCase = Character.isUpperCase(c);
	            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

	            if (upperCase) robot.keyPress(KeyEvent.VK_SHIFT);
	            robot.keyPress(keyCode);
	            robot.keyRelease(keyCode);
	            if (upperCase) robot.keyRelease(KeyEvent.VK_SHIFT);

	        } catch (IllegalArgumentException e) {
	            System.out.println("Unsupported character: " + c);
	        }
	    }

	    public void fillContactFormViaMouse(String name, String email, String phone, String company, String city) throws InterruptedException {
	        // Example coordinates — you must adjust these based on your screen and form field locations
	        moveAndClick(250, 300);  // Name field
	        typeText(name);

	        moveAndClick(250, 360);  // Email field
	        typeText(email);

	        moveAndClick(250, 420);  // Phone field
	        typeText(phone);

	        moveAndClick(250, 500);  // Company field
	        typeText(company);

	        moveAndClick(250,580);  // City field
	        typeText(city);

	        moveAndClick(250, 645);  // Continue button
	    }
	    
	    
	    public void takesScreen() throws IOException
		{
			TakesScreenshot screen1=(TakesScreenshot)driver;
			File src1= screen1.getScreenshotAs(OutputType.FILE);
			String filename = "View_Report"+System.currentTimeMillis()+".png";
			String destination ="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\Screenshots\\"
			+filename;
			
			File dest = new File(destination);
		   FileUtils.copyFile(src1, dest);
		   
		 
					
		}
	
	   

	    
	    
	}

	
	
	