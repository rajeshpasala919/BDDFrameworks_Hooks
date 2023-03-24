package BDD_Runnerfiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/login.feature" 
        ,glue = {"stepDefinitions"}
        ,monochrome = true 
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, dryRun = false)
public class Runnerfiles extends AbstractTestNGCucumberTests {

}
