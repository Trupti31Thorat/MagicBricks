package com.loginrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = {"com.loginstepdefinition"},
    plugin = {"pretty",
    		"html:target/cucumber-report.html",
    		"json:target/cucumber.json",
    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    		},
    tags = "@Login"
)

public class LoginRunner extends AbstractTestNGCucumberTests{}
