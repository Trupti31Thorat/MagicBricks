package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature",
   glue = {"com.stepDefination", "com.setup"},
   plugin = {"pretty", "html:target/cucumber-html", "json:target/cucumber.json"},
   monochrome = true
)
public class TestRunnerWithJunit { }




