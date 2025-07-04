package com.stepdefinition;
 
import com.pages.MBAdvicePage; import com.setup.BaseSteps; import io.cucumber.java.en.*;
 
public class MBAdviceSteps {
 
MBAdvicePage advicePage;
 
@Given("user is on the MagicBricks homepage")
public void user_is_on_the_magic_bricks_homepage() {
    BaseSteps.initializeBrowser();
    advicePage = new MBAdvicePage(BaseSteps.driver);
    advicePage.launchMagicBricks();
}
 
@When("user clicks on the Find Pincode link in the MB Advice section")
public void user_clicks_on_the_find_pincode_link_in_the_mb_advice_section() {
    advicePage.hoverAndClickFindPincode();
}
 
@When("user selects a state from the dropdown")
public void user_selects_a_state_from_the_dropdown() throws InterruptedException {
    advicePage.scrollToDropdown();
  //  advicePage.selectRandomDropdown(advicePage.stateDropdown);
    advicePage.selectDropdown();
}
 
@When("user selects a city from the dropdown")
public void user_selects_a_city_from_the_dropdown() {
  //  advicePage.selectRandomDropdown(advicePage.cityDropdown);
	
}
 
@When("user selects a locality from the dropdown")
public void user_selects_a_locality_from_the_dropdown() {
   // advicePage.selectRandomDropdown(advicePage.localityDropdown);
	
}
 
@Then("user clicks the Search button")
public void user_clicks_the_search_button() {
    advicePage.clickSearchButton();
    BaseSteps.closeBrowser();
}
 
}