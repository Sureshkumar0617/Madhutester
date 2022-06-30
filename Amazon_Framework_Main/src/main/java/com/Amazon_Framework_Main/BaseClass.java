package com.Amazon_Framework_Main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	public static WebDriver driver;
	public ExtentHtmlReporter htmlreport;
	public static ExtentReports extent;
	public static ExtentTest logger;

	@BeforeTest
	public void beforeTestMethod(){
	}

	@BeforeMethod
	@Parameters(value={"browserName"})
	public void beforeMethodMethod(String browserName){
	setupDriver(browserName);
	driver.manage().window().maximize();
	driver.manage();
	}




	private void setupDriver(String browserName) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void afterMethodMethod(){
	driver.quit();
	}

	@AfterTest
	public void afterTestMethod(){
	}





	
}
