package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.celtic.automation.cmcs.util.ElementUtil;

public class PaymentTab {
	public WebDriver driver;
	public PaymentTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#contentMsg > div > ul > li:nth-child(1) > span") WebElement paymentValidationMessage1;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(2) > span") WebElement paymentValidationMessage2;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(3) > span") WebElement paymentValidationMessage3;
	@FindBy(css="#contentMsg > div > ul > li > span") WebElement paymentValidationMessage4;
	@FindBy(css="#contentMsg > div > ul > li > span") WebElement supplementValidationMessage5;
	
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement paymentSupplementDetailsSubHdr;
	
	@FindBy(xpath="//label[@for='IRPEscrow']") WebElement paymentIRPSystemCreditLbl;;
	@FindBy(xpath="//input[@id='IRPEscrow']") WebElement Payment_IRPSystemCredittxt;

	@FindBy(xpath="//label[@for='EnterpriseEscrow']") WebElement paymentEnterpriseSystemCreditLbl;;
	@FindBy(xpath="//input[@id='EnterpriseEscrow']") WebElement paymentEnterpriseSystemCreditTxt;

	@FindBy(xpath="//label[@for='InvoiceDate']") WebElement paymentInvoiceDateLbl;;
	@FindBy(xpath="//input[@id='InvoiceDate']") WebElement paymentInvoiceDatedtPicker;
	@FindBy(xpath="//label[@for='invoiceNbr']") WebElement paymentInvoiceNumberLbl;;
	@FindBy(xpath="//input[@id='invoiceNbr']") WebElement paymentInvoiceNumberTxt;
	@FindBy(xpath="//label[@for='ReceiptDate']") WebElement paymentPaymentReciptDateLbl;;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement paymentPaymentReciptDatedtPicker;
	
