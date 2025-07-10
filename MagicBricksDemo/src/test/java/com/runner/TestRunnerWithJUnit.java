package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
				


@RunWith(Cucumber.class)
@CucumberOptions(            
    features = "src/test/resource/features",
    glue = {"com.stepdefinitions", "com.setup"},
    plugin = { "pretty", "json:target/cucumber.json",
               "junit:target/cucumberReport/HtmlReport.html" },
    tags = "@DesignGallery"                
)        
public class TestRunnerWithJUnit  { }


