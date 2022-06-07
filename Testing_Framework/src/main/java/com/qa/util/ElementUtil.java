package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	public void clickElement(By obj, String objName) {
		try {
			//waitForElement(obj, objName);
			getWebElement(obj, objName).click();
			//log(LogType.INFO, "click on element " + objName);
		} catch (Exception e) {
			//log(LogType.ERROR, "Exception while clicking element: " + objName + " Exception: " + e.getMessage());
		}
	}
	public WebElement getWebElement(By streetname, String objName)
	 {
		// TODO Auto-generated method stub
		return null;
	}
	public void waitForElement(By streetname, String objName) 
	{
		// TODO Auto-generated method stub
		
	}
	public void cliclElementManyTimes(By obj, String objName,int productCount) {
		try {
			for(int i=1;i<productCount;i++) {
				waitForElement(obj, objName);
				getWebElement(obj, objName).click();
				//log(LogType.INFO, "click on element " + objName);
			}
		} catch (Exception e) {
			//log(LogType.ERROR, "Exception while clicking element: " + objName + " Exception: " + e.getMessage());
		}
			}

}







