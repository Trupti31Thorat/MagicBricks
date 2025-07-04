package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

//
//    public void selectCity(String cityName) {
//        //handleInitialPopups();
//        String cityXpath = String.format(
//            "//a[text()='Pune']",
//            cityName);
//
//        
//        WebElement cityElement = wait.until(
//            ExpectedConditions.elementToBeClickable(By.xpath(cityXpath))
//        );
//        
//        cityElement.click();
//    }
//
//
//    public void selectBudget(String budget) {
//        click(budgetSelectTrigger);
//        WebElement option = wait.until(
//            ExpectedConditions.elementToBeClickable(
//                By.xpath(String.format(budgetOptionXpath, budget))
//            )
//        );
//        option.click();
//        System.out.println("✅ Budget: " + budget);
//    }
//
//    public void clickCheckProject() {
//        click(checkProjectBtn);
//    }
//
//    public void fillContactForm(String name, String mobile) {
//        type(nameInput, name);
//        type(mobileInput, mobile);
//        click(submitContactFormBtn);
//    }
//
//    public boolean isDesignerMatchingConfirmationDisplayed() {
//        return isDisplayed(designerMatchingConfirmationMsg);
//    }
//}

public class HomeInteriorPageFactory extends HomeInteriorBasePage {

    public HomeInteriorPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Home Interiors menu and link
    @FindBy(linkText = "Home Interiors")
    public WebElement homeInteriorsMenu;

    @FindBy(xpath = "//a[contains(text(),'Home Interior Design Services')]")
    private WebElement designServicesLink;

    // Budget dropdown trigger
    @FindBy(xpath = "//div[contains(@class,'form-input-box') and contains(.,'Select Budget')]")
    private WebElement budgetSelectTrigger;

    // Buttons and inputs
    @FindBy(xpath = "//button[contains(text(),'Check Project')]")
    private WebElement checkProjectBtn;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "mobile")
    private WebElement mobileInput;

    @FindBy(css = "button#submitBtn, button[type='submit']")
    private WebElement submitContactFormBtn;

    @FindBy(xpath = "//div[contains(text(),'designer matching confirmation') or contains(text(),'Your request has been sent')]")
    private WebElement designerMatchingConfirmationMsg;

    // Dynamic-option XPaths
    private final String cityOptionXpath = "//li[contains(@class,'mb-list__item')][normalize-space()='%1$s'] | //a[normalize-space()='%1$s'] | //span[normalize-space()='%1$s']";
   
    private final String budgetOptionXpath = "//*[contains(@class,'dropdown') or contains(@class,'option') or contains(@class,'list')]//*[normalize-space(text())='%1$s']";


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
            Thread.sleep(2000); // Wait for 2 seconds
            System.out.println(" Waited for popups to settle.");
        } catch (InterruptedException e) {
            System.out.println(" Interrupted while waiting: " + e.getMessage());
        }
    }

    public void selectCity(String cityName) {
        try {
            String cityLocator = String.format(cityOptionXpath, cityName);
            WebElement cityElement = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(cityLocator))
            );
            cityElement.click();
            System.out.println(" City selected directly: " + cityName);
        } catch (Exception e) {
            System.out.println(" Failed to select city: " + cityName + ". Error: " + e.getMessage());
        }
    }
    

//    public void clickBudget(String budget) {
//        try {
//            // Scroll to the dropdown trigger
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", budgetSelectTrigger);
//
//            // Use Actions to move and click the dropdown
//            Actions actions = new Actions(driver);
//            actions.moveToElement(budgetSelectTrigger).click().perform();
//            System.out.println("✅ Clicked budget dropdown using Actions.");
//
//            // Wait for dropdown options to be visible
//            String budgetLocator = String.format(budgetOptionXpath, budget);
//            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(budgetLocator)));
//
//            // Scroll to and click the option
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
//            actions.moveToElement(option).click().perform();
//            System.out.println("✅ Budget selected: " + budget);
//        } catch (Exception e) {
//            System.out.println("❌ Failed to select budget: " + budget + ". Error: " + e.getMessage());
//        }
//    }

    public void selectBudget(String budget) {
        try {
            // Define the dropdown trigger using the provided XPath
            WebElement budgetSelectTrigger = driver.findElement(By.xpath("//*[@id='intsrpPages']/div[1]/div[1]/div/div/div[1]"));

            // Click the dropdown trigger
            new Actions(driver).moveToElement(budgetSelectTrigger).click().perform();
            System.out.println("✅ Opened budget dropdown.");

            // Define the XPath for the dropdown option
            By optionLocator = By.xpath("//*[contains(@class,'dropdown') or contains(@class,'option') or contains(@class,'list')]//*[normalize-space(text())='" + budget + "']");

            // Wait for the option to be clickable and click it
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionLocator));
            new Actions(driver).moveToElement(option).click().perform();
            System.out.println("✅ Selected budget: " + budget);

        } catch (Exception e) {
            System.out.println("❌ Failed to select budget '" + budget + "'. Error: " + e.getMessage());
        }
    }



    public void clickCheckProject() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkProjectBtn);
            wait.until(ExpectedConditions.elementToBeClickable(checkProjectBtn)).click();
            System.out.println(" Clicked 'Check Project' button.");
        } catch (Exception e) {
            System.out.println(" Failed to click 'Check Project'. Error: " + e.getMessage());
        }
    }

    public void fillContactForm(String name, String mobile) {
        type(nameInput, name);
        type(mobileInput, mobile);
        click(submitContactFormBtn);
    }

    public boolean isDesignerMatchingConfirmationDisplayed() {
        return isDisplayed(designerMatchingConfirmationMsg);
    }

	

}


