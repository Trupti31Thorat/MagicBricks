package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.pages.WebStoriesPage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MbVideoRobot {

	
	

	WebStoriesPage advicePage;

    @Given("user is on Trending Web Stories page")
    public void the_user_is_on_the_mb_advise_page() {
        BaseSteps.initializeBrowser();
        advicePage = new WebStoriesPage(BaseSteps.driver);
        advicePage.launchMagicBricks();
        
        advicePage.hoverAndClickWebDriver();
    }
    
    
    

@When("user presses PageDown key using Robot")
public void pressPageDownWithRobot() {
	advicePage.scrollWithRobotPageDown();
}


@Then("Web Stories section should scroll")
public void press_ctrl_p_using_robot_class_to_print() throws AWTException, IOException {
	advicePage.takesScreen();
}


}
