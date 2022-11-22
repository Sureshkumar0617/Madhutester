package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt",
				"json:target/cucumber-reportreport.json"},
		monochrome = true,
		publish = true,
		glue = { "parallel","apphooks" },
		features = { "src/test/resources/Parallel/RWC_002.feature"}
		)


public class MyTestRunner extends AbstractTestNGCucumberTests{
	
	}