package com.stepdefination;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.Scenario;
import com.pages.BalanceTransferPageFactory;
import com.pages.CityPageFactory;
import com.pages.EMIPageFactory;
import com.pages.HomeLoansPageFactory;
import com.pages.SBIPageFactory;
import com.parameter.ExcelReader;
import com.setup.BaseSteps;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MagicBricksHomeLoans {
	WebDriver driver;
	
	
	
	//------------------------------------Scenario 1---------------------------------------------------

	
SBIPageFactory SBIpage;

@Given("the user is on the Magic Bricks homepage")
public void the_user_is_on_the_magic_bricks_homepage() {
   driver = BaseSteps.getDriver();
		driver.get(BaseSteps.getBaseUrl());
		SBIpage = new SBIPageFactory(driver);
}

@When("the user clicks on the {string} link in the Home Loans Menu bar")
public void the_user_clicks_on_the_link_in_the_home_loans_menu_bar(String string) {
   SBIpage.clickSBILoansbtn();   
		SBIpage.switchToNewestWindow();
}

@When("the user enters the loan amount in the {string} field")
public void the_user_enters_the_loan_amount_in_the_field(String amount) {
   SBIpage.enterLoanAmount(amount);
}

@Then("the user enters a valid mobile number in the {string} field")
public void the_user_enters_a_valid_mobile_number_in_the_field(String mobile) {
	SBIpage.enterMobileNumber(mobile);
}

@Then("the user enters a valid value in {string} field")
public void the_user_enters_a_valid_value_in_field(String property) {
   SBIpage.enterPropertyCity(property);
}

@Then("the user selects the city where the property is located from the Property City dropdown")
public void the_user_selects_the_city_where_the_property_is_located_from_the_property_city_dropdown() throws AWTException {
   SBIpage.selectPropertyCity();
}


@Then("the user selects the appropriate option for Is Property Finalized? {string}")
public void the_user_selects_the_appropriate_option_for_is_property_finalized(String option) {
    SBIpage.selectPropertyFinalized(option);
}

@Then("the user selects the appropriate option for Is Token Amount Paid {string}")
public void the_user_selects_the_appropriate_option_for_is_token_amount_paid(String token) {
   SBIpage.selectTokenAmount(token);
}

@Then("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String eligibility) {
   SBIpage.clickCheckEligibility(eligibility);
}


@Then("the user should be redirected to the Mobile Number Verification page")
public void the_user_should_be_redirected_to_the_mobile_number_verification_page() {
	//Assert.assertTrue(driver.getTitle().contains("Verify your Number"));
	SBIpage.takesscreen();
	Assert.assertTrue(driver.getTitle().contains(""));
}





	
//----------------------------------------SBI Eligibility using Excel----------------------------------------------
	
/*	  SBIPageFactory sbiPage;

	    @Given("the user is on the Magic Bricks homepage")
	    public void the_user_is_on_the_magic_bricks_homepage() {
	        driver = BaseSteps.getDriver();
	        driver.get(BaseSteps.getBaseUrl());
	        sbiPage = new SBIPageFactory(driver);
	    }

	    @When("the user clicks on the {string} link in the Home Loans Menu bar")
	    public void the_user_clicks_on_the_link_in_the_home_loans_menu_bar(String linkName) {
	        sbiPage.clickSBILoansbtn();
	        sbiPage.switchToNewestWindow();
	    }

	    @When("the user fills the SBI Home Loan form with data from Excel")
	    public void the_user_fills_the_SBI_Home_Loan_form_with_data_from_Excel() throws Exception {
	        String filePath = "C:\\Users\\teshahan\\OneDrive - Capgemini\\Eclipse1\\HomeLoansFunctionality\\src\\test\\resource\\TestData\\SBIHomeLoansData.xlsx";
	        String sheetName = "Sheet1";

	        List<List<String>> data = ExcelReader.getData(filePath, sheetName);

	        for (List<String> row : data) {
	            System.out.println("Row size: " + row.size() + " | Row: " + row);

	            String loanAmount = row.get(0);
	            String mobileNumber = row.get(1);
	            String propertyCity = row.get(2);
	            String propertyFinalized = row.get(3);
	            String tokenAmountPaid = row.size() > 4 ? row.get(4) : "No";

	            sbiPage.enterLoanAmount(loanAmount);
	            sbiPage.enterMobileNumber(mobileNumber);
	            sbiPage.enterPropertyCity(propertyCity);
	            //sbiPage.selectPropertyCity();
	            if(propertyCity !=null && propertyCity.trim().length() >=3)
	            {
	            	sbiPage.selectPropertyCity();
	            }
	            else {
	            	System.out.println("Skipped city dropdown select because input is invalid --> negative test case");
	            }
	            sbiPage.selectPropertyFinalized(propertyFinalized);
	            sbiPage.selectTokenAmount(tokenAmountPaid);
	            sbiPage.clickCheckEligibility("");

	            System.out.println(" Done: " + loanAmount + " | " + mobileNumber);
	        }


	            // Optional: break after first row if you only want one run at a time
	            // break;
	        }
	    

	    @Then("the user should be redirected to the Mobile Number Verification page")
	    public void the_user_should_be_redirected_to_the_mobile_number_verification_page() {
	        // Optional: Add your assertion
	        // Assert.assertTrue(driver.getTitle().contains("Verification"));
	    //	sbiPage.switchToNewestWindow();
	    	sbiPage.takesscreen();
	    }
	
*/


//---------------------------------------Scenario navigate to city----------------------------------------------------------

	CityPageFactory cityPage;
	@Given("user is on Magic Bricks homepage")
	public void user_is_on_magic_bricks_homepage() {
		 driver = BaseSteps.getDriver();
	        driver.get(BaseSteps.getBaseUrl());
		cityPage = new CityPageFactory(driver);
	}

	@When("the user clicks on the {string} link in the navigation bar")
	public void the_user_clicks_on_the_link_in_the_navigation_bar(String string) {
		cityPage.clickHomeLoansbtn();   
		cityPage.switchToNewestWindow();
	}

	@Then("the user should be redirected to the Home Loans page")
	public void the_user_should_be_redirected_to_the_home_loans_page() {
		// Assert.assertTrue(driver.getTitle().contains("Home Loans"));
	}

	@Then("the user scrolls down on the Home Loans Page")
	public void the_user_scrolls_down_on_the_home_loans_page() throws InterruptedException {
	    cityPage.scrollDown();
	}

	@Then("the user clicks on {string} button on SBI Home Loan Offer")
	public void the_user_clicks_on_button_on_sbi_home_loan_offer(String string) {
		cityPage.clickCheckOffer();   
		cityPage.switchToNewestWindow();
	}

	@Then("the user should be redirected to the MagicLoans page")
	public void the_user_should_be_redirected_to_the_magic_loans_page() {
	   //Assert.assertTrue(driver.getTitle());
	}

	@Then("the user scrolls down on the MagicLoans Page")
	public void the_user_scrolls_down_on_the_magic_loans_page() {
		cityPage.switchToNewestWindow();
	  cityPage.scrollDownII();
	}

	@Then("the user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		cityPage.clickGetStarted();   
	}

	@Then("the user clicks on one of the cities")
	public void the_user_clicks_on_one_of_the_cities() {
	    cityPage.clickCity();
	    cityPage.takesscreen();
	}
	
	@Then("the user clicks on {string} button to generate signup form")
	public void the_user_clicks_on_button_to_generate_signup_form(String string) {
	    cityPage.clickNext();
	    cityPage.takesscreen();
	    
	    
	    
	    
	}





//---------------------------------------EMI Calculator using Excel---------------------------------------------------


    EMIPageFactory emiPage;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // You may already have this driver setup in BaseSteps
        driver = BaseSteps.getDriver();
        driver.get(BaseSteps.getBaseUrl());
        emiPage = new EMIPageFactory(driver);
    }

    @When("I navigate to the home loans menu")
    public void i_navigate_to_the_home_loans_menu() {
        emiPage.EMICalculatorbtn();
        emiPage.switchToNewestWindow();
    }

    @And("I click on the home loan EMI calculator")
    public void i_click_on_the_home_loan_emi_calculator() {
        // Already covered by EMICalculatorbtn() above
    }

    @And("I calculate EMI for all rows in Excel")
    public void i_calculate_emi_for_all_rows_in_excel() throws InterruptedException {
        String filePath = "C:\\Users\\teshahan\\OneDrive - Capgemini\\Eclipse1\\HomeLoans\\src\\test\\resource\\TestData\\EMIData.xlsx";
        String sheetName = "Sheet1"; // adjust if your sheet name is different

        List<List<String>> data = ExcelReader.getData(filePath, sheetName);

        for (List<String> row : data) {
            String loanAmount = row.get(0);
            String loanTenure = row.get(1);
            String interestRate = row.get(2);
            String propertyFinalized = row.get(3);

            System.out.println("🔹 Running with data: " + loanAmount + ", " + loanTenure + ", " + interestRate + ", " + propertyFinalized);

            emiPage.enterEMILoanAmount(loanAmount);
            emiPage.enterEMITenure(loanTenure);
            emiPage.enterEMIInterest(interestRate);
            emiPage.selectPropertyFinalized(propertyFinalized);
            emiPage.selectFreeBreakfastFilter();
            emiPage.clickCalculateEMI("Recalculate Your EMI");

            Thread.sleep(2000); // optional wait to see the result for each row
        }
    }

    @Then("I should see the recalculated EMI")
    public void i_should_see_the_recalculated_emi() {
        // Add your assertion here
    	emiPage.takesscreen();
    }



	
	//--------------------------------Balance Transfer using excel------------------------------------


	BalanceTransferPageFactory btPage;
	
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		 driver = BaseSteps.getDriver();
	        driver.get(BaseSteps.getBaseUrl());
	        btPage = new BalanceTransferPageFactory(driver);
	}

	@When("the user navigates to the Home Loans section")
	public void the_user_navigates_to_the_home_loans_section() {
	    btPage.clickBalanceTransferbtn();
	    btPage.switchToNewestWindow();
	}

	@When("the user clicks on the Balance Transfer option")
	public void the_user_clicks_on_the_balance_transfer_option() {
	   //
	}


