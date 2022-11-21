package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class InventoryPage {

	public WebDriver driver;
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#contentMsg > div > ul > li > span") WebElement inventoryValidateMessage;
	
	@FindBy(xpath="//a[@title='Operations']") WebElement dashboardOperation;
	
	@FindBy(xpath="//a[text()='Inventory']") WebElement dashboardInventory;
	
	@FindBy(xpath="//a[text()='Status Inquiry']") WebElement inventoryStatusInventory;
	
	@FindBy(xpath="//select[@class='cancel valid']") WebElement inventoryType;
	
	@FindBy(xpath="//select[@id='SelectedInventoryType']") WebElement inventoryNewInType;
	
	@FindBy(id="SelectedInventorySubType") WebElement inventorySubType;
	
@FindBy(xpath="//*[text()='No data available in table']") WebElement inventoryValidateMsg;
	
@FindBy(xpath="//a[text()='New Inventory']") WebElement inventoryNewInventory;
	
	@FindBy(id="FromNo") WebElement invemtoryFromNo;
	
	@FindBy(id="NoOfIneventoriesToOrder") WebElement inventoryQuantity;
	
	@FindBy(id="ProdExpYYYY") WebElement inventoryYear;
	
	@FindBy(xpath="//div[contains(@class,'alert-info')]") WebElement inventoryAddedMsg;
	
	@FindBy(xpath="//a[@title='Assign Inventory']") WebElement inventoryAssignInventorylnk;
	
public void clickOperation() {
	ElementUtil.clickElement(dashboardOperation);
}
public void clickAssignInventory() {
	ElementUtil.waitUntilElementClickable(inventoryAssignInventorylnk);
	ElementUtil.clickElement(inventoryAssignInventorylnk);
}
public void clickOnInventory() {
	ElementUtil.clickElement(dashboardInventory);
}
public void clickOnInventoryStatus() {
	ElementUtil.clickElement(inventoryStatusInventory);
}
public void selectInventoryType(String selectValue) {
	ElementUtil.selectFromDropdownByValue(inventoryType, selectValue);
}
public void selectInventorySubType(String selectValue) {
ElementUtil.selectFromDropdownByValue(inventorySubType, selectValue);
}
public void validateInventoryMsg() {
	ElementUtil.highlightElement(driver, inventoryValidateMsg);
}
public void clickNewInventory() {
	ElementUtil.waitUntilElementClickable(inventoryNewInventory);
	ElementUtil.clickElement(inventoryNewInventory);
}
public void selectNewInventoryType(String selectValue) {
	ElementUtil.selectFromDropdownByValue(inventoryNewInType, selectValue);
}
public void selectNewSubInventoryType(String selectValue) {
	ElementUtil.selectFromDropdownByValue(inventorySubType, selectValue);
}
public void enterFromNo(String fromnoValue) {
	ElementUtil.webEditTxtChange(invemtoryFromNo,fromnoValue);
}
public void enterQuantity(String quantityValue) {
	ElementUtil.webEditTxtChange(inventoryQuantity,quantityValue);
}
public void enterYear(String yearValue) {
	ElementUtil.webEditTxtChange(inventoryYear,yearValue);
}
public void validateAddedMsg(String msgValue) {
ElementUtil.highlightElement(driver, inventoryAddedMsg);
if(inventoryAddedMsg.getText().contains(msgValue))
	assert true;
}

public String validateMessage() {
	 ElementUtil.highlightElement(driver, inventoryValidateMessage);
	 return ElementUtil.FetchTextBoxValuewithText(inventoryValidateMessage);
}


}