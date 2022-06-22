package com.amazon.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	public static void main(String[] args) {
		
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
	}

}
