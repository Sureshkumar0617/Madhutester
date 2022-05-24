package com.pages;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class LoginPage{
	
	
	public static WebDriver driver;
	
	public ExtentSparkReporter htmlextent = null;
	public ExtentReports report = null;
	public ExtentTest log = null;

	// 1. By Locators: OR
	private By Username = By.id("txtUsername");
	private By Password = By.id("txtPassword");
	private By LOGIN = By.id("btnLogin");
	
	

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
		
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		
		return driver.getTitle();
		

	}

	

	public void enterUserName(String username) throws IOException, InterruptedException {
		driver.findElement(Username).sendKeys(username);
		
	
	        log.log(Status.INFO, "username"+log.addScreenCaptureFromPath(screenshot()));
			
			//log.log(Status.PASS, "Passed"+log.addScreenCaptureFromPath(screenshot()));
	
		Thread.sleep(2000);
	}
	
		
	

	public void enterPassword(String pwd) throws IOException  {
		driver.findElement(Password).sendKeys(pwd);
		  log.log(Status.INFO, "pwd"+log.addScreenCaptureFromPath(screenshot()));
			
			//log.log(Status.PASS, "Passed"+log.addScreenCaptureFromPath(screenshot()));
	
	}
		
		
	public void clickOnLogin()  {
		driver.findElement(LOGIN).click();
	}
	
	public
	HomePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(Username).sendKeys(un);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(LOGIN).click();
		return new HomePage(driver);
	}
	public static String screenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\Screenshots\\login.png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
				
		return dest;
		
	}
}


