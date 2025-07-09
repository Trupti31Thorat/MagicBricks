package com.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EMIPageFactory extends BasePage {
	// Constructor
    public EMIPageFactory(WebDriver driver) {
      
    	super(driver);
    }

    
    // WebElements
    @FindBy(xpath = "/html/body/header/section[2]/div/ul/li[4]/a")
    public WebElement homeLoansMenu;
    
    @FindBy(xpath = "//a[text()=\"Home Loan EMI Calculator\"]")
    public WebElement EMIbtn;
    
    @FindBy(id = "amountRequiredEmiCal")
    public WebElement LoanEMI;
    
    @FindBy(id = "loanTenureEmiCal")
    public WebElement TenureEMI;
    
    @FindBy(id = "interestRateEmiCal")
    public WebElement InterestEMI;
    
  @FindBy(xpath = "//input[@id=\"emiPropFinalizedYes\"]")
   // @FindBy(xpath = "//input[@type='radio' and @value='Yes']")
    public WebElement propertyFinalizedYes;
    
    @FindBy(id = "emiPropFinalizedNo") // Optional: 'No' option
    public WebElement propertyFinalizedNo;
    
    @FindBy(id = "submitbuttonEmiCalid") 
    public WebElement CalculateEMI;
    // Methods

    public void EMICalculatorbtn() {

    	
    	waitUntilWebElementIsVisible(homeLoansMenu);
    	
    	Actions actions = new Actions(driver);
    	actions.moveToElement(homeLoansMenu).perform();
    	waitUntilWebElementIsVisible(EMIbtn);
    	
    	EMIbtn.click();
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
    	    
    	    
    	    public void enterEMILoanAmount(String amount) {
    	    	
    	        waitUntilWebElementIsVisible(LoanEMI);
    	        LoanEMI.clear();
    	        LoanEMI.sendKeys(amount);
    	    }
    	    
    	    public void enterEMITenure(String tenure) {
    	    	
    	        waitUntilWebElementIsVisible(TenureEMI);
    	        TenureEMI.clear();
    	        TenureEMI.sendKeys(tenure);
    	    }
    	    
    	    public void enterEMIInterest(String interest) {
 	
	     waitUntilWebElementIsVisible(InterestEMI);
	     	InterestEMI.clear();
	     InterestEMI.sendKeys(interest);
	     
	     
	    
    	    }
 
    	    
    	    public void selectPropertyFinalized(String option) {
    	    	
    /*	    	WebElement elementToScroll = option.equalsIgnoreCase("Yes") ? propertyFinalizedYes : propertyFinalizedNo;
    	    	((JavascriptExecutor) driver).executeScript(
    	 	            "arguments[0].scrollIntoView({block: 'center'});",
    	 	            elementToScroll);

    	 	        try { Thread.sleep(1000); } catch (InterruptedException e) {}
*/
    	    	
    	    	
    	    
    	    		try {
    	    			WebElement propertyFinalized = wait.until(ExpectedConditions
    	    					.visibilityOfElementLocated(By.xpath("\"//input[@id=\\\"emiPropFinalizedYes\\\"]\"")));
    	    			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", propertyFinalized);
    	    			Thread.sleep(1000);
    	    			System.out.println("✅ Scrolled to Most Popular filter section");
    	    		} catch (Exception e) {
    	    			System.out.println("❌ Failed to scroll to Most Popular section: " + e.getMessage());
    	    		}
    	    
    	     
    	       
    	        //waitUntilWebElementIsVisible(propertyFinalizedYes);
    	 	      /* waitUntilWebElementIsVisible(propertyFinalizedYes);
    	        if (option.equalsIgnoreCase("Yes")) {
    	            if (!propertyFinalizedYes.isSelected()) {
    	                propertyFinalizedYes.click();
    	            }
    	        } else {
    	            waitUntilWebElementIsVisible(propertyFinalizedNo);
    	            if(option.equalsIgnoreCase("No"))
    	            {
    	                propertyFinalizedNo.click();
    	            
    	        } */
    	    //}
    	    }
    	    public void selectFreeBreakfastFilter() {
    			try {
    	 
    			
    				By freeBreakfastFilter = By.xpath("/html/body/div/div[4]/div[1]/div/div/div[1]/form/div[3]/div[2]/div[2]/label");
    				WebElement freeBreakfast = wait.until(ExpectedConditions.elementToBeClickable(freeBreakfastFilter));
    				((JavascriptExecutor) driver).executeScript("arguments[0].click();", freeBreakfast);
    				System.out.println("✅ Selected filter: Free Breakfast");
    	 
    				Thread.sleep(3000); // Wait for results update
    			} catch (Exception e) {
    				System.out.println("❌ Failed to select Free Breakfast filter: " + e.getMessage());
    			}
    		}
    	    
    	    public void clickCalculateEMI(String calculate) {
    	        ((JavascriptExecutor) driver).executeScript(
    	            "arguments[0].scrollIntoView({block: 'center'});",
    	            CalculateEMI);

    	        try { Thread.sleep(500); } catch (InterruptedException e) {}

    	        waitUntilWebElementIsVisible(CalculateEMI);
    	        waitUntilElementIsClickable(CalculateEMI);
    	        CalculateEMI.click();
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
     }


