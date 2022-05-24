package com.pages;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class GenericFucntions extends Base_Class{
	public static byte[] getByteScreenshot() throws Exception{
		
		
				
			    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    byte[] fileContent = FileUtils.readFileToByteArray(src);
                
		         return fileContent;
		

}
	
	

	
	


}