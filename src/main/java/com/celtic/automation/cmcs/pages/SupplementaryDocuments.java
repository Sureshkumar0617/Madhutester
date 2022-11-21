package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class SupplementaryDocuments {
	
	public WebDriver driver;

	public SupplementaryDocuments(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
    @FindBy(xpath="//label[@for='AccountNo']") WebElement supplementDocumentsAccountNoLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement supplementDocumentsAccountNo;
	@FindBy(xpath="//label[@for='LegalName']") WebElement supplementDocumentsLegalNameLbl;
	@FindBy(xpath="//input[@id='LegalName']") WebElement supplementDocumentsLegalName;
	@FindBy(xpath="//label[@for='DBA']") WebElement supplementDocumentsDBALbl;
	@FindBy(xpath="//input[@id='DBA']") WebElement supplementDocumentsDba;
	@FindBy(xpath="//label[@for='FleetNo']") WebElement supplementDocumentsFleetNoLbl;
	@FindBy(xpath="//input[@id='FleetNo']") WebElement supplementDocumentsFleetNo;
	@FindBy(xpath="//label[@for='FltExpMonthYear']") WebElement supplementDocumentsFltExpMonthYearLbl;
	@FindBy(xpath="//input[@id='FltExpMonthYear']") WebElement supplementDocumentsFltExpMonthYear;
	@FindBy(xpath="//label[@for='SupplementNo']") WebElement supplementDocumentsSupplementNoLbl;
	@FindBy(xpath="//input[@id='SupplementNo']") WebElement supplementDocumentsSupplementNo;
	@FindBy(xpath="//label[@for='FleetType']") WebElement supplementDocumentsFleetTypeLbl;
	@FindBy(xpath="//input[@id='FleetType']") WebElement supplementDocumentsFleetType;
	@FindBy(xpath="//label[@for='SuppType']") WebElement supplementDocumentsTransactionTypeLbl;
	@FindBy(xpath="//input[@id='SuppType']") WebElement supplementDocumentsTransactionType;
	@FindBy(xpath="//label[@for='USDot']") WebElement supplementDocumentsUSDotLbl;
	@FindBy(xpath="//input[@id='USDot']") WebElement supplementDocumentsUSDot;
	
	@FindBy(xpath="//label[@for='IRPRequirementsForm_DocStatInd']") WebElement supplementDocumentsIRPRequirementLbl;
	@FindBy(xpath="//select[@id='IRPRequirementsForm_DocStatInd']") WebElement supplementDocumentsIRPRequirement;
	@FindBy(xpath="//label[@for='StatementOfUnderstanding_DocStatInd']") WebElement supplementDocumentsStatementofUnderstandingLbl;;
	@FindBy(xpath="//select[@id='StatementOfUnderstanding_DocStatInd']") WebElement supplementDocumentsStatementOfUnderstanding;
	@FindBy(xpath="//label[@for='InstallmentAgreement_DocStatInd']") WebElement supplementDocumentsInstallmentAgreementLbl;
	@FindBy(xpath="//select[@id='InstallmentAgreement_DocStatInd']") WebElement supplementDocumentsInstallmentAgreement;
	@FindBy(xpath="//label[@for='PowerOfAttony_DocStatInd']") WebElement supplementDocumentsPowerOfAttonyLbl;
	@FindBy(xpath="//select[@id='PowerOfAttony_DocStatInd']") WebElement supplementDocumentsPowerOfAttony;
	

	
	//Fetch Values
	public String fetchAccountNoLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsAccountNoLbl);
	}

	public String fetchAccountNo() {
		return ElementUtil.FetchDropdownSelectedValue(supplementDocumentsAccountNo);
	}
	public String fetchLegalNameLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsLegalNameLbl);
	}

	public String fetchLegalName() {
		return ElementUtil.FetchDropdownSelectedValue(supplementDocumentsLegalName);
	}

	public String fetchDBALbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsDBALbl);
	}

	public String fetchDBA() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsDba,"value");
	}
	public String fetchFleetNoLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsFleetNoLbl);
	}

	public String fetchFleetNo() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsFleetNo,"value");
	}
	public String fetchExpMonthYearLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsFltExpMonthYearLbl);
	}

	public String fetchExpMonthYear() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsFltExpMonthYearLbl,"value");
	}
	public String fetchSupplementNoLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsSupplementNoLbl);
	}

	public String fetchSupplementNo() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsSupplementNoLbl,"value");
	}

	public String fetchFleetTypeLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsFleetTypeLbl);
	}

	public String fetchFleetType() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsFleetType,"value");
	}

	public String fetchTransactionTypeLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsTransactionTypeLbl);
	}

	public String fetchTransactionType() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsTransactionTypeLbl,"value");
	}

	public String fetchUSDOTLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsUSDotLbl);
	}
	
	public String fetchUSDOT() {
		return ElementUtil.FetchTextBoxValuewithattribute(supplementDocumentsUSDot,"value");
	}
	
	public String supplementDocumentsStatementOfUnderstandingLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsStatementofUnderstandingLbl);
	}
	public String supplementDocumentsStatementOfUnderstanding() {
		return ElementUtil.FetchDropdownSelectedValue(supplementDocumentsStatementOfUnderstanding);
	}
	
	public String supplementDocumentsInstallmentAgreementLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsInstallmentAgreementLbl);
	}
	public String supplementDocumentsInstallmentAgreement() {
		return ElementUtil.FetchDropdownSelectedValue(supplementDocumentsInstallmentAgreement);
	}
	public String supplementDocumentsPowerOfAttorneyLbl() {
		return ElementUtil.FetchTextBoxValuewithText(supplementDocumentsPowerOfAttonyLbl);
	}
	public String supplementDocumentsPowerOfAttorney() {
		return ElementUtil.FetchDropdownSelectedValue(supplementDocumentsPowerOfAttony);
	}
	
	
	public void enterAccountNo(String accountNo) {
		ElementUtil.webEditTxtChange(supplementDocumentsAccountNo, accountNo);
	}
	public void selectIRPRequirements(String IRP) {
		ElementUtil.selectFromDropdownByVisibleText(supplementDocumentsIRPRequirement, IRP);
	}
	
	public void selectstatmentdoccs(String statementUnderstanding) {
		ElementUtil.selectFromDropdownByVisibleText(supplementDocumentsStatementOfUnderstanding, statementUnderstanding);
		
	}
	public void selectInstallmentDocs(String installment) {
		ElementUtil.selectFromDropdownByVisibleText(supplementDocumentsInstallmentAgreement, installment);
	}
	public void selectPowerOfAttony(String powerOfAttony) {
	ElementUtil.selectFromDropdownByVisibleText(supplementDocumentsPowerOfAttony, powerOfAttony);
}
}