package com.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.parameters.ConfigReader;

public class HomeInteriorPageFactory extends HomeInteriorBasePage {

	public HomeInteriorPageFactory(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);

	}

	public static final String HOME_INTERIOR_URL = "url";

	public void openHomeInteriorsFromConfigUrl() {
		String url = ConfigReader.get(HOME_INTERIOR_URL);
		driver.get(url);
	}

// -----------------------------------------------------Scenario 1 @HomeInteriors-----------------------------------------------------------------------

	//Xpath
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div/div[2]/div[1]/a")
	WebElement postPropertyBtn;

	//CSS
	@FindBy(css = "#pp-exit-intent [class*='close'], #pp-exit-intent svg, #pp-exit-intent button")
	WebElement popupCloseBtn;

	@FindBy(xpath = "label[contains(text(),'Owner')]")
	WebElement ownerRadioBtn;

	@FindBy(xpath = "label[contains(text(),'Sell')]")
	WebElement sellRadioBtn;

	@FindBy(xpath = "//*[@id=\"ownerMobile\"]") 
	WebElement contactNumberInput;

	public void clickPostProperty() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(postPropertyBtn)).click();
			System.out.println(" Clicked on Post Property using WebDriver.");
		} catch (Exception e) {
			System.out.println(" Normal click failed, trying JavaScript click: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", postPropertyBtn);
		}
	}

	public void closePopupIfPresent() {
		driver.get(
				"https://post.magicbricks.com/?_gl=1*67ehie*_gcl_au*MTgwMzg2OTQ1LjE3NTE4NzQ0NDI.*_ga*MTg4NjQwNTc4NS4xNzUxODc0NDQy*_ga_Y3D9LD1B01*czE3NTE4NzQ0NDIkbzEkZzEkdDE3NTE4NzQ0NDkkajUzJGwwJGgw");
		try {
			System.out.println(" Waiting for popup to appear...");

			WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(15));
			longWait.until(ExpectedConditions.visibilityOf(popupCloseBtn));

			// Scroll and click using JS to avoid overlap or invisibility
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", popupCloseBtn);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", popupCloseBtn);

			System.out.println(" Popup closed.");
		} catch (TimeoutException e) {
			System.out.println(" Popup did not appear within wait time.");
		} catch (Exception e) {
			System.out.println(" Failed to close popup: " + e.getMessage());
		}
	}

	public void switchToFormIframe() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
			System.out.println(" Switched to iframe containing the form.");
		} catch (Exception e) {
			System.out.println(" Could not switch to iframe: " + e.getMessage());
		}
	}

	@FindBy(css = "label[for='Owner'], label[for='Sell']") // Adjust selector as needed
	List<WebElement> radioOptions;


	public void selectRadioByLabel(String labelText) {
		for (WebElement option : radioOptions) {
			if (option.getText().trim().equalsIgnoreCase(labelText)) {
				try {
					Thread.sleep(100); // Pause for 1 second before clicking
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				option.click();
				System.out.println("Selected radio option " + labelText);
				return;
			}
		}
		System.out.println("Radio option not found: " + labelText);
	}

	public void enterContactNumber(String number) {
		if (number == null || number.trim().isEmpty()) {
			System.out.println(" Contact number is null or empty! Please check test data.");
			return;
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(contactNumberInput));
			wait.until(ExpectedConditions.elementToBeClickable(contactNumberInput));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contactNumberInput);
			contactNumberInput.clear();
			contactNumberInput.sendKeys(number);
			System.out.println(" Mobile number entered: " + number);
		} catch (Exception e) {
			System.out.println(" Failed to enter mobile number: " + e.getMessage());
		}
	}

	public void clickStartNow() {

		try {
			Robot robot = new Robot();
			robot.delay(100);

			for (int i = 0; i < 8; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.delay(100);
				Thread.sleep(100);

			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Sent message using tab and enter");

		} catch (Exception e) {
			System.out.println(" Failed to click Start Now: " + e.getMessage());
		}
	}

	
	
// -----------------------------------------------------------------Scenario -2 @EngineeredWoods-----------------------------------------------

	@FindBy(xpath = "//div[contains(text(), 'Your Home Interiors Price Guide')]")
	WebElement priceGuideSection;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div/div/div[2]/div/div[3]/a[8]/div[2]")
	WebElement engineeredWoodsLink;

	public void scrollToPriceGuideSection() throws InterruptedException {
		Thread.sleep(1000);
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				priceGuideSection);
	}

	// Clicks on the "Engineered Woods" link
	public void clickEngineeredWoods() throws InterruptedException {
		engineeredWoodsLink.click();
	}

	public boolean isEngineeredWoodsPageOpen() {
		// Option 1: Verify using part of the URL
		String currentUrl = driver.getCurrentUrl();
		return currentUrl.contains("engineered-woods");

	}

