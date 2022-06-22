package com.Amazon_Framework_Main;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	//BROWSER LAUNCH
    public static WebDriver driver;
	public static WebDriver browserLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
				 driver = new ChromeDriver(); 
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Drivers\\edgedriver.exe"));
				 driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\Drivers\\firefoxdriver.exe"));
				 driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
     }
	
//URL
	public static void url(String link) {
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//INPUT OF ELEMENT
	public static void inputOfelement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
//CLICK ON ELEMENT
	public static void clickOnelement(WebElement element) {
		element.click();
	}
	
//CLEAR ON ELEMENT
	public static void clearOnelement(WebElement element) {
		element.clear();
	}
	
//DROPDOWN
	public static void dropDown(WebElement element, String type ,String value) {
		Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			} else if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byVisibletext")) {
				s.selectByVisibleText(value);
			} else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//CLOSE
	public static void close() {
		driver.close();
	}
	
//QUIT	
	public static void quit() {
		driver.quit();
	}

//NAVIGATE TO
	public static void navigateTo(String link) {
        driver.navigate().to(link);
	}
	
//NAVIGATE BACK
	public static void navigateBack() {
		driver.navigate().back();
	}
	
//NAVIGATE FORWARD
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
//NAVIGATE REFRESH
	public static void navigateRefresh() {
        driver.navigate().refresh();
	}
//GET
	public static void getValue(String link) {
		driver.get(link);
	}
	
//ALERT
	public static void alert(WebElement element, String type, String value ,String key)  {
		try {
			if (type.equalsIgnoreCase("simple")) {
				element.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (type.equalsIgnoreCase("confirm")) {
				element.click();
				Thread.sleep(2000);
				if (value=="ok") {
					driver.switchTo().alert().accept();
				} else {
			         driver.switchTo().alert().dismiss();
				}
			} else if (type.equalsIgnoreCase("prompt")) {
				element.click();
				Thread.sleep(2000);
				driver.switchTo().alert().sendKeys(key);
				Thread.sleep(2000);
				if (value=="ok") {
					driver.switchTo().alert().accept();
				} else {
			         driver.switchTo().alert().dismiss();
				}
			} else {
				System.out.println("Invalid");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

//ENABLE
	
	public static void enabled(WebElement element) {
		element.isEnabled();
	}

//DISPLAYED
	
	public static void displayed(WebElement element) {
		element.isDisplayed();
	}

//SELECTED
	
	public static void selected(WebElement element) {
		element.isSelected();
	}
//GET TITLE
	public static void gettitle() {
	driver.getTitle();	
	}
	
//GET CURRENT URL
	public static void getCurrenturl() {
		driver.getCurrentUrl();
	}
	
//GET TEXT
	
	public static void gettext(WebElement element) {
	element.getText();	
	}
	
//GET ATTRIBUTE
	
	public static void getattribute(WebElement element,String value) {
	element.getAttribute(value);
	}
	
//METHODS USING SELECT CLASS
	
//IS MULTIPLE
	
	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
	    boolean multiple = s.isMultiple();
	    if (s.isMultiple()) {
			System.out.println("TRUE");
		} else {
            System.out.println("FALSE");
		}
	}
	
//GET FIRST SELECTED OPTIONS
	
	public static void getfirst(WebElement element) {
		Select s = new Select(element);
         WebElement firstSelectedOption = s.getFirstSelectedOption();
         System.out.println(firstSelectedOption);
	}
	
//GET ALL SELECTED OPTIONS
	
	public static void getall(WebElement element) {
       Select s = new Select(element);
       List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
       for (WebElement all : allSelectedOptions) {
		System.out.println(all.getText());
	}
	}
	
//GET OPTIONS
	
	public static void getoptions(WebElement element) {
		Select s = new Select(element);
        List<WebElement> options = s.getOptions();
        for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
	}
//ACTION
	
	public static void actions(WebElement element, String method) {
           Actions ac = new Actions(driver);
           try {
			if (method.equalsIgnoreCase("context click")) {
				ac.contextClick(element).build().perform();
				Thread.sleep(2000);
			} else if (method.equalsIgnoreCase("double click")) {
			   ac.doubleClick(element).build().perform();
			   Thread.sleep(2000);
			} else if (method.equalsIgnoreCase("click")) {
				ac.click(element).build().perform();
				Thread.sleep(2000);
			} else if (method.equalsIgnoreCase("move to element")) {
				ac.moveToElement(element).build().perform();
			} else {
				System.out.println("invalid");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
           
	}
	
//ACTION-DRAG AND DROP	
	public static void draganddrop(WebElement source,WebElement dest) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, dest).build().perform();
	}
	
//ROBOT
	public static void robot(String event,int keyEvent) throws AWTException {
		Robot r = new Robot();
    if (event.equalsIgnoreCase("press")) {
		r.keyPress(keyEvent);
	}else if (event.equalsIgnoreCase("release")) {
		r.keyRelease(keyEvent);
		
	}else {
		System.out.println("invalid");
	}
	}
	
//CHECK BOX
	
	public static void checkbox(WebElement element) {
		element.click();
	}
	
//TAKE SCREENSHOTS
	
	public static void screenshots(String destpath) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
         File dest=new File(destpath);
         FileUtils.copyFile(src, dest);
         
	}

//SCROLL UP AND DOWN
	
	
	public static void scroll(WebElement start , WebElement end , String x , String y) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", start);
		js.executeScript("arguments[0].scrollIntoView();", end);
		Thread.sleep(2000);
		js.executeScript(x);
		Thread.sleep(2000);
		js.executeScript(y);

	}

}
