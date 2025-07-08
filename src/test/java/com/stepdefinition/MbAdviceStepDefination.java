package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;
import com.pages.LocalityPage;
import com.pages.MultipleWindowHandlePage;
import com.pages.PrintResearchPage;
import com.pages.ResearchInsightsPage;
import com.pages.ViewReportPage;
import com.pages.WebStoriesPage;
import com.setup.BaseSteps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.*;
public class MbAdviceStepDefination {
	WebDriver driver;
	
//-----------------------------------------------Research and insights --------------------------------------------	
	
	ResearchInsightsPage advicePage1;


@Given("the user is on the MB Advise page and nevigate to research and insights")
public void the_user_is_on_the_MB_Advise_page_and_nevigate_to_research_and_insights() {
	BaseSteps.initializeBrowser();
	advicePage1 = new ResearchInsightsPage(BaseSteps.driver);
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
        advicePage2.launchMagicBricks();
    }

    @When("the user navigates to Price Trends")
    public void the_user_navigates_to_price_trends() {
        advicePage2.navigateToReserchInsights();
    }

    @Then("press Ctrl+P using Robot class to print")
    public void press_ctrl_p_using_robot_class_to_print() throws AWTException, IOException {
        advicePage2.pressPrintWithRobot();
        advicePage2.takesScreen();
    }



	
	//--------------------------------------Multiple Window HandlePage--------------------------------
	
	

	MultipleWindowHandlePage advicePage3;

	    @Given("the user is on the MB Advise page")
	    public void user_is_on_mb_advise_page() {
	        BaseSteps.initializeBrowser();
	        advicePage3 = new MultipleWindowHandlePage(BaseSteps.driver);
	        advicePage3.launchMagicBricks();
	    }


@When("the user opens multiple links under MB Advice")
public void open_multiple_links_under_mb_advice() {
    advicePage3.openMultipleAdviceWindows();
}

@Then("switch to each window and print title")
public void switch_to_each_window_and_print_title() throws IOException {
    advicePage3.handleAllWindows();
    advicePage3.takesScreen();
}


	
	
	
	//----------------------------------------using robot key scrolling page--------------------------------------
	
	


	WebStoriesPage advicePage4;

    @Given("user is on Trending Web Stories page")
    public void the_user_is_on_the_mb_advise_page() {
        BaseSteps.initializeBrowser();
        advicePage4 = new WebStoriesPage(BaseSteps.driver);
        advicePage4.launchMagicBricks();
        
        advicePage4.hoverAndClickWebDriver();
    }
    
    
    

@When("user presses PageDown key using Robot")
public void pressPageDownWithRobot() {
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
    	BaseSteps.initializeBrowser();
        advicePage5 = new ViewReportPage(BaseSteps.driver);
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

    @When("user fills the contact form with valid details from Excel")
    public void user_fills_the_contact_form_with_valid_details_from_excel() throws InterruptedException {
        String[] data = ExcelReader.getContactFormData();
    
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
    
    
    
//    
//    @After
//	public void tearDown(Scenario scenario) // wil take screenshots for each and every scenario
//	{
//		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png", "Image");
//		
//	}
}

	
	

