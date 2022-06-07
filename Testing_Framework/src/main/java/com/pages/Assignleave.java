package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignleave {
	
	
	
private WebDriver driver;

	
	private By Assignleavetab = By.id("menu_leave_assignLeave");
	private By employeename = By.id("assignleave_txtEmployee_empName");
	private By Leavetype = By.id("assignleave_txtLeaveType");
	private By fromdate = By.id("assignleave_txtFromDate");
	private By todate = By.id("assignleave_txtToDate");
	private By comment = By.id("assignleave_txtComment");
	private By assignbutton = By.id("assignBtn");
	
	


	
	
	
	


	public Assignleave(WebDriver driver) {
		this.driver = driver;
	}

	

   public void clickonassignleavetab() {
	   driver.findElement(Assignleavetab).click();
	   
   }
	
	
	public void enterEmployeename(String Employeename) {
		driver.findElement(employeename).sendKeys("Orange Test");
	}
	
	public void clickonleavetype() {
		driver.findElement(Leavetype).click();
		
		WebElement Leavetype = driver.findElement(By.id("assignleave_txtLeaveType"));
		   Select s3 = new Select(Leavetype);
		   s3.selectByValue("9");
		   
		
		
		
	}
	
	public void enterFromdate(String Fromdate) {
		driver.findElement(fromdate).sendKeys("2022-05-31");
	}
	
	public void entertodate(String Todate) {
		driver.findElement(todate).sendKeys("2022-05-31");
	}

	
	public void enterComment(String Comment) {
		driver.findElement(comment).sendKeys("sickleave");
	}
	
	public void clickonassignleave () {
    	driver.findElement(assignbutton).click();
    }



}
