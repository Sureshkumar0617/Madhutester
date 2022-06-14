package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPaymentpage {
	
	
	private WebDriver driver;

	
	private By fname = By.id("first_name");
	private By lname = By.id("last_name");
	private By Billaddrs = By.id("address");
	private By credcarno = By.id("cc_num");
	private By crecartyp = By.id("cc_type");
	private By exmonth = By.id("cc_exp_month");
	private By exyr = By.id("cc_exp_year");
	private By cvno = By.id("cc_cvv");
	private By Bookbutton = By.id("book_now");
	private By logout = By.xpath("//*[text()='Logout']");
	
	public SearchPaymentpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void enterfirstname(String Aadhitya) {
		driver.findElement(fname).sendKeys("Aadhitya");
		
	}
	
	public void enterlastname(String rajan)  {
		driver.findElement(lname).sendKeys("rajan");
	}
	
	public void enterbillingaddress(String No4Chennai)   {
		driver.findElement(Billaddrs).sendKeys("No4Chennai");
	}
	
	
	public void entercreditcardnumber(String string)  {
		driver.findElement(credcarno).sendKeys("5754788954621325");
	}
	
	public void enterctreditcardtype(String VISA)  {
		driver.findElement(crecartyp).sendKeys("VISA");
		
	}
	
	
	public void enterexpirydatemonth(String June)  {
		driver.findElement(exmonth).sendKeys("June");
		
	}
	
	public void enterexpirydateyear(String string)  {
		driver.findElement(exyr).sendKeys("2023");
		 
	}
	
	public void entercvvnumber(String string)   {
		driver.findElement(cvno).sendKeys("256");
		
	}
	
    public void clickbutton()  {
    	driver.findElement(Bookbutton).click();
    }
    
    public void clickonlogout() {
    	driver.findElement(logout).click();
    }

}
