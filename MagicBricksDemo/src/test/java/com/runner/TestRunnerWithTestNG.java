package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/features",
    glue = {"com.stepdefinitions", "com.setup"},
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "junit:target/cucumberReport/HtmlReport4.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    tags = "@NegativeTest",
    monochrome = true
)


public class TestRunnerWithTestNG  extends AbstractTestNGCucumberTests{
	

}
