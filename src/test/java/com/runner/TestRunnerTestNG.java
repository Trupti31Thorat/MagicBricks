package com.runner;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = "src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition"}, 
//tags="@research ",
plugin = {"pretty", "html:reports/cucumber-reports-Scenario-Sprint2.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ) 
public class TestRunnerTestNG extends AbstractTestNGCucumberTests  { 
	
}








