package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resource\\Features\\HomeLoans.feature"}, tags = "@CityNavigation or @EMICalc or @SBIforminput1 or @BalanceTransfer", 
glue={"com.stepdefination", "com.setup"},
plugin= {"pretty:target/pretty.txt",
		"json:target/jsonreport.json", 
		"junit:target/junitReport.xml",
		"html:target/cucumberReport/HtmlReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {

}
