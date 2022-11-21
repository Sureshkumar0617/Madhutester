package com.celtic.automation.cmcs.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;


public class AccountTabPage {
	public WebDriver driver;
	public AccountTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='AccountBtn']") WebElement accountActMainTab;

	@FindBy(css = "#contentMsg > div > ul") WebElement accountVerificationMessage;
	//Customer Details section
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement accountCustomerDetailsSubhdr;
	@FindBy(xpath="//span[text()='Account No.']") WebElement accountAccountNbrLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement accountAccountNbrTxt;
	
	@FindBy(xpath="//label[@for='MCECustomerID']") WebElement accountMCECustomerIDLbl;
	@FindBy(xpath="//input[@id='MCECustomerID']") WebElement accountMCECustomerIDTxt;
	
	@FindBy(xpath="//label[@for='RegistrantType']") WebElement accountRegistrantTypeLbl;
	@FindBy(xpath="//input[@id='RegistrantType']") WebElement accountRegistrantTypeTxt;
	
	@FindBy(xpath="//label[@for='CarrierType']") WebElement accountCarrierTypeLbl;
	@FindBy(xpath="//input[@id='CarrierType']") WebElement accountCarrierTypeTxt;
	
	@FindBy(xpath="//label[@for='IFTAAccountNo']") WebElement accountIFTAAccountNoLbl;
	@FindBy(xpath="//input[@id='IFTAAccountNo']") WebElement accountIFTAAccountNoTxt;
	
	@FindBy(xpath="//label[@for='ClientStatus']") WebElement accountCustomerStatusLbl;
	@FindBy(xpath="//input[@id='ClientStatus']") WebElement accountCustomerStatusTxt;
	
	//Address Details Section
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement accountAddressDetailsSubhdr;
	@FindBy(xpath="//li[@aria-controls='tabs-1']") WebElement accountTab1;
	
	@FindBy(xpath="//label[@for='Addressess_0__AddrLine1']") WebElement accountStreet0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__AddrLine1']") WebElement accountStreet0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Zip']") WebElement accountZip0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__Zip']") WebElement accountZip0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Jur']") WebElement accountJur0Lbl;
	@FindBy(xpath="//select[@id='Addressess_0__Jur']") WebElement accountJur0dd;
	
	@FindBy(xpath="//label[@for='Addressess_0__City']") WebElement accountCity0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__City']") WebElement accountCity0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__County']") WebElement accountCounty0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__County']") WebElement accountCounty0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Country']") WebElement accountCountry0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__Country']") WebElement accountCountry0Txt;
	
	
	@FindBy(xpath="//li[@aria-controls='tabs-2']") WebElement accountTab2;
	@FindBy(xpath="//label[@for='Addressess_1__AddrLine1']") WebElement accountStreet1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__AddrLine1']") WebElement accountStreet1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Zip']") WebElement accountZip1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__Zip']") WebElement accountZip1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Jur']") WebElement accountJur1Lbl;
	@FindBy(xpath="//select[@id='Addressess_1__Jur']") WebElement accountJur1dd;
	
	@FindBy(xpath="//label[@for='Addressess_1__City']") WebElement accountCity1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__City']") WebElement accountCity1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__County']") WebElement accountCounty1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__County']") WebElement accountCounty1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Country']") WebElement accountCountryLbl;
	@FindBy(xpath="//input[@id='Addressess_1__Country']") WebElement accountCountry1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__AttnTo']") WebElement accountAttentionToLbl;
	@FindBy(xpath="//input[@id='Addressess_1__AttnTo']") WebElement accountAttentionToTxt;
	
	//Business Customer Details Section
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement accountBusinesscustomerDetailsSubhdr;
	
	@FindBy(xpath="//label[@for='USDOTNo']") WebElement accountUSDOTNoLbl;
	@FindBy(xpath="//input[@id='USDOTNo']") WebElement accountUSDOTNoTxt;
	
	@FindBy(xpath="//label[@for='TIN']") WebElement accountTPIDLbl;
	@FindBy(xpath="//input[@id='TIN']") WebElement accountTPIDTxt;
	
	@FindBy(xpath="//label[@for='ConatactName']") WebElement accountContactNameLbl;
	@FindBy(xpath="//input[@id='ConatactName']") WebElement accountContactNameTxt;
	
	@FindBy(xpath="//label[@for='EmailAddress']") WebElement accountEmailLbl;
	@FindBy(xpath="//input[@id='EmailAddress']") WebElement accountEmailTxt;
	
	@FindBy(xpath="//label[@for='PrimaryPhone']") WebElement accountPrimaryPhoneLbl;
	@FindBy(xpath="//input[@id='PrimaryPhone']") WebElement accountPrimaryPhoneTxt;
	
	@FindBy(xpath="//label[@for='AlternatePhone']") WebElement accountAlternatePhoneLbl;
	@FindBy(xpath="//input[@id='AlternatePhone']") WebElement accountAlternatePhoneTxt;
	
	@FindBy(xpath="//label[@for='FaxNo']") WebElement accountFaxNoLbl;
	@FindBy(xpath="//input[@id='FaxNo']") WebElement accountFaxNoTxt;
	
	//Account Details
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[4]") WebElement accountAccountDetailsSubhdr;
	@FindBy(xpath="//label[@for='EmailNotification']") WebElement accountEmailNotificationLbl; //text
	@FindBy(xpath="//input[@id='EmailNotification']") WebElement accountEmailNotification; //checked
	@FindBy(xpath="//label[@for='FaxNotification']") WebElement accountFaxNotificationLbl;
	@FindBy(xpath="//input[@id='FaxNotification']") WebElement accountFaxNotification; //checked

			
	public void validateAccountstabPresence() {
		ElementUtil.isPresentAndDisplayed(accountActMainTab);
		ElementUtil.highlightElement(driver, accountActMainTab);
	}
		
	public void checkEmailNotification() {
		ElementUtil.webCheckON(accountEmailNotification);
	}

	public void checkFaxNotification() {
		ElementUtil.webCheckON(accountFaxNotification);
	}

