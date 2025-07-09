package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resource/Features/HomeLoans.feature"}, tags = "@CityNavigation or @EMICalc or @SBIforminput1",
                 glue={"com.stepdefination", "com.setup"}, plugin= {"pretty:target/pretty.txt",
                			"json:target/jsonreport.json", 
                			"junit:target/junitReport.xml",
                			"html:target/cucumberReport/HtmlReport.html",
                			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                			})
                
public class TestRunnerWithJunit {
}