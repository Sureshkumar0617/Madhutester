package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class FleetTabPage {
	public WebDriver driver;
	public FleetTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Fleet Tab    
	 
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(1) > span") WebElement fleetVerificationMsg1;
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(2) > span") WebElement fleetVerificationMsg2;
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(3) > span") WebElement fleetVerificationMsg3;
	    
	 
		@FindBy(xpath="//a[@id='FleetBtn']") WebElement fleetFltMainTab;

		
		//Fleet Summary
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement fleetFltSummarySubHdr;
		
		@FindBy(xpath="//label[@for='CustomerType']") WebElement fleetRegistrationTypeLbl;
		@FindBy(xpath="//select[@id='CustomerType']") WebElement fleetRegistrationTypedd;
		
		@FindBy(xpath="//label[@for='FltStatus']") WebElement fleetFltStatusLbl;
		@FindBy(xpath="//select[@id='FltStatus']") WebElement fleetFltStatusdd;
		
		@FindBy(xpath="//label[@for='CarrierType']") WebElement fleetCarrierTypeLbl;
		@FindBy(xpath="//input[@id='CarrierType']") WebElement fleetCarrierTypeTxt;
		
		@FindBy(xpath="//label[@for='DBA']") WebElement fleetDBANameLbl;
		@FindBy(xpath="//input[@id='DBA']") WebElement fleetDBANameTxt;
		
		
		//Address Details Section
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement fleetAddressDetailsSubHdr;
		@FindBy(xpath="//input[@id='btnAddrOverride']") WebElement fleetAddressOverrideSubHdr;
		
		@FindBy(xpath="//li[@aria-controls='tabs-1']") WebElement fleetTab1;  //Business Address
		
		@FindBy(xpath="//label[@for='Addressess_0__AddrLine1']") WebElement fleetStreet0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__AddrLine1']") WebElement fleetStreet0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Zip']") WebElement fleetZip0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__Zip']") WebElement fleetZip0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Jur']") WebElement fleetJur0Lbl;
		@FindBy(xpath="//select[@id='Addressess_0__Jur']") WebElement fleetJur0dd;
		

		@FindBy(xpath="//label[@for='Addressess_0__City']") WebElement fleetCity0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__City']") WebElement fleetCity0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__County']") WebElement fleetCounty0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__County']") WebElement fleetCounty0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Country']") WebElement fleetCountry0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__Country']") WebElement fleetCountry0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__IsNonDeliverableAddr']") WebElement fleetNonDeliverable0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__IsNonDeliverableAddr']") WebElement fleetNonDeliverable0Chk;
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-2']") WebElement fleetTab2;  //Mailing Address
		@FindBy(xpath="//label[@for='Addressess_1__AddrLine1']") WebElement fleetStreet1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__AddrLine1']") WebElement fleetStreet1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Zip']") WebElement fleetZip1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__Zip']") WebElement fleetZip1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Jur']") WebElement fleetJur1Lbl;
		@FindBy(xpath="//select[@id='Addressess_1__Jur']") WebElement fleetJur1dd;
		
		@FindBy(xpath="//label[@for='Addressess_1__City']") WebElement fleetCity1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__City']") WebElement fleetCity1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__County']") WebElement fleetCounty1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__County']") WebElement fleetCounty1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Country']") WebElement fleetCountry1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__Country']") WebElement fleetCountry1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__IsNonDeliverableAddr']") WebElement fleetNonDeliverable1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__IsNonDeliverableAddr']") WebElement fleetNonDeliverable1Chk;
		
		@FindBy(xpath="//input[@id='Addressess_1__AttnTo']") WebElement fleetAttentionTO1Txt;
		@FindBy(xpath="//label[@for='Addressess_1__AttnTo']") WebElement fleetAttentionToLbl;
		
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-3']") WebElement fleetTab3;  //Service provider
		@FindBy(xpath="//label[@for='reportingServices_ServiceProviderID']") WebElement fleetServiceProviderLbl;
		@FindBy(xpath="//select[@id='reportingServices_ServiceProviderID']") WebElement fleetServiceProviderdd;
		
		@FindBy(xpath="//label[@for='reportingServices_LegalName']") WebElement fleetLegalNameLbl;
		@FindBy(xpath="//input[@id='reportingServices_LegalName']") WebElement fleetLegalNameTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_DBAName']") WebElement fleetServiceDBANameLbl;
		@FindBy(xpath="//input[@id='reportingServices_DBAName']") WebElement fleetServiceDBANameTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_checkedPwrattoony']") WebElement fleetServicePowerOfAttroneyLbl;
		@FindBy(xpath="//input[@id='reportingServices_checkedPwrattoony']") WebElement fleetServicePowerOfAttroneyChk;
		
		@FindBy(xpath="//label[@for='reportingServices_PowerOfAttEffDate']") WebElement fleetServicePowerOfAttroneyEffDateLbl;
		@FindBy(xpath="//input[@id='reportingServices_PowerOfAttEffDate']") WebElement fleetServicePowerOfAttroneyEffDateTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_PowerOfAttExpDate']") WebElement fleetServicePowerOfAttroneyExpDateLbl;
		@FindBy(xpath="//input[@id='reportingServices_PowerOfAttExpDate']") WebElement fleetServicePowerOfAttroneyExpDateTxt;
		
		
		@FindBy(xpath="//label[@for='reportingServices_EmailID']") WebElement fleetServiceEmailIdLbl;
		@FindBy(xpath="//input[@id='reportingServices_EmailID']") WebElement fleetServiceEmailIdTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_PhoneNo']") WebElement fleetServicePhoneNoLbl;
		@FindBy(xpath="//input[@id='reportingServices_PhoneNo']") WebElement fleetServicePhoneNoTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Fax']") WebElement fleetServiceFaxNoLbl;
		@FindBy(xpath="//input[@id='reportingServices_Fax']") WebElement fleetServiceFaxNoTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Street1']") WebElement fleetServiceStreetLbl;
		@FindBy(xpath="//input[@id='reportingServices_Street1']") WebElement fleetServiceStreetTxt;
		
		
		@FindBy(xpath="//label[@for='reportingServices_City']") WebElement fleetServiceCityLbl;
		@FindBy(xpath="//input[@id='reportingServices_City']") WebElement fleetServiceCityTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Jur']") WebElement fleetService_JurLbl;
		@FindBy(xpath="//input[@id='reportingServices_Jur']") WebElement fleetServiceJurTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_ZipCode']") WebElement fleetServiceZipCodeLbl;
		@FindBy(xpath="//input[@id='reportingServices_ZipCode']") WebElement fleetServiceZipCodeTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Country']") WebElement fleetServiceCountryLbl;
		@FindBy(xpath="//input[@id='reportingServices_Country']") WebElement fleetServiceCountryTxt;
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-4']") WebElement fleetTab4;  //One-Time Mailing Address
		
		@FindBy(xpath="//label[@for='Addressess_2__AddrLine1']") WebElement fleetServiceMailingStreetLbl;
		@FindBy(xpath="//input[@id='Addressess_2__AddrLine1']") WebElement fleetServiceMailingStreetTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Zip']") WebElement fleetServiceMailingZipCodeLbl;
		@FindBy(xpath="//input[@id='Addressess_2__Zip']") WebElement fleetServiceMailingZipCodeTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Jur']") WebElement fleetServiceMailingJurLbl;
		@FindBy(xpath="//select[@id='Addressess_2__Jur']") WebElement fleetServiceMailingJurTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__City']") WebElement fleetServiceMailingCityLbl;
		@FindBy(xpath="//input[@id='Addressess_2__City']") WebElement fleetServiceMailingCityTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__County']") WebElement fleetServiceMailingCountyLbl;
		@FindBy(xpath="//input[@id='Addressess_2__County']") WebElement fleetServiceMailingCountyTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Country']") WebElement fleetServiceMailingCountryLbl;
		@FindBy(xpath="//input[@id='Addressess_2__Country']") WebElement fleetServiceMailingCountrytxt;
		
		@FindBy(xpath="//input[@id='Addressess_2__AttnTo']") WebElement fleetServiceMailingAttentionToTxt;
		@FindBy(xpath="//label[@for='Addressess_2__AttnTo']") WebElement fleetServiceMailingAttentionToLbl;
		
		//Fleet Details
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement fleetfltDetailsSubHdr;
		
		@FindBy(xpath="//label[@for='ContactName']") WebElement fleetDetailsContactNameLbl;
		@FindBy(xpath="//input[@id='ContactName']") WebElement fleetDetailsContactNameTxt;
		
		@FindBy(xpath="//label[@for='Email']") WebElement fleetDetailsEmailIdLbl;
		@FindBy(xpath="//input[@id='Email']") WebElement fleetDetailsEmailIdTxt;
		
		@FindBy(xpath="//label[@for='PhoneNumber']") WebElement fleetDetailsPrimaryCellNbrLbl;
		@FindBy(xpath="//input[@id='PhoneNumber']") WebElement fleetDetailsPrimaryCellNbrTxt;
		
		@FindBy(xpath="//label[@for='FlCellNbr']") WebElement fleetDetailsAlternateCellNbrLbl;
		@FindBy(xpath="//input[@id='FlCellNbr']") WebElement fleetDetailsAlternateCellNbrTxt;
		
		@FindBy(xpath="//label[@for='FaxNo']") WebElement fleetDetailsFaxNoLbl;
		@FindBy(xpath="//input[@id='FaxNo']") WebElement fleetDetailsFaxNoTxt;
		
		@FindBy(xpath="//label[@for='TinNbr']") WebElement fleetDetailsTpIdLbl;
		@FindBy(xpath="//input[@id='TinNbr']") WebElement fleetDetailsTPIdTxt;
		
		@FindBy(xpath="//label[@for='UsdotNbr']") WebElement fleetDetailsUsdotNbrLbl;
		@FindBy(xpath="//input[@id='UsdotNbr']") WebElement fleetDetailsUsdotNbrTxt;
		
		@FindBy(xpath="//label[@for='ChangeVehUsdotTin']") WebElement fleetDetailsChangeVehUsdotTinLbl;
		@FindBy(xpath="//input[@id='ChangeVehUsdotTin']") WebElement fleetDetailsChangeVehUsdotTInChk;
		
		@FindBy(xpath="//label[@for='FltType']") WebElement fleetDetailsFltTypeLbl;
		@FindBy(xpath="//select[@id='FltType']") WebElement fleetDetailsFltTypedd;
		
		@FindBy(xpath="//label[@for='CommodityClass']") WebElement fleetDetailsCommodityClassLbl;
		@FindBy(xpath="//select[@id='CommodityClass']") WebElement fleetDetailsCommodityClassdd;
		
		@FindBy(xpath="//label[@for='FltEffDate']") WebElement fleetDetailsFltEffDateLbl;
		@FindBy(xpath="//input[@id='FltEffDate']") WebElement fleetDetailsFltEffDatedtPicker;
		
		@FindBy(xpath="//label[@for='FltExpDate']") WebElement fleetDetailsFltExpDateLbl;
		@FindBy(xpath="//input[@id='FltExpDate']") WebElement fleetDetailsFltExpDatedtPicker;
		
		@FindBy(xpath="//label[@for='changeAddrOnUsdot']") WebElement fleetDetailsChangeAddrOnUsdotLbl;
		@FindBy(xpath="//input[@id='changeAddrOnUsdot']") WebElement fleetDetailschangeAddrOnUsdotChk;
		
		@FindBy(xpath="//label[@for='FirstOperationDate']") WebElement fleetDetailsFirstOperatedDateLbl;
		@FindBy(xpath="//input[@id='FirstOperationDate']") WebElement fleetDetailsFirstOperatedDatedtPicker;
		
		@FindBy(xpath="//label[@for='WyIntraStF']") WebElement fleetDetailsWyomingIndicatorLbl;
		@FindBy(xpath="//input[@id='WyIntraStF']") WebElement fleetDetailsWyomingIndicatorChk;
		
		@FindBy(xpath="//label[@for='IftaMileageChk']") WebElement fleetDetailsIFTADistanceLbl;
		@FindBy(xpath="//input[@id='IftaMileageChk']") WebElement fleetDetailsIFTADistanceChk;
		
		@FindBy(xpath="//label[@for='MobileIND']") WebElement fleetDetailsMobileNotificationLbl;
		@FindBy(xpath="//input[@id='MobileIND']") WebElement fleetDetailsMobileNotificationChk;
		
		
		//Document Collection
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[5]") WebElement fleetDocumentationCollectionSubHdr;
		
		@FindBy(xpath="//label[@for='IRPRequirementsForm']") WebElement fleetDocCollectionIRPRequirementsFormLbl;
		@FindBy(xpath="//select[@id='IRPRequirementsForm']") WebElement fleetDocCollectionIRPRequirementsFormdd;
		
		@FindBy(xpath="//label[@for='StatementOfUnderstanding']") WebElement fleetDocCollectionStatementOfUnderstandingLbl;
		@FindBy(xpath="//select[@id='StatementOfUnderstanding']") WebElement fleetDocCollectionStatementOfUnderstandingdd;
		
		@FindBy(xpath="//label[@for='InstallmentAgreement']") WebElement fleetDocCollectionInstallmentAgreementLbl;
		@FindBy(xpath="//select[@id='InstallmentAgreement']") WebElement fleetDocCollectionInstallmentAgreementdd;
		
		@FindBy(xpath="//label[@for='PowerOfAttorney']") WebElement fleetDocCollectionPowerOfAttorneyLbl;
		@FindBy(xpath="//select[@id='PowerOfAttorney']") WebElement fleetDocCollectionPowerOfAttorneydd;
		
		//Vehicle Document 
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[6]") WebElement fleetVehicleDocumentSubHdr;
		
		@FindBy(xpath="//label[@for='HVUTForm2290']") WebElement fleetVehDocumentHVUTFormLbl;
		@FindBy(xpath="//select[@id='HVUTForm2290']") WebElement fleetVehDocumentHVUTFormdd;
		
		@FindBy(xpath="//label[@for='PropertyTaxVehDocument']") WebElement fleetVehDocumentPropertyTaxLbl;
		@FindBy(xpath="//select[@id='PropertyTaxVehDocument']") WebElement fleetVehDocumentPropertyTaxdd;
		
		
		//-------------------------------------
	
	
	public void navigateToServiceProvider() throws Exception {
		//ElementUtil.scrollToViewAndClickElement(fleetTab3);  //click on service Provider under Address details
		ElementUtil.clickElement(fleetTab3);
		//ElementUtil.sleepTime(2000);
		
	}

	public void clickPowerOfAttroney() {
		if(ElementUtil.isPresentAndDisplayed(fleetServicePowerOfAttroneyChk)) {
			ElementUtil.webCheckON(fleetServicePowerOfAttroneyChk);
		}
	}
	public void enterEmailID(String emailIdValue) {
		Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsEmailIdTxt);
		if(valueexists==true) {
		ElementUtil.webEditTxtChange(fleetDetailsEmailIdTxt, emailIdValue);  }
	}
	public void selectIRPRequirementForm(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetDocCollectionIRPRequirementsFormdd,selectValue);  //C - COLLECTED
	}
	public void selectStatementofUnderstanding(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetDocCollectionStatementOfUnderstandingdd,selectValue); //C - COLLECTED
	}
	public void selectInstallmentAgreement(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetDocCollectionInstallmentAgreementdd,selectValue); //C - COLLECTED
	}
	public void selectPowerOfAttroney(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetDocCollectionPowerOfAttorneydd,selectValue); //C - COLLECTED
	}

	public void selectHVUTForm(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetVehDocumentHVUTFormdd,selectValue); //C - COLLECTED
	}
	public void selectPropertyTax(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(fleetVehDocumentPropertyTaxdd,selectValue); //C - COLLECTED
	}

	public void selectEffectiveDate(String effDate) {
		Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsFltEffDatedtPicker);
		if(valueexists==true) {
			ElementUtil.clickElement(fleetDetailsFltEffDatedtPicker);
			ElementUtil.webEditTxt(fleetDetailsFltEffDatedtPicker,effDate); 
			}
	}
	public void selectExpirationDate(String expDate) {
		Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsFltExpDatedtPicker);
		if(valueexists==true) {
			ElementUtil.clickElement(fleetDetailsFltExpDatedtPicker);
			ElementUtil.webEditTxt(fleetDetailsFltExpDatedtPicker,expDate); 
			}
	}
	public void selectFirstOperatedDate(String firstOperatedDate) {
		Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsFirstOperatedDatedtPicker);
		if(valueexists==true) {
			ElementUtil.clickElement(fleetDetailsFirstOperatedDatedtPicker);
			ElementUtil.webEditTxt(fleetDetailsFirstOperatedDatedtPicker,firstOperatedDate); 
			}
	}
