package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\Features\\Rent.feature",
   glue = {"com.stepDefination", "com.setup"},
   //tags="@ownerPhoto",
  // tags="@contactOwnerPositive",
   tags="@contactOwnerPositiveOutline",
  // tags="@contactOwnerNegative",
	//tags="@sortHighToLow",
   // tags="@furnishedHomesBHK",
   //tags="@findAgent",
  // tags="@exploreLocalities",
   plugin = {"pretty", "html:target/cucumber-html.html"},
   monochrome = true
)
public class TestRunnerWithJunit { }