//Fetch Details
public String fetchMCECustomernolbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountMCECustomerIDLbl);
}

public String fetchMCECustomerno() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountMCECustomerIDTxt,"value");
}

public String fetchRegistrationTypelbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountRegistrantTypeLbl);
}

public String fetchRegistrationType() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountRegistrantTypeTxt,"value");
}

public String fetchAccountCarrierTypeLbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCarrierTypeLbl);
}

public String fetchAccountCarrierType() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCarrierTypeTxt,"value");
}
public String fetchIFTAAccountNbrlbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountIFTAAccountNoLbl);
}

public String fetchIFTAAccountNbr() {
	return ElementUtil.FetchTextBoxValuewithattributedisabled(accountIFTAAccountNoTxt,"value");
}

public String fetchAccountCustomerStatusLbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCustomerStatusLbl);
}

public String fetchAccountCustomerStatus() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCustomerStatusTxt,"value");
}
public String fetchAccountsTab1() {
	return ElementUtil.FetchTextBoxValuewithText(accountTab1);
}

public String fetchAccountStreet0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountStreet0Lbl);
}

public String fetchAccountStreet0() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountStreet0Txt,"value");
}

public String fetchAccountZip0lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountZip0Lbl);
}

public String fetchAccountZip0() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountZip0Txt,"value");
}

public String fetchAccountJur0lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountJur0Lbl);
}

public String fetchAccountJur0() {
	return ElementUtil.FetchDropdownSelectedValue(accountJur0dd);
}
public String fetchAccountCity0lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCity0Lbl);
}

public String fetchAccountCity0() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCity0Txt,"value");
}

public String fetchAccountCounty0lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCounty0Lbl);
}

public String fetchAccountCounty0() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCounty0Txt,"value");
}

public String fetchAccountCountry0lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCountry0Lbl);
}

public String fetchAccountCountry0() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCountry0Txt,"value");
}

public void clickMailingAddress() {
	ElementUtil.clickElement(accountTab2);
}
public String fetchAccountsTab2() {
	return ElementUtil.FetchTextBoxValuewithText(accountTab2);
}
public String fetchAccountStreet1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountStreet1Lbl);
}

public String fetchAccountStreet1() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountStreet1Txt,"value");
}

public String fetchAccountZip1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountZip1Lbl);
}

public String fetchAccountZip1() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountZip1Txt,"value");
}

public String fetchAccountJur1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountJur1Lbl);
}

public String fetchAccountJur1() {
	return ElementUtil.FetchDropdownSelectedValue(accountJur1dd);
}
public String fetchAccountCity1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCity1Lbl);
}

public String fetchAccountCity1() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCity1Txt,"value");
}

public String fetchAccountCounty1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCounty1Lbl);
}

public String fetchAccountCounty1() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCounty1Txt,"value");
}

public String fetchAccountCountry1lbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountCountryLbl);
}

public String fetchAccountCountry1() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountCountry1Txt,"value");
}

public String fetchAccountAttentionTolbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountAttentionToLbl);
}

public String fetchAccountAttentionTo() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountAttentionToTxt,"value");
}

public String fetchAccountUSDOTNolbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountUSDOTNoLbl);
}

public String fetchAccountUSDOTNo() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountUSDOTNoTxt,"value");
}

public String fetchAccountTPIDlbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountTPIDLbl);
}
public String fetchAccountTPID() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountTPIDTxt,"value");
}

public String fetchAccountContactnamelbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountContactNameLbl);
}

public String fetchAccountContactname() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountContactNameTxt,"value");
}

public String fetchAccountEmaillbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountEmailLbl);
}

public String fetchAccountEmail() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountEmailTxt,"value");
}

public String fetchAccountPrimaryPhonelbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountPrimaryPhoneLbl);
}

public String fetchAccountPrimaryPhone() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountPrimaryPhoneTxt,"value");
}


public String fetchAccountAlternatePhonelbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountAlternatePhoneLbl);
}

public String fetchAccountAlternatePhone() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountAlternatePhoneTxt,"value");
}
public String fetchAccountFaxNolbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountFaxNoLbl);
}

public String fetchAccountFaxNo() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountFaxNoTxt,"value");
}
public String fetchAccountEmailnotificationlbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountEmailNotificationLbl);
}

public String fetchAccountEmailnotification() {
	return ElementUtil.FetchTextBoxValuewithattribute(accountEmailNotification,"checked");
}
public String fetchAccountFaxnotificationlbl() {
	return ElementUtil.FetchTextBoxValuewithText(accountFaxNotificationLbl);
}

public String fetchAccountFaxnotification() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(accountFaxNotification,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}


//Validate messages

public String validateMessage() {
	ElementUtil.highlightElement(driver, accountVerificationMessage);
	return ElementUtil.FetchTextBoxValuewithText(accountVerificationMessage);
}




























































}

