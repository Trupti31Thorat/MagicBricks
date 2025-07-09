package com.pages;

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

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;

public class PrintResearchPage extends BasePage {

	Properties prop;

	public PrintResearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/header/section[2]/div/ul/li[6]/a")
	WebElement mbAdviceMenu;           	

	@FindBy(xpath = "//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement ReserchIn;		

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


}