public void selectFleetType(String fleetTypeValue) {
	Boolean selectedornot=ElementUtil.validateDropdownSelected(fleetDetailsFltTypedd);
	if(selectedornot==true) {
	ElementUtil.selectFromDropdownByVisibleText(fleetDetailsFltTypedd, fleetTypeValue);  }
	//FHE - FOR HIRE EXEMPT (FH),FOR - FOR HIRE (FH),FHL - FOR HIRE LEASE (FH),FHR - FOR HIRE RENTAL CARRIER (FH),PVR - PRIVATE RENTAL (PC),PVT - PRIVATE CARRIER (PC)
}


public void selectCommodityClass(String commodityClassValue) {
	Boolean selectedornot=ElementUtil.validateDropdownSelected(fleetDetailsCommodityClassdd);
	if(selectedornot==true) {
	ElementUtil.selectFromDropdownByVisibleText(fleetDetailsCommodityClassdd, commodityClassValue);  }
	//A - ALL,B - BUS,E - EXEMPT,H - HOUSEHOLD GOODS (HG),L - LOGS
}

public void enterContactName(String contactNameValue) {
	Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsContactNameTxt);
	if(valueexists== true) {
	ElementUtil.webEditTxtChange(fleetDetailsContactNameTxt, contactNameValue);
	}
}
public void enterprimaryPhone(String primaryPhoneValue) {
	Boolean valueexists=ElementUtil.validateTextbox(fleetDetailsPrimaryCellNbrTxt);
	if(valueexists == true) {
	ElementUtil.webEditTxtChange(fleetDetailsPrimaryCellNbrTxt, primaryPhoneValue);
	}
}

