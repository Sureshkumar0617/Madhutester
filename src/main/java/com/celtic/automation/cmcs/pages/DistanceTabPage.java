package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.celtic.automation.cmcs.util.ElementUtil;

public class DistanceTabPage {

	public WebDriver driver;
	public DistanceTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Distance Details

	@FindBy(css = "#contentMsg > div > ul > li:nth-child(1) > span") WebElement distanceVerificationMsg1;
	@FindBy(css = "#contentMsg > div > ul > li:nth-child(2) > span") WebElement distanceVerificationMsg2;
	@FindBy(css = "#contentMsg > div > ul > li > span") WebElement distanceVerificationMsg3;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement distanceDistanceDetailsSubhdr;

	@FindBy(xpath="//label[@for='ReportingPeriodFrom']") WebElement distanceReportingperiodFromLbl;
	@FindBy(xpath="//input[@id='ReportingPeriodFrom']") WebElement distanceReportingperiodFromTxt;

	@FindBy(xpath="//label[@for='ReportingPeriodTo']") WebElement distanceReportingperiodToLbl;
	@FindBy(xpath="//input[@id='ReportingPeriodTo']") WebElement distanceReportingperiodToTxt;

	@FindBy(xpath="//label[@for='UsdotNbr']") WebElement distanceUSDOTNoLbl;
	@FindBy(xpath="//input[@id='UsdotNbr']") WebElement distanceUSDOTNoFromTxt;

	@FindBy(xpath="//label[@for='EstimatedDistanceChart']") WebElement distanceVehicleDistanceChartLbl;
	@FindBy(xpath="//input[@id='EstimatedDistanceChart']") WebElement distanceVehicleDistanceChartChk;

	@FindBy(xpath="//label[@for='OverrideContJur']") WebElement distanceOverrideContJurLbl;
	@FindBy(xpath="//input[@id='OverrideContJur']") WebElement distanceOverrideContJurChk;

	@FindBy(xpath="//label[@for='EstimatedDistance']") WebElement distanceEstimatedDistanceLbl;
	@FindBy(xpath="//input[@id='EstimatedDistance']") WebElement distanceEstimatedDistanceTxt;

	@FindBy(xpath="//label[@for='EstimatedDistanceGen']") WebElement distanceEstimatedDistance1Lbl;
	@FindBy(xpath="//input[@id='EstimatedDistanceGen']") WebElement distanceEstimatedDistance1Txt;

	@FindBy(xpath="//label[@for='ActualDistance']") WebElement distanceActualDistanceLbl;
	@FindBy(xpath="//input[@id='ActualDistance']") WebElement distanceActualDistanceTxt;

	@FindBy(xpath="//label[@for='ActualDistanceGen']") WebElement distanceActualDistance1Lbl;
	@FindBy(xpath="//input[@id='ActualDistanceGen']") WebElement distanceActualDistance1Txt;

	@FindBy(xpath="//label[@for='TotalFleetDistance']") WebElement distanceTotalFleetDistanceLbl;
	@FindBy(xpath="//input[@id='TotalFleetDistance']") WebElement distanceTotalFleetDistanceTxt;

	@FindBy(xpath="//label[@for='TotalFleetDistanceGen']") WebElement distanceTotalFleetDistance1Lbl;
	@FindBy(xpath="//input[@id='TotalFleetDistanceGen']") WebElement distanceTotalFleetDistance1Txt;

	@FindBy(xpath="//label[@for='FRPMlgQuetion']") WebElement distanceReportingPeriodQuestionLbl;
	@FindBy(xpath="//input[@id='FRPMlgQuetion']") List<WebElement> distanceReportingPeriodQuestionrd;

	@FindBy(xpath="//input[@id='FRPMlgQuetion' and @value='Y']") WebElement distanceQuestionYes;
	@FindBy(xpath="//input[@id='FRPMlgQuetion' and @value='N']") WebElement distanceQuestionNo;

