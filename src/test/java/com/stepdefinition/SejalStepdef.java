package com.stepdefinition;




public class SejalStepdef {

	WebDriver driver;

	OwnerPropertyPage page;

//1st Scenario 

/*	
 
	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}

 
	@When("user hovers on Rent and clicks on Owner Properties under Popular Choices")

	public void user_hovers_on_rent_and_clicks_on_owner_properties_under_popular_choices() {

		page.clickOwnerProperties();

		page.switchToNewestWindow();

	}
 
	@When("user clicks on first property photo")

	public void user_clicks_on_first_property_photo() {
 
		page.clickPropertyPhoto();

		page.switchToNewestWindow();

	}
 
	@Then("user scrolls down the photo view page")

	public void user_scrolls_down_the_photo_view_page() throws InterruptedException {

		page.scrollDown();
 
	}

*/


//2nd  scenario

/*

	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}

@When("user hovers on Rent and clicks on Owner Properties under Popular Choices")

	public void user_hovers_on_rent_and_clicks_on_owner_properties_under_popular_choices() {

		page.clickOwnerProperties();

		page.switchToNewestWindow();

	}


	@When("user clicks on Contact Owner button")

	public void user_clicks_on_contact_owner_button() {

	    page.clickContactOwnerButton();

	}
 
@When("user fills the contact form with valid data from Excel")

	public void user_fills_the_contact_form_with_valid_data_from_excel() {

	    String[] data = ExcelReader.getContactFormData();

	    page.fillContactForm(data[0], data[1], data[2]);

	}
 
	@When("user clicks on Continue button")

	public void user_clicks_on_continue_button() {

	    page.clickContinue();

	}
 
	@Then("contact form should proceed next")

	public void contact_form_should_proceed_next() {

	    Assert.assertTrue(page.isVerificationDisplayed());

	}

*/
 
	

//3rd Scenario

/*

	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}
 
	@When("user hovers on Rent and clicks on Owner Properties under Popular Choices")

	public void user_hovers_on_rent_and_clicks_on_owner_properties_under_popular_choices() {

		page.clickOwnerProperties();

		page.switchToNewestWindow();

	}


	@When("user clicks on Contact Owner button")

	public void user_clicks_on_contact_owner_button() {

	    page.clickContactOwnerButton();

	}

	@When("user fills the contact form with invalid WhatsApp number from Excel")

	public void user_fills_the_contact_form_with_invalid_data_from_excel() {

	    String[] data = ExcelReader.getInvalidContactFormData(); // Add a new method for invalid data

	    page.fillContactForm(data[0], data[1], data[2]);

	}


	@When("user clicks on Continue button")

	public void user_clicks_on_continue_button() {

	    page.clickContinue();

	}
 
	@Then("phone number validation error message should appear")

	public void phone_number_validation_error_should_appear() {

	 //   WebElement error = page.getPhoneNumberErrorElement(); // Add this method in page class

	   // Assert.assertTrue(error.isDisplayed(), "Phone validation error not displayed");

	}

*/

/*	

//4th Scenario

	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}
 
@When("user hovers on Rent and clicks on Owner Properties under Popular Choices")

	public void user_hovers_on_rent_and_clicks_on_owner_properties_under_popular_choices() {

		page.clickOwnerProperties();

		page.switchToNewestWindow();

	}

	@When("user selects Sort By as {string}")

	public void user_selects_sort_by_as(String sortOption) throws InterruptedException {

	    page.selectSortOptionOnlyClick(sortOption);

	}
 
	@Then("sorting should be applied")

	public void sorting_should_be_applied() {

	    System.out.println("Sort option clicked. Rearrangement expected.");

	}
 
*/


/*

// 5th Scenario 

	FurnishedHomesPage furnishedPage;

	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}

	@When("user hovers on Rent and clicks on Furnished Homes under Popular Choices")

	public void user_hovers_on_rent_and_clicks_on_furnished_homes_under_popular_choices() {

	    furnishedPage = new FurnishedHomesPage(driver);

	    furnishedPage.clickFurnishedHomes();

	    furnishedPage.switchToNewestWindow();

	}
 
	@When("user scrolls to the bedroom selection section")

	public void user_scrolls_to_the_bedroom_selection_section() throws InterruptedException {

	    Thread.sleep(2000); // You can also implement JS scroll if needed

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("window.scrollBy(0,600)");

	}
 
	@When("user clicks on 1BHK option")

	public void user_clicks_on_1bhk_option() {

	    furnishedPage.click1BHKOption();

	}
 
	@Then("the page should display only 1BHK furnished properties")

	public void the_page_should_display_only_1bhk_furnished_properties() {

	    // Assertion can be added here based on filtered result

	    System.out.println("1BHK Furnished properties displayed.");

	}

*/

 
//6th Scenario

	/*

	FindAnAgentPage findAnAgentPage;

	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}
 
	@When("user hovers on Rent and clicks on Find an Agent under Explore")

	public void openFindAnAgentPage() {

		driver = BaseSteps.getDriver();

		findAnAgentPage = new FindAnAgentPage(driver);

		findAnAgentPage.openFindAgent();

	}
 
	@When("user filters agents using city and locality from Excel")

	public void filterAgentsFromExcel() {

		ExcelReader reader = new ExcelReader();

		String city = reader.getCellValue("FindAgentData", "City", 1);

		String locality = reader.getCellValue("FindAgentData", "Locality", 1);

		findAnAgentPage.filterAgents(city, locality);

	}
 
	@Then("user clicks on View Details of the first agent")

	public void clickViewDetailsOfFirstAgent() {

		findAnAgentPage.clickFirstAgentDetails();

	}

*/
 
 
//7th Scenario

	LocalityPage localityPage;

 
	@Given("user launches the MagicBricks website")

	public void user_launches_the_magic_bricks_website() {

		driver = BaseSteps.getDriver();

		driver.get(BaseSteps.getBaseUrl());

		page = new OwnerPropertyPage(driver);

	}
 
 
//	@When("user hovers on Rent and clicks on Localities under Explore")

//	public void user_hovers_on_rent_and_clicks_on_localities_under_explore() {

//	    localityPage = new LocalityPage(driver);

//	    localityPage.openLocalitiesPage();

//	}

//

//	@When("user enters city {string} in the search box and selects from suggestions")

//	public void user_enters_city_in_the_search_box_and_selects_from_suggestions(String city) {

//	    localityPage.searchAndSelectCity(city);

//	}

//

//	@Then("user scrolls down to view locality results")

//	public void user_scrolls_down_to_view_locality_results() {

//	    localityPage.scrollResults();

//	}

	@When("user hovers on Rent and clicks on Localities under Explore")

	public void user_hovers_on_rent_and_clicks_on_localities_under_explore() {

	    localityPage = new LocalityPage(driver);

	    localityPage.clickLocalitiesFromRent();

	}
 
	@When("user enters city {string} in the search box and selects from suggestions")

	public void user_enters_city_in_the_search_box_and_selects_from_suggestions(String city) {

	    localityPage.enterLocalityCity(city);

	    localityPage.selectLocalityCityFromList();

	}
 
	@Then("user scrolls down to view locality results")

	public void user_scrolls_down_to_view_locality_results() {

	    localityPage.scrollLocalityResults();

	}
 
 
}

 