public void clickMailingAddress() throws InterruptedException {
	ElementUtil.clickElement(fleetTab2);
	//ElementUtil.sleepTime(1000);
}

public void clickOnTimeMailingAddress() throws InterruptedException {
	ElementUtil.clickElement(fleetTab4);
	//ElementUtil.sleepTime(1000);
}


public String fetchFleetTabBusinessAddress() {
	return ElementUtil.FetchTextBoxValuewithText(fleetTab1);
}
public String fetchFleetTabMailingAddress() {
	return ElementUtil.FetchTextBoxValuewithText(fleetTab2);
}
public String fetchFleetTabServiceProviderAddress() {
	return ElementUtil.FetchTextBoxValuewithText(fleetTab3);
}
public String fetchFleetTabOneTimeMailingAddress() {
	return ElementUtil.FetchTextBoxValuewithText(fleetTab4);
}
public String fetchRegistrationtypelbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetRegistrationTypeLbl);
}

public String fetchRegistrationtype() {
	return ElementUtil.FetchDropdownSelectedValue(fleetRegistrationTypedd);
}
public String fetchfltstatuslbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetFltStatusLbl);
}

public String fetchfltstatus() {
	return ElementUtil.FetchDropdownSelectedValue(fleetFltStatusdd);
}

public String fetchcarriertypelbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCarrierTypeLbl);
}

