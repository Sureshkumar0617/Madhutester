package com.celtic.automation.cmcs.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.celtic.automation.cmcs.factory.DriverFactory;

public class Generic_Functions extends DriverFactory{

	
	
	public static String getBase645Screenshot() throws IOException {
		
		
		String Base64StringOfScreenshot = "";
		File src = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sDate = sdf.format(date);
		FileUtils.copyFile(src,new File("image_" + sDate + ".png"));
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		Base64StringOfScreenshot = "data:image/png:base64,"+ Base64.getEncoder().encodeToString(fileContent);
					return Base64StringOfScreenshot;
		
	}
	public static byte[] getByteScreenshot() throws IOException {
		File src = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(src);
		return filecontent;
		
	}

}