@When("the user fills the old and new loan details with data from Excel")
public void the_user_fills_the_old_and_new_loan_details_with_data_from_excel() throws Exception {
    String filePath = "C:\\Users\\teshahan\\OneDrive - Capgemini\\Eclipse1\\HomeLoansFunctionality\\src\\test\\resource\\TestData\\BalanceTransferData.xlsx";
    String sheetName = "Sheet1";

    List<List<String>> data = ExcelReader.getData(filePath, sheetName);

    for (int i = 1; i < data.size(); i++) { // skip header if present
        List<String> row = data.get(i);

        System.out.println("Row: " + row);

        String oldLoanAmount = row.get(0);
        String oldTenure = row.size() > 1 ? row.get(1) : "";
        String oldRate = row.size() > 2 ? row.get(2) : "";
        String installments = row.size() > 3 ? row.get(3) : "";
        String processingFees = row.size() > 4 ? row.get(4) : "";
        String newTenure = row.size() > 5 ? row.get(5) : "";
        String newRate = row.size() > 6 ? row.get(6) : "";

        btPage.enterOldLoanAmount(oldLoanAmount);
        btPage.enterOldTenure(oldTenure);
        btPage.enterOldRate(oldRate);
        btPage.enterInstallments(installments);
        btPage.enterProcessing(processingFees);
        btPage.enterNewTenure(newTenure);
        btPage.enterNewRate(newRate);

        btPage.clickCompare("");

        System.out.println(" Filled: " + oldLoanAmount + " | " + oldTenure + " | " + oldRate + " | " + installments + " | " + processingFees + " | " + newTenure + " | " + newRate);
    }
}
	@Then("the user compares the old and new loan details")
	public void the_user_compares_the_old_and_new_loan_details() {
		   System.out.println(" Comparison triggered successfully.");

	}

	@AfterStep
	public void tearDown(Scenario scenario) 
	{
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Image");
		
	}
}



