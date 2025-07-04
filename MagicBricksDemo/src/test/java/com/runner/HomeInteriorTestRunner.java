package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = {"com.stepdefinitions"},
    plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"},
    tags = "@HomeInteriors"
)
public class HomeInteriorTestRunner { }


