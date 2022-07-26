package Extentreport;

import com.relevantcodes.extentreports.ExtentReports;

public class Extentfactory {
 
	public static ExtentReports getInstance() {
		
		ExtentReports extent;
		
	     String Path = "C:\\Users\\HP\\eclipse-workspace\\Amazon_Testing_Framework\\test-output\\reportdemoAmazon1.html";
	     extent = new ExtentReports(Path, false);

	return extent;


			
			
			
			
		}


}