	@FindBy(xpath="//label[@for='DistanceType']") WebElement distanceDistanceTypeLbl;
	@FindBy(xpath="//select[@id='DistanceType']") WebElement distanceDistanceTypedd;

	@FindBy(xpath="//label[@for='ActualDistConfirmation']") WebElement distanceActualDistanceQuestionLbl;
	@FindBy(xpath="//input[@id='ActualDistConfirmation']") WebElement distanceActualDistanceQuestionChk;

	@FindBy(xpath="//a[@id='showMapId']") WebElement distanceshowMaplnk;

	@FindBy(xpath="(//th[@class='leftAlign'])[1]") WebElement distanceJurisdictionTbl;
	@FindBy(xpath="(//th[@class='rightAlign'])[1]") WebElement distancedistanceTbl;
	@FindBy(xpath="(//th[@scope='col'])[1]") WebElement distancePercentTbl;

	@FindBy(xpath="//input[@id='MileageDataVMList_0__JurCode']//preceding-sibling::span") WebElement distanceJuri0;
	@FindBy(xpath="//input[@id='MileageDataVMList_0__Mileage']") WebElement distanceJuri0Value;
	@FindBy(xpath="//input[contains(@id,'MileageDataVMList')and contains(@id,'JurCode')]//preceding-sibling::span") List<WebElement> distanceJurisList;
	@FindBy(xpath="//input[contains(@class,'rightAlign') and contains(@id,'MileageDataVMList')]")List<WebElement> distanceDistanceJurisList;

	//Reinstatement Distance Tab
	@FindBy(xpath="//a[@id='MileageBtn']") WebElement distanceDistanceTab;
	@FindBy(xpath="//h3[@class='float-left']") WebElement distanceReinstateSubhdr;

	//Distance Grid
	@FindBy(xpath="//table[@id='dtlstJurisdiction']//tr/th[not(contains(@class,'hidden'))]") List<WebElement> distanceJurisTableHeader; //take text
	@FindBy(xpath="//input[contains(@id,'MileageDataVMList') and contains(@id,'_JurCode')]/preceding-sibling::span") List<WebElement> distanceJuris; //take text
	@FindBy(xpath="//input[contains(@id,'MileageDataVMList') and contains(@id,'_Mileage') and not (contains(@id,'Type'))]") List<WebElement> distanceDistance;  //text
	@FindBy(xpath="//input[contains(@id,'MileageDataVMList') and contains(@id,'Percent')]/preceding-sibling::span") List<WebElement> distancePercent; //text
	@FindBy(xpath="//table[@id='dtlstJurisdiction']//tr/th[not(contains(@class,'hidden')) and contains(text(),'Jur')]") WebElement distanceJurisTableHeaderJuri; //take text
	@FindBy(xpath="//table[@id='dtlstJurisdiction']//tr/th[not(contains(@class,'hidden')) and contains(text(),'Dist')]") WebElement distanceJurisTableHeaderDistance; //take text
	@FindBy(xpath="//table[@id='dtlstJurisdiction']//tr/th[not(contains(@class,'hidden')) and contains(text(),'Percent')]") WebElement distanceJurisTableHeaderPercent; //take text


