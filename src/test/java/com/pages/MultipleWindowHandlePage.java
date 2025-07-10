package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
public class MultipleWindowHandlePage extends BasePage{
=======
public class MultipleWindowHandlePage {
>>>>>>> origin/MbAdvice

	
	

<<<<<<< HEAD
	
	Properties prop;
	public MultipleWindowHandlePage(WebDriver driver) {
		super(driver);

		
=======
	WebDriver driver;
	Properties prop;
	public MultipleWindowHandlePage(WebDriver driver) {
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
	}
	
	

	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
	WebElement mbAdviceMenu;   
	

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[2]/a")
	WebElement LifeStyle;												//Y
	
	
	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[4]/ul/li[4]/a")
	WebElement FinancialAndLegal;											//Y
	

	public void launchMagicBricks() {
<<<<<<< HEAD
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\PropertyFiles\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
=======
>>>>>>> origin/MbAdvice
		driver.get(prop.getProperty("url"));
	}

	
	

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
    
}


<<<<<<< HEAD


=======
public void takesScreen() throws IOException
{
	TakesScreenshot screen1=(TakesScreenshot)driver;
	File src1= screen1.getScreenshotAs(OutputType.FILE);
<<<<<<< HEAD
	String filename = "Multiple_Window"+System.currentTimeMillis()+".png";
=======
	String filename = "MultipleWindow"+System.currentTimeMillis()+".png";
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
	String destination ="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\Screenshots\\"
	+filename;
	
	File dest = new File(destination);
   FileUtils.copyFile(src1, dest);
   
 
	
	
}
>>>>>>> origin/MbAdvice
	
}
