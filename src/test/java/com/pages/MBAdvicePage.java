package com.pages;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.ExcelReader;
import com.utils.ExcelReader;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class MBAdvicePage {
	WebDriver driver;
	Properties prop;

	public MBAdvicePage(WebDriver driver) {
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
	}

	
	
	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
	WebElement mbAdviceMenu;                                             //Y
		

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement findPincodeLink;											//Y
	
	
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement ReserchIn;												//Y
	
	
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[1]/a")
	WebElement LatestBlogs;												//Y
	
	
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[2]/a")
	WebElement LifeStyle;												//Y
	
	
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[4]/a")
	WebElement FinancialAndLegal;											//Y
	
	

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[7]/a") // adjust if needed
	WebElement WebStories;
	
//-----------------Common Methods--------------------------------------------------------------------

	public void launchMagicBricks() {
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

		// Reload and scroll in the new window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("location.reload()");
		Thread.sleep(2000); // Wait for reload to complete
		js.executeScript("window.scrollBy(0,300)");
	}


	

	
	
	//--------------------------------------Research and Insights-------------------------------------//
/*	
	public void hoverAndClickResearchInsights() {
		Actions action = new Actions(driver);
		action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).moveToElement(ReserchIn).click().build()
				.perform();
	}

	
	
	public void selectRandomCityFromDropdown() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click the dropdown to reveal options
	    WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[contains(@class, 'p-dropdown-label') and contains(text(), 'Cities')]")
	    ));
	    cityDropdown.click();

	    Thread.sleep(3000);
	    driver.findElement(By.id("dropdownItem_3")).click();
	   
	}
	
	public void selectRandomQuartersFromDropdown() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click the dropdown to reveal options
	    WebElement QuartersDropdown = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[contains(@class, 'p-dropdown-label') and contains(text(), 'Quarters')]")
	    ));
	    QuartersDropdown.click();

	    Thread.sleep(3000);
	    driver.findElement(By.id("dropdownItem_0")).click();
	   
	}

	
	public void selectRandomYearFromDropdown() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click the dropdown to reveal options
	    WebElement YearDropdown = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[contains(@class, 'p-dropdown-label') and contains(text(), 'Years')]")
	    ));
	    YearDropdown.click();

	    Thread.sleep(3000);
	    driver.findElement(By.id("dropdownItem_0")).click();
	  
	}

	
	*/
	
//-------------------------------------------Latest blogs take screenshot ------------------------------------------//
	

	public void hoverAndClickLatestBlogs() {
		Actions action = new Actions(driver);
		action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).moveToElement(LatestBlogs).click().build()
				.perform();
	}

	public void takesScreen() throws IOException
	{
		TakesScreenshot screen1=(TakesScreenshot)driver;
		File src1= screen1.getScreenshotAs(OutputType.FILE);
		String filename = "latest_blogs"+System.currentTimeMillis()+".png";
		String destination ="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\Screenshots\\"
		+filename;
		
		File dest = new File(destination);
	   FileUtils.copyFile(src1, dest);
	   
	 
		
		
	}
	
	



	

//--------------------------------------------------Print with Robot -------------------------------

	/*
public void navigateToReserchInsights() {
    Actions actions = new Actions(driver);
    actions.moveToElement(mbAdviceMenu)
           .pause(Duration.ofSeconds(1))
           .moveToElement(ReserchIn)
           .click().build().perform();
}

public void pressPrintWithRobot() throws AWTException {
    Robot robot = new Robot();
    robot.delay(2000);

    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_P);
    robot.keyRelease(KeyEvent.VK_P);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    robot.delay(10000);

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
}    


*/

//-------------------------------------Window Handling------------------------------------

public void hoverAndClickFindPincodeForWindow() {
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).perform();
    wait.until(ExpectedConditions.visibilityOf(findPincodeLink));
    action.moveToElement(findPincodeLink).click().build().perform();
}


public void switchToNewWindowAndValidate() {
    String parent = driver.getWindowHandle();
    Set<String> handles = driver.getWindowHandles();
    for (String window : handles) {
        if (!window.equals(parent)) {
            driver.switchTo().window(window);
            break;
        }
    }

    // Wait for the page to load
    new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));

    System.out.println("New window title: " + driver.getTitle());
}
   
//------------------------------------------Multiple Window Handle---------------------------------

/*

public void openMultipleAdviceWindows() {
    Actions actions = new Actions(driver);

    // Open Find Pincode
    actions.moveToElement(mbAdviceMenu)
           .pause(Duration.ofSeconds(1))
           .moveToElement(LifeStyle)
           .click().build().perform();

    // Open Research & Insights
    actions.moveToElement(mbAdviceMenu)
           .pause(Duration.ofSeconds(1))
           .moveToElement(FinancialAndLegal)
           .click().build().perform();
}

// Switch to all windows one by one and print their titles
public void handleAllWindows() {
    String parent = driver.getWindowHandle();
    Set<String> allWindows = driver.getWindowHandles();

    for (String win : allWindows) {
        driver.switchTo().window(win);
        System.out.println("Window title: " + driver.getTitle());
    }

    // Optionally, switch back to parent
    driver.switchTo().window(parent);
    
    

}*/
//------------------------------------------------------------------------------------------------



/*

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
*/


//------------------------------------excel------------------------------------------//

@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[2]/a")
WebElement RaresTrends;



WebDriverWait wait;
@FindBy(xpath = "//*[@id=\"keyword\"]")
WebElement citySearchBox;

@FindBy(xpath = "//*[@id=\"showTrendsId\"]")
WebElement showTrendsBtn;



public void hoverAndClickRatesTrends() 
{
	Actions action = new Actions(driver);
	action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).moveToElement(RaresTrends).click().build()
			.perform();
}
public void selectCityUsingRobotpopup()
{
	 try {
	        Robot robot = new Robot();
	        robot.mouseMove(360,35);
	        robot.keyPress(InputEvent.BUTTON1_DOWN_MASK);
			robot.keyRelease(InputEvent.BUTTON1_DOWN_MASK);
	       
	    } catch (AWTException e) {
	        throw new RuntimeException("Robot failed", e);
	    }
}

public void clickSearchBox() {
	
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(citySearchBox)).click();
}

public void enterCityName(String city) {
    citySearchBox.sendKeys(city);
}

public void selectCityUsingRobot() {
    try {
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    } catch (AWTException e) {
        throw new RuntimeException("Robot failed", e);
    }
}


public void clickShowTrends() {
    wait.until(ExpectedConditions.elementToBeClickable(showTrendsBtn)).click();
}


public boolean isTrendsPageLoaded() {
    return driver.getCurrentUrl().contains("Property-Rates");
}


}
