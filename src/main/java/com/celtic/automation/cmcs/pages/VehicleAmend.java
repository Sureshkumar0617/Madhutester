package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleAmend {
	
	public WebDriver driver;
	public VehicleAmend(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement AmendVehicle_ChangeVehicleDetailsSubHdr;
	
	@FindBy(xpath="//label[@for='ChangeVehUnitNo']") WebElement AmendVehicle_ChangeVehUnitNolbl;
	@FindBy(xpath="//input[@id='ChangeVehUnitNo']") WebElement AmendVehicle_ChangeVehUnitNotxt;
	
	@FindBy(xpath="//label[@for='ChangeVehVIN']") WebElement AmendVehicle_VINlbl;
	@FindBy(xpath="//input[@id='ChangeVehVIN']") WebElement AmendVehicle_VINtxt;
	
	@FindBy(xpath="//label[@for='ChangeVehPlateNo']") WebElement AmendVehicle_PLateNolbl;
	@FindBy(xpath="//input[@id='ChangeVehPlateNo']") WebElement AmendVehicle_PlateNotxt;
	
	@FindBy(xpath="//input[@id='btnFind']") WebElement AmendVehicle_Searchbtn;
	
	
	//Supplement Details
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement AmendVehicle_SupplementDetailsSubHdr;
	@FindBy(xpath="//label[@for='NoOfVehicle']") WebElement AmendVehicle_NoOfVehiclesNolbl;
	@FindBy(xpath="//input[@id='NoOfVehicle']") WebElement AmendVehicle_NoOfVehiclestxt;
	
	@FindBy(xpath="//label[@for='RegistrantType']") WebElement AmendVehicle_RegistrationTypelbl;
	@FindBy(xpath="//select[@id='RegistrantType']") WebElement AmendVehicle_RegistrationTypetxt;
	
	//Vehicle Details
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement AmendVehicle_VehiclesDetailsSubHdr;
		@FindBy(xpath="//label[@for='VehDtlVin']") WebElement AmendVehicle_Vinlbl;
		@FindBy(xpath="//input[@id='VehDtlVin']") WebElement AmendVehicle_Vintxt;
		
		@FindBy(xpath="//label[@for='VehDtlUnitNo']") WebElement AmendVehicle_UnitNolbl;
		@FindBy(xpath="//input[@id='VehDtlUnitNo']") WebElement AmendVehicle_UnitNotxt;
		
		@FindBy(xpath="//label[@for='VehDtlWeightGroupNo']") WebElement AmendVehicle_WeightGroupNolbl;
		@FindBy(xpath="//select[@id='VehDtlWeightGroupNo']") WebElement AmendVehicle_WeightGroupNodd;
		
		@FindBy(xpath="//label[@for='VehDtlYear']") WebElement AmendVehicle_Yearlbl;
		@FindBy(xpath="//input[@id='VehDtlYear']") WebElement AmendVehicle_Yeartxt;
		
		@FindBy(xpath="//label[@for='VehDtlBodyStyle']") WebElement AmendVehicle_Bodytypelbl;
		@FindBy(xpath="//select[@id='VehDtlBodyStyle']") WebElement AmendVehicle_Bodytypedd;
		
		@FindBy(xpath="//label[@for='VehDtlMake']") WebElement AmendVehicle_MakeDatelbl;
		@FindBy(xpath="//select[@id='VehDtlMake']") WebElement AmendVehicle_MakeDatedd;
		@FindBy(xpath="//input[@id='VehDtlMakeOther']") WebElement AmendVehicle_MakeDateOthertxt;
		
		@FindBy(xpath="//label[@for='VehDtlCombinedAxles']") WebElement AmendVehicle_CombinedAxlelbl;
		@FindBy(xpath="//input[@id='VehDtlCombinedAxles']") WebElement AmendVehicle_CombinedAxletxt;
		
		@FindBy(xpath="//label[@for='VehDtlAxles']") WebElement AmendVehicle_Axlelbl;
		@FindBy(xpath="//input[@id='VehDtlAxles']") WebElement AmendVehicle_Axletxt;
		
		@FindBy(xpath="//label[@for='VehDtlFuleType']") WebElement AmendVehicle_Fueltypelbl;
		@FindBy(xpath="//select[@id='VehDtlFuleType']") WebElement AmendVehicle_Fueltypedd;
		
		@FindBy(xpath="//label[@for='VehDtlSeats']") WebElement AmendVehicle_seatlbl;
		@FindBy(xpath="//input[@id='VehDtlSeats']") WebElement AmendVehicle_Seattxt;
		
		@FindBy(xpath="//label[@for='VehDtlColor']") WebElement AmendVehicle_VehicleColourlbl;
		@FindBy(xpath="//select[@id='VehDtlColor']") WebElement AmendVehicle_VehicleColourdd;
		
		@FindBy(xpath="//label[@for='VehDtlUnladenWeight']") WebElement AmendVehicle_UnladenWeightlbl;
		@FindBy(xpath="//input[@id='VehDtlUnladenWeight']") WebElement AmendVehicle_UnladenWeighttxt;
		
		@FindBy(xpath="//label[@for='VehDtlMaxDesiredWeight']") WebElement AmendVehicle_GrossWeightlbl;
		@FindBy(xpath="//input[@id='VehDtlMaxDesiredWeight']") WebElement AmendVehicle_GrossWeighttxt;
		
		@FindBy(xpath="//label[@for='PurchaseDate']") WebElement AmendVehicle_PurchaseDatelbl;
		@FindBy(xpath="//input[@id='PurchaseDate']") WebElement AmendVehicle_PurchaseDatedtPicker;
		
		@FindBy(xpath="//label[@for='PurchasePrice']") WebElement AmendVehicle_PurchasePricelbl;
		@FindBy(xpath="//input[@id='PurchasePrice']") WebElement AmendVehicle_PurchasePricetxt;
		
		@FindBy(xpath="//label[@for='FactoryPrice']") WebElement AmendVehicle_FactoryPricelbl;
		@FindBy(xpath="//input[@id='FactoryPrice']") WebElement AmendVehicle_FactoryPricetxt;
		
		@FindBy(xpath="//label[@for='IsTearIndicator']") WebElement AmendVehicle_TVRlbl;
		@FindBy(xpath="//input[@id='IsTearIndicator']") WebElement AmendVehicle_TVRchk;
		
		@FindBy(xpath="//label[@for='NoOfDays']") WebElement AmendVehicle_TVRNoOfDayslbl;
		@FindBy(xpath="//input[@id='NoOfDays']") WebElement AmendVehicle_TVRNoOfDaystxt;
		
		@FindBy(xpath="//label[@for='VehDtlTitleJurisdiction']") WebElement AmendVehicle_TitleJurisdictionlbl;
		@FindBy(xpath="//select[@id='VehDtlTitleJurisdiction']") WebElement AmendVehicle_TitleJurisdictiondd;
		
		@FindBy(xpath="//label[@for='VehDtlTitleNo']") WebElement AmendVehicle_TitleNolbl;
		@FindBy(xpath="//input[@id='VehDtlTitleNo']") WebElement AmendVehicle_TitleNotxt;
		
		@FindBy(xpath="//label[@for='VehDtlCountyPlateType']") WebElement AmendVehicle_InStatePlateTypelbl;
		@FindBy(xpath="//select[@id='VehDtlCountyPlateType']") WebElement AmendVehicle_InStatePlateTypedd;
		
		@FindBy(xpath="//label[@for='VehDtlCountyWeight']") WebElement AmendVehicle_InStatePlateWeightlbl;
		@FindBy(xpath="//input[@id='VehDtlCountyWeight']") WebElement AmendVehicle_InStatePlateWeighttxt;
		
		@FindBy(xpath="//label[@for='CountyPlateExpiration']") WebElement AmendVehicle_InStateExpirationDatelbl;
		@FindBy(xpath="//input[@id='CountyPlateExpiration']") WebElement AmendVehicle_InStateExpirationDatedtPicker;
		
		@FindBy(xpath="//label[@for='VehDtlCountyPlate']") WebElement AmendVehicle_InStatePlatelbl;
		@FindBy(xpath="//input[@id='VehDtlCountyPlate']") WebElement AmendVehicle_InStatePlatetxt;
		
		@FindBy(xpath="//label[@for='CountyFee']") WebElement AmendVehicle_InStatePlateFeelbl;
		@FindBy(xpath="//input[@id='CountyFee']") WebElement AmendVehicle_InStatePlateFeetxt;
		
		@FindBy(xpath="//label[@for='OwnerDtlName']") WebElement AmendVehicle_OwnerNamelbl;
		@FindBy(xpath="//input[@id='OwnerDtlName']") WebElement AmendVehicle_OwnerNametxt;
		
		@FindBy(xpath="//label[@for='OwnerPhoneNo']") WebElement AmendVehicle_OwnerPhoneNolbl;
		@FindBy(xpath="//input[@id='OwnerPhoneNo']") WebElement AmendVehicle_OwnerPhoneNotxt;
		
		@FindBy(xpath="//label[@for='LeaseOrOwner']") WebElement AmendVehicle_SafetyResponsibilitylbl;
		@FindBy(xpath="//select[@id='LeaseOrOwner']") WebElement AmendVehicle_SafetyResponsibilitydd;
		
		@FindBy(xpath="//label[@for='IsLease']") WebElement AmendVehicle_Leaselbl;
		@FindBy(xpath="//input[@id='IsLease']") WebElement AmendVehicle_Leasechk;
		
		@FindBy(xpath="//label[@for='VehDtlSafetyUsdot']") WebElement AmendVehicle_SafetyUSDOTlbl;
		@FindBy(xpath="//input[@id='VehDtlSafetyUsdot']") WebElement AmendVehicle_SafetyUSDOTtxt;
		
		@FindBy(xpath="//label[@for='VehDtlSafetyTin']") WebElement AmendVehicle_SafetyTPIDlbl;
		@FindBy(xpath="//input[@id='VehDtlSafetyTin']") WebElement AmendVehicle_SafetyTPIDtxt;
		
		@FindBy(xpath="//label[@for='SaftyChangeDuringYear']") WebElement AmendVehicle_SafetyChangelbl;
		@FindBy(xpath="//select[@id='SaftyChangeDuringYear']") WebElement AmendVehicle_SafetyChangedd;
		
		@FindBy(xpath="//label[@for='IsUseExistingPlate']") WebElement AmendVehicle_UseExistingPlatelbl;
		@FindBy(xpath="//input[@id='IsUseExistingPlate']") WebElement AmendVehicle_UseExistingPlatechk;
		
		@FindBy(xpath="//label[@for='ExistingPlate']") WebElement AmendVehicle_ExistingPlatelbl;
		@FindBy(xpath="//input[@id='ExistingPlate']") WebElement AmendVehicle_ExistingPlatetxt;
		
		@FindBy(xpath="//label[@for='VehDtlIsChangeUsdotAddress']") WebElement AmendVehicle_ChangeNameAddlbl;
		@FindBy(xpath="//input[@id='VehDtlIsChangeUsdotAddress']") WebElement AmendVehicle_ChangeNameAddchk;
		
		@FindBy(xpath="//label[@for='CabCardFeeOverride']") WebElement AmendVehicle_OverrideGradeCrossingFeelbl;
		@FindBy(xpath="//input[@id='CabCardFeeOverride']") WebElement AmendVehicle_OverrideGradeCrossingFeechk;
		
		@FindBy(xpath="//label[@for='TAFeeOverride']") WebElement AmendVehicle_OverrideBicentennialFeelbl;
		@FindBy(xpath="//input[@id='TAFeeOverride']") WebElement AmendVehicle_OverrideBicentennialFeechk;
		
		@FindBy(xpath="//label[@for='IsNewPlateRequired']") WebElement AmendVehicle_NewPlateRequiredlbl;
		@FindBy(xpath="//input[@id='IsNewPlateRequired']") WebElement AmendVehicle_NewPlateRequiredchk;
		
	//Documentation Requirements For Admin Fee and Fee Calculation
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[5]") WebElement AmendVehicle_FeeCalculationSubHdr;
	
		@FindBy(xpath="//label[@for='ColoradoDistanceFlag']") WebElement AmendVehicle_Colorado10kIndicatorlbl;
		@FindBy(xpath="//select[@id='ColoradoDistanceFlag']") WebElement AmendVehicle_Colorado10kIndicatordd;
		
		@FindBy(xpath="//label[@for='ColoradoTrailerFlag']") WebElement AmendVehicle_ColoradoTrailerFlaglbl;
		@FindBy(xpath="//select[@id='ColoradoTrailerFlag']") WebElement AmendVehicle_ColoradoTrailerFlagdd;
		
		@FindBy(xpath="//label[@for='UTSpecialTruckFlag']") WebElement AmendVehicle_UtahSpecialTrucklbl;
		@FindBy(xpath="//select[@id='UTSpecialTruckFlag']") WebElement AmendVehicle_UtahSpecialTruckdd;
		
		@FindBy(xpath="//label[@for='NewUsedF']") WebElement AmendVehicle_NewVehiclelbl;
		@FindBy(xpath="//select[@id='NewUsedF']") WebElement AmendVehicle_NewVehicledd;
		
		@FindBy(xpath="//label[@for='CoSpecialTruck']") WebElement AmendVehicle_COSpecialTrucklbl;
		@FindBy(xpath="//select[@id='CoSpecialTruck']") WebElement AmendVehicle_COSpecialTruckdd;
		
	//Documentation Requirement Tracking
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[6]") WebElement AmendVehicle_TrackingSubHdr;
		@FindBy(xpath="//label[@for='HVUTForm2290']") WebElement AmendVehicle_HVUTForm2290lbl;
		@FindBy(xpath="//select[@id='HVUTForm2290']") WebElement AmendVehicle_HVUTForm2290dd;
		
		@FindBy(xpath="//label[@for='LeaseContract']") WebElement AmendVehicle_LeaseContractlbl;
		@FindBy(xpath="//select[@id='LeaseContract']") WebElement AmendVehicle_LeaseContractdd;
		
		@FindBy(xpath="//label[@for='TitleDocument']") WebElement AmendVehicle_TitleDocumentlbl;
		@FindBy(xpath="//select[@id='TitleDocument']") WebElement AmendVehicle_TitleDocumentdd;
		
		@FindBy(xpath="//label[@for='PlateReturndoc']") WebElement AmendVehicle_PlateReturndocbl;
		@FindBy(xpath="//select[@id='PlateReturndoc']") WebElement AmendVehicle_PlateReturndocdd;
		
		@FindBy(xpath="//label[@for='AffidavitDoc']") WebElement AmendVehicle_AffidavitDoclbl;
		@FindBy(xpath="//select[@id='AffidavitDoc']") WebElement AmendVehicle_AffidavitDocdd;
	
		@FindBy(xpath="//label[@for='PropertyTaxVehDocument']") WebElement AmendVehicle_PropertyTaxlbl;
		@FindBy(xpath="//select[@id='PropertyTaxVehDocument']") WebElement AmendVehicle_PropertyTaxdd;
	
	public void clickVIN() {
		ElementUtil.clickElement(AmendVehicle_VINtxt);
	}
	public void clickUnitNo() {
		ElementUtil.clickElement(AmendVehicle_ChangeVehUnitNotxt);
	}
	
	public void selectUnitNoFromSuggestions() {
		ElementUtil.waitUntilElementClickable(AmendVehicle_ChangeVehUnitNotxt);
		ElementUtil.clickElement(AmendVehicle_ChangeVehUnitNotxt);
		AmendVehicle_ChangeVehUnitNotxt.sendKeys(Keys.ARROW_DOWN);
		AmendVehicle_ChangeVehUnitNotxt.sendKeys(Keys.ENTER);
	}
	public void selectUnitNoFromExcel(String ChangeVehicleUnitNoValue) {
		String text;
		
		do {
			ElementUtil.waitUntilElementClickable(AmendVehicle_ChangeVehUnitNotxt);
			ElementUtil.clickElement(AmendVehicle_ChangeVehUnitNotxt);
			AmendVehicle_ChangeVehUnitNotxt.sendKeys(Keys.ARROW_DOWN);
			AmendVehicle_ChangeVehUnitNotxt.sendKeys(Keys.ENTER);
			 text=AmendVehicle_ChangeVehUnitNotxt.getAttribute("value").trim();
			if(text==ChangeVehicleUnitNoValue) {
				AmendVehicle_ChangeVehUnitNotxt.sendKeys(Keys.ENTER);
				break;
			}
			 
		}
	while(!text.isEmpty());
	}
	public void enterUnitNo(String ChangeVehicleUnitNoValue) {
			ElementUtil.webEditTxtChange(AmendVehicle_ChangeVehUnitNotxt, ChangeVehicleUnitNoValue);
	}
	public void clickSearch() throws InterruptedException {
		ElementUtil.clickElement(AmendVehicle_Searchbtn);
		//ElementUtil.sleepTime(1000);
	
	}
	
	public void selectBodyType(String AmendVehicle_BodytypeddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_Bodytypedd, AmendVehicle_BodytypeddValue); //BS - Bus,CG - Converter Gear,FT - Full Trailer,MT - Motor Totor,RT - Road Truck,ST - Semi Trailer,TK - Straight Truck,TR - Tractor,TT - Truck Tractor,WR - Wrecker
	}
	public void clickTVR() {
		ElementUtil.clickElement(AmendVehicle_TVRchk);
	}
	public void enterUnladenWeight(String unladenWeightValue) {
		if(ElementUtil.FetchTextBoxValuewithattribute(AmendVehicle_UnladenWeighttxt,"value") == null) {
			ElementUtil.webEditTxtChange(AmendVehicle_UnladenWeighttxt, unladenWeightValue);
		}
	}
	public void selectWeightGroupNo(String AmendVehicle_WeightGroupNoddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_WeightGroupNodd, AmendVehicle_WeightGroupNoddValue); //BS - Bus,CG - Converter Gear,FT - Full Trailer,MT - Motor Totor,RT - Road Truck,ST - Semi Trailer,TK - Straight Truck,TR - Tractor,TT - Truck Tractor,WR - Wrecker
	}
	public void ValidatePresenceOfMandatoryFeildValues() {
		 ElementUtil.isElementcontainsValue(AmendVehicle_UnitNotxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_WeightGroupNodd,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_Yeartxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_Bodytypedd,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_MakeDatedd,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_Axletxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_UnladenWeighttxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_PurchaseDatedtPicker,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_PurchasePricetxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_TitleJurisdictiondd,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_TitleNotxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_OwnerNametxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_SafetyUSDOTtxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_SafetyTPIDtxt,"value");
		 ElementUtil.isElementcontainsValue(AmendVehicle_SafetyChangedd,"value");
	}
	
	
	public void selectColorado10kIndicator(String Colorado10kIndicatorddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_Colorado10kIndicatordd,Colorado10kIndicatorddValue);
	}
	
	public void selectColoradoTrailer(String ColoradoTrailerddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_ColoradoTrailerFlagdd,ColoradoTrailerddValue);
	}
	
	public void selectUtahSpecialTruck(String UtahSpecialTruckddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_UtahSpecialTruckdd,UtahSpecialTruckddValue);
	}
	
	public void selectCNewVehicle(String NewVehicleddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_NewVehicledd,NewVehicleddValue);
	}
	
	public void selectCOSpecialTruck(String COSpecialTruckddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_COSpecialTruckdd,COSpecialTruckddValue);
	}
	
	
	public void selectHVUTForm2290(String HVUTForm2290ddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_HVUTForm2290dd,HVUTForm2290ddValue);
	}
	
	public void selectLeaseContract(String LeaseContractddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_LeaseContractdd,LeaseContractddValue);
	}
	public void selectTitleDocument(String TitleDocumentddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_TitleDocumentdd,TitleDocumentddValue);
	}
	public void selectPlateReturndoc(String PlateReturndocddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_PlateReturndocdd,PlateReturndocddValue);
	}
	
	public void selectAffidavitDoc(String AffidavitDocddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_AffidavitDocdd,AffidavitDocddValue);
	}
	public void selectPropertyTax(String PropertyTaxddValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_PropertyTaxdd,PropertyTaxddValue);
	}
	
	public void selectSafetyChangedd(String AmendVehicle_SafetyChangeValue) {
		ElementUtil.selectFromDropdownByVisibleText(AmendVehicle_SafetyChangedd,AmendVehicle_SafetyChangeValue);
	}
	
	
	
	
	
	
	
	//Fetch Value 
	public String fetchAmendVehicleBodyType() {
		return ElementUtil.FetchDropdownSelectedValue(AmendVehicle_Bodytypedd);
	}
	
	
	
	
	
	
}
