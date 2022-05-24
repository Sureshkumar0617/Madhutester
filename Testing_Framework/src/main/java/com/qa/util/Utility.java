package com.qa.util;

import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.pages.GenericFucntions;

import io.cucumber.java.Scenario;

public class Utility {
	
	public static Scenario message;    

	public static void takeScreenShotAfterEveryStep() throws WebDriverException, Exception {
	        byte[] as = ((TakesScreenshot)DriverManager.getDriver(null)).getScreenshotAs(OutputType.BYTES);
	        message.attach(GenericFucntions.getByteScreenshot() ,"image/png", "anyname");
	    }
	}


