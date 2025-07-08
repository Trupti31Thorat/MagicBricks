package com.stepdefinitions;

import com.pages.HomeInteriorPageFactory;
import com.parameters.ExcelReader;
import com.setup.HomeInteriorBaseSteps;
import io.cucumber.java.en.*;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import com.parameters.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeInteriorSteps  {
    WebDriver driver = HomeInteriorBaseSteps.getDriver();
    HomeInteriorPageFactory page = new HomeInteriorPageFactory(driver);
    
    
//-----------------------------------------------------------Background-----------------------------------------------------------------//
    @Given("user is on MagicBricks homepage")
    public void on_homepage() {
        page.openHomeInteriorsFromConfigUrl();
    }



// ---------------------------------------------------Scenario 1 @HomeInteriors----------------------------------------------------------------------------//
    /*created By:
	 * Reviewed By:
	 * Motive:
	 */
    
 	@Then("clicks on post Property button")
 	public void clicks_on_post_property_button() {
 		page.clickPostProperty();
 	}

     @And("on next page one popup appears which is closed by clicking")
     public void close_popup_if_visible() {
         page.closePopupIfPresent();
     }

     @Then("user clicks on owner")
     public void user_clicks_owner_option() {
         page. selectRadioByLabel("Owner");
     }

     @Then("clicks on Sell")
     public void clicks_on_sell() {
        page. selectRadioByLabel("sell");
     }
     
     @Then("owner fills contact details with {string}")
     public void owner_fills_contact_details_with_mobile(String mobile) {
         if (mobile == null || mobile.trim().isEmpty()) {
             throw new IllegalArgumentException("Mobile number is missing in Scenario Outline");
         }

         System.out.println("Mobile from Scenario Outline: " + mobile);
         page.enterContactNumber(mobile);
     }


     @Then("clicks on Start now button")
     public void click_start_now_btn() {
         page.clickStartNow();
         String screenshotPath = new HomeInteriorBaseSteps().takeScreenshot("Post_Property_Scenario1");
         System.out.println("Screenshot captured at: " + screenshotPath);
     }
     
//---------------------------------------------------Scenario 2 @EngineeredWoods-------------------------------------------------------//
     /*created By:
 	 * Reviewed By:
 	 * Motive:
 	 */
     
     @When("user scrolls down to \"Your Home Interiors Price Guide\" section")
     public void user_scrolls_down_to_price_guide_section() throws InterruptedException {
     	page.scrollToPriceGuideSection();  // using existing page reference
     }

     @When("user clicks on \"Engineered Woods\"")
     public void user_clicks_on_engineered_woods() throws InterruptedException {
     	Thread.sleep(1000);
         page.clickEngineeredWoods();  // no need to initialize a new page
     }

//     @Then("Engineered Woods page should open")
//     public void engineered_woods_page_should_open() throws InterruptedException {
//    for (String handle : driver.getWindowHandles()) {
//             driver.switchTo().window(handle);
//         }
     @Then("Engineered Woods page should open")
     public void engineered_woods_page_should_open() throws InterruptedException {
         for (String handle : driver.getWindowHandles()) {
             driver.switchTo().window(handle);
         }

         String currentUrl = driver.getCurrentUrl();
         Thread.sleep(1000);
         Assert.assertTrue("❌ Engineered Woods page did not open!", currentUrl.contains("https://www.magicbricks.com/blog/engineered-wood/132343.html"));
         System.out.println("✅ Engineered Woods page opened successfully.");
         String screenshotPath = new HomeInteriorBaseSteps().takeScreenshot("Engineered_Price_Guide_Scenario2");
         System.out.println("Screenshot captured at: " + screenshotPath);
     }
     
  

//-------------------------------------------------------Scenario 3 @Estimation----------------------------------------------------------------------//
     /*created By:
 	 * Reviewed By:
 	 * Motive:
 	 */
     
    @When("user navigates to Home Interiors and hovers on Home Interior Design Services page")
    public void hover_home_interiors() {
        new Actions(driver).moveToElement(page.homeInteriorsMenu).perform();
    }

    @When("user clicks on Home Interior Design Services")
        public void click_design_services() {
            page.clickDesignServices();
            page.switchToNewWindow();
            page.waitForPopupsToSettle();
            
        }

    @When("user scrolls down and clicks on the Kitchen & Wardrobe calculate section")
    public void click_estimator_section() {
        page.clickKitchenWardrobeEstimator();
    }

    @When("user fills full estimator form from Excel row {int}")
    public void fill_full_form_excel(int rowNum) throws IOException {
        Map<String, String> data = ExcelReader.getRowData("EstimatorForm", rowNum);

        
        // Kitchen
        page.selectKitchen(data.get("KitchenLayout"), data.get("KitchenSize"));

        // Wardrobe — validate & convert to int
        String countRaw = data.get("WardrobeCount");
        if (countRaw == null || countRaw.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ 'WardrobeCount' column is missing or empty in Excel row " + rowNum);
        }

        int count = Integer.parseInt(countRaw.trim());
        page.selectWardrobe(count, data.get("WardrobeSize"));
    }


    @When("user fills contact details from Excel row {int}")
    public void fill_contact_details_from_excel(int rowNum) throws IOException {
        Map<String, String> data = ExcelReader.getRowData("EstimatorForm", rowNum);
        page.fillContactDetails(data.get("Name"), data.get("Mobile"), data.get("Email"));
    }
    
    @Then("user should see the estimated quote")
    public void verify_quote() {
    	  String screenshotPath = new HomeInteriorBaseSteps().takeScreenshot("HomeInterior_EstimateSubmitted_Scenario3");
          System.out.println("Screenshot captured at: " + screenshotPath);
    
    }  
    
 
//-------------------------------------------------Scenario 4 @NegativeTest Scenario----------------------------------------------------------------//
    /*created By:
  	 * Reviewed By:
  	 * Motive:
  	 */
    
    @When("user fills contact details with invalid {int}-digit mobile number from Excel row {int}")
    public void user_fills_contact_details_with_invalid_digit_mobile_number_from_excel_row(Integer digitCount, Integer rowNum) {
    	Map<String, String> data = ExcelReader.getRowData("EstimatorForm", rowNum);
        page.fillContactDetails(data.get("Name"), data.get("Mobile"), data.get("Email"));
        
        String screenshotPath = new HomeInteriorBaseSteps().takeScreenshot("HomeInterior_EstimationError_Scenario4");
        System.out.println("Screenshot captured at: " + screenshotPath);

       
    }
    
 //--------------------------------------------------------Scenario 6 @Language-------------------------------------------------------------------//
    /*created By:
  	 * Reviewed By:
  	 * Motive:
  	 */

    	@Then("scrolls down and clicks on View All")
        public void scrolls_down_and_clicks_on_view_all() {
            page.clickViewAll();
        }

        @And("on next page clicks on the language dropdown")
        public void on_next_page_clicks_on_language_dropdown() {
            page.openLanguageDropdown();
        }

        @And("selects the language {string}")
        public void selects_the_language(String language) {
            page.selectLanguage(language);
        }

    

    
}