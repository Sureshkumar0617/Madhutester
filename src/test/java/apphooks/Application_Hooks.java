package apphooks;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.celtic.automation.cmcs.factory.DriverFactory;
import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.Generic_Functions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks {

private DriverFactory driverFactory;
private WebDriver driver;
Properties prop;
private ConfigReader config =new ConfigReader();

public static Scenario scenario;


@Before()
public void launchBrowser(Scenario scenario) {
driverFactory = new DriverFactory();
try {
driver = driverFactory.initdriver(config.readBrowser());
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


}
@AfterStep
public void as(Scenario scenario) throws Exception
{

scenario.attach(Generic_Functions.getByteScreenshot(), "image/png", "anyname");
}


@After(order = 0)
public void quitBrowser() {
driver.quit();
}




@After(order = 1)
public void tearDown(Scenario scenario) throws Exception {
	String exeTime = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

if (scenario.isFailed()) {
// take screenshot:
String screenshotName = scenario.getName().replaceAll(" ", "_");
byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
scenario.attach(sourcePath, "image/png", screenshotName);

TakesScreenshot ts = (TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File f = new File(config.readPassedScreenshotFile()+"\\"+exeTime);
if(f.exists() && !f.isDirectory()) { 
	FileUtils.copyFile(source, new File(config.readFailedScreenshotFile()+"\\"+exeTime+screenshotName+".png"));
}	
else {
FileUtils.copyFile(source, new File(config.readFailedScreenshotFile()+"\\"+exeTime+screenshotName+".png"));
}
}
}

}