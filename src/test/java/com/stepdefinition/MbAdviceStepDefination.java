package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.OutputType;
<<<<<<< HEAD
=======
=======
import java.util.Properties;

import org.junit.Assert;
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD



import com.pages.MultipleWindowHandlePage;
import com.pages.PrintResearchPage;

=======
<<<<<<< HEAD


import com.pages.LocalityPage;
import com.pages.MultipleWindowHandlePage;
import com.pages.PrintResearchPage;
import com.pages.Property_Valuation;
=======
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;
import com.pages.LocalityPage;
import com.pages.MultipleWindowHandlePage;
import com.pages.PrintResearchPage;
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import com.pages.ResearchInsightsPage;
import com.pages.ViewReportPage;
import com.pages.WebStoriesPage;
import com.setup.BaseSteps;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
<<<<<<< HEAD
=======
=======
import io.cucumber.java.After;
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.*;
public class MbAdviceStepDefination {
	WebDriver driver;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
	ResearchInsightsPage advicePage1;
	PrintResearchPage advicePage2;
	
	WebStoriesPage advicePage4;
<<<<<<< HEAD
	
	/*
	  Created by: Trupti Thorat
	  Reviewed by:Priti 
	  Motive: Automation testing of MagicBricks Application 
	 */
=======
>>>>>>> origin/MbAdvice
//-----------------------------------------------Research and insights --------------------------------------------	
	
	
@Given("the user is on the MB Advise page and nevigate to research and insights")
public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research_and_insights() {
	driver=BaseSteps.initializeBrowser();
	advicePage1 = new ResearchInsightsPage(driver);
<<<<<<< HEAD
=======
=======
	
//-----------------------------------------------Research and insights --------------------------------------------	
	
	ResearchInsightsPage advicePage1;


@Given("the user is on the MB Advise page and nevigate to research and insights")
public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research_and_insights() {
	BaseSteps.initializeBrowser();
	advicePage1 = new ResearchInsightsPage(BaseSteps.driver);
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
	advicePage1.launchMagicBricks();
}


@When("the user clicks on the research and insights tool")
public void the_user_clicks_on_the_research_and_insights_tool() {
	advicePage1.hoverAndClickResearchInsights();
}

@When("slightly scroll down")
public void slightly_scroll_down() throws InterruptedException {
	advicePage1.scrollToDropdown();
}

@When("select city from  dropdown")
public void select_city_from_dropdown() throws InterruptedException {
	advicePage1.selectRandomCityFromDropdown();
}

@When("select quarters  from dropdown")
public void select_quarters_from_dropdown() throws InterruptedException {
	advicePage1.selectRandomQuartersFromDropdown();
   
}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice



	
//-------------------------------------------Print with Robot---------------------------------

    @Given("the user is on the MB Advise page and nevigate to research")
    public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research() {
    	driver=BaseSteps.initializeBrowser();
        advicePage2 = new PrintResearchPage(driver);
<<<<<<< HEAD
=======
=======
@Then("select year  from dropdown")
public void select_year_from_dropdown() throws InterruptedException, IOException {
	advicePage1.selectRandomYearFromDropdown();
	advicePage1.takesScreen();
	
}

	
//-------------------------------------------Print with Robot---------------------------------
	
 
	
	PrintResearchPage advicePage2;

    @Given("the user is on the MB Advise page and nevigate to research")
    public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research() {
        BaseSteps.initializeBrowser();
        advicePage2 = new PrintResearchPage(BaseSteps.driver);
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
        advicePage2.launchMagicBricks();
    }

    @When("the user navigates to Price Trends")
    public void the_user_navigates_to_price_trends() {
        advicePage2.navigateToReserchInsights();
    }

    @Then("press Ctrl+P using Robot class to print")
    public void press_ctrl_p_using_robot_class_to_print() throws AWTException, IOException {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
    	
    	advicePage2.pressPrintWithRobot();
       
        
        
<<<<<<< HEAD
=======
=======
        advicePage2.pressPrintWithRobot();
        advicePage2.takesScreen();
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
    }



	
	//--------------------------------------Multiple Window HandlePage--------------------------------
	
	

	MultipleWindowHandlePage advicePage3;

	    @Given("the user is on the MB Advise page")
	    public void user_is_on_mb_advise_page() {
<<<<<<< HEAD
	    	driver=BaseSteps.initializeBrowser();
	        advicePage3 = new MultipleWindowHandlePage(driver);
=======
<<<<<<< HEAD
	    	driver=BaseSteps.initializeBrowser();
	        advicePage3 = new MultipleWindowHandlePage(driver);
=======
	        BaseSteps.initializeBrowser();
	        advicePage3 = new MultipleWindowHandlePage(BaseSteps.driver);
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
	        advicePage3.launchMagicBricks();
	    }


@When("the user opens multiple links under MB Advice")
public void open_multiple_links_under_mb_advice() {
    advicePage3.openMultipleAdviceWindows();
}

@Then("switch to each window and print title")
public void switch_to_each_window_and_print_title() throws IOException {
    advicePage3.handleAllWindows();
<<<<<<< HEAD
   
=======
<<<<<<< HEAD
   
=======
    advicePage3.takesScreen();
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
}


	
	
	
	//----------------------------------------using robot key scrolling page--------------------------------------
	
	


<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice


    @Given("user is on Trending Web Stories page")
    public void the_user_is_on_the_mb_advise_page() {
    	driver=BaseSteps.initializeBrowser();
        advicePage4 = new WebStoriesPage(driver);
        advicePage4.launchMagicBricks();
        
        advicePage4.hoverAndClickWebDriver();
        
<<<<<<< HEAD
=======
=======
	WebStoriesPage advicePage4;

    @Given("user is on Trending Web Stories page")
    public void the_user_is_on_the_mb_advise_page() {
        BaseSteps.initializeBrowser();
        advicePage4 = new WebStoriesPage(BaseSteps.driver);
        advicePage4.launchMagicBricks();
        
        advicePage4.hoverAndClickWebDriver();
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
    }
    
    
    

@When("user presses PageDown key using Robot")
<<<<<<< HEAD
public void pressPageDownWithRobot() throws InterruptedException {
	advicePage4.scrollToDropdown();
=======
<<<<<<< HEAD
public void pressPageDownWithRobot() throws InterruptedException {
	advicePage4.scrollToDropdown();
=======
public void pressPageDownWithRobot() {
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
	advicePage4.scrollWithRobotPageDown();
}


@Then("Web Stories section should scroll")
public void Web_Stories_section_should_scroll() throws AWTException, IOException {
	advicePage4.takesScreen();
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
=======
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
}

	
	



	//-----------------------------------------------------valid data -------------------------


ViewReportPage advicePage5;

    @Given("user launches the MagicBricks website")
    public void user_launches_the_magic_bricks_website() {
<<<<<<< HEAD
    	driver=BaseSteps.initializeBrowser();
        advicePage5 = new ViewReportPage(driver);
=======
<<<<<<< HEAD
    	driver=BaseSteps.initializeBrowser();
        advicePage5 = new ViewReportPage(driver);
=======
    	BaseSteps.initializeBrowser();
        advicePage5 = new ViewReportPage(BaseSteps.driver);
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
        advicePage5.launchMagicBricks();
        
      
    }

    @When("user hovers on Rent and clicks on actionable insights under mbadvice")
    public void user_hovers_on_Rent_and_clicks_on_actionable_insights_under_mbadvice() throws InterruptedException {
    	  advicePage5.navigateInsights();
    	  advicePage5.scrollToDropdown();
    }

    @When("user clicks on  View Report")
    public void user_clicks_on_View_Report() throws InterruptedException {
    	advicePage5.ClickOnViewReport();
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
//    @When("user fills the contact form with valid details from Excel")
//    public void user_fills_the_contact_form_with_valid_details_from_excel() throws InterruptedException {
//        String[] data = ExcelReader.getContactFormData();
//    
//        advicePage5.fillContactFormViaMouse(data[0], data[1], data[2], data[3], data[4]);
//    }
    
    @When("user fills the contact form with valid details from Excel using")
    public void user_fills_the_contact_form_with_valid_details_from_excel_using(DataTable dataTable) throws IOException, InterruptedException {

    	List<String> list = dataTable.asList(String.class);
		String data[] = ExcelReader.loginReader(list.get(0));
		advicePage5.fillContactFormViaMouse(data[0], data[1], data[2], data[3], data[4]);
    	
    }
    
 
<<<<<<< HEAD
=======
=======
    @When("user fills the contact form with valid details from Excel")
    public void user_fills_the_contact_form_with_valid_details_from_excel() throws InterruptedException {
        String[] data = ExcelReader.getContactFormData();
    
        advicePage5.fillContactFormViaMouse(data[0], data[1], data[2], data[3], data[4]);
    }
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice

    @Then("user clicks on Continue button")
    public void user_clicks_on_continue_button() throws IOException {
    	advicePage5.takesScreen();
<<<<<<< HEAD
    	
=======
<<<<<<< HEAD
    	
=======
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
   
    }
//------------------------------------------------Invalid--------------------

    @When("user fills the contact form with Invalid details from Excel")
    public void user_fills_the_contact_form_with_Invalid_details_from_excel() throws InterruptedException {
        String[] data = ExcelReader.getInvalidContactFormData();
    
        advicePage5.fillContactFormViaMouse(data[0], data[1], data[2], data[3], data[4]);
    }

    
    @Then("user clicks on Continue button and validate error")
    public void user_clicks_on_continue_button_and_validate_error() throws InterruptedException {
    	
    	Thread.sleep(2000);
   
    	System.out.println("validation error for phone number and email here");
    }
    
<<<<<<< HEAD
   
=======
<<<<<<< HEAD
    //------------------------------------------------------------------------New Property Valuation---------------
    Property_Valuation advicePage6;
    
    @Given("user is on property valuation page")
    public void user_is_on_property_valuation_page() throws InterruptedException {
        driver = BaseSteps.initializeBrowser();
        advicePage6 = new Property_Valuation(driver);
        advicePage6.launchMagicBricks();
        advicePage6.navigateProperty();
        advicePage6.moveAndClick1();
        
      
    }

    @Then("user fills the contact form with valid details from Excel data")
    public void user_fills_the_contact_form_with_valid_details_from_excel_data()  {
      
    	
    	
    }

    @Then("click on continue of Property")
    public void click_on_continue_of_Property() {
       
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
>>>>>>> origin/MbAdvice
    
    
    
//-----------------------------------------------------------------------------------------------------------
    @AfterStep
	public void tearDown(Scenario scenario) // wil take screenshots for each and every scenario
	{
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Image");
		
	}
    
<<<<<<< HEAD
=======
=======
    
    
//    
//    @After
//	public void tearDown(Scenario scenario) // wil take screenshots for each and every scenario
//	{
//		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png", "Image");
//		
//	}
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
}

	
	

