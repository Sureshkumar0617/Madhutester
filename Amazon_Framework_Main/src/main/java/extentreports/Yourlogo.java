package extentreports;

import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Yourlogo {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	ExtentTest extentTest;
	
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Driver\\chromedriver.exe");
	
	    driver = new ChromeDriver();
	
		
		baseUrl = "http://automationpractice.com/index.php";
		 report = ExtentFactory.getInstance();
       test = report.startTest("Verify welcome Text");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO,"Browser Maximized");
		driver.get(baseUrl);
		test.log(LogStatus.INFO,"Web Application opened");}
		
		
		
	
	
	@Test
		public void Youlogo1_test() throws Exception {

WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
signin.click();


test.log(LogStatus.INFO, "Click on Sigin");



Screenshot screenshot = new AShot().takeScreenshot(driver);

Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Screenshot"));

//entering emailid

WebElement emailid = driver.findElement(By.id("email"));
emailid.sendKeys("suresh1047@gmail.com");

Utility.captureScreenshot(driver, "TypeEmailid");


test.log(LogStatus.INFO, "enter username");


//entering password

WebElement password = driver.findElement(By.id("passwd"));

password.sendKeys("Suchi@0617");

Utility.captureScreenshot(driver, "TypePassword");

test.log(LogStatus.INFO, "enter password");


WebElement submitbutton = driver.findElement(By.id("SubmitLogin"));
submitbutton.click();

Utility.captureScreenshot(driver, "Cliking Submit");

test.log(LogStatus.INFO, "Click sumbit");


WebElement womendress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
womendress.click();

Utility.captureScreenshot(driver, "Cliking on womendress");


test.log(LogStatus.INFO, "click on womendress");


WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
tshirt.click();

Utility.captureScreenshot(driver, "Cliking on the t-shirt");


test.log(LogStatus.INFO, "click on t-shirt selected");


WebElement addtocart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
addtocart.click();

Utility.captureScreenshot(driver, "Cliking on the addtocart");


test.log(LogStatus.INFO, "click on addtocart");


Thread.sleep(2000);

WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	checkout.click();
	
	Utility.captureScreenshot(driver, "Cliking on the Checkout");

	
	test.log(LogStatus.INFO, "click on checkout");

	
	Thread.sleep(2000);
	
	WebElement checkoutproceedure = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	
	checkoutproceedure.click();
	
	Utility.captureScreenshot(driver, "Cliking on checkoutproceedure");

	
	test.log(LogStatus.INFO, "click on checkoutproceedure");

	
	WebElement addnewaddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p/a"));
	addnewaddress.click();
	
	Utility.captureScreenshot(driver, "Cliking on addingnewaddress");

	
	test.log(LogStatus.INFO, "click on newaddress");

	
        //Create an object of File class to open xls file
        File file =    new File("C:\\Users\\HP\\Desktop\\NewAddressYourLogo.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //creating a Sheet object
        XSSFSheet  sheet=wb.getSheet("NewAddressYourLogo");
        
        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
      

        //Identify the WebElements for the student registration form
        WebElement firstName  =driver.findElement(By.id("firstname"));
        WebElement lastName = driver.findElement(By.id("lastname"));
        WebElement companyname = driver.findElement(By.id("company"));
        WebElement addressfirstline = driver.findElement(By.id("address1"));
        WebElement cityname = driver.findElement(By.id("city"));
        WebElement statename = driver.findElement(By.id("id_state"));
        WebElement zipcode =driver.findElement(By.id("postcode"));
        WebElement homephone = driver.findElement(By.id("phone"));
        WebElement message = driver.findElement(By.id("alias"));



        //iterate over all the rows in Excel and put data in the form.
        for(int i=1;i<=rowCount;i++) {
        	firstName.clear();
        	
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
        	
        	Utility.captureScreenshot(driver, "Entering Firstname");

        	
        	test.log(LogStatus.INFO, "enter firstname");


        	lastName.clear();
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            
        	Utility.captureScreenshot(driver, "Entering Lastname");

        	test.log(LogStatus.INFO, "enter lastname");

        	Thread.sleep(2000);

            companyname.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            
        	Utility.captureScreenshot(driver, "Entering companyname");

        	
        	test.log(LogStatus.INFO, "enter company name");


            addressfirstline.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
        	
        	Utility.captureScreenshot(driver, "Entering addressfirstline");

            
        	test.log(LogStatus.INFO, "enter address");


            cityname.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());

        	Utility.captureScreenshot(driver, "Entering cityname");

        	test.log(LogStatus.INFO, "enter city");


        	statename.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
        	
        	Utility.captureScreenshot(driver, "Entering Statename");

        	test.log(LogStatus.INFO, "enter statename");

        	
            zipcode.sendKeys("93657");
            
        	Utility.captureScreenshot(driver, "Entering zipcode");

            
            test.log(LogStatus.INFO, "enter zipcode");


            homephone.sendKeys("9445758113");
            
        	Utility.captureScreenshot(driver, "Entering homephoneno");

            
            test.log(LogStatus.INFO, "enter homephone");


        	message.sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
        	
        	Utility.captureScreenshot(driver, "Entering Message");

        	
        	test.log(LogStatus.INFO, "enter message");

            
            Thread.sleep(2000);
            WebElement saveaddress = driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span"));
	saveaddress.click();
	
	test.log(LogStatus.INFO, "click on saveaddress");

	Thread.sleep(2000);


	WebElement Addressprocedure = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	Addressprocedure.click();
	
	Utility.captureScreenshot(driver, "Clicking addressproceedure");

	
	test.log(LogStatus.INFO, "click on addressproceedure");

	
Thread.sleep(2000);
	
	WebElement agreeterms = driver.findElement(By.id("cgv"));
	
	Utility.captureScreenshot(driver, "Clicking agreeterms");

	agreeterms.click();
	
	test.log(LogStatus.INFO, "click on agreeterms");

	
	WebElement shippingpro = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
	
	Utility.captureScreenshot(driver, "Clicking shipping");

		
	shippingpro.click();
	
	test.log(LogStatus.INFO, "click on Shipping");

	
        }
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
		}



}
