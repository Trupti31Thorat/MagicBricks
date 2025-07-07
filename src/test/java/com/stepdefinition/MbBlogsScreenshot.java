package com.stepdefinition;

import java.io.IOException;

import com.pages.MBAdvicePage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MbBlogsScreenshot {
	MBAdvicePage advicePage;


	
	@Given("the user is on the MB Advise page nevigate to Latest Blogs")
	public void the_user_is_on_the_mb_advise_page() {
		BaseSteps.initializeBrowser();
		advicePage = new MBAdvicePage(BaseSteps.driver);
		advicePage.launchMagicBricks();
	}
	
	

@When("When the user clicks on the Latest Blogs")
public void when_the_user_clicks_on_the_latest_blogs() {
	advicePage.hoverAndClickLatestBlogs();
}

@Then("take screenshot")
public void take_screenshot() throws IOException {
	advicePage.takesScreen();
	
}

}
