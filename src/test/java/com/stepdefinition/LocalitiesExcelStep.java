package com.stepdefinition;

import com.pages.LocalityPage;
import com.pages.WebStoriesPage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocalitiesExcelStep {

	
	LocalityPage advicePage;
	

@Given("the user is on the MB Advise page and nevigate Localities page")
public void the_user_is_on_the_mb_advise_page_and_nevigate_localities_page() throws InterruptedException {
	 BaseSteps.initializeBrowser();
     advicePage = new LocalityPage(BaseSteps.driver);
     advicePage.launchMagicBricks();
     advicePage.navigateToNewProject();
     
    // advicePage.scrollToDropdown();
}

@When("the user clicks on see all projects")
public void the_user_clicks_on_see_all_projects() {
	//advicePage.clickSeeAllPro();
}

@When("the user click on contact dealer")
public void the_user_click_on_contact_dealer() throws InterruptedException {
//	advicePage.scrollToMostPopularFilter();
//	advicePage.selectFreeBreakfastFilter();
	
  
}

@When("fill the form with name email and mobileno")
public void fill_the_form_with_name_email_and_mobileno() throws InterruptedException {
	//advicePage.ClickContactUsingRobot();
}

@Then("click on continueo")
public void click_on_continueo() {
  
}



	
}
