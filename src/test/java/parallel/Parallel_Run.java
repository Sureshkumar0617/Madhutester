package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/Parallelfailedrerun.txt",
				"json:target/cucumber-reportreport2.json"},
		monochrome = true,
		publish = true,
		glue = { "Parallel","AppHooks" },
		features = { "src/test/resources/parallel"}
		)



public class Parallel_Run extends AbstractTestNGCucumberTests{



	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}


}