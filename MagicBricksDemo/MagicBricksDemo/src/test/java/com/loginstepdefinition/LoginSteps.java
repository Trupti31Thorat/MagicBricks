package com.loginstepdefinition;

import com.pages.LoginPageFactory;
import com.loginparameters.ExcelReader1;
import com.setup.HomeInteriorBaseSteps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class LoginSteps {
    WebDriver driver = HomeInteriorBaseSteps.getDriver();
    LoginPageFactory loginPage = new LoginPageFactory(driver);

    @Given("user is on MagicBricks homepage")
    public void user_is_on_magic_bricks_homepage() {
        driver.get("https://www.magicbricks.com/");
    }

    @When("user hovers on login and clicks login")
    public void user_hovers_on_login_and_clicks_login() {
        loginPage.hoverAndClickLogin();
        loginPage.switchToNewWindow();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("user enters mobile number from Excel row {int}")
    public void user_enters_mobile_number_from_excel_row(Integer rowNum) throws InterruptedException {
        ExcelReader1 reader = new ExcelReader1();
        String mobile = reader.getMobileNumber("Login1", rowNum);

        if (mobile == null || mobile.isEmpty()) {
            System.out.println("❌ Mobile number NOT found at row " + rowNum);
            throw new RuntimeException("Mobile number missing in Excel row: " + rowNum);
        } else {
            System.out.println("✅ Found mobile number: " + mobile);
        }

        loginPage.enterMobileNumber(mobile);
    }

    @When("user waits for manual captcha and clicks next")
    public void user_waits_for_manual_captcha_and_clicks_next() throws InterruptedException {
    	 new Scanner(System.in).nextLine();
         loginPage.clickNextAfterCaptcha();
      
    }
    @When("user waits for manual OTP entry")
    public void user_waits_for_manual_otp_entry()  throws InterruptedException{
    	new Scanner(System.in).nextLine();
        loginPage.clickLoginAfterOTP();
    }
    
    @Then("user clicks continue")
    public void user_clicks_continue() {
        loginPage.clickContinue();
    }
    
}
