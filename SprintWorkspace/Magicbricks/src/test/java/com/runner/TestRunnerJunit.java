package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/",
    glue = {"com.stepDefinition"
    , "com.hooks"},
    tags = "@MagicBricks",
    plugin = { "pretty" ,
    "html:target/CucumberReport.html",
    "json:target/CucumberReport.json",
    "junit:target/CucumberReport.xml"
    },
    monochrome = true

)
public class TestRunnerJunit {
	
}
