package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBIPageFactory extends BasePage{
  

    // Constructor
    public SBIPageFactory(WebDriver driver) {
      
    	super(driver);
    }

    // WebElements
    @FindBy(xpath = "(//a[text()=\"Home Loans\"])[1]")
    public WebElement homeLoansMenu;
    
    @FindBy(xpath = "//a[text()=\"SBI Home Loan\"]")
  
    public WebElement SBILoansbtn;

    @FindBy(id = "loanAmount")
    public WebElement loanAmountInput;
    
    @FindBy(id = "mobileNumber")
    public WebElement mobileNumberInput;
    
    @FindBy(id = "PropertyCity")
    public WebElement propertyCityInput;
    
    @FindBy(xpath = "//*[@id=\"cityDropdownWebList\"]/li[1]")
    public WebElement propertyCitySelect;
    
    @FindBy(xpath = "//*[@id=\"loan-section\"]/div[2]/div[1]/div[4]/div[2]/div[1]/label")
    public WebElement propertyFinalizedYes;
    
    @FindBy(xpath = "//input[@value='No']") // Optional: 'No' option
    public WebElement propertyFinalizedNo;
    
    @FindBy(xpath = "//*[@id=\"propertySection\"]/div/div[2]/div[2]/label")
    public WebElement tokenAmountNo;
    
    @FindBy(id = "generate-otp")
    public WebElement checkEligibilityButton;
    
    
    // Methods

public void clickSBILoansbtn() {

	
	waitUntilWebElementIsVisible(homeLoansMenu);
	
	Actions actions = new Actions(driver);
	actions.moveToElement(homeLoansMenu).perform();
	waitUntilWebElementIsVisible(SBILoansbtn);
	
	SBILoansbtn.click();
 }



    public String getPageTitle() {
        return driver.getTitle();
    }
    
    public void switchToNewestWindow()
    {
    	for(String handle:
    		driver.getWindowHandles())
    	{
    		driver.switchTo().window(handle);
    	}
    }
    public void enterLoanAmount(String amount) {
    	
        waitUntilWebElementIsVisible(loanAmountInput);
        loanAmountInput.clear();
        loanAmountInput.sendKeys(amount);
    }

    public void enterMobileNumber(String mobile) {
        waitUntilWebElementIsVisible(mobileNumberInput);
        mobileNumberInput.clear();
        mobileNumberInput.sendKeys(mobile);
    }
    
    public void enterPropertyCity(String property) {
        waitUntilWebElementIsVisible(propertyCityInput);
        propertyCityInput.clear();
        propertyCityInput.sendKeys(property);
     
    }
    
    public void selectPropertyCity() throws AWTException
    {
    	waitUntilWebElementIsVisible(propertyCitySelect);
  	  propertyCitySelect.click();
    }

    public void selectPropertyFinalized(String option) {
        waitUntilWebElementIsVisible(propertyFinalizedYes);
        if (option.equalsIgnoreCase("Yes")) {
            if (!propertyFinalizedYes.isSelected()) {
                propertyFinalizedYes.click();
            }
        } else {
            waitUntilWebElementIsVisible(propertyFinalizedNo);
            if (!propertyFinalizedNo.isSelected()) {
                propertyFinalizedNo.click();
            }
        }
        }
        
     public void selectTokenAmount(String token)
      {
    	  waitUntilWebElementIsVisible(tokenAmountNo);
    	// SCROLL the button into view
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tokenAmountNo);

    	    // Small pause to let sticky elements settle
    	    try { Thread.sleep(500); } catch (InterruptedException e) {}
    	  tokenAmountNo.click();
      }
    
     public void takesscreen() {
		    try {
		        TakesScreenshot ts = (TakesScreenshot) driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		
		        String dest = "C:\\Users\\teshahan\\OneDrive - Capgemini\\Eclipse1\\HomeLoansFunctionality\\src\\test\\resource\\screenshot\\" + System.currentTimeMillis() + ".png";
		        FileUtils.copyFile(src, new File(dest));
		
		        System.out.println("Screenshot saved at: " + dest);
		    } catch (Exception e) {
		        System.out.println("Failed to take screenshot: " + e.getMessage());
		    }
		}

    public void clickCheckEligibility(String eligibility) {
        waitUntilWebElementIsVisible(checkEligibilityButton);
        waitUntilElementIsClickable(checkEligibilityButton);
        checkEligibilityButton.click();
    }
}



