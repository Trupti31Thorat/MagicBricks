package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocalityPage
{

	WebDriver driver;
	Properties prop;
	public LocalityPage(WebDriver driver) {
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
	

	@FindBy(xpath = "//*[@id=\"newprojects\"]/div[1]/div[2]/div/ul/li[6]/div/div/div[3]/ul/li[4]/span")
	WebElement NewProject;	
	
	public void launchMagicBricks() {
		driver.get(prop.getProperty("url"));
	}


public void navigateToNewProject() {
    Actions actions = new Actions(driver);
    actions.moveToElement(mbAdviceMenu)
           .pause(Duration.ofSeconds(1))
           .moveToElement(NewProject)
           .click().build().perform();
}
	


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