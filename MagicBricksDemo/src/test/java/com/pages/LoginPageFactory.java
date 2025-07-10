package com.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class LoginPageFactory {
	WebDriver driver;
	WebDriverWait wait;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	// Hover menu and login link
	@FindBy(xpath = "//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/a")
	WebElement loginMenu;

	@FindBy(xpath = "//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/div/div[2]/a")
	WebElement loginLink;

	@FindBy(id = "emailOrMobile")
	private WebElement mobileInput;

	@FindBy(id = "btnStep1")
	WebElement nextBtn;

	@FindBy(xpath = "//*[@id='verifyOtpDiv']/div[2]/div[3]/button")
	WebElement continueBtn;

	public void hoverAndClickLogin() {
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(loginMenu));
		actions.moveToElement(loginMenu).pause(Duration.ofSeconds(1)).perform();

		wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
	}

	public void switchToNewWindow() {
		String originalWindow = driver.getWindowHandle();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			if (!originalWindow.equals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println(" Switched to new window: " + driver.getCurrentUrl());
				return;
			}
		}
		System.out.println(" Could not switch to new window.");
	}

	public void enterMobileNumber(String mobile) throws InterruptedException {
		System.out.println(" Trying to enter mobile number: " + mobile);
		try {
			wait.until(ExpectedConditions.visibilityOf(mobileInput));
			wait.until(ExpectedConditions.elementToBeClickable(mobileInput));
			mobileInput.click();
			Thread.sleep(300);
			mobileInput.clear();
			mobileInput.sendKeys(mobile);
			Thread.sleep(100);

			String enteredValue = mobileInput.getAttribute("value");
			if (!enteredValue.contains(mobile)) {
				System.out.println(" sendKeys failed, injecting via JS...");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value='" + mobile + "';", mobileInput);
				System.out.println(" JS injection complete.");
			}
		} catch (Exception e) {
			System.out.println(" Failed to enter mobile number: " + e.getMessage());
		}
	}

	public void clickNextAfterCaptcha() throws InterruptedException {
		System.out.println(" Waiting for manual captcha entry...");
		Thread.sleep(100);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
			if (nextBtn.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
				System.out.println(" Clicked Next button.");
			} else {
				System.out.println(" Next button is disabled.");
			}
		} catch (Exception e) {
			System.out.println(" Failed to click Next: " + e.getMessage());
		}
	}

	public void clickContinue() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
			System.out.println("✅ Clicked on Continue button.");
		} catch (Exception e) {
			System.out.println("❌ Failed to click Continue: " + e.getMessage());
		}
	}

	private void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
//
//	public void clickLoginAfterOTP() {
//		System.out.println("⌛ Waiting for manual OTP entry...");
//        Thread.sleep(100);
//        click(loginBtn);	
//		
//	}
}
