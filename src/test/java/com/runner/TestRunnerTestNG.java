package com.runner;
 
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


<<<<<<< HEAD
@CucumberOptions( features = "src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition"}, 
//tags="@research ",
plugin = {"pretty", "html:reports/cucumber-reports-Scenario-Sprint2.html",
=======
<<<<<<< HEAD
@CucumberOptions( features = "src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition"}, 
tags="@InvalidContact",
plugin = {"pretty", "html:reports/cucumber-reports-Scenario-.html",
=======
@CucumberOptions( features = "C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition", "com.setup"}, 
tags="  @ValidContact	",
plugin = {"pretty", "html:reports/cucumber-reports1.html"
		,
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ) 
public class TestRunnerTestNG extends AbstractTestNGCucumberTests  { 
	
}








<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


/*
data[i] = (cell.getCellType() == CellType.NUMERIC)
        ? String.valueOf((long) cell.getNumericCellValue())
        : cell.getStringCellValue();
        
        

          }*/
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
