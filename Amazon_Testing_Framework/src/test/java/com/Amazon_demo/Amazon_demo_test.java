package com.Amazon_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Extentreport.Extentfactory;
import Utility_screenshot.Utility;

public class Amazon_demo_test {

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
				"C:\\Users\\HP\\eclipse-workspace\\Amazon_Testing_Framework\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		baseUrl = "https://www.amazon.in/";
		report = Extentfactory.getInstance();
		test = report.startTest("Amazon Page");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web Application opened");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void AmazonPagedemo_test() throws Exception {

		WebElement siginbutton = driver.findElement(By.id("nav-signin-tooltip"));
		siginbutton.click();
		test.log(LogStatus.INFO, "Click on Sigup Link");

		Utility.captureScreenshot(driver, "Sig in Button");

		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("9445758113");
		test.log(LogStatus.INFO, "Enter Username");

		Utility.captureScreenshot(driver, "Enter Username");

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		test.log(LogStatus.INFO, "Click on Continue");

		Utility.captureScreenshot(driver, "Click on continue");

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Suchi@0617");
		test.log(LogStatus.INFO, "Enter Password");

		Utility.captureScreenshot(driver, "Enter Password");

		WebElement submitbutton = driver.findElement(By.id("signInSubmit"));
		submitbutton.click();
		test.log(LogStatus.INFO, "Click on Submit");

		Utility.captureScreenshot(driver, "Click on Submit");

		WebElement Searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Wildcraft bag");

		Utility.captureScreenshot(driver, "Enter the Product");

		test.log(LogStatus.INFO, "Search Product");

		WebElement submitsearch = driver.findElement(By.id("nav-search-submit-button"));

		Utility.captureScreenshot(driver, "Click on Submit Search");

		submitsearch.click();

		test.log(LogStatus.INFO, "Click Search Button");

		Thread.sleep(2000);

		String parentTab = driver.getWindowHandle();

		// Find out the exact bag and click on the searched option

		WebElement watchsearch = driver.findElement(By.linkText("44 Ltrs Casual Backpack (11629-Wolf_Blue)"));

		watchsearch.click();

		Utility.captureScreenshot(driver, "Click on Selected Bag");

		test.log(LogStatus.INFO, "Click Selected bag");

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

		Select quantity = new Select(driver.findElement(By.id("quantity")));

		quantity.selectByValue("4");
		
		Utility.captureScreenshot(driver, "Click on Quantity");

		test.log(LogStatus.INFO, "Click on Adding Quantity");


		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Thread.sleep(2000);
		addtocart.click();

		Utility.captureScreenshot(driver, "Click Add To Cart");

		test.log(LogStatus.INFO, "Click Add To Cart");

		WebElement validateaddtocart = driver.findElement(By.id("nav-cart-text-container"));

		Thread.sleep(2000);
		
		validateaddtocart.click();

		Utility.captureScreenshot(driver, "Click On Validate Cart");
		
		test.log(LogStatus.INFO, "Click to Validate Cart");


		Thread.sleep(2000);

		driver.switchTo().window(parentTab);

		WebElement page = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		page.click();
		
		Utility.captureScreenshot(driver, "click on Home Page");
		
		test.log(LogStatus.INFO, "Click on Home Page");


		Thread.sleep(2000);

		WebElement youraddress = driver.findElement(By.xpath("//*[text()='Edit addresses for orders and gifts']"));

		Utility.captureScreenshot(driver, "Click on Your Address");

		youraddress.click();
		
		test.log(LogStatus.INFO, "Click on Your Address");


		Thread.sleep(2000);
		WebElement addaddress = driver.findElement(By.id("ya-myab-plus-address-icon"));

		Utility.captureScreenshot(driver, "Click on Add Address");

		addaddress.click();
		
		test.log(LogStatus.INFO, "Click on Add Address");


		File file = new File("C:\\Users\\HP\\Desktop\\desktop\\AmazonAddress.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("AmazonAddress");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		WebElement fullname = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		WebElement phonenumber = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		Thread.sleep(2000);
		WebElement postalcode = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		WebElement addressline1 = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		WebElement addressline2 = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		WebElement landmark = driver.findElement(By.id("address-ui-widgets-landmark"));
		WebElement cityname = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		WebElement statename = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));

		WebElement addaddress2 = driver
				.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));

		for (int i = 1; i <= rowCount; i++) {

			fullname.sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter first name");

			test.log(LogStatus.INFO, "Enter FullName");

			Thread.sleep(2000);
			phonenumber.sendKeys("9445758113");

			Utility.captureScreenshot(driver, "Enter Phonenumber");

			test.log(LogStatus.INFO, "Enter Phonenumber");

			Thread.sleep(2000);
			postalcode.clear();

			postalcode.sendKeys("600072");

			Utility.captureScreenshot(driver, "Enter PostalCode");

			test.log(LogStatus.INFO, "Enter PostalCode");

			addressline1.sendKeys((sheet.getRow(i).getCell(1).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter Addressline 1");

			test.log(LogStatus.INFO, "Enter Addressline 1");

			addressline2.sendKeys((sheet.getRow(i).getCell(2).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter Addressline 2");

			test.log(LogStatus.INFO, "Enter Addressline 2");

			landmark.sendKeys((sheet.getRow(i).getCell(3).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter Landmark");

			test.log(LogStatus.INFO, "Enter Landmark");

			cityname.sendKeys((sheet.getRow(i).getCell(4).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter City");

			test.log(LogStatus.INFO, "Enter CityName");

			statename.sendKeys((sheet.getRow(i).getCell(5).getStringCellValue()));

			Utility.captureScreenshot(driver, "Enter StateName");
			test.log(LogStatus.INFO, "Enter StateName");
			addaddress2.click();
			Utility.captureScreenshot(driver, "Enter Click Add Address");

			test.log(LogStatus.INFO, "Click Add Address");

		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
