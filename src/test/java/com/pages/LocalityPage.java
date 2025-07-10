package com.pages;

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
import org.openqa.selenium.JavascriptExecutor;
<<<<<<< HEAD
=======
=======

import org.apache.commons.io.FileUtils;
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
public class LocalityPage extends BasePage
=======
<<<<<<< HEAD
public class LocalityPage extends BasePage
=======
public class LocalityPage
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
{

	WebDriver driver;
	Properties prop;
	public LocalityPage(WebDriver driver) {
<<<<<<< HEAD
		super(driver);
=======
<<<<<<< HEAD
		super(driver);
=======
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
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
	WebElement mbAdviceMenu;           
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement ReserchIn;	
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section[3]/div/div[1]/div[1]/div/div/div/div[2]/div[2]/button[1]")
	WebElement Report;	
<<<<<<< HEAD
=======
=======

	@FindBy(xpath = "//*[@id=\"newprojects\"]/div[1]/div[2]/div/ul/li[6]/div/div/div[3]/ul/li[4]/span")
	WebElement NewProject;	
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
	
	public void launchMagicBricks() {
		driver.get(prop.getProperty("url"));
	}


<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
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
	js.executeScript("window.scrollBy(0,600)");
}

public void ClickOnViewReport()
{
	waitUntilWebElementIsClickable(Report);
	click(Report);
	
	
}

<<<<<<< HEAD
=======
=======
public void navigateToNewProject() {
    Actions actions = new Actions(driver);
    actions.moveToElement(mbAdviceMenu)
           .pause(Duration.ofSeconds(1))
           .moveToElement(NewProject)
           .click().build().perform();
}
	
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice


public void takesScreen() throws IOException
{
	TakesScreenshot screen1=(TakesScreenshot)driver;
	File src1= screen1.getScreenshotAs(OutputType.FILE);
	String filename = "ReaserchInsights"+System.currentTimeMillis()+".png";
	String destination ="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\Screenshots\\"
	+filename;
	
	File dest = new File(destination);
   FileUtils.copyFile(src1, dest);
   
 
	
	
}

	
}