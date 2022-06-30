package extentreports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage1 {

	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	ExtentTest extentTest;

	public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {

		screenshotName = screenshotName + ".png";
		String directory = "C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Screenshot";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + screenshotName));
		String destination = directory + screenshotName;

		return destination;

	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		baseUrl = "https://www.amazon.in/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify welcome Text");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web Application opened");
	}

	@Test
	public void LoginPage1_test() throws Exception {

		WebElement siginbutton = driver.findElement(By.id("nav-signin-tooltip"));
		siginbutton.click();
		test.log(LogStatus.INFO, "Click on siguplink");

		Utility.captureScreenshot(driver, "siginbutton");

		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("9445758113");
		test.log(LogStatus.INFO, "Enter username");

		Utility.captureScreenshot(driver, "enterusername");

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		test.log(LogStatus.INFO, "Click on con");

		Utility.captureScreenshot(driver, "Click on continue");

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Suchi@0617");
		test.log(LogStatus.INFO, "Enter Password");

		Utility.captureScreenshot(driver, "enterpassword");

		WebElement submitbutton = driver.findElement(By.id("signInSubmit"));
		submitbutton.click();
		test.log(LogStatus.INFO, "Click on Submit");

		Utility.captureScreenshot(driver, "clickonsubmit");

		WebElement Searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Samsung Smart Watch");

		Utility.captureScreenshot(driver, "enter the product");

		test.log(LogStatus.INFO, "SearchProduct");

		WebElement submitsearch = driver.findElement(By.id("nav-search-submit-button"));

		Utility.captureScreenshot(driver, "click on submit");

		submitsearch.click();

		test.log(LogStatus.INFO, "Click searchbutton");

		Thread.sleep(2000);
		String parentTab = driver.getWindowHandle();
		
		// Find out the exact Samsung Smart watch and click on the searched option
		WebElement watchsearch = driver.findElement(By.linkText(
				"Fire-Boltt Rage Full Touch 1.28” Display & 60 Sports Modes with IP68 Rating Smartwatch, Sp02 Tracking, Over 100 Cloud Based Watch Faces"));
		watchsearch.click();
		test.log(LogStatus.INFO, "Click watch");

		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> iterator = s1.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!parent.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}

		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		Utility.captureScreenshot(driver, "click on addtocart");

		test.log(LogStatus.INFO, "Click addtocart");

		Thread.sleep(2000);

		WebElement validateaddtocart = driver.findElement(By.id("nav-cart-text-container"));
		Thread.sleep(2000);

		validateaddtocart.click();
		
		Utility.captureScreenshot(driver, "click on validatecart");

		Thread.sleep(2000);

		driver.switchTo().window(parentTab);

		WebElement page = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		page.click();
		Utility.captureScreenshot(driver, "click on Homepage");

		
		Thread.sleep(2000);

		
		WebElement youraddress = driver.findElement(By.xpath("//*[text()='Edit addresses for orders and gifts']"));
		
		Utility.captureScreenshot(driver, "click on youraddress");

		youraddress.click();

		WebElement addaddress = driver.findElement(By.id("ya-myab-plus-address-icon"));
		
		Utility.captureScreenshot(driver, "click on addaddress");

		
		addaddress.click();

		
		File file = new File("C:\\Users\\HP\\Desktop\\desktop\\AmazonAddress.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("AmazonAddress");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		WebElement fullname = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		WebElement phonenumber = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		WebElement postalcode = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		WebElement addressline1 = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		WebElement addressline2 = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		WebElement landmark = driver.findElement(By.id("address-ui-widgets-landmark"));
		WebElement cityname = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		WebElement statename = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));

		WebElement addaddress2 = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));

		for (int i = 1; i <= rowCount; i++) {

			fullname.sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));

			Utility.captureScreenshot(driver, "enter first name");

			test.log(LogStatus.INFO, "enter fullname");

			Thread.sleep(2000);
			phonenumber.sendKeys("9445758113");

			Utility.captureScreenshot(driver, "enter phonenumber");

			test.log(LogStatus.INFO, "enter phonenumber");

			postalcode.sendKeys("600072");

			Utility.captureScreenshot(driver, "enter postalcode");

			
			test.log(LogStatus.INFO, "enter postalcode");

			addressline1.sendKeys((sheet.getRow(i).getCell(1).getStringCellValue()));
			
			Utility.captureScreenshot(driver, "enter addressline1");


			test.log(LogStatus.INFO, "enter addressline1");

			addressline2.sendKeys((sheet.getRow(i).getCell(2).getStringCellValue()));
			
			Utility.captureScreenshot(driver, "enter addressline2");


			test.log(LogStatus.INFO, "enter addressline2");

			landmark.sendKeys((sheet.getRow(i).getCell(3).getStringCellValue()));
			
			Utility.captureScreenshot(driver, "enter landmark");


			test.log(LogStatus.INFO, "enter landmark");

			cityname.sendKeys((sheet.getRow(i).getCell(4).getStringCellValue()));
			
			Utility.captureScreenshot(driver, "enter city");


			test.log(LogStatus.INFO, "enter cityname");

			statename.sendKeys((sheet.getRow(i).getCell(5).getStringCellValue()));
	
			Utility.captureScreenshot(driver, "enter statename");
			test.log(LogStatus.INFO, "enter statename");
			addaddress2.click();
			Utility.captureScreenshot(driver, "enter clickadd address");


			test.log(LogStatus.INFO, "Click on add");

		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
