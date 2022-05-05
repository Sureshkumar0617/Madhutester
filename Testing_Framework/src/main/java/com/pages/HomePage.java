package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	private WebDriver driver;

	private By HomeSections = By.cssSelector("div#mainMenu b");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public int getHomeSectionCount() {
		return driver.findElements(HomeSections).size();
	}

	public List<String> getHomeSectionsList() {

		List<String> HomeList = new ArrayList<>();
		List<WebElement> HomeHeaderList = driver.findElements(HomeSections);

		for (WebElement e : HomeHeaderList) {
			String text = e.getText();
			System.out.println(text);
			HomeList.add(text);
		}

		return HomeList;

	} 

}
