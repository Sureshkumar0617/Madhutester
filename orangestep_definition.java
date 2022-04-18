package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.org.Orangebase_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangestep_definition extends Orangebase_Class {
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() {
		browserLaunch("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}

	@When("^user Enter the Username in Usnername field$")
	public void user_Enter_the_Username_in_Usnername_field() {
	    
		WebElement userid = driver.findElement(By.id("txtUsername"));
	    userid.sendKeys("Admin");
	
	}

	@When("^user Enter the Password in Password field$")
	public void user_Enter_the_Password_in_Password_field() {
	    
		WebElement password = driver.findElement(By.id("txtPassword"));
	     password.sendKeys("admin123");
	
	}

	@Then("^user Click On the Login button and it Navigates to login$")
	public void user_Click_On_the_Login_button_and_it_Navigates_to_login() throws InterruptedException {
	    
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
         
	}
         @Then("^user update the attendace in Time tab$")
         public void user_update_the_attendace_in_Time_tab() {
         
        	 WebElement Timetab = driver.findElement(By.id("menu_time_viewTimeModule"));
             Timetab.click();
        	 
       }

         @Then("^user update today's attendance$")
         public void user_update_today_s_attendance() throws InterruptedException {
        	 
        	 Thread.sleep(2000);
        	 WebElement attendance = driver.findElement(By.id("menu_attendance_Attendance"));
             Actions ac = new Actions(driver);
             
             ac.moveToElement(attendance).build().perform();
                        
             attendance.click();

        	 
      }
         @Then("^user click on puchin button$")
         public void user_click_on_puchin_button() throws InterruptedException, AWTException {
        	 
        	 Thread.sleep(2000);
        	 
        	 WebElement puchin = driver.findElement(By.id("menu_attendance_punchIn"));
        	 puchin.click();
        	 
        	 Thread.sleep(2000);
        	 WebElement date = driver.findElement(By.id("attendance_date"));
        	 date.clear();
        	 
        	 date.sendKeys("2022-04-18");
        	 
        	 Thread.sleep(2000);
        	 
        	 WebElement time = driver.findElement(By.id("attendance_time"));
        	 time.clear();
        	 time.sendKeys("16:00");
        	 
        	 Thread.sleep(2000);
        	 WebElement In = driver.findElement(By.id("btnPunch"));
             In.click(); 
         
         }

         @Then("^user puchout today's attendance$")
         public void user_puchout_today_s_attendance() throws InterruptedException {
        	
        	 
        	 WebElement punchouttime = driver.findElement(By.xpath("//input[@id='attendance_time'][1]"));
        	 punchouttime.clear();
        	 punchouttime.sendKeys("18:00");
        	 
        	 Thread.sleep(2000);
        	 
        	 WebElement punchout = driver.findElement(By.className("punchOutbutton"));
        	 punchout.click();
        	 
         }

         @Then("^user click on logout button$")
         public void user_click_on_logout_button() throws Exception {
        	 
        	 WebElement Profilelogout = driver.findElement(By.id("welcome"));
             Profilelogout.click();
        	 Thread.sleep(2000);
        	WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
            logout.click();
         
         }

   
         
}


	
	

	