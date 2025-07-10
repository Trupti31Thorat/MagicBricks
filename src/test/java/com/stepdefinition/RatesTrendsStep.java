package com.stepdefinition;

import org.junit.Assert;

import com.pages.MBAdvicePage;
import com.setup.BaseSteps;
import com.utils.ExcelReader;
import io.cucumber.java.en.*;


public class RatesTrendsStep {

	MBAdvicePage advicePage;

    String cityName;

    @Given("user is on Rates and Trends page")
    public void user_is_on_rates_and_trends_page() {
    	BaseSteps.initializeBrowser();
    	advicePage = new MBAdvicePage(BaseSteps.driver);
    	advicePage.launchMagicBricks();
    	advicePage.hoverAndClickRatesTrends();
    	
    }

    @When("user enters city name from Excel with {string}")
    public void user_enters_city_name_from_excel_with(String rowIndexStr) {
      
    	int rowIndex=Integer.parseInt(rowIndexStr);
	    String city=ExcelReader.getCityFromExcel("Trends", rowIndex, 0);
	    advicePage.selectCityUsingRobotpopup();
	    advicePage.clickSearchBox();
	    advicePage.enterCityName(city);
	    
		
    }
    
    @When("selects suggestion using Robot")
    public void selects_suggestion_using_robot() {
    	advicePage.selectCityUsingRobot();
    }

    @When("clicks on Show Trends button")
    public void clicks_on_show_trends_button() {
    	advicePage.clickShowTrends();
    }

    @Then("Trends page for that city should be displayed")
    public void trends_page_should_displayed() {
        Assert.assertTrue(advicePage.isTrendsPageLoaded());
    }
}

