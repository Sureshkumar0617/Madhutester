package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	
	public static ExtentReports getInstance() {
		
	ExtentReports extent;
	
     String Path = "C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\test-output\\testoutput.html";
     extent = new ExtentReports(Path, false);

return extent;


		
		
		
		
	}

}
