package com.stepdefinition;

import com.pages.ResearchInsightsPage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResearchInsightsStep {
	ResearchInsightsPage advicePage;


@Given("the user is on the MB Advise page and nevigate to research and insights")
public void the_user_is_on_the_mb_advise_page() {
	BaseSteps.initializeBrowser();
	advicePage = new ResearchInsightsPage(BaseSteps.driver);
	advicePage.launchMagicBricks();
}


@When("the user clicks on the research and insights tool")
public void the_user_clicks_on_the_research_and_insights_tool() {
	advicePage.hoverAndClickResearchInsights();
}

@When("slightly scroll down")
public void slightly_scroll_down() throws InterruptedException {
	advicePage.scrollToDropdown();
}

@When("select city from  dropdown")
public void select_city_from_dropdown() throws InterruptedException {
	advicePage.selectRandomCityFromDropdown();
}

@When("select quarters  from dropdown")
public void select_quarters_from_dropdown() throws InterruptedException {
	advicePage.selectRandomQuartersFromDropdown();
   
}

@Then("select year  from dropdown")
public void select_year_from_dropdown() throws InterruptedException {
	advicePage.selectRandomYearFromDropdown();
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
