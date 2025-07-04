package com.stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.OwnerPropertyPage;
import com.setup.BaseSteps;

import io.cucumber.java.en.*;

/*public class Rent {
    WebDriver driver;
    OwnerPropertyPage page;

    @Given("user launches the MagicBricks website")
    public void launchSite() throws Throwable {
        driver = BaseSteps.getDriver();
        driver.get(BaseSteps.getBaseUrl());
        page = new OwnerPropertyPage(driver);
        Assert.assertTrue(driver.getTitle().contains("MagicBricks"), "Title does not contain MagicBricks");
    }

    @When("user hovers on Rent and clicks on Owner Properties under Popular Choices")
    public void clickOwnerProps() throws Throwable {
       page.hoverAndClickOwnerProps();
        page.switchToLatestWindow();
        Assert.assertTrue(driver.getCurrentUrl().contains("owner"), "Owner Properties page not loaded");
    	   Thread.sleep(3000); // If needed, replace with WebDriverWait for production

          
           System.out.println("After switch, URL: " + driver.getCurrentUrl());
           System.out.println("After switch, Title: " + driver.getTitle());

           
           boolean isLoaded = driver.getCurrentUrl().toLowerCase().contains("owner")
                            || driver.getTitle().toLowerCase().contains("owner")
                            || driver.getPageSource().toLowerCase().contains("owner properties");

           Assert.assertTrue(isLoaded, "Owner Properties page not loaded");
    }
   
    @And("user clicks on first property photo")
    public void clickPhoto() throws Throwable {
        page.clickFirstPropertyPhoto();
    }

    @Then("user scrolls down the photo view page")
    public void scrollPhoto() throws Throwable {
        page.scrollInGallery();
    }
}*/

public class Rent {
	WebDriver driver;
	OwnerPropertyPage page;

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

}