public String fetchcarriertype() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCarrierTypeTxt,"value");
}

public String fetchDBANamelbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDBANameLbl);
}

public String fetchDBAName() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDBANameTxt,"value");
}

public String fleetStreet0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetStreet0Lbl);
}

public String fleetStreet0() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetStreet0Txt,"value");
}

public String fleetZip0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetZip0Lbl);
}

public String fleetZip0() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetZip0Txt,"value");
}
public String fleetJur0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetJur0Lbl);
}

public String fleetJur0() {
	return ElementUtil.FetchDropdownSelectedValue(fleetJur0dd);
}
public String fleetCity0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCity0Lbl);
}

public String fleetCity0() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCity0Txt,"value");
}
public String fleetCounty0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCounty0Lbl);
}

public String fleetCounty0() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCounty0Txt,"value");
}
public String fleetCountry0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCountry0Lbl);
}

public String FleetCountry0() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCountry0Txt,"value");
}
public String fleetNonDeliverable0Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetNonDeliverable0Lbl);
}

public String fleetNonDeliverable0() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetNonDeliverable0Chk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetStreet1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetStreet1Lbl);
}

public String fleetStreet1() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetStreet1Txt,"value");
}

public String fleetZip1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetZip1Lbl);
}

public String fleetZip1() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetZip1Txt,"value");
}
public String fleetJur1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetJur1Lbl);
}

