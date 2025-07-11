package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




import com.pages.MultipleWindowHandlePage;
import com.pages.PrintResearchPage;

import com.pages.ResearchInsightsPage;
import com.pages.ViewReportPage;
import com.pages.WebStoriesPage;
import com.setup.BaseSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.*;
public class MbAdviceStepDefination {
	WebDriver driver;
	ResearchInsightsPage advicePage1;
	PrintResearchPage advicePage2;
	
	WebStoriesPage advicePage4;
	
	/*
	  Created by: Trupti Thorat
	  Reviewed by:Priti 
	  Motive: Automation testing of MagicBricks Application 
	 */
//-----------------------------------------------Research and insights --------------------------------------------	
	
	
@Given("the user is on the MB Advise page and nevigate to research and insights")
public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research_and_insights() {
	driver=BaseSteps.initializeBrowser();
	advicePage1 = new ResearchInsightsPage(driver);
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




	
//-------------------------------------------Print with Robot---------------------------------

    @Given("the user is on the MB Advise page and nevigate to research")
    public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research() {
    	driver=BaseSteps.initializeBrowser();
        advicePage2 = new PrintResearchPage(driver);
        advicePage2.launchMagicBricks();
    }

    @When("the user navigates to Price Trends")
    public void the_user_navigates_to_price_trends() {
        advicePage2.navigateToReserchInsights();
    }

    @Then("press Ctrl+P using Robot class to print")
    public void press_ctrl_p_using_robot_class_to_print() throws AWTException, IOException {
    	
    	advicePage2.pressPrintWithRobot();
       
        
        
    }



	
	//--------------------------------------Multiple Window HandlePage--------------------------------
	
	

	MultipleWindowHandlePage advicePage3;

	    @Given("the user is on the MB Advise page")
	    public void user_is_on_mb_advise_page() {
	    	driver=BaseSteps.initializeBrowser();
	        advicePage3 = new MultipleWindowHandlePage(driver);
	        advicePage3.launchMagicBricks();
	    }


@When("the user opens multiple links under MB Advice")
public void open_multiple_links_under_mb_advice() {
    advicePage3.openMultipleAdviceWindows();
}

@Then("switch to each window and print title")
public void switch_to_each_window_and_print_title() throws IOException {
    advicePage3.handleAllWindows();
   
}


	
	
	
	//----------------------------------------using robot key scrolling page--------------------------------------
	
	




    @Given("user is on Trending Web Stories page")
    public void the_user_is_on_the_mb_advise_page() {
    	driver=BaseSteps.initializeBrowser();
        advicePage4 = new WebStoriesPage(driver);
        advicePage4.launchMagicBricks();
        
        advicePage4.hoverAndClickWebDriver();
        
    }
    
    
    

@When("user presses PageDown key using Robot")
public void pressPageDownWithRobot() throws InterruptedException {
	advicePage4.scrollToDropdown();
	advicePage4.scrollWithRobotPageDown();
}


@Then("Web Stories section should scroll")
public void Web_Stories_section_should_scroll() throws AWTException, IOException {
	advicePage4.takesScreen();
	
}

	
	



	//-----------------------------------------------------valid data -------------------------


ViewReportPage advicePage5;

    @Given("user launches the MagicBricks website")
    public void user_launches_the_magic_bricks_website() {
    	driver=BaseSteps.initializeBrowser();
        advicePage5 = new ViewReportPage(driver);
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
    
 

    @Then("user clicks on Continue button")
    public void user_clicks_on_continue_button() throws IOException {
    	advicePage5.takesScreen();
    	
   
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
    
   
    
    
    
//-----------------------------------------------------------------------------------------------------------
    @AfterStep
	public void tearDown(Scenario scenario) // wil take screenshots for each and every scenario
	{
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Image");
		
	}
    
}

	
	

