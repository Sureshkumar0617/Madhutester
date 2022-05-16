package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddcandidatePage {

	
	
private WebDriver driver;

	
	private By firstname = By.id("addCandidate_firstName");
	private By lastname = By.id("addCandidate_lastName");
	private By email = By.id("addCandidate_email");
	private By savebutton = By.id("btnSave");
	
	


	public AddcandidatePage(WebDriver driver2) {
        this.driver=driver2;
        		}

	public void Addcandidate(WebDriver driver) {
		this.driver = driver;
	}

	public String getaddcandiatePageTitle() {
		return driver.getTitle();
		
	}


	public void fillContactUsForm(String frstname, String lstname, String emailid) {
		driver.findElement(firstname).sendKeys("FirstName");
		driver.findElement(lastname).sendKeys("LastName");
    	driver.findElement(email).sendKeys("Emailid");

		
		
		
	}

	
    public void clickonSavebutton() {
    	driver.findElement(savebutton).click();
    }

}