public String fleetJur1() {
	return ElementUtil.FetchDropdownSelectedValue(fleetJur1dd);
}
public String fleetCity1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCity1Lbl);
}

public String FleetCity1() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCity1Txt,"value");
}
public String fleetCounty1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCounty1Lbl);
}

public String fleetCounty1() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCounty1Txt,"value");
}
public String fleetCountry1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetCountry1Lbl);
}

public String fleetCountry1() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetCountry1Txt,"value");
}
public String fleetNonDeliverable1Lbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetNonDeliverable1Lbl);
}

public String fleetNonDeliverable1() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetNonDeliverable1Chk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetAttentionToLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetAttentionToLbl);
}

public String fleetAttentionTO() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetAttentionTO1Txt,"value");
}


public String fleetServiceProviderLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceProviderLbl);
}

public String fleetServiceProvider() {
	return ElementUtil.FetchDropdownSelectedValue(fleetServiceProviderdd);
}
public String fleetServiceLegalNameLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetLegalNameLbl);
}

public String fleetServiceLegalName() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetLegalNameTxt,"value");
}
public String fleetServiceDBANameLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceDBANameLbl);
}

public String fleetServiceDBAName() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceDBANameTxt,"value");
}
public String fleetServicePowerOfAttroneyLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServicePowerOfAttroneyLbl);
}

