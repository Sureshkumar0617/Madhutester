package com.celtic.automation.cmcs.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class WgtGroupAdd {

	public WebDriver driver;
	public WgtGroupAdd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement addWgtGroupSupplementDetailsSubHdr;
	@FindBy(xpath="//label[@for='WgtGroupType']") WebElement addWgtGroupWeightGroupTypeLbl;
	@FindBy(xpath="//select[@id='WgtGroupType']") WebElement addWgtGroupWeightGroupTypedd;

	@FindBy(xpath="//label[@for='WgtGroupNo']") WebElement addWgtGroupWeightGroupNoLbl;
	@FindBy(xpath="//input[@id='WgtGroupNo']") WebElement weightGroupNoTxt;

	@FindBy(xpath="//label[@for='MaxGrossWeight']") WebElement maxGrossWeightLbl;
	@FindBy(xpath="//select[@id='MaxGrossWeight']") WebElement maxGrossWeightdd;

	@FindBy(xpath="//label[@for='WgtGroupNoOld']") WebElement AddWgtGroup_CopyFromWeightlbl;
	@FindBy(xpath="//input[@id='WgtGroupNoOld']") WebElement AddWgtGroup_CopyFromWeighttxt;
	@FindBy(xpath="//input[@id='btnCopyFrom']") WebElement AddWgtGroup_CopyFrombtn;



	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement AddWgtGroup_ListOfJurandWeightSubHdr;
	@FindBy(xpath="//input[contains(@id,'WeightList') and contains(@id,'WeightQ')]") List<WebElement> AddWgtGroup_Weighttxt;


	@FindBy(xpath="//input[@id='btnGoToWeightGroupSelection']") WebElement goToWeightGroupSelectionBtn;
	@FindBy(xpath="//input[@id='btnDeleteWeightGroup']") WebElement deleteWeightGroupBtn;
	@FindBy(xpath="//input[contains(@id,'Juris')]/preceding-sibling::span") List<WebElement> editWgtGroupJurisList;
	@FindBy(xpath="//input[contains(@id,'WeightQ')]") List<WebElement> editWgtGroupWeightTxt;



	public void selectWeightGroupType(String weightGroupTypeValue) {
		ElementUtil.selectFromDropdownByVisibleText(addWgtGroupWeightGroupTypedd, weightGroupTypeValue);  //B - BUS  P - POWER UNIT T - TRAILER

	}


	public void enterWeightGroupNo(String weightGroupNoValue) {
		ElementUtil.webEditTxtChange(weightGroupNoTxt, weightGroupNoValue);
	}
	public void selectMaxGrossWeight(String maxGrossWeightValue) {
		ElementUtil.selectFromDropdownByVisibleText(maxGrossWeightdd, maxGrossWeightValue);  //B - BUS  P - POWER UNIT T - TRAILER
	}


	public void clickGoToWeightGroupSelection() {
		ElementUtil.clickElement(goToWeightGroupSelectionBtn);
	}
	public void clickDeleteWeightGroup() {
		ElementUtil.clickElement(deleteWeightGroupBtn);
	}


	public void enterWeightJuriValue( String juri) {
		ElementUtil.waitUntilElementsVisible(editWgtGroupJurisList);
		int GrossWeightint =Integer.valueOf(fetchMaxGrossWeight());

		//MO,AL,AR,AZ,CA,CO,CT,DC
		for(int i=0;i<editWgtGroupJurisList.size();i++) {
			if(ElementUtil.FetchTextBoxValuewithText(editWgtGroupJurisList.get(i)).equalsIgnoreCase(juri)) { //"MO - MISSOURI"
				ElementUtil.webEditTxtChange(editWgtGroupWeightTxt.get(i),String.valueOf(GrossWeightint-1));
				break;
			}
		}
	}
	public void enterAllWeightValue(String distanceValuedynamic) {
		ElementUtil.waitUntilElementsVisible(editWgtGroupWeightTxt);
		for(int i=0;i<editWgtGroupWeightTxt.size();i++) {
			ElementUtil.webEditTxtChange(editWgtGroupWeightTxt.get(i),distanceValuedynamic);
		}
	}
	public String fetchMaxGrossWeight() {
		String GrossWeight=	ElementUtil.FetchDropdownSelectedValue(maxGrossWeightdd);
		return GrossWeight;	
	}






}
































