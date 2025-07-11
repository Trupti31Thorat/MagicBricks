package com.runner;
 
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions; 
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class) 
@CucumberOptions( features = "C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\Features\\MbAdviceScenario.feature",
glue = ("com.stepdefinition"), 
//tags=" @RobotKeyDown " ,
plugin = {"pretty", "html:target/cucumber-reports-Scenario-Sprint2.html"},
monochrome = true ) 
public class TestRunner { 
	
}