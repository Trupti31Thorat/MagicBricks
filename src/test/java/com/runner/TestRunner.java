package com.runner;
 
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions; 
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class) 
@CucumberOptions( features = "C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = {"com.stepdefinition", "com.setup"}, 
<<<<<<< HEAD
tags="  @ValidContact		",
plugin = {"pretty", "html:target/cucumber-reports4.html"},
=======

plugin = {"pretty", "html:target/cucumber-reports"},
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
monochrome = true ) 
public class TestRunner { 
	
}