	public void selectYesOrNo(String selectvalue) {
		ElementUtil.waitUntilElementsVisible(distanceReportingPeriodQuestionrd);
		for(WebElement a:distanceReportingPeriodQuestionrd) {
			if(a.getAttribute("value").equalsIgnoreCase(selectvalue)) { //"Y" //"N"
				ElementUtil.clickElement(a);
				break;
			}
		}
	}
	public void enterMODistanceValue( String juri,String distanceValuedynamic) {
		ElementUtil.waitUntilElementsVisible(distanceJurisList);
		for(int i=0;i<distanceJurisList.size();i++) {
			Boolean valuexists=ElementUtil.validateTextbox(distanceDistanceJurisList.get(i));
			if(distanceJurisList.get(i).getText().equalsIgnoreCase(juri) && valuexists==false) { //"MO - MISSOURI"
				ElementUtil.webEditTxtChange(distanceDistanceJurisList.get(i),distanceValuedynamic);
				break;
			}
		}
	}
	public void enterAllDistanceValue(String distanceValuedynamic) {
		ElementUtil.waitUntilElementsVisible(distanceJurisList);
		for(int i=0;i<distanceDistanceJurisList.size();i++) {
			ElementUtil.webEditTxtChange(distanceDistanceJurisList.get(i),distanceValuedynamic);
		}
	}
	public void enterEstimatedDistance(String estimatedDistanceValue) {
		ElementUtil.webEditTxtChange(distanceEstimatedDistanceTxt,estimatedDistanceValue);
	}

	//Reinstatement
	public void validateDistancetab(String textmsg) {	
		if(ElementUtil.FetchTextBoxValuewithText(distanceDistanceTab).contains(textmsg)==true) {
			assert true;
		}
		else {
			assert false;
		}
	}

	public void validatesubhdr(String hdrvalue) {
		if(ElementUtil.FetchTextBoxValuewithText(distanceReinstateSubhdr).contains(hdrvalue))
			assert true;
	}

