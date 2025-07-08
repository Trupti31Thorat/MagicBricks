package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature",
    glue = {"com.stepDefination", "com.setup"},
    tags = "@contactOwnerPositive",
//    plugin = {"pretty", "html:reports/cucumber-html-report.html",
//    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    
    plugin= {"pretty:target/pretty.txt",
    		"json:target/jsonreport.json",
    		"junit:target/junitReport.xml",
    		"html:target/cucumberReport/HtmlReport.html",
    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    		}
     
)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}

//html:target/cucumberReport/HtmlReport.html