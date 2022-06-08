package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsjsonPage {

	private WebDriver driver;
	

	private By subjectHeading = By.id("id_contact");
	private By email = By.id("email");
	private By orderRef = By.id("id_order");
	private By messageText = By.id("message");
	private By sendButton = By.id("submitMessage");

	public ContactUsjsonPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactUsjsonPageTitle() {
		return driver.getTitle();
	}
	   public void clickonsubjectheading(String heading) {
		   
		   Select select = new Select(driver.findElement(subjectHeading));
			select.selectByVisibleText(heading);
		  
	   }
		   
		   public void clickonemailaddress(String emailId) {
			   driver.findElement(email).sendKeys(emailId);
			   }
			   
			   public void clickonorderRef(String orderReference) {
				   driver.findElement(orderRef).sendKeys(orderReference);
			   }
			   
			   public void clickonmessageText(String message) {
				   driver.findElement(messageText).sendKeys(message);
			   }
	
				   public void clickonsendButton() {
					   driver.findElement(sendButton).click();
		
	
	
}

}