package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	public WebDriver driver;

	// 1. By Locators: OR
		private By Userid = By.id("username");
		private By Passcode = By.id("password");
		private By Loginbutton = By.id("login");

		
		

		// 2. Constructor of the page class:
		
		public Loginpage(WebDriver driver) {
			
			this.driver = driver;
			
			
		}


		// 3. page actions: features(behavior) of the page the form of methods:

		
		public String getLoginPageTitle() {
			
			return driver.getTitle();
			

		}

		

		public void enterUserName(String userid) throws IOException {
			driver.findElement(Userid).sendKeys(userid);
		
		}


		

		public void enterPassword(String pswd) {
			driver.findElement(Passcode).sendKeys(pswd);
			  
		}
			
			
		public void clickOnLogin()  {
			driver.findElement(Loginbutton).click();
		}

		public
		SearchHotelpage doLogin(String un, String pwd) {
			System.out.println("login with: " + un + " and " + pwd);
			driver.findElement(Userid).sendKeys(un);
			driver.findElement(Passcode).sendKeys(pwd);
			driver.findElement(Loginbutton).click();
			return new SearchHotelpage(driver);
			
			
		}
		
}
