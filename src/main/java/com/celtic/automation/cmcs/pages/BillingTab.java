package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class BillingTab {
	public WebDriver driver;
	public BillingTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#contentMsg > div > ul > li > span") WebElement billingValidationMessage;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(1) > span") WebElement billingValidationMessage2;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(2) > span") WebElement billingValidationMessage3;


	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement billingSupplementDetailsSubhdr;
	@FindBy(xpath="//label[@for='RegMonth']") WebElement billingRegisterMonthLbl;
	@FindBy(xpath="//input[@id='RegMonth']") WebElement billingRegisterMonthTxt;

	@FindBy(xpath="//label[@for='NoOfPowerVehicle']") WebElement billingNoOfVehiclesinSuppLbl;
	@FindBy(xpath="//input[@id='NoOfPowerVehicle']") WebElement billingNoOfVehiclesInSuppTxt;

	@FindBy(xpath="//label[@for='SupplementStatus']") WebElement billingSupplementStatusLbl;
	@FindBy(xpath="//input[@id='SupplementStatus']") WebElement billingSupplementStatusTxt;

	@FindBy(xpath="//label[@for='EnterpriseEscrow']") WebElement billingEnterpriseSystemCreditLbl;
	@FindBy(xpath="//input[@id='EnterpriseEscrow']") WebElement billingEnterpriseSystemCreditTxt;

	@FindBy(xpath="//label[@for='IRPEscrow']") WebElement billingIRPSystemCreditLbl;
	@FindBy(xpath="//input[@id='IRPEscrow']") WebElement billingIRPSystemCreditTxt;

	@FindBy(xpath="//label[@for='RenewalFeeEffectiveDate']") WebElement billingRenewalFeeEffectiveDateLbl;
	@FindBy(xpath="//input[@id='RenewalFeeEffectiveDate']") WebElement billingRenewalFeeEffectiveDatedtPicker;

	@FindBy(xpath="//label[@for='InvoiceDate']") WebElement billingInvoiceDateLbl;
	@FindBy(xpath="//input[@id='InvoiceDate']") WebElement billingInvoiceDatedtPicker;

	@FindBy(xpath="//label[@for='ReceiptDate']") WebElement billingApplicationReceiptDateLbl;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement billingApplicationReceiptDatedtPicker;

	@FindBy(xpath="//label[@for='PaymentDate']") WebElement billingPaymentDateLbl;
	@FindBy(xpath="//input[@id='PaymentDate']") WebElement billingPaymentDatedtPicker;

	@FindBy(xpath="//label[@for='ExchangeRate']") WebElement billingExchangeRateLbl;
	@FindBy(xpath="//input[@id='ExchangeRate']") WebElement billingExchangeRateTxt;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement billingFeeSubhdr;

	@FindBy(xpath="//label[@for='ManualAdjBaseJur']") WebElement billingManualAdjBaseJurLbl;
	@FindBy(xpath="//input[@id='ManualAdjBaseJur']") WebElement billingManualAdjBaseJurTxt;

	@FindBy(xpath="//label[@for='BatchBilling']") WebElement billingBatchBillingLbl;
	@FindBy(xpath="//input[@id='BatchBilling']") WebElement billingBatchBillingChk;

	@FindBy(xpath="//label[@for='Chk30daysTear']") WebElement billingTVRLbl;
	@FindBy(xpath="//input[@id='Chk30daysTear']") WebElement billingTVRChk;

	@FindBy(xpath="//label[@for='QuaterPayment']") WebElement billingInstallmentPlanLbl;
	@FindBy(xpath="//input[@id='QuaterPayment']") WebElement billingInstallmentPlanChk;

	@FindBy(xpath="//label[@for='IsUseOneTimeMailing']") WebElement billingIsUseOneTimeMailingLbl;
	@FindBy(xpath="//input[@id='IsUseOneTimeMailing']") WebElement billingIsUseOneTimeMailingChk;
	@FindBy(xpath="//label[@for='NoOfdaysTear']") WebElement billingTVRNoOfDaysLbl;
	@FindBy(xpath="//input[@id='NoOfdaysTear']") WebElement billingTVRNoOfDaysTxt;

	//select[@id='selectEDC']
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden'))]") List<WebElement> billingGridHeaders;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeDescription')]") List<WebElement> billingFeeType;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeAmount')]") List<WebElement> billingFeeAmount;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement billingDeliveryDetailsSubhdr;

	@FindBy(xpath="//label[@for='selectEDC']") WebElement billingElectronicDeliveryTypeLbl;
	@FindBy(xpath="//select[@id='selectEDC']") WebElement billingElectronicDeliveryTypedd;

	@FindBy(xpath="//label[@for='selectedInvReport']") WebElement billingInvoiceReportTypeLbl;
	@FindBy(xpath="//select[@id='selectedInvReport']") WebElement billingInvoiceReportTypedd;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeDescription')]") List<WebElement> Billing_FeeType;

	@FindBy(xpath="//input[@id='btnRecalculate']") WebElement billingReCalculateBtn;
	@FindBy(xpath="(//select[contains(@id,'ReasonsSelect')])") List<WebElement> WaiveList;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Type')]") WebElement billingGridFeeType;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Amt')]") WebElement Billing_GridFeeAmount;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Waive')]") WebElement billingGridWaive;


	//Validation screen
	@FindBy(xpath="//label[@for='selectEDC30daysTear']") WebElement billingTVRElectronicDeliveryTypeLbl;
	@FindBy(xpath="//select[@id='selectEDC30daysTear']") WebElement billingTVRElectronicDeliveryTypedd;

	@FindBy(xpath="//input[@id='btnCancelBill']") WebElement billingCancelBillBtn;
	@FindBy(xpath="//input[@id='Email']") WebElement billingEmailIDTxt;

	@FindBy(xpath="//a[@role='button' and contains(text(),'Manual')]") WebElement billingManualAdjReasonCollapse;
	@FindBy(xpath="//textarea[@id='editComment_CommentTxtcommentsVM2']") WebElement billingManualAdjReasonCommentsTxt;
	@FindBy(xpath="//input[@id='editComment_DelAllowedcommentsVM2']") WebElement billingManualAdjReasonDeleteAllowedChk;
	@FindBy(xpath="//input[@id='addUpdateCommentBtncommentsVM2']") WebElement billingManualAdjReasonAddorUpdateCommentBtn;
	@FindBy(xpath="//input[@id='refreshCommentBtncommentsVM2']") WebElement billingManualAdjReasonClearCommentBtn;

	@FindBy(xpath="//select[@id='FeeDetailRows_8__WaiverReasonsSelect']") WebElement billingBicentennialFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_9__WaiverReasonsSelect']") WebElement billingGradeCrossingFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_10__WaiverReasonsSelect']") WebElement billingReplacementPlateFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_11__WaiverReasonsSelect']") WebElement billingSecondPlateFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_12__WaiverReasonsSelect']") WebElement billingLateFilingPenaltydd;
	@FindBy(xpath="//select[@id='FeeDetailRows_13__WaiverReasonsSelect']") WebElement billingLatePayPenaltydd;
	@FindBy(xpath="//select[@id='FeeDetailRows_14__WaiverReasonsSelect']") WebElement billingTransferFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_15__WaiverReasonsSelect']") WebElement billingTransferRevenueFeedd;

	@FindBy(xpath="//a[@role='button' and contains(text(),'Fee')]") WebElement billingFeeOverrideReasonCollapse;
	@FindBy(xpath="//textarea[@id='editComment_CommentTxtcommentsVM3']") WebElement billingFeeOverrideReasonCommentsTxt;
	@FindBy(xpath="//input[@id='editComment_DelAllowedcommentsVM3']") WebElement billingFeeOverrideReasonDeleteAllowedChk;
	@FindBy(xpath="//input[@id='addUpdateCommentBtncommentsVM3']") WebElement billingFeeOverrideReasonAddorUpdateCommentBtn;
	@FindBy(xpath="//input[@id='refreshCommentBtncommentsVM3']") WebElement billingFeeOverrideReasonClearCommentBtn;

	///Reinstatement
	@FindBy(xpath="//a[@id='BillingBtn']") WebElement billingBillingTab;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement billingAppReceiptDatedPicker;
	@FindBy(xpath="//h3[contains(@class,'pull-left')]") WebElement billingSubhdr;




	public void enterManualAdjBaseJur(String manualAdjBaseJurValue) {
		ElementUtil.webEditTxtChange(billingManualAdjBaseJurTxt, manualAdjBaseJurValue);
	}
	public void clickBatchBilling() {
		ElementUtil.webCheckON(billingBatchBillingChk);
	}

	public void clickTVR() {
		ElementUtil.webCheckON(billingTVRChk);
	}
	public void clickInstallmentPlan() {
		ElementUtil.webCheckON(billingInstallmentPlanChk);
	}
	public void clickIsUseOneTimeMailingChk() {
		ElementUtil.webCheckON(billingIsUseOneTimeMailingChk);
	}
	public void enterTVRNofDays(String tVRNoOfDaysValue) {
		ElementUtil.webEditTxtChange(billingTVRNoOfDaysTxt, tVRNoOfDaysValue);
	}
	public void selectElectronicDeliveryType(String electronicDeliveryTypeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingElectronicDeliveryTypedd,electronicDeliveryTypeValue);
	}

	public void selectInvoiceReportType(String invoiceReportTypeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingInvoiceReportTypedd,invoiceReportTypeValue);
	}
	public void clickReCalculate() throws InterruptedException {
		ElementUtil.clickElement(billingReCalculateBtn);

		//ElementUtil.sleepTime(1000);
	}
	public void selectTVRElectronicDeliveryType(String tVRElectronicDeliveryTypeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingTVRElectronicDeliveryTypedd,tVRElectronicDeliveryTypeValue);
	}
	public void clickCancelBill() {
		ElementUtil.clickElement(billingCancelBillBtn);
	}
	public void enterEmailIDTxt(String emailIDTxtValue) {
		ElementUtil.webEditTxtChange(billingEmailIDTxt, emailIDTxtValue);
	}
	public void expandManualAdjReason() throws Exception {

		if(ElementUtil.FetchTextBoxValuewithattribute(billingManualAdjReasonCollapse,"aria-expanded").equalsIgnoreCase("false")) {
			ElementUtil.clickElement(billingManualAdjReasonCollapse);
		}
	}
	public void enterManualAdjReasonComments(String manualAdjReasonCommentsValue) {
		ElementUtil.webEditTxtChange(billingManualAdjReasonCommentsTxt, manualAdjReasonCommentsValue);
	}
	public void clickManualAdjReasonDeleteAllowed() {
		ElementUtil.webCheckON(billingManualAdjReasonDeleteAllowedChk);
	}
	public void  clickManualAdjReasonAddorUpdateComments() {
		ElementUtil.clickElement(billingManualAdjReasonAddorUpdateCommentBtn);
	}
	public void  clickManualAdjReasonclearComments() {
		ElementUtil.clickElement(billingManualAdjReasonClearCommentBtn);
	}
	public void selectBicentennialFee(String bicentennialFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingBicentennialFeedd,bicentennialFeeValue);
	}
	public void selectGradeCrossingFee(String gradeCrossingFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingGradeCrossingFeedd,gradeCrossingFeeValue);
	}
	public void selectReplacementPlateFee(String replacementPlateFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingReplacementPlateFeedd,replacementPlateFeeValue);
	}
	public void selectSecondPlateFee(String secondPlateFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingSecondPlateFeedd,secondPlateFeeValue);
	}
	public void selectLateFilingPenalty(String lateFilingPenaltyValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingLateFilingPenaltydd,lateFilingPenaltyValue);
	}
	public void selectLatePayPenalty(String latePayPenaltyValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingLatePayPenaltydd,latePayPenaltyValue);
	}
	public void selectTransferFee(String transferFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingTransferFeedd,transferFeeValue);
	}
	public void selectTransferRevenueFee(String transferRevenueFeeValue) {
		ElementUtil.selectFromDropdownByVisibleText(billingTransferRevenueFeedd,transferRevenueFeeValue);
	}
	public void expandFeeOverrideReason() {
		ElementUtil.clickElement(billingFeeOverrideReasonCollapse);
	}
	public void enterFeeOverrideReasonComments(String manualAdjReasonCommentsValue) {
		ElementUtil.webEditTxtChange(billingFeeOverrideReasonCommentsTxt, manualAdjReasonCommentsValue);
	}
	public void clickFeeOverrideReasonDeleteAllowed() {
		ElementUtil.webCheckON(billingFeeOverrideReasonDeleteAllowedChk);

	}
	public void  clickFeeOverrideReasonAddorUpdateComments() {
		ElementUtil.clickElement(billingFeeOverrideReasonAddorUpdateCommentBtn);
	}

	public void  clickFeeOverrideReasonclearComments() {
		ElementUtil.clickElement(billingFeeOverrideReasonClearCommentBtn);
	}

	public void validateBillingtab(String textmsg) {
		Boolean a=billingBillingTab.getText().contains(textmsg);
		if(a==true) {
			assert true;
		}
		else {
			assert false;
		}
	}
	public String validateMessage() {
		ElementUtil.clickElement(billingValidationMessage);
		ElementUtil.highlightElement(driver, billingValidationMessage);
		return ElementUtil.FetchTextBoxValuewithText(billingValidationMessage);
	}

	public String validateMessage2() {
		ElementUtil.highlightElement(driver, billingValidationMessage2);
		return ElementUtil.FetchTextBoxValuewithText(billingValidationMessage2);
	}
	public String validateMessage3() {
		ElementUtil.highlightElement(driver, billingValidationMessage3);
		return ElementUtil.FetchTextBoxValuewithText(billingValidationMessage3);
	}

	///Reinstatement
	public void enterreceiptdate(String previousdate) {
		if(billingAppReceiptDatedPicker.getAttribute("value").isEmpty()) {
			ElementUtil.clickElement(billingAppReceiptDatedPicker);
			ElementUtil.webEditTxt(billingAppReceiptDatedPicker,previousdate); }
	}
	public void validatesubhdr(String hdrvalue) {
		if(billingSubhdr.getText().contains(hdrvalue))
			assert true;
	}
	//Fetch Values

	public String fetchRegisterMonthlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingRegisterMonthLbl);
	}

	public String fetchRegisterMonth() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingRegisterMonthTxt,"value");
	}
	public String fetchNoOfVehiclesinSupplbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingNoOfVehiclesinSuppLbl);
	}

	public String fetchNoOfVehiclesinSupp() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingNoOfVehiclesInSuppTxt,"value");
	}

	public String fetchSupplementStatuslbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingSupplementStatusLbl);
	}

	public String fetchSupplementStatus() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingSupplementStatusTxt,"value");
	}

	public String fetchEnterpriseSystemCreditlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingEnterpriseSystemCreditLbl);
	}

	public String fetchEnterpriseSystemCredit() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingEnterpriseSystemCreditTxt,"value");
	}

	public String fetchIRPSystemCreditlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingIRPSystemCreditLbl);
	}

	public String fetchIRPSystemCredit() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingIRPSystemCreditTxt,"value");
	}

	public String fetchRenewalFeeEffectiveDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingRenewalFeeEffectiveDateLbl);
	}

	public String fetchRenewalFeeEffectiveDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingRenewalFeeEffectiveDatedtPicker,"value");
	}

	public String fetchInvoiceDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingInvoiceDateLbl);
	}

	public String fetchInvoiceDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingInvoiceDatedtPicker,"value");
	}

	public String fetchApplicationReceiptDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingApplicationReceiptDateLbl);
	}

	public String fetchApplicationReceiptDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingApplicationReceiptDatedtPicker,"value");
	}

	public String fetchPaymentDatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingPaymentDateLbl);
	}

	public String fetchPaymentDate() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingPaymentDatedtPicker,"value");
	}
	public String fetchExchangeRatelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingExchangeRateLbl);
	}

	public String fetchExchangeRate() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingExchangeRateTxt,"value");
	}
	public String fetchManualAdjBaseJurlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingManualAdjBaseJurLbl);
	}

	public String fetchManualAdjBaseJur() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingManualAdjBaseJurTxt,"value");
	}

	public String fetchBilling_BatchBillinglbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingBatchBillingLbl);
	}

	public String fetchBilling_BatchBilling() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(billingBatchBillingChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_TVRlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingTVRLbl);
	}

	public String fetchBilling_TVR() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(billingTVRChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_IsUseOneTimeMailinglbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingIsUseOneTimeMailingLbl);
	}

	public String fetchBilling_IsUseOneTimeMailing() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(billingIsUseOneTimeMailingChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_InstallmentPlanlbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingInstallmentPlanLbl);
	}

	public String fetchBilling_InstallmentPlan() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(billingInstallmentPlanChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBillingTVRNoOfDayslbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingTVRNoOfDaysLbl);
	}

	public String fetchBillingTVRNoOfDays() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingTVRNoOfDaysTxt,"value");
	}

	public ArrayList<String> FetchTableHeaders() {
		ArrayList<String> headersArray = new ArrayList<String>();
		for(int i=0;i<billingGridHeaders.size();i++) {
			headersArray.add(ElementUtil.FetchTextBoxValuewithText(billingGridHeaders.get(i)));
		}
		return headersArray;
	}

	public ArrayList<String> FetchTable_FeeType() {
		ArrayList<String> feeTypeArray = new ArrayList<String>();
		for(int i=0;i<billingFeeType.size();i++) {
			feeTypeArray.add(ElementUtil.FetchTextBoxValuewithattributedisabled(billingFeeType.get(i),"value"));
		}
		return feeTypeArray;
	}
	public ArrayList<String> FetchTable_FeeAmount() {
		ArrayList<String> feeAmountArray = new ArrayList<String>();
		for(int i=0;i<billingFeeAmount.size();i++) {
			feeAmountArray.add(ElementUtil.FetchTextBoxValuewithattributedisabled(billingFeeAmount.get(i),"value"));
		}
		return feeAmountArray;
	}
	public String fetchElectronicDeliveryTypelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingElectronicDeliveryTypeLbl);
	}
	public String fetchElectronicDeliveryType() {
		return ElementUtil.FetchDropdownSelectedValue(billingElectronicDeliveryTypedd);
	}
	public String fetchBilling_Email() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingEmailIDTxt,"value");
	}
	public String fetchInvoiceReportTypelbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingInvoiceReportTypeLbl);
	}
	public String fetchBilling_InvoiceReportType() {
		return ElementUtil.FetchDropdownSelectedValue(billingInvoiceReportTypedd);
	}
	public void selectWaiveOff(String FeeTypeExcel, String FeeWaiveExcel) {
		boolean Amountbool=false;
		for(int i=0;i<Billing_FeeType.size();i++) {
			if(ElementUtil.FetchTextBoxValuewithattributedisabled(Billing_FeeType.get(i),"value").trim().equalsIgnoreCase(FeeTypeExcel));{
				ElementUtil.selectFromDropdownByVisibleText(WaiveList.get(i), FeeWaiveExcel);
				break;
			}
		}
	}
	//Returns True only is the Specified Fee Type contains amount more than zero
	//Bicentennial Fee,Grade Crossing Fee,Replacement Plate Fee,Second Plate Fee,Late Filing Penalty,Late Pay Penalty,Transfer Fee,Transfer Revenue Fee,Wire Transfer Fee
	public boolean getAmount(String FeeTypeExcel) {
		boolean Amountbool=false;
		for(int i=0;i<Billing_FeeType.size();i++) {
			if(ElementUtil.FetchTextBoxValuewithattributedisabled(Billing_FeeType.get(i),"value").trim().equalsIgnoreCase(FeeTypeExcel));{
				String FeeAmountValue=ElementUtil.FetchTextBoxValuewithattributedisabled(billingFeeAmount.get(i),"value").trim();
				if(Double.valueOf(String.format("%.2f",(Double.valueOf(FeeAmountValue))))>0){
					Amountbool=true;
					break;
				}
			}
		}
		return Amountbool;
	}
	public String fetchbillingTVRNoOfDaysLbl() {
		return ElementUtil.FetchTextBoxValuewithText(billingTVRNoOfDaysLbl);
	}
	public String fetchBilling_TVRNoOfDays() {
		return ElementUtil.FetchTextBoxValuewithattribute(billingTVRNoOfDaysTxt,"value");
	}
	public ArrayList<String> FetchTable_Headers() {
		ArrayList<String> Headers_array = new ArrayList<String>();
		for(int i=0;i<billingGridHeaders.size();i++) {
			Headers_array.add(ElementUtil.FetchTextBoxValuewithText(billingGridHeaders.get(i)));
		}
		return Headers_array;
	}
	public String fetchBillingGridFeeType() {
		return ElementUtil.FetchTextBoxValuewithText(billingGridFeeType);
	}
	public String fetchBillingGridFeeAmount() {
		return ElementUtil.FetchTextBoxValuewithText(Billing_GridFeeAmount);
	}
	public String fetchbillingGridWaive() {
		return ElementUtil.FetchTextBoxValuewithText(billingGridWaive);
	}
}