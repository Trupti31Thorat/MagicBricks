package com.pages;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OwnerPropertyPage extends BasePage {

	public OwnerPropertyPage(WebDriver driver) {
		super(driver);
	}

	
//1st Scenario
/*
	@FindBy(id = "rentheading")
	public WebElement rentTag;
	
	@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href='javascript:void(0);']")
	// @FindBy(css =
	// "a[href*='https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage']")
	public WebElement OwnerProperties;

	public void clickOwnerProperties() {

		waitUntilWebElementIsVisible(rentTag);

		Actions actions = new Actions(driver);
		actions.moveToElement(rentTag).perform();
		waitUntilWebElementIsVisible(rentTag);

		OwnerProperties.click();
	}
	

	public void switchToNewestWindow() {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	//@FindBy(xpath = "//img[@src='https://img.staticmb.com/mbphoto/property/cropped_images/2024/Dec/07/Photo_h300_w450/76392859_9_PropertyImage369-6091984673031_300_450.jpg' and @alt='3BHK Penthouse for Rent in Bella Vista Empress at Wakad']\r\n")
	@FindBy(xpath = "//img[@src='https://img.staticmb.com/mbphoto/property/cropped_images/2025/May/02/Photo_h300_w450/79213625_8_1000420257_300_450.jpg' and @alt='A building with windows is next to a pathway and vegetation']\r\n")
	public WebElement PropertyPhoto;
	
     public void clickPropertyPhoto() {

		waitUntilWebElementIsVisible(PropertyPhoto);
		waitUntilElementIsClickable(PropertyPhoto);
		PropertyPhoto.click();
	}

	public void scrollDown() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); // Adjust the scroll value as needed
	}
*/	

	
	
//2nd Scenario 
	
	// WebElements
		@FindBy(id = "rentheading")
		public WebElement rentTag;
	@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href='javascript:void(0);']")
		// @FindBy(css =
		// "a[href*='https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage']")
		public WebElement OwnerProperties;

		public void clickOwnerProperties() {

			waitUntilWebElementIsVisible(rentTag);

			Actions actions = new Actions(driver);
			actions.moveToElement(rentTag).perform();
			waitUntilWebElementIsVisible(rentTag);

			OwnerProperties.click();
		}

		public void switchToNewestWindow() {
			for (String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
		}

	//@FindBy(xpath = "//*[@id=\"cardid78966081\"]/div/div[2]/div[2]/span[1]")
		@FindBy(xpath="/html/body/div/div/div/div[2]/div[5]/div/div/div[1]/div[5]/div/div[2]/div[2]/span[1]")
		public WebElement contactOwnerButton;

		//@FindBy(id = "name")
		@FindBy(xpath="//*[@id=\"userName\"]")
		public WebElement nameField;

	//2nd scenario mobile no.
		@FindBy(xpath= "/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/form/div[3]/div[2]/input")
		public WebElement mobileField;

		@FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/form/div[2]/div/input")
		public WebElement emailField;

		//@FindBy(xpath = "//button[contains(text(),'Continue')]")
		@FindBy(xpath="//*[@id=\"contact-slide-default\"]/form/button")
		public WebElement continueButton;

		@FindBy(xpath = "//div[contains(text(),'Verify') or contains(text(),'OTP')]")
		public WebElement verificationElement;
		
		public void clickContactOwnerButton() {
		    waitUntilElementIsClickable(contactOwnerButton);
		    contactOwnerButton.click();
		}

		public void fillContactForm(String name, String mobile, String email) {
		    waitUntilWebElementIsVisible(nameField);
		    nameField.clear();
		    nameField.sendKeys(name);

	//2nd scenario mobile no.
		    mobileField.clear();
		    mobileField.sendKeys(mobile);  

		    emailField.clear();
		    emailField.sendKeys(email);
		}


		public void clickContinue() {
		    waitUntilElementIsClickable(continueButton);
		    continueButton.click();
		}
		
		public boolean isVerificationDisplayed() {
		    return verificationElement.isDisplayed();
		}

	
	
	
//3rd Scenario
/*
	// WebElements
		@FindBy(id = "rentheading")
		public WebElement rentTag;
		
	@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href='javascript:void(0);']")
		// @FindBy(css =
		// "a[href*='https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage']")
		public WebElement OwnerProperties;

		public void clickOwnerProperties() {

			waitUntilWebElementIsVisible(rentTag);

			Actions actions = new Actions(driver);
			actions.moveToElement(rentTag).perform();
			waitUntilWebElementIsVisible(rentTag);

			OwnerProperties.click();
		}
		
		

		public void switchToNewestWindow() {
			for (String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
		}

	//@FindBy(xpath = "//*[@id=\"cardid78966081\"]/div/div[2]/div[2]/span[1]")
		@FindBy(xpath="/html/body/div/div/div/div[2]/div[5]/div/div/div[1]/div[5]/div/div[2]/div[2]/span[1]")
		public WebElement contactOwnerButton;

		//@FindBy(id = "name")
		@FindBy(xpath="//*[@id=\"userName\"]")
		public WebElement nameField;

		@FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/form/div[2]/div/input")
		public WebElement emailField;

		//@FindBy(xpath = "//button[contains(text(),'Continue')]")
		@FindBy(xpath="//*[@id=\"contact-slide-default\"]/form/button")
		public WebElement continueButton;

	public void fillContactForm(String name, String mobile, String email) {
		    waitUntilWebElementIsVisible(nameField);
		    nameField.clear();
		    nameField.sendKeys(name);
		    
		    mobileField.clear();
		    mobileField.sendKeys(mobile);  

		    emailField.clear();
		    emailField.sendKeys(email);
		}

		
	//3rd Scenario..mobile no.
		
//		public void clickContactOwnerButton() {
//		    By contactOwnerBtnLocator = By.xpath("/html/body/div/div/div/div[2]/div[5]/div/div/div[1]/div[5]/div/div[2]/div[2]/span[1]");
//		    waitUntilElementIsClickable(driver.findElement(contactOwnerBtnLocator));
//		    driver.findElement(contactOwnerBtnLocator).click();
//		}
		
		public void clickContactOwnerButton() {
		    By contactOwnerBtnLocator = By.xpath("/html/body/div/div/div/div[2]/div[5]/div/div/div[1]/div[5]/div/div[2]/div[2]/span[1]");
		    
		    WebElement element = waitUntilElementIsClickable(contactOwnerBtnLocator); // updated helper method
		    element.click();
		}


		//@FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/form/div[3]/div[2]/input") // Adjust based on actual message
		//@FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/form/div[3]/div[2]/label")
		@FindBy(className = "contact-form__mobile-no")
		public WebElement mobileField;
		
		
		//@FindBy(xpath = "//*[@id=\"contact-slide-default\"]/form/div[3]/div[2]/div") // Adjust based on actual message
		@FindBy(xpath = "//form[@id='contact-slide-default']//div[contains(text(), '10-digit')]")
		public WebElement phoneValidationError;


		public WebElement getPhoneNumberErrorElement() {
		    waitUntilWebElementIsVisible(phoneValidationError);
		    return phoneValidationError;
		}
		
		public void clickContinue() {
		    waitUntilElementIsClickable(continueButton);
		    continueButton.click();
		}
		
		
		public void takesscreen() {
		    try {
		        TakesScreenshot ts = (TakesScreenshot) driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		
		        String dest = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Screenshot\\" + System.currentTimeMillis() + ".png";
		        FileUtils.copyFile(src, new File(dest));
		
		        System.out.println("Screenshot saved at: " + dest);
		    } catch (Exception e) {
		        System.out.println("Failed to take screenshot: " + e.getMessage());
		    }
		}
*/	

		

		
		
//4th Scenario
/*	
	@FindBy(id = "rentheading")
	public WebElement rentTag;
	
	@FindBy(css = "a[onclick*='openRentUrlInNewTab'][href='javascript:void(0);']")
	// @FindBy(css =
	// "a[href*='https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage']")
	public WebElement OwnerProperties;

	public void clickOwnerProperties() {

		waitUntilWebElementIsVisible(rentTag);

		Actions actions = new Actions(driver);
		actions.moveToElement(rentTag).perform();
		waitUntilWebElementIsVisible(rentTag);

		OwnerProperties.click();
	}
	

	public void switchToNewestWindow() {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	public void selectSortOptionOnlyClick(String optionText) throws InterruptedException {
	    // Step 1: Click dropdown
	    WebElement dropdown = driver.findElement(By.xpath("//div[contains(@class, 'mb-srp__tabs__sortby--title')]"));
	    dropdown.click();
	    Thread.sleep(1000);

	    // Step 2: Click sort option from list
	    WebElement option = driver.findElement(By.xpath("//*[@id=\"body\"]/div[5]/div/div/div[1]/div[2]/div/div[2]/ul/li[3]"));
	    option.click();

	    Thread.sleep(2000);
	
	}
*/	
	
}

	
	
		

