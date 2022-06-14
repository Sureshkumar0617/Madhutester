package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotelpage {

	
	
	private WebDriver driver;

	private By Location = By.id("location");
	private By Hotels = By.id("hotels");
	private By Roomtype = By.id("room_type");
	private By Norooms = By.id("room_nos");
	private By Checkindate = By.id("datepick_in");
	private By CheckOutdate = By.id("datepick_out");
	private By Adultno = By.id("adult_room");
	private By Childrenperno = By.id("child_room");
	private By Search = By.id("Submit");
	private By Select = By.id("radiobutton_0");
	private By cont = By.id("continue");
	

public SearchHotelpage(WebDriver driver) {
	
	this.driver = driver;
	
	
	
}
	

public String getsearchhotel() {
	return driver.getTitle();

}



public void fillContactUsForm(String lction, String Hotel, String RoomTyp, String NoofRooms, String CheckIndate,
		String CheckOutDate, String Aultsperroom, String Childrenperroom) {
	
	driver.findElement(Location).sendKeys(lction);
	driver.findElement(Hotels).sendKeys(Hotel);
	driver.findElement(Roomtype).sendKeys(RoomTyp);
	driver.findElement(Norooms).sendKeys(NoofRooms);
	driver.findElement(Checkindate).sendKeys(CheckIndate);
	driver.findElement(CheckOutdate).sendKeys(CheckOutDate);
	driver.findElement(Adultno).sendKeys(Aultsperroom);
	driver.findElement(Childrenperno).sendKeys(Childrenperroom);
}
        public void clickOnSearch(){
	    driver.findElement(Search).click();
}
        public void clickonsearch() {
    		driver.findElement(Select).click();
    	}
    	
    	public void clickoncontinue() {
    		driver.findElement(cont).click();
    	}
}
