package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResearchInsightsPage extends BasePage {
	
	WebDriver driver;
	Properties prop;
	public ResearchInsightsPage(WebDriver driver) {
		super(driver);
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
	

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement ReserchIn;												//Y
	
	
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
	


}
