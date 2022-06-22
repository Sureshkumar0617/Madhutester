package com.amazon.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage_WindowHandling {
	
	public static void main(String[] args) throws AWTException {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Amazon_Framework_Main\\Driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();


          driver.get("https://www.amazon.in/");

          driver.manage().window().maximize();
	
          WebElement sigin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
      	sigin.click();
      	
      	WebElement username = driver.findElement(By.id("ap_email"));
      	username.sendKeys("9445758113");
      	
      	WebElement cont = driver.findElement(By.id("continue"));
      	cont.click();
      	
      	WebElement password = driver.findElement(By.id("ap_password"));
      	password.sendKeys("Suchi@0617");
      	
      	WebElement siginbutton = driver.findElement(By.id("signInSubmit"));
      	siginbutton.click();
      	
	
          
          WebElement fresh = driver.findElement(By.xpath("//a[text()='Fresh']"));
            Actions ac = new Actions(driver);
            ac.contextClick(fresh).build().perform();
 
 
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
 
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         
         
         
         WebElement amazonpay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
         ac.contextClick(amazonpay).build().perform();


        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        
        
        

        WebElement BestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers12']"));
        ac.contextClick(BestSellers).build().perform();


       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);

       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);


        
        
}

	}



