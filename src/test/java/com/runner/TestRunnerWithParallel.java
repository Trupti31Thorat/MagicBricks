package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
 
@CucumberOptions(

    features = "src\\\\test\\\\resource\\\\Features\\\\HomeLoans.feature",
    glue = {"com.stepdefination","com.setup"}
)

public class TestRunnerWithParallel extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

 