package com.runner;
 
import org.testng.annotations.DataProvider;
 
 
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features="C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\Features\\MbAdviceScenario.feature",

glue="com.stepdefinition")

public class TestRunnerParallelTest extends AbstractTestNGCucumberTests  {

	@Override

	@DataProvider(parallel=true)

	public Object[][] scenarios() {

		// TODO Auto-generated method stub

		return super.scenarios();

}

}

 