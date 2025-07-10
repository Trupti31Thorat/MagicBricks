package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature", glue = {
		"com.stepDefination", "com.setup" },
   //tags=" @ownerPhoto",
		// tags = "@contactOwnerPositive",

		plugin = { "pretty:target/pretty2.txt", 
				"json:target/jsonreport2.json", 
				"junit:target/junitReport2.xml",
				"html:target/cucumberReport/HtmlReport2.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
