package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature", glue = {
		"com.stepDefination", "com.setup" },
//    tags=" @ownerPhoto",
		// tags = "@contactOwnerPositive",

		plugin = { "pretty:target/pretty1.txt", 
				"json:target/jsonreport1.json", 
				"junit:target/junitReport1.xml",
				"html:target/cucumberReport/HtmlReport1.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
