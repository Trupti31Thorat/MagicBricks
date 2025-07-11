package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
				


@RunWith(Cucumber.class)
@CucumberOptions(            
    features = "src/test/resource/features",
    glue = {"com.loginstepdefinition", "com.setup"},
    plugin = { "pretty","html:target/cucumber-reports-Scenario-5.html"},
    tags = "@Login"                
)        
public class TestRunnerWithJUnit  { }


