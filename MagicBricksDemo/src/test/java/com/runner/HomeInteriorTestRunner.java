package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
				

@RunWith(Cucumber.class)
@CucumberOptions(			
	    features = "src/test/resource/features",
	    glue = {"com.stepdefinitions","com.setup"},
	    plugin = {
	        "pretty",
	        "json:target/cucumber.json",
	        "junit:target/cucumberReport/HtmlReport.html",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    },
	    tags =" @NegativeTest"					
	)
	public class HomeInteriorTestRunner extends AbstractTestNGCucumberTests { }




