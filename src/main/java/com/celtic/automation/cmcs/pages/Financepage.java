package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;


public class Financepage {
	
	public WebDriver driver;

	public Financepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@for='AccountNo']") WebElement postPaymentAccountNoLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement postPaymentAccountNo;
	@FindBy(xpath="//label[@for='FleetNbr']") WebElement installmentFleetNoLbl;
	@FindBy(xpath="//input[@id='FleetNbr']") WebElement Installment_FleetNo;
	@FindBy(xpath="//label[@for='LegalName']") WebElement Installment_LegalNamelbl;
	@FindBy(xpath="//input[@id='LegalName']") WebElement Installment_LegalName;
	@FindBy(xpath="//label[@for='FltMonthYear']") WebElement PostPayment_FleerMonthYearlbl;
	@FindBy(xpath="//input[@id='FltMonthYear']") WebElement PostPayment_FleerMonthYear;
	@FindBy(xpath="//label[@for='SupplementNo']") WebElement Installment_SupplementNolbl;
	@FindBy(xpath="//input[@id='SupplementNo']") WebElement Installment_SupplementNo;
	@FindBy(xpath="//label[@for='DBAName']") WebElement Installment_DBANamelbl;
	@FindBy(xpath="//input[@id='DBAName']") WebElement Installment_DBAName;
	@FindBy(xpath="//label[@for='CMVFleetType']") WebElement PostPayment_FleetTpelbl;
	@FindBy(xpath="//input[@id='CMVFleetType']") WebElement PostPayment_FleetTpe;
	@FindBy(xpath="//label[@for='SupplementDesc']") WebElement Installment_SupplementDesclbl;
	@FindBy(xpath="//input[@id='SupplementDesc']") WebElement Installment_SupplementDesc;
	@FindBy(xpath="//label[@for='UsdotNbr']") WebElement Installment_USDOTlbl;
	@FindBy(xpath="//input[@id='UsdotNbr']") WebElement Installment_USDOT;
	@FindBy(xpath="//label[@for='SupplementEffectiveDate']") WebElement PostPayment_SupplementEffectiveDatelbl;
	@FindBy(xpath="//input[@id='SupplementEffectiveDate']") WebElement PostPayment_SupplementEffectiveDate;
	@FindBy(xpath="//label[@for='SupplementStatus']") WebElement Installment_SupplementStatuslbl;
	@FindBy(xpath="//input[@id='SupplementStatus']") WebElement Installment_SupplementStatus;
	@FindBy(xpath="//label[@for='InvoiceDate']") WebElement Installment_InvoiceDatelbl;
	@FindBy(xpath="//input[@id='InvoiceDate']") WebElement Installment_InvoiceDate;
	@FindBy(xpath="//label[@for='invoiceNbr']") WebElement Installment_invoiceNbrlbl;
	@FindBy(xpath="//input[@id='invoiceNbr']") WebElement Installment_invoiceNbr;
	@FindBy(xpath="//label[@for='EnterpriseEscrow']") WebElement PostPayment_EnterpriseSystemCreditlbl;
	@FindBy(xpath="//input[@id='EnterpriseEscrow']") WebElement PostPayment_EnterpriseSystemCredit;
	@FindBy(xpath="//label[@for='ReceiptDate']") WebElement Installment_ReceiptDatelbl;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement Installment_ReceiptDate;
	@FindBy(xpath="//label[@for='InstallmentPlanNumber']") WebElement Installment_InstallmentPlanNumberlbl;
	@FindBy(xpath="//input[@id='InstallmentPlanNumber']") WebElement Installment_InstallmentPlanNumber;
	
	@FindBy(xpath="//th[@class='sorting_disabled']") List<WebElement> Fee_Headers;
	@FindBy(xpath="//tr[@role='row']//th[not(contains(@class,'hidden')) and (contains(@class,'Align'))]") List<WebElement> Fee_Row;
	
	@FindBy(xpath="//a[@title='Finance']") WebElement DashboardFinancetab;
	@FindBy(xpath="//a[@title='Post Payment']") WebElement Finance_postpayment;
	
	@FindBy(xpath="//input[@id='btnSearch']") WebElement PostPayment_Search;
	@FindBy(xpath="//a[@id='lnkGridSelectgvPostPayment']") WebElement PostPayment_Cartid;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement PostPayment_Mceid;
	
	//installment payment
	
	
	@FindBy(xpath="//a[@title='Services']") WebElement Installment_Service;
	@FindBy(xpath="//a[@title='IRP']") WebElement Installment_IRP;
	@FindBy(xpath="//a[@title='Installment Payment']") WebElement Installment_instalpayment;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement Installment_AccountNo;
	
	@FindBy(xpath="//input[@id='FltExpYear']") WebElement Installment_FleetYear;
	@FindBy(xpath="//a[@id='lnkGridSelectCustomerGrid']") WebElement Installment_Grid;
	@FindBy(xpath="//select[@id='paymentVos_0__PayType']") WebElement Installment_paytype;
	@FindBy(xpath="//input[@id='paymentVos_0__PaymentAmount']") WebElement Installment_paymentcash;
	@FindBy(xpath="//select[@id='outPutModelSelect']") WebElement Intallment_Pdf;
	
	
	public void clickfinance() {
		ElementUtil.clickElement(DashboardFinancetab);
	}
	public void clickpostpayment() {
		ElementUtil.clickElementUsingActions(Finance_postpayment);
	}
	
	
	public void enterMCEid(String MCEIDvalue) {
		ElementUtil.clickElement(PostPayment_Mceid);
		ElementUtil.webEditTxtChange(PostPayment_Mceid,MCEIDvalue);
	}
	
	
	public void clicksearch() {
		ElementUtil.clickElement(PostPayment_Search);
	}
	
	public void clickoncartid() {
		ElementUtil.clickElement(PostPayment_Cartid);
	}
	public void clickservice() {
		ElementUtil.clickElement(Installment_Service);
	}
	public void clickIRP() {
		ElementUtil.clickElement(Installment_IRP);
	}
	public void selectpaymenttype(String selectValue) {
		ElementUtil.selectFromDropdownByVisibleText(Installment_paytype, selectValue); //Cash,Check,Certified Check,E-check,Credit Card,Wire Transfer,EFT,Enterprise System Credit,IRP System Credit,IFTA System Credit,OPA System Credit,IFTA Bond
		//ElementUtil.selectFromDropdownByValue(Installment_paytype, selectValue);
		
	}
	public void entercashamount(String installmenttypevalue) {	
	ElementUtil.webEditTxtChange(Installment_paymentcash,installmenttypevalue);
	}
	public void clickreceipt(String selectValue) {
	ElementUtil.selectFromDropdownByValue(Intallment_Pdf, selectValue);
}
	public void clickinstallmentpayment() throws InterruptedException {
		ElementUtil.clickElement(Installment_instalpayment);
		//ElementUtil.sleepTime(2000);
	}
	public void clickandenterAccountNo(String accountnovalue) {
		ElementUtil.webEditTxtChange(Installment_AccountNo,accountnovalue);
	}
	public void clickandenterfleet(String fleetnovalue) {
		ElementUtil.webEditTxtChange(Installment_FleetNo,fleetnovalue);
	}
	public void clickandenterfleetyear(String yearvalue) {
		ElementUtil.webEditTxtChange(Installment_FleetYear,yearvalue);
	}
	public void clickgrid() throws InterruptedException {
		ElementUtil.clickElement(Installment_Grid);
		//ElementUtil.sleepTime(2000);
	}

	
	
	//Fetch values
	public ArrayList<String> FetchTableHeader() {
ElementUtil.waitUntilElementsVisible(Fee_Headers);
		ArrayList<String> Headers_Array = new ArrayList<String>();
		for(int i=0;i<Fee_Headers.size();i++) {
			Headers_Array.add(ElementUtil.FetchTextBoxValuewithText(Fee_Headers.get(i)));
		}
		return Headers_Array;
	}
	public ArrayList<String> FetchTable_RowValues() {
		ElementUtil.waitUntilElementsVisible(Fee_Row);
		ArrayList<String> Juris_Array = new ArrayList<String>();
		for(int i=0;i<Fee_Row.size();i++) {
			Juris_Array.add(ElementUtil.FetchTextBoxValuewithText(Fee_Row.get(i)));
		}
		return Juris_Array;
	}
	
	public String Fetch_postPaymentAccountNoLbl() {
		return ElementUtil.FetchTextBoxValuewithText(postPaymentAccountNoLbl);
	}
	public String Fetch_postPaymentAccountNo() {
		return ElementUtil.FetchTextBoxValuewithattribute(postPaymentAccountNo,"value");
	}
	public String Fetch_FleetNolbl() {
		return ElementUtil.FetchTextBoxValuewithText(installmentFleetNoLbl);
	}
	public String Fetch_FleetNo() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_FleetNo,"value");
	}
	public String Fetch_LegalNamelbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_LegalNamelbl);
	}
	public String Fetch_LegalName() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_LegalName,"value");
	}
	public String Fetch_FleerMonthYearlbl() {
		return ElementUtil.FetchTextBoxValuewithText(PostPayment_FleerMonthYearlbl);
	}
	public String Fetch_FleerMonthYear() {
		return ElementUtil.FetchTextBoxValuewithattribute(PostPayment_FleerMonthYear,"value");
	}
	public String Fetch_SupplementNolbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_SupplementNolbl);
	}
	public String Fetch_SupplementNo() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_SupplementNo,"value");
	}
	public String Fetch_DBANamelbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_DBANamelbl);
	}
	public String Fetch_DBAName() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_DBAName,"value");
	}
	public String Fetch_FleetTypelbl() {
		return ElementUtil.FetchTextBoxValuewithText(PostPayment_FleetTpelbl);
	}
	public String Fetch_FleetType() {
		return ElementUtil.FetchTextBoxValuewithattribute(PostPayment_FleetTpe,"value");
	}
	public String Fetch_SupplementDesclbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_SupplementDesclbl);
	}
	public String Fetch_SupplementDesc() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_SupplementDesc,"value");
	}
	public String Fetch_USDOTlbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_USDOTlbl);
	}
	public String Fetch_USDOT() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_USDOT,"value");
	}
	public String Fetch_SupplementEffectiveDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(PostPayment_SupplementEffectiveDatelbl);
	}
	public String Fetch_SupplementEffectiveDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(PostPayment_SupplementEffectiveDate,"value");
	}
	public String Fetch_SupplementStatuslbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_SupplementStatuslbl);
	}
	public String Fetch_SupplementStatus() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_SupplementStatus,"value");
	}
	public String Fetch_InvoiceDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_InvoiceDatelbl);
	}
	public String Fetch_InvoiceDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_InvoiceDate,"value");
	}
	public String Fetch_Invoicenolbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_invoiceNbrlbl);
	}
	public String Fetch_Invoiceno() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_invoiceNbr,"value");
	}
	public String Fetch_EnterpriseSystemCreditlbl() {
		return ElementUtil.FetchTextBoxValuewithText(PostPayment_EnterpriseSystemCreditlbl);
	}

	public String Fetch_EnterpriseSystemCredit() {
		return ElementUtil.FetchTextBoxValuewithattribute(PostPayment_EnterpriseSystemCredit,"value");
	}
	public String Fetch_Installment_ReceiptDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_ReceiptDatelbl);
	}

	public String Fetch_Installment_ReceiptDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_ReceiptDate,"value");
	}
	public String Fetch_InstallmentPlanNumberlbl() {
		return ElementUtil.FetchTextBoxValuewithText(Installment_InstallmentPlanNumberlbl);
	}

	public String Fetch_InstallmentPlanNumber() {
		return ElementUtil.FetchTextBoxValuewithattribute(Installment_InstallmentPlanNumber,"value");
	}


}