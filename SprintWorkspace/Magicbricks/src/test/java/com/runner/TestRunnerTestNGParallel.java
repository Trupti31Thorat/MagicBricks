package com.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Windows\\System32\\config\\systemprofile\\SprintWorkspace\\Magicbricks\\src\\test\\resources\\Features\\BuyModule.feature", glue = "com.stepDefinition")

public class TestRunnerTestNGParallel extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();

	}
}
