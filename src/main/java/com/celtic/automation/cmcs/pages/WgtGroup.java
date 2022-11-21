package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class WgtGroup {


	public WebDriver driver;
	public WgtGroup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#contentMsg > div > ul > li > span") WebElement weightVerificationMsg;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement weightGroupListSubHdr;

	@FindBy(xpath="//th[contains(@class,'sorting_disabled')  and contains(text(),'No')]") WebElement weightGroupNoTbl;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')  and contains(text(),'Type')]") WebElement weightGroupTypeTbl;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')  and contains(text(),'Base')]") WebElement baseJurisdictionWeightTbl;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')  and contains(text(),'Gross')]") WebElement maxGrossWeightTbl;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')  and contains(text(),'Different')]") WebElement jurWithDifferentWeightsTbl;

	@FindBy(xpath="//input[@id='btnAddWeightGroup']") WebElement addWeightGroupBtn;
	@FindBy(xpath="(//td[contains(@class,'leftAlign')])[2]") WebElement jurWithWeight;

	@FindBy(xpath="(//a[@id='lnkGridSelectWgtGrpSelectGrid'])[1]") WebElement fleetGridFirstHandimg;

	@FindBy(xpath="//table[@id='WgtGrpSelectGrid']/tbody//tr") List<WebElement> noOfRows;


	@FindBy(xpath="//tr[@role='row']/th[not (contains(@class,'hidden'))]") List<WebElement> tableHeader;
	@FindBy(xpath="//tr[@role='row']/td[not (contains(@class,'hidden'))]") List<WebElement> weightTableRows;

	public void clickHandImg() {
		if(ElementUtil.isPresentAndDisplayed(fleetGridFirstHandimg)) {
			ElementUtil.clickElement(fleetGridFirstHandimg);
		}	
	}

	public void clickAddWeightGroup() {
		if(ElementUtil.isPresentAndDisplayed(addWeightGroupBtn)) {
			ElementUtil.clickElement(addWeightGroupBtn);
		}
	}

	public String fetchJurWithDiffWeights() {
		return ElementUtil.FetchTextBoxValuewithText(jurWithWeight);
	}

	public String[] validateJurisWeightsedited() {
		return fetchJurWithDiffWeights().split("[,]", 0);
	}


	public ArrayList<String> fetchTableHeader() {
		ElementUtil.waitUntilElementsVisible(tableHeader);
		ArrayList<String>headersArray =new ArrayList<String>();
		for(int i=0;i<tableHeader.size();i++) {
			headersArray.add(ElementUtil.FetchTextBoxValuewithText(tableHeader.get(i)));
		}
		return headersArray;
	}

	public ArrayList<String> fetchTableRowData() {
		ElementUtil.waitUntilElementsVisible(weightTableRows);
		ArrayList<String>rowDataArray =new ArrayList<String>();
		for(int i=0;i<weightTableRows.size();i++) {
			rowDataArray.add(ElementUtil.FetchTextBoxValuewithText(weightTableRows.get(i)));
		}
		return rowDataArray;
	}

	public String weightValidateMessage() {
		ElementUtil.highlightElement(driver, weightVerificationMsg);
		return ElementUtil.FetchTextBoxValuewithText(weightVerificationMsg);
	}	

}
