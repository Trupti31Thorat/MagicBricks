package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
//    features = "src/test/resources/Features",
//    glue = {"com.stepDefination"},
//    plugin = {
//        "pretty",
//        "html:target/parallel/CucumberReport.html",
//        "json:target/parallel/cucumber.json",
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//    },
//    tags = "@ownerPhoto or @contactOwnerPositive or @contactOwnerNegative or @sortHighToLow or @furnishedHomesBHK or @findAgent or @exploreLocalities",
//    monochrome = true
)
public class TestRunnerForParallelTesting extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