public String fleetServicePowerOfAttroney() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetServicePowerOfAttroneyEffDateLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServicePowerOfAttroneyEffDateLbl);
}


public String fleetServicePowerOfAttroneyEffDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyEffDateTxt,"value");
}
public String fleetServicePowerOfAttroneyExpDateLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServicePowerOfAttroneyExpDateLbl);
}

public String fleetServicePowerOfAttroneyExpDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyExpDateTxt,"value");
}

public String fleetServiceEmailIdLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceEmailIdLbl);
}

public String fleetServiceEmailId() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceEmailIdTxt,"value");
}
public String fleetServicePhoneNoLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServicePhoneNoLbl);
}

public String fleetServicePhoneNo() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServicePhoneNoTxt,"value");
}

public String fleetServiceFaxNoLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceFaxNoLbl);
}

public String fleetServiceFaxNo() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceFaxNoTxt,"value");
}
public String fleetServiceStreetLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceStreetLbl);
}

public String fleetServiceStreet() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceStreetTxt,"value");
}
public String fleetServiceCityLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceCityLbl);
}

public String fleetServiceCity() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceCityTxt,"value");
}
public String fleetServiceJurLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetService_JurLbl);
}

public String fleetServiceJur() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceJurTxt,"value");
}
public String fleetServiceZipCodeLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceZipCodeLbl);
}

public String fleetServiceZipCode() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceZipCodeTxt,"value");
}

public String fleetServiceCountryLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceCountryLbl);
}

public String fleetServiceCountry() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceCountryTxt,"value");
}

public String fleetServiceMailingStreetLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingStreetLbl);
}

public String fleetServiceMailingStreet() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingStreetTxt,"value");
}

public String fleetServiceMailingZipCodeLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingZipCodeLbl);
}

public String fleetServiceMailingZipCode() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingZipCodeTxt,"value");
}
public String fleetServiceMailingJurLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingJurLbl);
}

public String fleetServiceMailingJur() {
	return ElementUtil.FetchDropdownSelectedValue(fleetServiceMailingJurTxt);
}
public String fleetServiceMailingCityLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingCityLbl);
}

public String fleetServiceMailingCity() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingCityTxt,"value");
}
public String fleetServiceMailingCountyLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingCountyLbl);
}
public String fleetServiceMailingCounty() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingCountyTxt,"value");
}
public String fleetServiceMailingCountryLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingCountryLbl);
}

public String fleetServiceMailingCountry() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingCountrytxt,"value");
}
public String fleetServiceMailingAttentionToLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetServiceMailingAttentionToLbl);
}

public String fleetServiceMailingAttentionTo() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetServiceMailingAttentionToTxt,"value");
}

public String fleetDetailsContactNameLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsContactNameLbl);
}

public String fleetDetailsContactName() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsContactNameTxt,"value");
}
public String fleetDetailsEmailIdLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsEmailIdLbl);
}
public String fleetDetailsEmailId() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsEmailIdTxt,"value");
}
public String fleetDetailsPrimaryCellNbrLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsPrimaryCellNbrLbl);
}

public String fleetDetailsPrimaryCellNbr() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsPrimaryCellNbrTxt,"value");
}
public String fleetDetailsAlternateCellNbrLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsAlternateCellNbrLbl);
}

