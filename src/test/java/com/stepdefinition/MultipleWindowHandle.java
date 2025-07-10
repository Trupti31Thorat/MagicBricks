package com.stepdefinition;

import java.io.IOException;

import com.pages.MultipleWindowHandlePage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleWindowHandle {


	MultipleWindowHandlePage advicePage;

	    @Given("the user is on the MB Advise page")
	    public void user_is_on_mb_advise_page() {
	        BaseSteps.initializeBrowser();
	        advicePage = new MultipleWindowHandlePage(BaseSteps.driver);
	        advicePage.launchMagicBricks();
	    }


@When("the user opens multiple links under MB Advice")
public void open_multiple_links_under_mb_advice() {
    advicePage.openMultipleAdviceWindows();
}

@Then("switch to each window and print title")
public void switch_to_each_window_and_print_title() throws IOException {
    advicePage.handleAllWindows();
    advicePage.takesScreen();
}


}
