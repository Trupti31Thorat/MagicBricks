package com.runner;
 
<<<<<<< HEAD
=======


>>>>>>> origin/MbAdvice
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


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
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ) 
public class TestRunnerTestNG extends AbstractTestNGCucumberTests  { 
	
}








<<<<<<< HEAD
=======


/*
data[i] = (cell.getCellType() == CellType.NUMERIC)
        ? String.valueOf((long) cell.getNumericCellValue())
        : cell.getStringCellValue();
        
        

          }*/
>>>>>>> origin/MbAdvice
