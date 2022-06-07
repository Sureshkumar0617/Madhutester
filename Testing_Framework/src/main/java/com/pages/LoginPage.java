package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage{
	
	
public WebDriver driver;

	
	// 1. By Locators: OR
	private By Username = By.id("txtUsername");
	private By Password = By.id("txtPassword");
	private By LOGIN = By.id("btnLogin");

	
	

	// 2. Constructor of the page class:
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}


	// 3. page actions: features(behavior) of the page the form of methods:

	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
		

	}

	

	public void enterUserName(String username) throws IOException {
		driver.findElement(Username).sendKeys(username);
	
	}


	

	public void enterPassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
		  
	}
		
		
	public void clickOnLogin()  {
		driver.findElement(LOGIN).click();
	}
	
	public
	HomePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(Username).sendKeys(un);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(LOGIN).click();
		return new HomePage(driver);
	}
}