	@FindBy(xpath="//label[@for='ManualAdjBaseJur']") WebElement paymentManualAdjBaseJurLbl;
	@FindBy(xpath="//input[@id='ManualAdjBaseJur']") WebElement paymentManualAdjBaseJurTxt;
	@FindBy(xpath="//label[@for='BatchCredential']") WebElement paymentBatchCredentialLbl;
	@FindBy(xpath="//input[@id='BatchCredential']") WebElement paymentBatchCredentialChk;;
	@FindBy(xpath="//label[@for='WireTransferFee']") WebElement paymentWireTransferFeeLbl;
	@FindBy(xpath="//input[@id='WireTransferFee']") WebElement paymentWireTransferFeeChk;
@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement paymentCabCardDeliveryTypeSubHdr;

@FindBy(xpath="//label[@for='ElectronicDeliveryType']") WebElement paymentElectronicDeliveryTypeLbl;
@FindBy(xpath="//select[@id='ElectronicDeliveryType']") WebElement paymentElectronicDeliveryTypedd;

@FindBy(xpath="//a[contains(text(),'Show')]") WebElement paymentShowHandLoglnk;
@FindBy(xpath="//a[contains(text(),'Invoice')]") WebElement paymentViewInvoiceReportlnk;
@FindBy(xpath="//a[contains(text(),'TVR')]") WebElement paymentViewTVRLnk;

@FindBy(xpath="//input[@id='btnPayNow']") WebElement paymentPayNowBtn; 
@FindBy(xpath="//input[@id='btnAddToCart']") WebElement paymentAddToCartBtn;

@FindBy(xpath="//select[@id='paymentVos_0__PayType']") WebElement paymentMethod;
@FindBy(xpath="//a[@title='Supplement Continuance']") WebElement supplementCont;
@FindBy(xpath="//div[@id='contentMsg']//span") WebElement addToCartMsg;
@FindBy(xpath="//a[@id='cartRef']") WebElement verifyAddToCart;
@FindBy(xpath="//select[contains(@id,'PayType')]") WebElement paymentType;
@FindBy(xpath="//input[contains(@id,'paymentAmount')and contains(@id,'paymentVos')]") WebElement paymentAmount;
@FindBy(xpath="//input[@id='Add']") WebElement paymentAdd;
@FindBy(xpath="//select[@id='paymentVos_1__PayType']") WebElement paymentAmountchecktype;
@FindBy(xpath="//input[@id='paymentVos_1__paymentAmount']") WebElement paymentAmountCheque;
@FindBy(xpath="//input[@id='paymentVos_2__DeleteChk']") WebElement checkboxDelete;
@FindBy(xpath="//input[@id='Delete']") WebElement deleteCheckBox;
@FindBy(xpath="//select[@id='outPutModelSelect']") WebElement paymentReceipt;
@FindBy(xpath="//input[@id='paymentVos_1__PaymentNo']") WebElement paymentCheckNo;
@FindBy(xpath="//input[@id='paymentVos_0__paymentAmount']") WebElement paymentAmount1;

@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden'))]") List<WebElement> billingGridHeaders;
@FindBy(xpath="//th[contains(@class,'sorting_disabled')and contains(text(),'Type')]") WebElement billingGridFeeType;
@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeDescription')]") List<WebElement> billingFeeType;
@FindBy(xpath="//th[contains(@class,'sorting_disabled')and contains(text(),'Amt')]") WebElement billingGridFeeAmount;
@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeAmount')]") List<WebElement> billingFeeAmount;

public void clickPayNow() throws InterruptedException {
	ElementUtil.scrollIntoView(paymentPayNowBtn);
	ElementUtil.clickElement(paymentPayNowBtn);
	//ElementUtil.sleepTime(2000);
}
public void clickAddtoCart() {
	ElementUtil.clickElement(paymentAddToCartBtn);
}	
public void clickPaymenToAdd() {
	ElementUtil.clickElement(paymentAdd);
}
/*public void clickandenteraccno(String accountnovalue) {
ElementUtil.clickElement(Accountno);
ElementUtil.webEditTxtChange(Accountno,accountnovalue);
}*/
public void clicksupplcont() {
	ElementUtil.clickElement(supplementCont);
}
public void validatemessage(String TransactionexistMeesage) {
	ElementUtil.highlightElement(driver, addToCartMsg);
	Assert.assertEquals(addToCartMsg.getText(), TransactionexistMeesage);
}
public void clickVerifyAddToCart() {
	ElementUtil.clickElement(verifyAddToCart);
}

public void Selectpaymentmethod(String Methodtype) {
	ElementUtil.webEditTxtChange(paymentMethod, Methodtype);
}
public void enterpaymentAmount(String paymentAmount1) {
	ElementUtil.webEditTxtChange(paymentAmount, paymentAmount1);
}
//Fetch Values
public String FetchEnterpriseSystemCreditlbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentEnterpriseSystemCreditLbl);
}
public String FetchEnterpriseSystemCredit() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentEnterpriseSystemCreditTxt,"value");
}
public String FetchIRPSystemCreditlbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentIRPSystemCreditLbl);
}
public String FetchIRPSystemCredit() {
	return ElementUtil.FetchTextBoxValuewithattribute(Payment_IRPSystemCredittxt,"value");
}
public String FetchInvoiceDatelbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentInvoiceDateLbl);
}
public String FetchInvoiceDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentInvoiceDatedtPicker,"value");
}
public String FetchInvoiceNumberlbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentInvoiceNumberLbl);
}
public String FetchInvoiceNumber() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentInvoiceNumberTxt,"value");
}
public String FetchPaymentReciptDatelbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentPaymentReciptDateLbl);
}
public String FetchPaymentReciptDate() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentPaymentReciptDatedtPicker,"value");
}
public String FetchManualAdjBaseJurlbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentManualAdjBaseJurLbl);
}
public String FetchManualAdjBaseJur() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentManualAdjBaseJurTxt,"value");
}
public String FetchBatchCredentiallbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentBatchCredentialLbl);
}
public String FetchBatchCredential() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentBatchCredentialChk,"value");
}
public String FetchWireTransferFeelbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentWireTransferFeeLbl);
}
public String FetchWireTransferFee() {
	return ElementUtil.FetchTextBoxValuewithattribute(paymentWireTransferFeeChk,"value");
}
public ArrayList<String> FetchTable_Headers() {
	ArrayList<String> Headers_array = new ArrayList<String>();
	for(int i=0;i<billingGridHeaders.size();i++) {
		Headers_array.add(ElementUtil.FetchTextBoxValuewithText(billingGridHeaders.get(i)));
	}
	return Headers_array;
}
public String FetchHeaderFeeType() {
	return ElementUtil.FetchTextBoxValuewithText(billingGridFeeType);
}

public ArrayList<String> FetchTable_FeeType() {
	ArrayList<String> FeeType_Array = new ArrayList<String>();
	for(int i=0;i<billingFeeType.size();i++) {
		FeeType_Array.add(ElementUtil.FetchTextBoxValuewithattributedisabled(billingFeeType.get(i),"value"));
	}
	return FeeType_Array;
}
public String FetchHeaderFeeAmount() {
	return ElementUtil.FetchTextBoxValuewithText(billingGridFeeAmount);
}

public ArrayList<String> FetchTable_FeeAmount() {
	ArrayList<String> FeeAmount_Array = new ArrayList<String>();
	for(int i=0;i<billingFeeAmount.size();i++) {
		FeeAmount_Array.add(ElementUtil.FetchTextBoxValuewithattributedisabled(billingFeeAmount.get(i),"value"));
	}
	return FeeAmount_Array;
}


public String FetchElectronicDeliveryTypelbl() {
	return ElementUtil.FetchTextBoxValuewithText(paymentElectronicDeliveryTypeLbl);
}
public String FetchElectronicDeliveryType() {
	return ElementUtil.FetchDropdownSelectedValue(paymentElectronicDeliveryTypedd);
}

}