public String fleetDetailsAlternateCellNbr() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsAlternateCellNbrTxt,"value");
}
public String fleetDetailsFaxNoLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsFaxNoLbl);
}
public String fleetDetailsFaxNo() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsFaxNoTxt,"value");
}
public String fleetDetailsTpIdLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsTpIdLbl);
}

public String fleetDetailsTPID() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsTPIdTxt,"value");
}
public String fleetDetailsUsdotNbrLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsUsdotNbrLbl);
}
public String fleetDetailsUsdotNbr() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsUsdotNbrTxt,"value");
}
public String fleetDetailsChangeVehUsdotTinLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsChangeVehUsdotTinLbl);
}

public String fleetDetailsChangeVehUsdotTin() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsChangeVehUsdotTInChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetDetailsFltTypeLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsFltTypeLbl);
}

public String fleetDetailsFltType() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDetailsFltTypedd);
}
public String fleetDetailsCommodityClassLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsCommodityClassLbl);
}
public String fleetDetailsCommodityClass() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDetailsCommodityClassdd);
}
public String fleetDetailsFltEffDateLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsFltEffDateLbl);
}

public String fleetDetailsFltEffDatedtPicker() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsFltEffDatedtPicker,"value");
}
public String fleetDetailsFltExpDateLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsFltExpDateLbl);
}
public String fleetDetailsFltExpDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsFltExpDatedtPicker,"value");
}

public String fleetDetailsChangeAddrOnUsdotLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsChangeAddrOnUsdotLbl);
}

public String fleetDetailsChangeAddrOnUsdot() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetDetailschangeAddrOnUsdotChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsFirstOperatedDateLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsFirstOperatedDateLbl);
}

public String fleetDetailsFirstOperatedDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsFirstOperatedDatedtPicker,"value");
}
public String fleetDetailsWyomingIndicatorLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsWyomingIndicatorLbl);
}
public String fleetDetailsWyomingIndicator() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsWyomingIndicatorChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsIFTADistanceLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsIFTADistanceLbl);
}

public String fleetDetailsIFTADistance() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsIFTADistanceChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsMobileNotificationLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDetailsMobileNotificationLbl);
}
public String fleetDetailsMobileNotification() {
	boolean boolstatus=false;
	if(ElementUtil.FetchTextBoxValuewithattribute(fleetDetailsMobileNotificationChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetDetailsIRPRequirementsLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDocCollectionIRPRequirementsFormLbl);
}

public String fleetDetailsIRPRequirements() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDocCollectionIRPRequirementsFormdd);
}

public String fleetDetailsStatementOfUnderstandingLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDocCollectionStatementOfUnderstandingLbl);
}
public String fleetDetailsStatementOfUnderstanding() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDocCollectionStatementOfUnderstandingdd);
}

public String fleetDetailsInstallmentAgreementLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDocCollectionInstallmentAgreementLbl);
}
public String fleetDetailsInstallmentAgreement() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDocCollectionInstallmentAgreementdd);
}
public String fleetDetailsPowerOfAttorneyLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetDocCollectionPowerOfAttorneyLbl);
}
public String fleetDetailsPowerOfAttorney() {
	return ElementUtil.FetchDropdownSelectedValue(fleetDocCollectionPowerOfAttorneydd);
}

public String fleetDetailsHVUTFormLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetVehDocumentHVUTFormLbl);
}
public String fleetDetailsHVUTForm() {
	return ElementUtil.FetchDropdownSelectedValue(fleetVehDocumentHVUTFormdd);
}
public String fleetDetailsPropertyTaxLbl() {
	return ElementUtil.FetchTextBoxValuewithText(fleetVehDocumentPropertyTaxLbl);
}
public String fleetDetailsPropertyTax() {
	return ElementUtil.FetchDropdownSelectedValue(fleetVehDocumentPropertyTaxdd);
}

public String fleetValidateMessage1() {
	ElementUtil.highlightElement(driver, fleetVerificationMsg1);
return ElementUtil.FetchTextBoxValuewithText(fleetVerificationMsg1);
}

public String fleetValidateMessage2() {
	ElementUtil.highlightElement(driver, fleetVerificationMsg2);
	return ElementUtil.FetchTextBoxValuewithText(fleetVerificationMsg2);
}
public String fleetValidateMessage3() {
	ElementUtil.highlightElement(driver, fleetVerificationMsg3);
	return ElementUtil.FetchTextBoxValuewithText(fleetVerificationMsg3);
}


}
