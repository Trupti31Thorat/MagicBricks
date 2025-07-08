package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BalanceTransferPageFactory extends BasePage{
	 // Constructor
    public BalanceTransferPageFactory(WebDriver driver) {
    	super(driver);
    }
    
    // WebElements
    @FindBy(xpath = "/html/body/header/section[2]/div/ul/li[4]/a")
    public WebElement homeLoansMenu;
    
    @FindBy(xpath = "//a[text()=\"Balance Transfer\"]")
    public WebElement BTbtn;
    
    @FindBy(id = "laltc")
    public WebElement OldLoan;
    
    @FindBy(id = "ltltc")
    public WebElement OldTenure;
    
    @FindBy(id = "rltc")
    public WebElement OldRate;
    
    @FindBy(id = "ipltc")
    public WebElement Installments;
    
    @FindBy(id = "pfltc")
    public WebElement ProcessingFees;
    
    @FindBy(id="nltltc")
    public WebElement NewTenure;
    
    @FindBy(id = "nrltc")
    public WebElement NewRate;
    
    @FindBy(xpath = "//*[@id=\"loanTransferCalculator\"]/div/div[1]/div/div[4]/input")
    public WebElement Comparebtn;
    
    
    // Methods

    public void clickBalanceTransferbtn() {

    	
    	waitUntilWebElementIsVisible(homeLoansMenu);
    	
    	Actions actions = new Actions(driver);
    	actions.moveToElement(homeLoansMenu).perform();
    	waitUntilWebElementIsVisible(BTbtn);
    	
    	BTbtn.click();
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
    
    
 public void enterOldLoanAmount(String amount) {
    	
        waitUntilWebElementIsVisible(OldLoan);
        OldLoan.clear();
        OldLoan.sendKeys(amount);
    }
    
    
 public void enterOldTenure(String oldten) {
 	
     waitUntilWebElementIsVisible(OldTenure);
     OldTenure.clear();
     OldTenure.sendKeys(oldten);
 }
 
 
 public void enterOldRate(String oldrate) {
	 	
     waitUntilWebElementIsVisible(OldRate);
     OldRate.clear();
     OldRate.sendKeys(oldrate);
 }
 
 public void enterInstallments(String install) {
	 	
     waitUntilWebElementIsVisible(Installments);
     Installments.clear();
     Installments.sendKeys(install);
 }
 
 public void enterProcessing(String process) {
	 	
     waitUntilWebElementIsVisible(ProcessingFees);
     ProcessingFees.clear();
     ProcessingFees.sendKeys(process);
 }
 
 public void enterNewTenure(String newten) {
	 	
     waitUntilWebElementIsVisible(NewTenure);
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewTenure);
     NewTenure.clear();
     NewTenure.sendKeys(newten);
 }
 
 
 public void enterNewRate(String newrate) {
	 	
     waitUntilWebElementIsVisible(NewRate);
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewRate);
     NewRate.clear();
     NewRate.sendKeys(newrate);
 }
 
 public void clickCompare(String cmp) {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", Comparebtn);

	    try { Thread.sleep(500); } catch (InterruptedException e) {}

	    waitUntilWebElementIsVisible(Comparebtn);
	    waitUntilElementIsClickable(Comparebtn);

	    try {
	        Comparebtn.click();
	    } catch (org.openqa.selenium.ElementClickInterceptedException e) {
	        System.out.println("Click intercepted — using JS click fallback");
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Comparebtn);
	    }
	}

    

}
