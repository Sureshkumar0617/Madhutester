package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddingemployeePage {

	private WebDriver driver;

	
	private By SubjectHeading = By.id("menu_recruitment_viewRecruitmentModule");
	private By Candidate = By.id("menu_recruitment_viewCandidates");
	private By addemp = By.id("btnAdd");
	private By firstname = By.id("addCandidate_firstName");
	private By lastname = By.id("addCandidate_lastName");
	private By email = By.id("addCandidate_email");
	private By savebutton = By.id("btnSave");
	
	


	
	public AddingemployeePage(WebDriver driver2) {
		this.driver=driver2;
	}



	public void Addingemployee(WebDriver driver) {
		this.driver = driver;
	}

	

   public void clickonrecruitment() {
	   driver.findElement(SubjectHeading).click();
	   
	   
   }
	
	
	public void clickoncandidate() {
		driver.findElement(Candidate).click();
	}
	
	public void clickonadd() {
		driver.findElement(addemp).click();
	}
	
	public void enterFirstname(String Firstname) {
		driver.findElement(firstname).sendKeys(Firstname);
	}
	
	public void enterLastname(String Lastname) {
		driver.findElement(lastname).sendKeys("Lastname");
	}

    public void enterEmailid (String Emailid) {
    	driver.findElement(email).sendKeys("Emailid");
    }

    public void clickonSavebutton() {
    	driver.findElement(savebutton).click();
    }

}


