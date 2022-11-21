package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class DashBoardPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Services']") WebElement dashboardServicesLink;
	@FindBy(xpath="//a[@title='IRP']") WebElement dashboardIRPLink;
	@FindBy(xpath="//div[@class='PageHeader row']") WebElement dashboardHeader;
	@FindBy(xpath="//div[@class='PageHeader row']//li[contains(@class,'breadcrumb-item')]") WebElement dashboardSecondRow;
	@FindBy(xpath="//div[@class='PageHeader row']//li[contains(@class,'breadcrumb-item')]/strong") WebElement dashboardIRPHeader;
	//Links
	@FindBy(xpath="//a[@title='Renew Fleet']") WebElement dashboardRenewFleetLink;
	@FindBy(xpath="//a[@title='Fleet Inquiry']") WebElement dashboardFleetEnquiry;
	@FindBy(xpath="//a[@title='Supplement Continuance']") WebElement dashboardSupplementContinuancelnk;
	@FindBy(xpath="//a[@title='Vehicle Inquiry']") WebElement dashboardVehicleEnquiry;
	@FindBy(xpath="//a[@title='Vehicle Supplement Inquiry']") WebElement dashboardVehicleSupplementEnquiry;
	@FindBy(xpath="//a[@title='Supplement Inquiry']") WebElement dashboardSupplementEnquiry;
	@FindBy(xpath="//a[@title='Account Inquiry']") WebElement dashboardAccountEnquiry;
	@FindBy(xpath="//a[@title='Supplement Documents']") WebElement dashboardSupplementDocuments;
@FindBy(xpath="//a[@title='Logout']") WebElement dashboardLogout;	
	// Elements for SiteMappage

		@FindBy(xpath="//a[text()='Add Vehicle']") WebElement siteMapAddVehicle;
		@FindBy(xpath="//input[@id='accountNo']") WebElement accountNo;
		@FindBy(id="FleetNbr") WebElement vehicleFleetNo;
		@FindBy(id="FltExpYear") WebElement vehicleExpYr;
		@FindBy(id="btnProceed") WebElement vehicleProceed;
		
		//After Successfully added into cart
@FindBy(xpath="//ul[@class='errorMessage']//span") WebElement dashboardMessage;


@FindBy(xpath="//ul[contains(@class,'errorMessage')]/li/span") WebElement dashboardErrorMsg;
@FindBy(xpath="//a[@id='cartRef']") WebElement cartImg;


//Reinstatement
@FindBy(xpath="//li[@class='dropdown']/a[contains(text(),'More')]") WebElement dashboardFleetMore;
@FindBy(xpath="//a[text()='Fleet Reinstatement']") WebElement dashoboadMoreFleetReinstatement;


public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickServiceLink() throws InterruptedException {
		ElementUtil.clickElementUsingActions(dashboardServicesLink);
		//ElementUtil.sleepTime(2000);
	}
	public void clickIRPLink() throws InterruptedException {
		ElementUtil.clickElementUsingActions(dashboardIRPLink);
		//ElementUtil.sleepTime(2000);
	}

	public void validateIRPScreen(String title) throws InterruptedException {
		ElementUtil.highlightElement(driver, dashboardIRPHeader);
		if(dashboardIRPHeader.getText().equalsIgnoreCase(title)) {
			assert true;
		}
		else {
			assert false;
		}
		//ElementUtil.sleepTime(2000);
	}


	public void clickRenewFleetLink() throws InterruptedException {
		ElementUtil.clickElementUsingActions(dashboardRenewFleetLink);
		//ElementUtil.sleepTime(2000);
	}
public void validateMessage(CharSequence successMessageValue) {
	
	if(dashboardMessage.getText().contains(successMessageValue)) { //Transaction is added to cart - 4113 successfully.
		assert true;
	}
	else {
		assert false;
	}
	
}
public void clickSupplementContinuance() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardSupplementContinuancelnk);
	//ElementUtil.sleepTime(2000);
}
public void clickFleetEnquiry() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardFleetEnquiry);
	//ElementUtil.sleepTime(2000);
}
public void clickVehicleEnquiry() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardVehicleEnquiry);
	//ElementUtil.sleepTime(2000);
}
public void clickVehicleSupplementEnquiry() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardVehicleSupplementEnquiry);
	//ElementUtil.sleepTime(2000);
}
public void clickSupplementEnquiry() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardSupplementEnquiry);
	//ElementUtil.sleepTime(2000);
}
public void clickAccountEnquiry() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardAccountEnquiry);
	//ElementUtil.sleepTime(2000);
}
public void clickSupplementDocuments() throws InterruptedException {
	ElementUtil.clickElementUsingActions(dashboardSupplementDocuments);
	//ElementUtil.sleepTime(2000);
}


public void enterAccountNo(String accountNoValue) {
	ElementUtil.webEditTxt(accountNo, accountNoValue);
}
public void validateErrorMessage(String errorMessgeValue) {
	if(dashboardErrorMsg.getText().contains(errorMessgeValue)) {
		assert true;
	}
	else {
		assert false;
	}
	
}
public void clickCartImg() {
	ElementUtil.clickElement(cartImg);
}
//Reinstatement
public void clickFleetMore() throws InterruptedException {
	ElementUtil.clickElement(dashboardFleetMore);
	//ElementUtil.sleepTime(2000);
}
public void clickFleetReinstatement() {
	ElementUtil.clickElement(dashoboadMoreFleetReinstatement);
}
public void clickLogout() {
	ElementUtil.clickElement(dashboardLogout);
}
}
