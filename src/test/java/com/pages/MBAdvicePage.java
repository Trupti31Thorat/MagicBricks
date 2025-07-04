package com.pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
 
import java.io.FileInputStream; import java.io.IOException; import java.time.Duration; import java.util.List; import java.util.Properties; import java.util.Random;
import java.util.Set;
 
public class MBAdvicePage { WebDriver driver; Properties prop;
 
public MBAdvicePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    prop = new Properties();
    try {
FileInputStream fis = new FileInputStream("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\PropertyFiles\\config.properties");
        prop.load(fis);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
 
@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
WebElement mbAdviceMenu;
 
@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[3]/a")
WebElement findPincodeLink;
 
@FindBy(xpath = "//input[@value='State']")
public

WebElement stateDropdown;
 
@FindBy(id = "citySelVal")
public
WebElement cityDropdown;
 
@FindBy(id = "localitySelVal")
public
WebElement localityDropdown;
 
@FindBy(id = "pinSearch")
WebElement searchBtn;
 
public void launchMagicBricks() {
    driver.get(prop.getProperty("url"));
}
 
public void hoverAndClickFindPincode() {
    Actions action = new Actions(driver);
    action.moveToElement(mbAdviceMenu).pause(Duration.ofSeconds(1)).moveToElement(findPincodeLink).click().build().perform();
}
 
/*
public void scrollToDropdown() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 1000)");

      
}*/

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


/*

public void selectRandomDropdown(WebElement dropdownElement) {
	Select dropdown = new Select(dropdownElement); 
	List<WebElement> options = dropdown.getOptions();
	if (options.size() > 1) {
		dropdown.selectByIndex(new Random().nextInt(options.size() - 1) + 1);
		}
	}
public void selectStateCityLocality()
{ selectRandomDropdown(stateDropdown); 
selectRandomDropdown(cityDropdown); 
selectRandomDropdown(localityDropdown);
}*/
 

public void selectDropdown() throws InterruptedException {

	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/span")).click();
	Thread.sleep(5000);
	
}


public void clickSearchButton() {
searchBtn.click();
}
 
}