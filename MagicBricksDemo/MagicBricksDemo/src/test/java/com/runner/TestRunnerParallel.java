package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resource/features",

		glue = "com.stepdefinition")

public class TestRunnerParallel extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)

	public Object[][] scenarios() {

	return super.scenarios();

	}

}