	//Fetch Details
	public String distanceReportingPeriodFromlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceReportingperiodFromLbl);
	}

	public String distanceReportingPeriodFrom() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceReportingperiodFromTxt,"value");
	}
	public String distanceReportingPeriodTolbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceReportingperiodToLbl);
	}

	public String distanceReportingPeriodTo() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceReportingperiodToTxt,"value");
	}

	public String distanceUsdotNbrlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceUSDOTNoLbl);
	}

	public String distanceUsdotNbr() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceUSDOTNoFromTxt,"value");
	}

	public String distanceEstimatedDistanceChartlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceVehicleDistanceChartLbl);
	}

	public String distanceEstimatedDistanceChart() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(distanceVehicleDistanceChartChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}
	public String distanceOverrideContJurlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceOverrideContJurLbl);
	}

	public String distanceOverrideContJur() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(distanceOverrideContJurChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String distanceEstimatedDistancelbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceEstimatedDistanceLbl);
	}

	public String distanceEstimatedDistance() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceEstimatedDistanceTxt,"value");
	}

	public String distanceActualDistancelbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceActualDistanceLbl);
	}

	public String distanceActualDistance() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceActualDistanceTxt,"value");
	}

	public String distanceTotalFleetDistancelbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceTotalFleetDistanceLbl);
	}

	public String distanceTotalFleetDistance() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceTotalFleetDistanceTxt,"value");
	}

	public String distanceFRPMlgQuetionlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceReportingPeriodQuestionLbl);
	}

	public String distanceFRPMlgQuetion() {
		String value;
		if(!(ElementUtil.FetchTextBoxValuewithattribute(distanceQuestionYes,"checked").isEmpty())) {
			value=ElementUtil.FetchTextBoxValuewithattribute(distanceQuestionYes,"value"); }
		else {
			value=ElementUtil.FetchTextBoxValuewithattribute(distanceQuestionNo,"value"); }
		return value;
	}
	public String distanceDistanceTypelbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceDistanceTypeLbl);
	}

	public String distanceDistanceType() {
		return ElementUtil.FetchTextBoxValuewithattribute(distanceDistanceTypedd,"value");
	}
	public String distanceActualDistConfirmationlbl() {
		return ElementUtil.FetchTextBoxValuewithText(distanceActualDistanceQuestionLbl);
	}

	public String distanceActualDistConfirmation() {
		boolean boolstatus=false;
		if(ElementUtil.FetchTextBoxValuewithattribute(distanceActualDistanceQuestionChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public ArrayList<String> fetchTableHeader() {
		ElementUtil.waitUntilElementsVisible(distanceJurisTableHeader);
		ArrayList<String> headersArray = new ArrayList<String>();
		for(int i=0;i<distanceJurisTableHeader.size();i++) {
			headersArray.add(ElementUtil.FetchTextBoxValuewithText(distanceJurisTableHeader.get(i)));
		}
		return headersArray;
	}
	public ArrayList<String> fetchTableJuris() {
		ElementUtil.waitUntilElementsVisible(distanceJuris);
		ArrayList<String> jurisArray = new ArrayList<String>();
		for(int i=0;i<distanceJuris.size();i++) {
			jurisArray.add(ElementUtil.FetchTextBoxValuewithText(distanceJuris.get(i)));
		}
		return jurisArray;
	}
	//change
	public ArrayList<String> fetchTablePercent() { 
		ElementUtil.waitUntilElementsVisible(distancePercent);
		ArrayList<String> percentArray = new ArrayList<String>();
		for(int i=0;i<distancePercent.size();i++) {
			percentArray.add(ElementUtil.FetchTextBoxValuewithText(distancePercent.get(i)));
		}
		return percentArray;
	}
	public ArrayList<String> fetchTableDistanceMiles() {
		ElementUtil.waitUntilElementsVisible(distanceDistance);
		ArrayList<String> distanceMilesArray = new ArrayList<String>();
		for(int i=0;i<distanceDistance.size();i++) {
			distanceMilesArray.add(ElementUtil.FetchTextBoxValuewithattribute(distanceDistance.get(i),"value"));
		}
		return distanceMilesArray;
	}


	public String distanceValidateMessage1() {
		ElementUtil.highlightElement(driver, distanceVerificationMsg1);
		return ElementUtil.FetchTextBoxValuewithText(distanceVerificationMsg1);
	}
	public String distanceValidateMessage2() {
		ElementUtil.highlightElement(driver, distanceVerificationMsg2);
		return ElementUtil.FetchTextBoxValuewithText(distanceVerificationMsg2);
	}

	public String distanceValidateMessage3() {
		ElementUtil.highlightElement(driver, distanceVerificationMsg3);
		return ElementUtil.FetchTextBoxValuewithText(distanceVerificationMsg3);
	}

	public ArrayList<String> FetchTable_DistanceMiles() {
		ElementUtil.waitUntilElementsVisible(distanceDistance);
		ArrayList<String> DistanceMiles_Array = new ArrayList<String>();
		for(int i=0;i<distanceDistance.size();i++) {
			DistanceMiles_Array.add(ElementUtil.FetchTextBoxValuewithattribute(distanceDistance.get(i),"value"));
		}
		return DistanceMiles_Array;
	}
	public ArrayList<String> FetchTable_Percent() {
		ElementUtil.waitUntilElementsVisible(distancePercent);
		ArrayList<String> Percent_Array = new ArrayList<String>();
		for(int i=0;i<distancePercent.size();i++) {
			Percent_Array.add(ElementUtil.FetchTextBoxValuewithText(distancePercent.get(i)));
		}
		return Percent_Array;
	}
	public ArrayList<String> FetchTable_Juris() {
		ElementUtil.waitUntilElementsVisible(distanceJuris);
		ArrayList<String> Juris_Array = new ArrayList<String>();
		for(int i=0;i<distanceJuris.size();i++) {
			Juris_Array.add(ElementUtil.FetchTextBoxValuewithText(distanceJuris.get(i)));
		}
		return Juris_Array;
	}
	public String distanceJurisTableHeaderPercent() {
		return ElementUtil.FetchTextBoxValuewithText(distanceJurisTableHeaderPercent);
	}
	public String distanceJurisTableHeaderDistance() {
		return ElementUtil.FetchTextBoxValuewithText(distanceJurisTableHeaderDistance);
	}
	public String distanceJurisTableHeaderJuri() {
		return ElementUtil.FetchTextBoxValuewithText(distanceJurisTableHeaderJuri);
	}











}

