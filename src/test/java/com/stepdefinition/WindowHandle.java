
package com.stepdefinition;

import com.pages.MBAdvicePage;
import com.setup.BaseSteps;
import io.cucumber.java.en.*;

public class WindowHandle {

    MBAdvicePage advicePage;

    @Given("the user is on the MB Advise page and nevigate to Find Pincode page")
    public void user_is_on_mb_advise_page() {
        BaseSteps.initializeBrowser();
        advicePage = new MBAdvicePage(BaseSteps.driver);
        advicePage.launchMagicBricks();
    }
    
   

    @When("the user clicks on Find Pincode under MB Advice")
    public void user_clicks_on_find_pincode() {
        advicePage.hoverAndClickFindPincodeForWindow();
    }

    @Then("switch to new window and validate the title")
    public void switch_to_new_window_and_validate_title() {
        advicePage.switchToNewWindowAndValidate();
    }
}
