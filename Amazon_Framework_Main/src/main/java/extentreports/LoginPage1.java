package extentreports;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class LoginPage1 {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	ExtentTest extentTest;
	
public static String takeScreenshot(WebDriver driver,String screenshotName) throws IOException	{
		
		screenshotName = screenshotName + ".png";
		String directory = "C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Screenshot";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + screenshotName));
		String destination = directory + screenshotName;
		
		return destination;
		
}
	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Driver\\chromedriver.exe");
	
	    driver = new ChromeDriver();
	
		
		baseUrl = "https://www.amazon.in/";
		 report = ExtentFactory.getInstance();
       test = report.startTest("Verify welcome Text");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO,"Browser Maximized");
		driver.get(baseUrl);
		test.log(LogStatus.INFO,"Web Application opened");}
		
		
		
	
	
	@Test
		public void YourLogo_test() throws Exception {

		
		WebElement siginbutton = driver.findElement(By.id("nav-signin-tooltip"));
		siginbutton.click();
		test.log(LogStatus.INFO, "Click on siguplink");
		 
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("9445758113");
		test.log(LogStatus.INFO, "Enter username");
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		test.log(LogStatus.INFO, "Click on con");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Suchi@0617");
		test.log(LogStatus.INFO, "Enter Password");
		
		
		WebElement submitbutton = driver.findElement(By.id("signInSubmit"));
		submitbutton.click();
		test.log(LogStatus.INFO, "Click on Submit");
		

		WebElement Searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("tshirt");
		
		test.log(LogStatus.INFO, "SearchProduct");
		
		WebElement submitsearch = driver.findElement(By.id("nav-search-submit-button"));
		submitsearch.click();

		test.log(LogStatus.INFO, "Click searchbutton");
		
		
		//Find out the exact Samsung Smart watch and click on the searched option
		driver.findElement(By.linkText("Test Samsung Gear S Smartwatch, White 4GB (Verizon Wireless)")).click();

		//Select the quantity
		Select quantity = new Select(driver.findElement(By.id("quantity")));
		quantity.selectByIndex(4);
		Thread.sleep(5000);

		//Add to the cart
		driver.findElement(By.id("add-to-cart-button")).click();
	}		
		
			@AfterClass
		public void afterClass() {
			driver.quit();
			report.endTest(test);
			report.flush();
			}
	

}