//----------------------------------------------------------Scenario 3 @Estimation & 4 @NegativeTest ---------------------------------------------------------------//
	
	// Home Interiors menu and link
	//Linktext
	@FindBy(linkText = "Home Interiors")
	public WebElement homeInteriorsMenu;

	@FindBy(xpath = "//a[contains(text(),'Home Interior Design Services')]")
	private WebElement designServicesLink;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div/div/div[1]/div/a[2]/span")
	private WebElement kitchenWardrobeEstimator;

	@FindBy(xpath = "//label[contains(.,'L - shape')]")
	WebElement kitchenLayout;
	@FindBy(xpath = "//label[contains(.,'Big')]")
	WebElement kitchenSize;

	@FindBy(xpath = "//button[.='+']")
	WebElement plusBtn;
	@FindBy(xpath = "//label[contains(.,'Medium')]")
	WebElement wardrobeSize;

	//ID
	@FindBy(id = "user-name")
	WebElement nameInput;

	@FindBy(id = "phone")
	WebElement mobileInput;

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(xpath = "//button[contains(text(),'Get Free Estimate')]")
	WebElement getFreeEstimateBtn;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	public WebElement nextButton;

	@FindBy(xpath = "//*[@id=\"kwpeScroll\"]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div")
	WebElement mobileErrorMsg;

	public String getMobileErrorText() {
		return mobileErrorMsg.getText().trim();
	}

	@FindBy(xpath = "//button[contains(text(),'Get Free Estimate')]")
	WebElement getEstimateBtn;

	// --- Actions ---

	public void clickDesignServices() {
		click(designServicesLink);
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
		System.out.println(" Could not switch to new window. Only one window found or new window did not open.");
	}

	/**
	 * Waits briefly to allow any popups to disappear naturally.
	 */
	public void waitForPopupsToSettle() {
		try {
			System.out.println(" Waiting for city popup to appear...");

			// Wait for up to 10 seconds for the close button to appear in DOM
			WebDriverWait popupWait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement closeBtn = popupWait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.city-popup__close")));

			// Optional: wait until it's visible
			wait.until(ExpectedConditions.visibilityOf(closeBtn));

			// Click via JS since it's a pseudo-element
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeBtn);
			System.out.println(" City popup closed using JavaScript.");

		} catch (TimeoutException e) {
			System.out.println(" City popup did not appear within timeout. Proceeding.");
		} catch (Exception e) {
			System.out.println(" Failed to close city popup: " + e.getMessage());
		}
	}

	public void clickKitchenWardrobeEstimator() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down multiple times
		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0, 300);");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// Try clicking
		wait.until(ExpectedConditions.elementToBeClickable(kitchenWardrobeEstimator));
		kitchenWardrobeEstimator.click();
	}

	public void selectKitchen(String layout, String size) {
		click(kitchenLayout);
		click(kitchenSize);
		click(nextButton);
	}

	public void selectWardrobe(int count, String size) {
		// Wait until overlay disappears
		try {
			WebDriverWait waitForOverlay = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitForOverlay.until(ExpectedConditions.invisibilityOfElementLocated(By.className("mb-cal-prog_wrapper")));
			System.out.println(" Overlay disappeared. Proceeding with wardrobe clicks.");
		} catch (Exception e) {
			System.out.println("Overlay may not have disappeared, but proceeding anyway.");
		}

		// Click plus button
		for (int i = 0; i < count; i++) {
			click(plusBtn); // This uses the custom click method with wait
		}

		click(wardrobeSize);
		click(nextButton);
	}

	public void fillContactDetails(String name, String mobile, String email) {
		type(nameInput, name);
		type(mobileInput, mobile);
		type(emailInput, email);
		click(getFreeEstimateBtn);
	}

//-------------------------------------------------------Scenario 6 @DesignGallery---------------------------------------------------------//

	@FindBy(xpath = "//*[@id='root']/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div/a/div[1]/img")
	private WebElement interiorsDesigns;

	@FindBy(css = "div.city-popup__close")
	private WebElement cancelPopup;

	@FindBy(xpath = "//*[@id='brandDetailsPage']/div[2]/div[2]/div[1]/div[1]/div[8]/ul/li[4]/span")
	public WebElement designGallery;

	@FindBy(xpath = "//*[@id='designGallery']/div/div[2]/div/button[2]")
	private WebElement favoriteDesignPhoto;

	public void clickInteriorsDesigns() {
		waitUntilClickable1(interiorsDesigns).click();
	}

	public void cancelPopupIfPresent() {
		try {
			WebDriverWait popupWait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement closeBtn = popupWait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.city-popup__close")));
			popupWait.until(ExpectedConditions.visibilityOf(closeBtn));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeBtn);
			System.out.println(" City popup closed using JavaScript.");
		} catch (TimeoutException e) {
			System.out.println(" City popup did not appear within timeout. Proceeding.");
		} catch (Exception e) {
			System.out.println(" Failed to close city popup: " + e.getMessage());
		}
	}

	public void clickDesignGallerySafely() {
		try {
			WebElement gallery = waitUntilVisible(designGallery);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gallery);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", gallery);
			System.out.println(" Clicked on Design Gallery using JavaScript.");
		} catch (Exception e) {
			System.out.println(" Failed to click Design Gallery: " + e.getMessage());
		}
	}

	public void scrollToAndClickFavoriteDesignPhoto() {
		try {
			WebElement photo = waitUntilVisible(favoriteDesignPhoto);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", photo);
			photo.click();
			System.out.println(" Scrolled to and clicked favorite design photo.");
		} catch (Exception e) {
			System.out.println(" Failed to interact with favorite design photo: " + e.getMessage());
		}
	}

	private WebElement waitUntilClickable1(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println(" Element not clickable: " + e.getMessage());
			return null;
		}
	}

	private WebElement waitUntilVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			return wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(" Element not visible: " + e.getMessage());
			return null;
		}
	}
}
	

