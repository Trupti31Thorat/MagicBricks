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

public class HomeInteriorSteps {
    WebDriver driver = HomeInteriorBaseSteps.getDriver();
    HomeInteriorPageFactory page = new HomeInteriorPageFactory(driver);

    
//-------------------------------------------------------Scenario 2----------------------------------------------------------------------//
   
    @Given("user is on MagicBricks homepage")
    public void on_homepage() {
        page.openHomeInteriorsFromConfigUrl();
    }

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
    }

    
//-------------------------------------------------Scenario 3(Negative Scenario)----------------------------------------------------------------//
   
    
    @When("user fills contact details with invalid {int}-digit mobile number from Excel row {int}")
    public void user_fills_contact_details_with_invalid_digit_mobile_number_from_excel_row(Integer digitCount, Integer rowNum) {
    	Map<String, String> data = ExcelReader.getRowData("EstimatorForm", rowNum);
        page.fillContactDetails(data.get("Name"), data.get("Mobile"), data.get("Email"));
        
        String screenshotPath = new HomeInteriorBaseSteps().takeScreenshot("HomeInterior_EstimateSubmitted");
        System.out.println("📸 Screenshot captured at: " + screenshotPath);

       
    }


    
// ---------------------------------------------------Scenario 1----------------------------------------------------------------------------//
	
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
    
    @Then("owner fills contact details:")
    public void owner_fills_contact_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> contactList = dataTable.asMaps(String.class, String.class);
		String mobile = contactList.get(0).get("Mobile");
		
		   if (mobile == null || mobile.trim().isEmpty()) {
		    throw new IllegalArgumentException("❌ Mobile number is missing in DataTable");
		 }
		
		System.out.println("📱 Mobile from DataTable: " + mobile);
		    page.enterContactNumber(mobile);
}

    @Then("clicks on Start now button")
    public void click_start_now_btn() {
        page.clickStartNow();
    }
    
}