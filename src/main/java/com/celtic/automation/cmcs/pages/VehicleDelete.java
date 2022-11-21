package com.celtic.automation.cmcs.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleDelete {
	public WebDriver driver;
	public VehicleDelete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="#contentMsg > div > ul") WebElement deleteVerificationMessage;
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement amendVehicleSupplementDetailsSubHdr;
	@FindBy(xpath="//label[@for='NoOfDeletedVehicle']") WebElement deleteVehicleDeletedVehicleLbl;
	@FindBy(xpath="//input[@id='NoOfDeletedVehicle']") WebElement deleteVehicleDeletedVehicleTxt;
	
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement amendVehicleSearchSubHdr;
	@FindBy(xpath="//label[@for='UnitNbr']") WebElement deleteVehicleUnitNumberLbl;
	@FindBy(xpath="//input[@id='UnitNbr']") WebElement deleteVehicleUnitNumberTxt;
	
	@FindBy(xpath="//label[@for='VIN']") WebElement deleteVehicleVINLbl;
	@FindBy(xpath="//input[@id='VIN']") WebElement deleteVehicleVINTxt;
	
	@FindBy(xpath="//label[@for='PlateNbr']") WebElement deleteVehiclePlateNbrLbl;
	@FindBy(xpath="//input[@id='PlateNbr']") WebElement deleteVehiclePlateNbrTxt;
	@FindBy(xpath="//input[@id='btnFind']") WebElement deleteVehicleSearchBtn;
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement amendVehicleListOfActiveVehicleSubHdr;
	
	@FindBy(xpath="//th[@aria-label='Select']") WebElement deleteVehicleSelectTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Unit')]") WebElement deleteVehicleUnitTbl;
	@FindBy(xpath="//th[contains(@aria-label,'VIN')]") WebElement deleteVehicleVINTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate No')]") WebElement deleteVehiclePlateNoTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate Status')]") WebElement deleteVehiclePlateStatusTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Inactive')]") WebElement deleteVehicleInactiveDateTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Returned')]") WebElement deleteVehiclePlateReturnedDocumentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Affidavit')]") WebElement deleteVehicleAffidavitDocumentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Comment')]") WebElement deleteVehicleCommentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Waive')]") WebElement deleteVehicleWaiveBasejurisdictionCreditTbl;
	
	
	@FindBy(xpath="//input[contains(@id,'DeletedVehicleVMList') and  contains(@id,'SelectFlag')]")WebElement deleteVehicleCheckboxChk;
	@FindBy(xpath="//select[contains(@id,'DeletedVehicleVMList') and  contains(@id,'PlateStatusFlag')]") WebElement deleteVehicleStatusPlatedd;
	@FindBy(xpath="//input[contains(@name,'DeleteDate')]") WebElement deleteVehicleInactiveDateddPicker;
	@FindBy(xpath="//select[contains(@id,'PlateReturnDocumentFlag')]") WebElement deleteVehiclePlateReturnedDocumenTdd;
	@FindBy(xpath="//select[contains(@id,'AffidavitDoc')]") WebElement deleteVehicleAffidavitDocdd;
	@FindBy(xpath="//textarea[contains(@id,'Comment')]") WebElement deleteVehicleCommentTxt;
	
	@FindBy(xpath="//input[@id='btnVehicleList']") WebElement deleteVehicleVehicleListBtn;
	@FindBy(xpath="//table[@id='DeleteVehicleGrid']/tbody/tr") List<WebElement> deleteVehicleRowInTable;
	@FindBy(xpath="//td[contains(@class,'leftAlign')]") List<WebElement> deleteCellsInaRow;
	
	
	@FindBy(xpath="//a[text()='Next']") WebElement nextLink;
	@FindBy(xpath="//div[@id='DeleteVehicleGrid_info']") WebElement showInGentries;
	
	
	
	
	
	public void enterUnitNo(String unitNumbeTxtValue) {
		ElementUtil.webEditTxtChange(deleteVehicleUnitNumberTxt,unitNumbeTxtValue);
	}
	public void clickonSearch() {
		ElementUtil.clickElement(deleteVehicleSearchBtn);
	}
	//Fetch the Row Number based on the Unit Value
	public  int selectRowinaTable(String unitValue) {
		int i;
		int j;
		ElementUtil.waitUntilElementsVisible(deleteVehicleRowInTable);
		for(i=1;i<=deleteVehicleRowInTable.size();i++) {
			List<WebElement>cellvalueineachrow=driver.findElements(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]"));
			//starting the loop from 2 because the Row contains checkbox for which text doesn't contain in locators
			for(j=1;j<=cellvalueineachrow.size();j++) {
				if(driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]["+j+"]")).getText().equalsIgnoreCase(unitValue))
					break;
			}
			break;

		}
		return i;
	}
	public void deleteFewVehicles(String vehiclesCount,String plateStatusValue,String plateReturnedValue, String affidavitDocumentValue, String deleteCommentsValue) throws InterruptedException {
		int j=0;
		String showresultsTo=null;
		for(int i=1;i<=Integer.valueOf(vehiclesCount);i++) {
			System.out.println("i value before loop is"+i);
			 showresultsTo=ElementUtil.FetchTextBoxValuewithText(showInGentries);
			System.out.println("mad"+showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")));
			System.out.println("madA"+showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")).trim());
			System.out.println("madB"+Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")-1).trim()));
			System.out.println("Madhuri"+Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")-1)));
			System.out.println("madC"+Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("Showing ")+8,showresultsTo.indexOf("to")).trim()));
			
			
			if(i>Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")-1))) {
				ElementUtil.clickElement(nextLink);
				ElementUtil.waitUntilElementClickable(deleteVehicleSearchBtn);
				i=i-1;
				}
			else {
				 showresultsTo=ElementUtil.FetchTextBoxValuewithText(showInGentries);
				j=(i+1-(Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("Showing ")+8,showresultsTo.indexOf("to")).trim())));
				System.out.println("j is:"+j);
			//Click the check box for each untill we reach the count to delete the vehicles
			WebElement checkBoxCheck=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[1]/input[@title='Select']"));
			ElementUtil.clickElement(checkBoxCheck);
			WebElement PlateStatus=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[5]//select"));
			ElementUtil.selectFromDropdownByVisibleText(PlateStatus,plateStatusValue);
			//Plate Returned Document
		    WebElement PlateReturnedDocument=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[7]//select"));
			ElementUtil.selectFromDropdownByVisibleText(PlateReturnedDocument,plateReturnedValue);
			//Affidavit Document
			WebElement AffidavitDocument=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[8]//select"));
			ElementUtil.selectFromDropdownByVisibleText(AffidavitDocument,affidavitDocumentValue);
			//Delete Comments
			WebElement DeleteComments=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[9]/textarea"));
		    ElementUtil.webEditTxtChange(DeleteComments, deleteCommentsValue);
			}
		}
	}
	public void ClickCheckBoxFromGrid() {
		ElementUtil.clickElement(deleteVehicleCheckboxChk);
	}
	
	public void selectPlateStatus(String plateStatusValue) {
		ElementUtil.selectFromDropdownByVisibleText(deleteVehicleStatusPlatedd,plateStatusValue);
	}
	public void selectPlateReturnedDocument(String plateReturnedDocumentValue) {
		ElementUtil.selectFromDropdownByVisibleText(deleteVehiclePlateReturnedDocumenTdd,plateReturnedDocumentValue);
	}
	public void selectAffidavitDocument(String affidavitDocumentValue) {
		ElementUtil.selectFromDropdownByVisibleText(deleteVehicleAffidavitDocdd,affidavitDocumentValue);
	}
	
	public void entercomments(String commentsValue) {
		ElementUtil.webEditTxt(deleteVehicleCommentTxt, commentsValue);
	}
	
	public void clickVehicleList() {
		ElementUtil.clickElement(deleteVehicleVehicleListBtn);
	}
	
	public String DeleteValidationMessage() {
		ElementUtil.highlightElement(driver, deleteVerificationMessage);
		return ElementUtil.FetchTextBoxValuewithText(deleteVerificationMessage);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
