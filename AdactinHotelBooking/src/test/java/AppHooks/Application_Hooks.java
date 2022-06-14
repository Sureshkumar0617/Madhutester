package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.Driver_Factory;
import com.qa.util.ConfigReader;
import com.qa.util.Generic_Functions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks {
	
	private Driver_Factory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	

		

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new Driver_Factory();
		driver = driverFactory.init_driver(browserName);
		
		
	}
	@AfterStep
	public void as(Scenario scenario) throws Exception 
	{
		
	    scenario.attach(Generic_Functions.takeScreenShotAsByte(), "image/png", "screenshots");
	}
	
		
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}


	
	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
		
		}


}
