package com.stepdefinition;




	import com.pages.PrintResearchPage;
	import com.setup.BaseSteps;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.Then;

	import java.awt.AWTException;
import java.io.IOException;

	public class PrintResearchStepDef {

		PrintResearchPage advicePage;

	    @Given("the user is on the MB Advise page and nevigate to research")
	    public void the_user_is_on_the_mb_advise_page() {
	        BaseSteps.initializeBrowser();
	        advicePage = new PrintResearchPage(BaseSteps.driver);
	        advicePage.launchMagicBricks();
	    }

	    @When("the user navigates to Price Trends")
	    public void the_user_navigates_to_price_trends() {
	        advicePage.navigateToReserchInsights();
	    }

	    @Then("press Ctrl+P using Robot class to print")
	    public void press_ctrl_p_using_robot_class_to_print() throws AWTException, IOException {
	        advicePage.pressPrintWithRobot();
	        advicePage.takesScreen();
	    }
	}

	
	
	
