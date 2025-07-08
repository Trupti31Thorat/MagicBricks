package com.runner;
 


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = "C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition", "com.setup"}, 
tags="  @ValidContact	",
plugin = {"pretty", "html:reports/cucumber-reports1.html"
		,
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ) 
public class TestRunnerTestNG extends AbstractTestNGCucumberTests  { 
	
}










/*
data[i] = (cell.getCellType() == CellType.NUMERIC)
        ? String.valueOf((long) cell.getNumericCellValue())
        : cell.getStringCellValue();
        
        

          }*/