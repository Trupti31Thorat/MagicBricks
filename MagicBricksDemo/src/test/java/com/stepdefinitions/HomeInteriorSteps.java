//package com.stepdefinitions;
//
//import com.pages.HomeInteriorPageFactory;
//import com.setup.HomeInteriorBaseSteps;
//import io.cucumber.java.en.*;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class HomeInteriorSteps {
//    WebDriver driver = HomeInteriorBaseSteps.getDriver();
//    HomeInteriorPageFactory page = new HomeInteriorPageFactory(driver);
//
//    @Given("user is on MagicBricks homepage")
//    public void on_homepage() {
//        driver.get(HomeInteriorBaseSteps.getBaseUrl());
//    }
//
//    @When("user navigates to Home Interiors and hovers on Home Interior Design Services page")
//    public void hover_home_interiors() {
//        new Actions(driver).moveToElement(page.homeInteriorsMenu).perform();
//    }
//
//    @When("user clicks on Home Interior Design Services")
//    public void click_design_services() throws InterruptedException {
//        page.clickDesignServices();
//    }
//        
//    
//
//    @When("user selects city as {string}")
//    public void select_city(String city) {
//        page.selectCity(city);
//    }
//
//    @Then("on next page user selects budget as {string}")
//    public void select_budget(String budget) {
//        page.selectBudget(budget);
//    }
//
//    @When("user clicks on Check Project")
//    public void click_check_project() {
//        page.clickCheckProject();
//    }
//
//    @When("user fills contact form with name {string}, mobile {string}")
//    public void fill_contact(String name, String mobile) {
//        page.fillContactForm(name, mobile);
//    }
//
//    @Then("user should see designer matching confirmation")
//    public void verify_confirmation() {
//        assert page.isDesignerMatchingConfirmationDisplayed()
//            : "Expected confirmation message not displayed";
//    }
//}
package com.stepdefinitions;

import com.pages.HomeInteriorPageFactory;
import com.setup.HomeInteriorBaseSteps;
import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeInteriorSteps {
    WebDriver driver = HomeInteriorBaseSteps.getDriver();
    HomeInteriorPageFactory page = new HomeInteriorPageFactory(driver);

    @Given("user is on MagicBricks homepage")
    public void on_homepage() {
        driver.get(HomeInteriorBaseSteps.getBaseUrl());
    }

    @When("user navigates to Home Interiors and hovers on Home Interior Design Services page")
    public void hover_home_interiors() {
        new Actions(driver).moveToElement(page.homeInteriorsMenu).perform();
    }

    @When("user clicks on Home Interior Design Services")
    public void click_design_services() {
        page.clickDesignServices();
        page.switchToNewWindow();
        
    }

    @When("user selects city as {string}")
    public void select_city(String city) {
        page.selectCity(city);
    }

    @Then("on next page user selects budget as {string}")
    public void on_next_page_user_select_budget_as(String budget) {
        page.selectBudget(budget); // e.g., "5-10 Lakhs"
    }


    @When("user clicks on Check Project")
    public void click_check_project() {
        page.clickCheckProject();
    }

    @When("user fills contact form with name {string}, mobile {string}")
    public void fill_contact(String name, String mobile) {
        page.fillContactForm(name, mobile);
    }

    @Then("user should see designer matching confirmation")
    public void verify_confirmation() {
        assert page.isDesignerMatchingConfirmationDisplayed()
            : "Expected confirmation message not displayed";
    }
}
