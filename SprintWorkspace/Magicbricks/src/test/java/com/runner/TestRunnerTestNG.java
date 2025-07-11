package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/Features",       
    glue = {"com.stepDefinition" ,"com.hooks" },
    		//, "com.hooks"},  
    tags="@BuyVsRent",

    
    plugin = {
        "pretty",
        "html:target/CucumberReport.html",
        "json:target/CucumberReport.json",

    },
    monochrome = true
                               
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
//	
//	@Override
//	@DataProvider
//	public Object[][] scenarios() {
//		// TODO Auto-generated method stub
//		return super.scenarios();
	

	
}