package com.celtic.automation.cmcs.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.celtic.automation.cmcs.factory.DriverFactory;

public class Screenshot_Utility extends DriverFactory{
	
	private ConfigReader config =new ConfigReader();
	public  void captureScreenshot(String screenshotName) throws Exception {
		int c=0;
		c++;
		TakesScreenshot ts = (TakesScreenshot)getDriver();
		File source=ts.getScreenshotAs(OutputType.FILE);
		File f = new File(config.readPassedScreenshotFile());
		if(f.exists() && !f.isDirectory()) { 
			FileUtils.copyFile(source, new File(f,screenshotName+".png"));
			c++;
		}	
		else {
			FileUtils.copyFile(source, new File(f,screenshotName+".png"));
		}
		
		
	}

}



