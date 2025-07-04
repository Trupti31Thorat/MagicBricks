package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature",
    glue = "com.stepDefination",
    tags = "@ownerPhoto",
    plugin = {"pretty", "html:reports/cucumber-html-report.html"}
)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {
}
