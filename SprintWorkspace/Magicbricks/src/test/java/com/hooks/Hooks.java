package com.hooks;

import com.relevantcodes.extentreports.*;


import com.setup.BaseSteps;
import com.utility.ExtentManager;
import com.utility.ScreenshotUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class Hooks {

	ExtentReports report;
	ExtentTest test;
	WebDriver driver;

	@Before
	public void beforeScenario(Scenario scenario) {
		report = ExtentManager.getInstance();
		test = report.startTest(scenario.getName());
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
		driver = BaseSteps.getDriver();

		String screenshotPath = ScreenshotUtil.captureScreenshot(driver, scenario.getName());
		String image = test.addScreenCapture(screenshotPath);

		if (!scenario.isFailed()) {

			test.log(LogStatus.PASS, "Scenario Passed", image);
		} else {
			test.log(LogStatus.FAIL, "Scenario Failed", image);
		}

		// Attaching the screenshots to Cucumber HTML report also :
		scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());

		report.endTest(test);
		report.flush();
	}
}