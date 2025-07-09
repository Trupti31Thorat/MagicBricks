package com.stepDefinition;

import org.testng.Assert;
import com.pages.ReadyToMovePage;
import com.setup.BaseSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadyToMoveFilterStep extends BaseSteps {

    ReadyToMovePage movePage = new ReadyToMovePage(driver);

    @When("the user click on {string}")
    public void the_user_click_on(String option) {
        movePage.clickReadyToMove();
    }

    @When("the user selects a Sort By option")
    public void the_user_selects_a_sort_by_option() throws InterruptedException {
        movePage.selectSortByOption();
    }

    @Then("the user clicks on the property listing using Robot")
    public void the_user_clicks_on_the_property_listing_using_robot() throws Exception {
        movePage.clickFirstPropertyWithRobot();
    }

    @Then("the selected property should be displayed on a new page")
    public void the_selected_property_should_be_displayed_on_a_new_page() {
        Assert.assertTrue(movePage.isNewPropertyPageOpened(), "Property details page did not open.");
    }
}