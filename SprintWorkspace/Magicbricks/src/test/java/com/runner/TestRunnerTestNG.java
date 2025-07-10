package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/Features",       
    glue = {"com.stepDefinition" },
    		//, "com.hooks"},  
    tags="@MagicBricks",

    
    plugin = {
        "pretty",
        //"html:target/CucumberReport.html",
        //"json:target/cucumber.json",

    },
    monochrome = true
                               
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	

	
}