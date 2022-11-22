package parallel;

import java.io.IOException;
import java.util.ArrayList;
import com.celtic.automation.cmcs.factory.DriverFactory;
import com.celtic.automation.cmcs.pages.AccountTabPage;
import com.celtic.automation.cmcs.pages.BillingTab;
import com.celtic.automation.cmcs.pages.CommonObjects;
import com.celtic.automation.cmcs.pages.DashBoardPage;
import com.celtic.automation.cmcs.pages.DistanceTabPage;
import com.celtic.automation.cmcs.pages.Financepage;
import com.celtic.automation.cmcs.pages.FleetPage;
import com.celtic.automation.cmcs.pages.FleetTabPage;
import com.celtic.automation.cmcs.pages.InstallmentPage;
import com.celtic.automation.cmcs.pages.InventoryPage;
import com.celtic.automation.cmcs.pages.LoginPage;
import com.celtic.automation.cmcs.pages.Payment;
import com.celtic.automation.cmcs.pages.PaymentTab;
import com.celtic.automation.cmcs.pages.VehicleAdd;
import com.celtic.automation.cmcs.pages.VehicleAmend;
import com.celtic.automation.cmcs.pages.VehicleDelete;
import com.celtic.automation.cmcs.pages.VehicleTabPage;
import com.celtic.automation.cmcs.pages.WgtGroup;
import com.celtic.automation.cmcs.pages.WgtGroupAdd;
import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;
import com.celtic.automation.cmcs.util.ReadExcelUtil;
import com.celtic.automation.cmcs.util.Screenshot_Utility;
import com.celtic.automation.cmcs.util.WriteExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.rules.ErrorCollector;

public class RWC_001 {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private DashBoardPage dashboardpage = new DashBoardPage(DriverFactory.getDriver());
	private AccountTabPage accounttabpage = new AccountTabPage(DriverFactory.getDriver());
	private FleetTabPage fleettabpage = new FleetTabPage(DriverFactory.getDriver());
	private FleetPage fleetpage = new FleetPage(DriverFactory.getDriver());
	private CommonObjects commonobjects = new CommonObjects(DriverFactory.getDriver());
	private DistanceTabPage distancetabpage = new DistanceTabPage(DriverFactory.getDriver());
	private WgtGroup wgtgroup = new WgtGroup(DriverFactory.getDriver());
	private WgtGroupAdd wgtgroupadd = new WgtGroupAdd(DriverFactory.getDriver());
	private VehicleTabPage Vehicletabpage = new VehicleTabPage(DriverFactory.getDriver());
	private VehicleAmend vehicleAmend =new VehicleAmend(DriverFactory.getDriver());
	private VehicleDelete vehicleDelete =new VehicleDelete(DriverFactory.getDriver());
	private BillingTab billingtab = new BillingTab(DriverFactory.getDriver());
	private Payment pay =new Payment(DriverFactory.getDriver());
	private PaymentTab paymenttab = new PaymentTab(DriverFactory.getDriver());
	private InventoryPage inventorypage = new InventoryPage(DriverFactory.getDriver());
	private InstallmentPage installmentpage = new InstallmentPage(DriverFactory.getDriver());
	private VehicleAdd vehicleadd= new VehicleAdd(DriverFactory.getDriver());
	private Financepage financepage =new Financepage(DriverFactory.getDriver());

	int RowNo=1;

	private ElementUtil eleutil =new ElementUtil();
	private Screenshot_Utility screenshotUtil =new Screenshot_Utility();
	private ConfigReader config=new ConfigReader();
	private Logger log = LogManager.getLogger("RWC_001");
	private ReadExcelUtil excelutil=null;
	private WriteExcelUtil excelutilWrite=null;
	private ErrorCollector error = new ErrorCollector();
	
	
	
	@Given("User login as a Internal user")
	public void user_login_as_a_internal_user() throws Exception {
		
		log.info("Opened Browser");
		
		CommonStep.scenario.log("Launch the application using URL and login with valid credentials");	
		//excelutil.meth(config.readRWCexcel());
		
		DriverFactory.getDriver().get(config.readLoginURL());
		log.info("****************************** Login to the application  *****************************************");
		screenshotUtil.captureScreenshot("ApplicationLogin");
		loginpage.enterUsername(config.readLoginInternalUser());
		log.info("*** Enter Username ***");
		screenshotUtil.captureScreenshot("Username");
		loginpage.enterPassword(config.readpswrd());
		log.info("*** Enter Password ***");
		screenshotUtil.captureScreenshot("Password");
		loginpage.clickLoginBtn();
		log.info("*** Click Login ***");
		screenshotUtil.captureScreenshot("Login");
	}

	@When("User will navigate to the IRPLink")
	public void user_will_navigate_to_the_irp_link() throws Exception {
		CommonStep.scenario.log("Expand the Services header on the left column of the screen and select IRP");
	    CommonStep.scenario.log("Click on Renew fleet from Fleet card menu.");
		dashboardpage.clickIRPLink();
		log.info("*** Click IRP ***");
		screenshotUtil.captureScreenshot("IRP");
		dashboardpage.clickRenewFleetLink();
		log.info("*** Click RenewFleet ***");
		screenshotUtil.captureScreenshot("RenewFleet");
	}
	@Then("User will provide all the Account Number Details to start with IRP Transaction")
	public void user_will_provide_all_the_account_number_details_to_start_with_irp_transaction() throws IOException, Exception {
        CommonStep.scenario.log("Enter valid search data and click to proceed");
		excelutil = new ReadExcelUtil(config.readRWCexcel());
		excelutilWrite=new WriteExcelUtil();
		fleetpage.enterAccountNo(excelutil.getCellData("PreSetup","AccountNumber",RowNo));
		log.info("*** Enter Account Number ***");
		screenshotUtil.captureScreenshot("Entering AccountNumber");
		fleetpage.enterFleetNo(excelutil.getCellData("PreSetup","FleetNumber",RowNo));
		log.info("*** Enter FleetNo ***");
		screenshotUtil.captureScreenshot("Entering FleetNumber");
		fleetpage.enterFleetyear(excelutil.getCellData("PreSetup","Fleet Expiration Year",RowNo));
		log.info("*** Click FleetYear ***");
		screenshotUtil.captureScreenshot("Entering FleetYear");
		commonobjects.clickProceed();	


	}

	@Then("User will navigate to account section and fill the data")
	public void user_will_navigate_to_account_section_and_fill_the_data_and_validate_message() throws Exception, Exception {
		//Fetch Values
		
		CommonStep.scenario.log("Enter valid all detail in account page with comments and click on proceed button");
		excelutilWrite.setCellData("Account",accounttabpage.fetchMCECustomernolbl(),RowNo,accounttabpage.fetchMCECustomerno());
		excelutilWrite.setCellData("Account",accounttabpage.fetchRegistrationTypelbl(), RowNo,accounttabpage.fetchRegistrationType());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountCarrierTypeLbl(), RowNo,accounttabpage.fetchAccountCarrierType());
		excelutilWrite.setCellData("Account",accounttabpage.fetchIFTAAccountNbrlbl(),RowNo,accounttabpage.fetchIFTAAccountNbr());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountCustomerStatusLbl(),RowNo,accounttabpage.fetchAccountCustomerStatus());

		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountStreet0Lbl(),RowNo,accounttabpage.fetchAccountStreet0());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountZip0lbl(),RowNo,accounttabpage.fetchAccountZip0());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountJur0lbl(), RowNo,accounttabpage.fetchAccountJur0());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountCity0lbl(),RowNo,accounttabpage.fetchAccountCity0());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountCounty0lbl(), RowNo,accounttabpage.fetchAccountCounty0());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab1()+accounttabpage.fetchAccountCountry0lbl(),RowNo,accounttabpage.fetchAccountCountry0());

		accounttabpage.clickMailingAddress();
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountStreet1lbl(),RowNo,accounttabpage.fetchAccountStreet1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountZip1lbl(), RowNo,accounttabpage.fetchAccountZip1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountJur1lbl(), RowNo,accounttabpage.fetchAccountJur1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountCity1lbl(),RowNo,accounttabpage.fetchAccountCity1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountCounty1lbl(),RowNo,accounttabpage.fetchAccountCounty1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountCountry1lbl(),RowNo,accounttabpage.fetchAccountCountry1());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountsTab2()+accounttabpage.fetchAccountAttentionTolbl(),RowNo,accounttabpage.fetchAccountAttentionTo());

		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountUSDOTNolbl(), RowNo,accounttabpage.fetchAccountUSDOTNo());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountTPIDlbl(),RowNo,accounttabpage.fetchAccountTPID());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountContactnamelbl(), RowNo,accounttabpage.fetchAccountContactname());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountEmaillbl(),RowNo,accounttabpage.fetchAccountEmail());

		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountPrimaryPhonelbl(),RowNo,accounttabpage.fetchAccountPrimaryPhone());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountAlternatePhonelbl(), RowNo,accounttabpage.fetchAccountAlternatePhone());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountFaxNolbl(),RowNo,accounttabpage.fetchAccountFaxNo());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountEmailnotificationlbl(), RowNo,accounttabpage.fetchAccountEmailnotification());
		excelutilWrite.setCellData("Account",accounttabpage.fetchAccountFaxnotificationlbl(),RowNo,accounttabpage.fetchAccountFaxnotification());

		log.info(commonobjects.validateInfoMsgs());
		accounttabpage.checkEmailNotification();
		log.info("*** Check Email Notification ***");
		screenshotUtil.captureScreenshot("Check EmailNotification");
		commonobjects.provideComments(excelutil.getCellData("AccountTab","Comments",RowNo));
		log.info("*** Enter Comments ***");
		screenshotUtil.captureScreenshot("Enter Comments in Account Section");
		commonobjects.clickProceed();
		//Account Verification Screen
		CommonStep.scenario.log("Click on proceed from the verification page");
		commonobjects.clickProceed();
	}

	@Then("User will navigate to Fleet section and fill the data and validate message  {string}")
	public void user_will_navigate_to_fleet_section_and_fill_the_data_and_validate_message(String expSucces) throws Exception {
		//Fetch Fleet Details screen 
		CommonStep.scenario.log("Enter update all the mandatory and valid details in fleet page. Also update Fleet Expiration Date & Fleet Type & Commodity Class and click on proceed button after entering comments");
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchRegistrationtypelbl(), RowNo,fleettabpage.fetchRegistrationtype());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchfltstatuslbl(),RowNo,fleettabpage.fetchfltstatus());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchcarriertypelbl(), RowNo,fleettabpage.fetchcarriertype());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchDBANamelbl(),RowNo, fleettabpage.fetchDBAName());

		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetStreet0Lbl(),RowNo,fleettabpage.fleetStreet0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetZip0Lbl(),RowNo,fleettabpage.fleetZip0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetJur0Lbl(), RowNo,fleettabpage.fleetJur0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetCity0Lbl(),RowNo, fleettabpage.fleetCity0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetCounty0Lbl(), RowNo,fleettabpage.fleetCounty0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetCountry0Lbl(),RowNo,fleettabpage.FleetCountry0());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabBusinessAddress()+fleettabpage.fleetNonDeliverable0Lbl(), RowNo,fleettabpage.fleetNonDeliverable0());

		fleettabpage.clickMailingAddress();
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetStreet1Lbl(),RowNo,fleettabpage.fleetStreet1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetZip1Lbl(),RowNo,fleettabpage.fleetZip1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetJur1Lbl(), RowNo,fleettabpage.fleetJur1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetCity1Lbl(),RowNo, fleettabpage.FleetCity1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetCounty1Lbl(), RowNo,fleettabpage.fleetCounty1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetCountry1Lbl(),RowNo,fleettabpage.fleetCountry1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetNonDeliverable1Lbl(), RowNo,fleettabpage.fleetNonDeliverable1());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabMailingAddress()+fleettabpage.fleetAttentionToLbl(), RowNo,fleettabpage.fleetAttentionTO());

		fleettabpage.navigateToServiceProvider();
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceProviderLbl(), RowNo,fleettabpage.fleetServiceProvider());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceLegalNameLbl(),RowNo,fleettabpage.fleetServiceLegalName());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceDBANameLbl(), RowNo,fleettabpage.fleetServiceDBAName());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServicePowerOfAttroneyLbl(),RowNo, fleettabpage.fleetServicePowerOfAttroney());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServicePowerOfAttroneyEffDateLbl(), RowNo,fleettabpage.fleetServicePowerOfAttroneyEffDate());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServicePowerOfAttroneyExpDateLbl(),RowNo,fleettabpage.fleetServicePowerOfAttroneyExpDate());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceEmailIdLbl(), RowNo,fleettabpage.fleetServiceEmailId());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServicePhoneNoLbl(),RowNo, fleettabpage.fleetServicePhoneNo());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceFaxNoLbl(), RowNo,fleettabpage.fleetServiceFaxNo());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceStreetLbl(),RowNo,fleettabpage.fleetServiceStreet());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceCityLbl(), RowNo,fleettabpage.fleetServiceCity());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceJurLbl(),RowNo, fleettabpage.fleetServiceJur());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceZipCodeLbl(), RowNo,fleettabpage.fleetServiceZipCode());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabServiceProviderAddress()+fleettabpage.fleetServiceCountryLbl(),RowNo,fleettabpage.fleetServiceCountry());

		fleettabpage.clickOnTimeMailingAddress();
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingStreetLbl(), RowNo,fleettabpage.fleetServiceMailingStreet());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingZipCodeLbl(),RowNo, fleettabpage.fleetServiceMailingZipCode());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingJurLbl(), RowNo,fleettabpage.fleetServiceMailingJur());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingCityLbl(),RowNo,fleettabpage.fleetServiceMailingCity());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingCountyLbl(), RowNo,fleettabpage.fleetServiceMailingCounty());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingCountryLbl(),RowNo, fleettabpage.fleetServiceMailingCountry());
		excelutilWrite.setCellData("Fleet",fleettabpage.fetchFleetTabOneTimeMailingAddress()+fleettabpage.fleetServiceMailingAttentionToLbl(), RowNo,fleettabpage.fleetServiceMailingAttentionTo());

		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsContactNameLbl(),RowNo,fleettabpage.fleetDetailsContactName());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsEmailIdLbl(), RowNo,fleettabpage.fleetDetailsEmailId());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsPrimaryCellNbrLbl(),RowNo, fleettabpage.fleetDetailsPrimaryCellNbr());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsAlternateCellNbrLbl(), RowNo,fleettabpage.fleetDetailsAlternateCellNbr());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsFaxNoLbl(),RowNo, fleettabpage.fleetDetailsFaxNo());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsTpIdLbl(), RowNo,fleettabpage.fleetDetailsTPID());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsUsdotNbrLbl(),RowNo,fleettabpage.fleetDetailsUsdotNbr());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsChangeVehUsdotTinLbl(), RowNo,fleettabpage.fleetDetailsChangeVehUsdotTin());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsFltTypeLbl(),RowNo, fleettabpage.fleetDetailsFltType());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsCommodityClassLbl(), RowNo,fleettabpage.fleetDetailsCommodityClass());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsFltEffDateLbl(),RowNo,fleettabpage.fleetDetailsFltEffDatedtPicker());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsFltExpDateLbl(), RowNo,fleettabpage.fleetDetailsFltExpDate());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsChangeAddrOnUsdotLbl(),RowNo, fleettabpage.fleetDetailsChangeAddrOnUsdot());

		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsFirstOperatedDateLbl(),RowNo,fleettabpage.fleetDetailsFirstOperatedDate());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsWyomingIndicatorLbl(), RowNo,fleettabpage.fleetDetailsWyomingIndicator());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsIFTADistanceLbl(),RowNo, fleettabpage.fleetDetailsIFTADistance());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsMobileNotificationLbl(), RowNo,fleettabpage.fleetDetailsMobileNotification());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsIRPRequirementsLbl(),RowNo, fleettabpage.fleetDetailsIRPRequirements());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsStatementOfUnderstandingLbl(), RowNo,fleettabpage.fleetDetailsStatementOfUnderstanding());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsInstallmentAgreementLbl(),RowNo,fleettabpage.fleetDetailsInstallmentAgreement());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsPowerOfAttorneyLbl(), RowNo,fleettabpage.fleetDetailsPowerOfAttorney());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsHVUTFormLbl(),RowNo, fleettabpage.fleetDetailsHVUTForm());
		excelutilWrite.setCellData("Fleet",fleettabpage.fleetDetailsPropertyTaxLbl(), RowNo,fleettabpage.fleetDetailsPropertyTax());

		String actualtext = commonobjects.fetchErrorMessage(expSucces);
		
		try {
			Assert.assertEquals(actualtext, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
				
		CommonStep.scenario.log("Message in Fleet Screen"+expSucces);
		

		log.info(commonobjects.validateInfoMsgs());
		log.info("Message in Fleet Screen "+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Fleet Screen 1");


		fleettabpage.navigateToServiceProvider();
		log.info("*** navigateToServiceProvider ***");
		screenshotUtil.captureScreenshot("Navigate to Service provider");

		fleettabpage.clickPowerOfAttroney();
		log.info("*** Click PowerofAttroney ***");
		screenshotUtil.captureScreenshot("Check Power of Attroney");

		fleettabpage.enterEmailID(excelutil.getCellData("FleetTab","Email iD",RowNo));
		log.info("*** Entering the Emailid ***");
		screenshotUtil.captureScreenshot("Entering the Emailid");
		//Expiration Date through Excel
		//	fleettabpage.selectExpirationDate(ExcelReader.FetchDataFromSheet(config.readRWCexcel(), "FleetTab", 2, 13));
		//Expiration Date through System
		fleettabpage.selectExpirationDate(eleutil.getAddedDateInSpecifiedFormat("MMddYYYY",2));
		log.info("*** Selecting the Expiration Date ***");
		screenshotUtil.captureScreenshot("Selecting the Expiration Date");

		fleettabpage.selectIRPRequirementForm(excelutil.getCellData("FleetTab","IRP Requirements Form",RowNo));
		log.info("*** Selecting the IRPRequirementForm ***");
		screenshotUtil.captureScreenshot("Selecting the IRPRequirementForm");

		fleettabpage.selectStatementofUnderstanding(excelutil.getCellData("FleetTab","Statement of Understanding",RowNo));		
		log.info("*** Selecting StatementofUnderstanding ***");
		screenshotUtil.captureScreenshot("Selecting StatementofUnderstanding");

		fleettabpage.selectInstallmentAgreement(excelutil.getCellData("FleetTab","Installment Agreement",RowNo));
		log.info("*** Selecting InstallmentAgreement ***");
		screenshotUtil.captureScreenshot("Selecting InstallmentAgreement");

		fleettabpage.selectPowerOfAttroney(excelutil.getCellData("FleetTab","Power of Attorney",RowNo));
		log.info("*** Selecting PowerOfAttroney ***");
		screenshotUtil.captureScreenshot("Selecting PowerOfAttroney");

		fleettabpage.selectHVUTForm(excelutil.getCellData("FleetTab","HVUT - Form 2290",RowNo));
		log.info("*** Selecting HVUTForm ***");
		screenshotUtil.captureScreenshot("Selecting HVUTForm");		

		fleettabpage.selectPropertyTax(excelutil.getCellData("FleetTab","Property Tax",RowNo));
		log.info("*** Selecting PropertyTax ***");
		screenshotUtil.captureScreenshot("Selecting PropertyTax");		

		commonobjects.provideComments(excelutil.getCellData("FleetTab","Comments",RowNo));
		log.info("*** Enter Comments ***");
		screenshotUtil.captureScreenshot("Enter Comments in Fleet Section");

		commonobjects.clickProceed();
		//Fleet Verification Screen
		CommonStep.scenario.log("Click on proceed button from the verification page");
		commonobjects.clickProceed();
		
	}

	@Then("User will navigate to Distance section and fill the data and validate message {string} {string}")
	public void user_will_navigate_to_distance_section_and_fill_the_data_and_validate_message(String expSucces1, String expSucces2) throws Exception, Exception {
	CommonStep.scenario.log("Select Actual Distance radio button & Enter all the mandatory and valid details in distance page and click on proceed button after entering comments");
		excelutilWrite.setCellData("Distance",distancetabpage.distanceReportingPeriodFromlbl(), RowNo,distancetabpage.distanceReportingPeriodFrom());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceReportingPeriodTolbl(), RowNo,distancetabpage.distanceReportingPeriodTo());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceUsdotNbrlbl(), RowNo,distancetabpage.distanceUsdotNbr());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceEstimatedDistanceChartlbl(), RowNo,distancetabpage.distanceEstimatedDistanceChart());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceOverrideContJurlbl(), RowNo,distancetabpage.distanceOverrideContJur());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceEstimatedDistancelbl(), RowNo,distancetabpage.distanceEstimatedDistance());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceActualDistancelbl(), RowNo,distancetabpage.distanceActualDistance());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceTotalFleetDistancelbl(), RowNo,distancetabpage.distanceTotalFleetDistance());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceFRPMlgQuetionlbl(), RowNo,distancetabpage.distanceFRPMlgQuetion());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceDistanceTypelbl(), RowNo,distancetabpage.distanceDistanceType());
		excelutilWrite.setCellData("Distance",distancetabpage.distanceActualDistConfirmationlbl(), RowNo,distancetabpage.distanceActualDistConfirmation());

		
		//Juris Table Verification
		//Juris Table header
		ArrayList<String> TableHeadervalues=distancetabpage.fetchTableHeader();
		ArrayList<String>  Juris_values=distancetabpage.FetchTable_Juris();
		ArrayList<String>  Distance_values=distancetabpage.FetchTable_DistanceMiles();
		ArrayList<String>  Percent_values=distancetabpage.FetchTable_Percent();

		for(int i=0;i<Juris_values.size();i++) {
			excelutilWrite.setCellData("Distance_Juris",distancetabpage.distanceJurisTableHeaderJuri()+i, RowNo,Juris_values.get(i));
			excelutilWrite.setCellData("Distance_Juris",distancetabpage.distanceJurisTableHeaderDistance()+i, RowNo,Distance_values.get(i));
			excelutilWrite.setCellData("Distance_Juris",distancetabpage.distanceJurisTableHeaderPercent()+i, RowNo,Percent_values.get(i));
		}

		//Juris list
		String actualmessage = commonobjects.fetchErrorMessage(expSucces1);
		try {
		Assert.assertEquals(actualmessage, expSucces1);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Distance Screen"+ expSucces1);
	
		log.info(commonobjects.validateInfoMsgs());
		log.info("Message in Distance Screen"+commonobjects.fetchErrorMessage(expSucces1));

		screenshotUtil.captureScreenshot("Message in Distance Screen 1");
		
		String actualmessage2 = commonobjects.fetchErrorMessage(expSucces2);
		try {
	      Assert.assertEquals(actualmessage2, expSucces2);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Distance Screen"+ expSucces2);
	
		log.info("Message in Distance Screen"+commonobjects.fetchErrorMessage(expSucces1));

		screenshotUtil.captureScreenshot("Message in Distance Screen 1");
		
		distancetabpage.enterAllDistanceValue(excelutil.getCellData("DistanceTab","Distance",RowNo));   	
		//distancetabpage.enterMODistanceValue(excelutil.getCellData("DistanceTab","Juri",RowNo), excelutil.getCellData("DistanceTab","Distance",RowNo));
		log.info("*** Enter MODistanceValue ***");
		screenshotUtil.captureScreenshot("Enter MODistanceValue");

		commonobjects.provideComments(excelutil.getCellData("DistanceTab","Comments",RowNo));
		log.info("*** Enter Comments ***");
		screenshotUtil.captureScreenshot("Enter Comments in Distance Section");

		commonobjects.clickProceed();
        CommonStep.scenario.log("Click on proceed button from the verification page");
		commonobjects.clickProceed();

	}

	@Then("User will navigate to Weight group section and fill the data ans validate message {string}")
	public void user_will_navigate_to_weight_group_section_and_fill_the_data_ans_validate_message(String expSucces) throws Exception {
		CommonStep.scenario.log("Click on Add weight group button Add new Weight Group(s) & enter all the mandatory and valid details in the weight group  page and click on proceed button");
		CommonStep.scenario.log("Update an existing Weight Group & enter comments");
		//Fetch Values into Excel
		ArrayList<String>  headervalues=wgtgroup.fetchTableHeader();
		ArrayList<String>  RowDatavalues=wgtgroup.fetchTableRowData();
		int j,k=0;
		for(int i=0;i<RowDatavalues.size();i++) {
			if(i>5){
				j=i%6;
				if(j==0){
					k++;
				}
				excelutilWrite.setCellData("WeightGroup",headervalues.get(j)+k, RowNo,RowDatavalues.get(i));
				log.info("Weight Group headervalues"+headervalues.get(j));
				log.info("Weight Group RowDatavalues"+RowDatavalues.get(i));
			}
			else{
				excelutilWrite.setCellData("WeightGroup",headervalues.get(i)+k, RowNo,RowDatavalues.get(i)); 
				log.info("Weight Group headervalues"+headervalues.get(i));
				log.info("Weight Group RowDatavalues"+RowDatavalues.get(i));
			}

		}
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		
		CommonStep.scenario.log("Message in Weight Group Screen"+expSucces);
	

		log.info(commonobjects.validateInfoMsgs());
		log.info("Message in Weight Group Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Weight Group Screen 1");

		wgtgroup.clickAddWeightGroup();
		log.info("*** Click AddweightGroup ***");
		screenshotUtil.captureScreenshot("Click AddweightGroup");
		//Add Weight Group Screen
		String WeightGroupCount_Excel=excelutil.getCellData("WeightGrouptab","TotalWeightGroups",RowNo);

		for(int weightcount=0;weightcount<Integer.valueOf(WeightGroupCount_Excel);weightcount++) {
			wgtgroupadd.selectWeightGroupType(excelutil.getCellData("WeightGrouptab","WeightGroup Type"+String.valueOf(weightcount),RowNo));

			log.info("*** Select WeightGroupType ***");
			screenshotUtil.captureScreenshot("Select WeightGroupType");
			wgtgroupadd.enterWeightGroupNo(excelutil.getCellData("WeightGrouptab","Weight Group No."+String.valueOf(weightcount),RowNo));
			log.info("*** Enter WeightGroup No ***");
			screenshotUtil.captureScreenshot("Enter WeightGroup No");
			wgtgroupadd.selectMaxGrossWeight(excelutil.getCellData("WeightGrouptab","Max Gross Weight"+String.valueOf(weightcount),RowNo));
			log.info("*** Select MaxGross Weight ***");
			screenshotUtil.captureScreenshot("Select MaxGross Weight");
			commonobjects.clickProceed();
            CommonStep.scenario.log("Click on proceed button from the verification page");
			commonobjects.clickProceed();
		}

		//Weight Group Screen
		//Edit Existing Weight Group
		/*	wgtgroup.clickHandimg();

		String Juri_ExcelCount=excelutil.getCellData("WeightJuris","Juris Count",RowNo);
		for(int i=0;i<Integer.valueOf(Juri_ExcelCount);i++) {
			String Juri_Excel=excelutil.getCellData("WeightJuris","Juri"+String.valueOf(i),RowNo);
			wgtgroupadd.enterWeight_JuriValue(Juri_Excel);
		}
		commonobjects.clickProceed();
		// Weight Group Verification Screen
		commonobjects.clickProceed();
	//	ArrayList<String> FetchInfoMessages1=commonobjects.validateInfoMsgs();
		log.info(commonobjects.validateInfoMsgs());
		//Validating JUR WITH DIFFERENT WEIGHTS
		String[] weightlist=wgtgroup.validateJurisWeightsedited(); //[AL, AR, AZ]
		for(int i=0;i<Integer.valueOf(Juri_ExcelCount);i++) {
			String Juri_Excel=excelutil.getCellData("WeightJuris","Juri"+String.valueOf(i),RowNo);
			if(weightlist[i].equalsIgnoreCase(Juri_Excel)){
				assert true;
			}
		}*/

		//In Weight Group Screen
		CommonStep.scenario.log("Click Done");
		commonobjects.clickDoneBtn();
	}

	@Then("User will navigate to Add vehicle and validate the message {string} {string} {string}")
	public void user_will_navigate_to_Add_vehicle_and_validate_the_message(String expSucces, String expSucces2, String expSucces3) throws Exception {
		CommonStep.scenario.log("Complete Amend vehicle and delete Vehicle in vehicle page Amend Vehicle(s) and edit Ownership Details Safety USDOT and TIN and change Weight Group such that New Plate is requested Also request TVR and enter comments Delete Vehicle(s) such that all Documents are collected and Comments entered");
		excelutilWrite.setCellData("VehicleTab",Vehicletabpage.fetchAmendVehicleLbl(), RowNo,Vehicletabpage.fetchAmendVehicle());
		excelutilWrite.setCellData("VehicleTab",Vehicletabpage.fetchAddVehiclesLbl(), RowNo,Vehicletabpage.fetchAddVehicles());
		excelutilWrite.setCellData("VehicleTab",Vehicletabpage.fetchDeleteVehicleLbl(), RowNo,Vehicletabpage.fetchDeleteVehicle());
		excelutilWrite.setCellData("VehicleTab",Vehicletabpage.fetchRenewVehicleLbl(), RowNo,Vehicletabpage.fetchRenewVehicle());
		log.info(commonobjects.validateInfoMsgs());

		int NoofVehiclestoAmend=Integer.valueOf(excelutil.getCellData("VehicleTab","NoofVehiclestoAmend",RowNo));
		if(NoofVehiclestoAmend>0) {

			Vehicletabpage.clickAmendVehicleRadioButton();
			log.info("*** Click AmendVehicle RadioButton ***");
			screenshotUtil.captureScreenshot("Click AmendVehicle RadioButton");

			commonobjects.clickProceed();
			log.info(commonobjects.validateInfoMsgs());

			String actualmessage = commonobjects.fetchErrorMessage(expSucces);
			try {
			Assert.assertEquals(actualmessage, expSucces);
			}
			catch(Throwable e) {
				error.addError(e);
			}
			CommonStep.scenario.log("Message in Amend Vehicle Screen"+expSucces);

			log.info("Message in Amend Vehicle Screen"+commonobjects.fetchErrorMessage(expSucces));
			screenshotUtil.captureScreenshot("Message in Amend Vehicle Screen 1");


			for(int i=0;i<NoofVehiclestoAmend;i++) {
				if(NoofVehiclestoAmend>Integer.valueOf(config.readAmendVehicleCondition())) {
					vehicleAmend.selectUnitNoFromSuggestions();
					log.info("*** Select Unit number ***");
					screenshotUtil.captureScreenshot("Select Unit number");
				}
				else {
					//vehicleAmend.selectUnitNoFromExcel(excelutil.getCellData("VehicleAmendTab","Unit"+String.valueOf(i),RowNo));
					vehicleAmend.enterUnitNo(excelutil.getCellData("VehicleAmendTab","Unit"+String.valueOf(i),RowNo));
					log.info("*** Enter Unit number ***");
					screenshotUtil.captureScreenshot("Enter Unit number");
				}
				vehicleAmend.clickSearch();


				if(vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("CG - Converter Gear") || 
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("MT - Motor Totor")||
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("RT - Road Truck")||
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("TK - Straight Truck")||
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("TR - Tractor")||
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("TT - Truck Tractor") ||
						vehicleAmend.fetchAmendVehicleBodyType().equalsIgnoreCase("WR - Wrecker")) {
					vehicleAmend.selectWeightGroupNo(excelutil.getCellData("WeightGrouptab","Vehicle_WeightGroupNo",RowNo));

					log.info("*** Enter WeightGroupNo ***");
					screenshotUtil.captureScreenshot("Enter WeightGroupNo");
					String actualmessage1 = commonobjects.fetchErrorMessage(expSucces2);
					try {
					Assert.assertEquals(actualmessage1, expSucces2);
					}
					catch(Throwable e) {
						error.addError(e);
					}
					CommonStep.scenario.log("Message in Amend Vehicle Screen"+expSucces2);
				
					log.info("Message in Amend Vehicle Screen"+commonobjects.fetchErrorMessage(expSucces2));
					screenshotUtil.captureScreenshot("Message in Amend Vehicle Screen 2");
				}
				vehicleAmend.enterUnladenWeight(excelutil.getCellData("VehicleTab","unladenWeight",RowNo));
				log.info("*** Enter UnladenWeight ***");
				screenshotUtil.captureScreenshot("Enter UnladenWeight");


				vehicleAmend.clickTVR();
				log.info("*** Click TVR ***");
				screenshotUtil.captureScreenshot("Click TVR");

				vehicleAmend.selectSafetyChangedd(excelutil.getCellData("VehicleTab","Safety Change",RowNo));
				log.info("*** Select Safety Changedd ***");
				screenshotUtil.captureScreenshot("Select Safety Changedd");

				vehicleAmend.selectHVUTForm2290(excelutil.getCellData("VehicleTab","HVUT - Form",RowNo));
				log.info("*** Select HVUTForm2290 ***");
				screenshotUtil.captureScreenshot("Select HVUTForm2290");

				vehicleAmend.selectLeaseContract(excelutil.getCellData("VehicleTab","Lease Contract",RowNo));
				log.info("*** Select LeaseContract ***");
				screenshotUtil.captureScreenshot("Select LeaseContract");

				vehicleAmend.selectTitleDocument(excelutil.getCellData("VehicleTab","Title Document",RowNo));
				log.info("*** Select TitleDocument ***");
				screenshotUtil.captureScreenshot("Select TitleDocument");

				vehicleAmend.selectPlateReturndoc(excelutil.getCellData("VehicleTab","Plate Returned Document",RowNo));
				log.info("*** Select PlateReturndoc ***");
				screenshotUtil.captureScreenshot("Select PlateReturndoc");

				vehicleAmend.selectAffidavitDoc(excelutil.getCellData("VehicleTab","Affidavit document",RowNo));
				log.info("*** Select AffidavitDoc ***");
				screenshotUtil.captureScreenshot("Select AffidavitDoc");

				vehicleAmend.selectPropertyTax(excelutil.getCellData("VehicleTab","Property Tax",RowNo));
				log.info("*** Select PropertyTax ***");
				screenshotUtil.captureScreenshot("Select PropertyTax");

				commonobjects.provideComments(excelutil.getCellData("VehicleTab","Ammend_Comments",RowNo));

				log.info("*** Enter Comments ***");
				screenshotUtil.captureScreenshot("Enter Comments in Distance Section");

				commonobjects.clickProceed();
				//Verification Screen
				commonobjects.clickProceed();

				String actualmessage2 = commonobjects.fetchErrorMessage(expSucces3);
				try {
				Assert.assertEquals(actualmessage2, expSucces3);
				}
				catch(Throwable e) {
					error.addError(e);
				}
				CommonStep.scenario.log("Message in Amend Vehicle Screen "+expSucces3);
			
				
				log.info("essage in Amend Vehicle Screen "+commonobjects.fetchErrorMessage(expSucces3));
				screenshotUtil.captureScreenshot("Message in Amend Vehicle Screen");

			}// End of for Loop
			commonobjects.clickDoneBtn();
			log.info(commonobjects.validateInfoMsgs());
		} //End of vehicle ammend if loop
	}


	@Then("User will Delete vehicle as per the requiremnet and validate the message {string}")
	public void user_will_delete_vehicle_as_per_the_requiremnet_and_validate_the_message(String expSucces) throws Exception {
		CommonStep.scenario.log("Go to Vehicle List and update/cancel Amended and Deleted Vehicle details");
		System.out.println("Proceed7");
		log.info(commonobjects.validateInfoMsgs());
		int NoofVehiclestoDelete=Integer.valueOf(excelutil.getCellData("VehicleTab","NoOfVehiclesToDelete",RowNo));	
		if(NoofVehiclestoDelete>0) {
			Vehicletabpage.clickDeleteVehicleRadioButton();
			log.info("**** Click DeleteVehicle ****");
			screenshotUtil.captureScreenshot("Click Delete Vehicle");

			commonobjects.clickProceed();
			log.info(commonobjects.validateInfoMsgs());
			//below lines of code for deleting the vehicles from suggestion box
			String Vehiclescount=excelutil.getCellData("VehicleTab","NoOfVehiclesToDelete",RowNo);
			String PlateStatus=excelutil.getCellData("VehicleTab","Delete_PlateStatus",RowNo);
			String PlateReturnedDocument=excelutil.getCellData("VehicleTab","Delete_PlateReturnedDocument",RowNo);
			String AffidavitDocument=excelutil.getCellData("VehicleTab","Delete_AffidavitDocument",RowNo);
			String Comments=excelutil.getCellData("VehicleTab","Delete_Comments",RowNo);

			if(NoofVehiclestoDelete>Integer.valueOf(config.readDeleteVehicleCondition())) {
				vehicleDelete.deleteFewVehicles(Vehiclescount, PlateStatus, PlateReturnedDocument, AffidavitDocument, Comments);
				commonobjects.clickProceed();
				commonobjects.clickProceed();
			}
			else {

				for(int j=0;j<NoofVehiclestoDelete;j++) {
					//Enter unit # to filter & delete
					vehicleDelete.enterUnitNo(excelutil.getCellData("VehicleDeleteTab","Unit"+String.valueOf(j),RowNo));
					log.info("*** Delete vehicle Enter Unit number ***");
					screenshotUtil.captureScreenshot("Delete vehicle Enter Unit number");

					vehicleDelete.clickonSearch();
					vehicleDelete.ClickCheckBoxFromGrid();

					vehicleDelete.selectPlateStatus(PlateStatus);
					log.info("***DeleteVehicle Select PlateStatus ***");
					screenshotUtil.captureScreenshot("DeleteVehicle Select PlateStatus");

					vehicleDelete.selectPlateReturnedDocument(PlateReturnedDocument);
					log.info("***DeleteVehicle Select PlateReturndoc ***");
					screenshotUtil.captureScreenshot("DeleteVehicle Select PlateReturndoc");

					vehicleDelete.selectAffidavitDocument(AffidavitDocument);
					log.info("***DeleteVehicle Select AffidavitDoc ***");
					screenshotUtil.captureScreenshot("DeleteVehicle Select AffidavitDoc");


					vehicleDelete.entercomments(Comments);
					log.info("*** DeleteVehicle Comment ***");
					screenshotUtil.captureScreenshot("DeleteVehicle Comment");

					commonobjects.clickProceed();
					commonobjects.clickProceed();
				}//End of For Loop
			} //End of if loop
			String actualmessage = commonobjects.fetchErrorMessage(expSucces);
			try {
			Assert.assertEquals(actualmessage, expSucces);
			}
			catch(Throwable e) {
				error.addError(e);
			}
			CommonStep.scenario.log("Message in Delete Vehicle Screen"+expSucces);
			
			log.info(commonobjects.validateInfoMsgs());
			log.info("Message in Delete Vehicle Screen"+commonobjects.fetchErrorMessage(expSucces));
			screenshotUtil.captureScreenshot("Message in Delete Vehicle Screen 1");
			commonobjects.clickDoneBtn();
			log.info(commonobjects.validateInfoMsgs());
		}//End of vehicle Delete if loop
	}
	@Then("User will confirm cancel {string}")
	public void user_will_confirm_cancel(String expSucces) throws Exception {
		//verification screen before going to billing screen -Vehicles cancel from Vehicle List
		Vehicletabpage.clickVehicleList();
		log.info("*** Click VehicleList ***");
		screenshotUtil.captureScreenshot("Click VehicleList");
			//Canceling the Amended Vehicle
		vehicleadd.enterUnitNumber(excelutil.getCellData("VehicleAmendTab","Unit0",RowNo));
		log.info("*** Select Unit No ***");
		screenshotUtil.captureScreenshot("Select Unit No");

		vehicleAmend.clickSearch();
		log.info("*** Search Unit No ***");
		screenshotUtil.captureScreenshot("Search Unit No");
		//	}
		vehicleadd.selectFirstHandIcon();
		commonobjects.clickCancelBtn();
		eleutil.handleAlert();
		log.info(commonobjects.validateInfoMsgs());
		log.info("Message in Vehicle Cancel Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Vehicle Cancel Screen 1");

		//Canceling the Deleted Vehicle
		Vehicletabpage.clickVehicleList();
		log.info("*** Click VehicleList ***");
		screenshotUtil.captureScreenshot("Click VehicleList");

		vehicleadd.enterUnitNumber(excelutil.getCellData("VehicleDeleteTab","Unit0",RowNo));
		log.info("*** Select Unit No ***");
		screenshotUtil.captureScreenshot("Select Unit No");

		vehicleAmend.clickSearch();
		log.info("*** Search Unit No ***");
		screenshotUtil.captureScreenshot("Search Unit No");
		//	}
		vehicleadd.selectFirstHandIcon();
		commonobjects.ClickConfirmCancel();
		eleutil.handleAlert();
		log.info(commonobjects.validateInfoMsgs());
		
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Vehicle Cancel Screen"+ expSucces);
	
		
		log.info("Message in Vehicle Cancel Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Vehicle Cancel Screen 1");

		commonobjects.clickBack();
		log.info(commonobjects.validateInfoMsgs());
	}
	@Then("User will navigate to vehicle list to update existing vehicle")
	public void user_will_navigate_to_vehicle_list_to_update_existing_vehicle() throws Exception {

		//verification screen before going to billing screen -Vehicle to be Amended from Vehicle List
		//Amending the Recently Cancelled Vehicle
		Vehicletabpage.clickAmendVehicleRadioButton();

		commonobjects.clickProceed();

		vehicleAmend.enterUnitNo(excelutil.getCellData("VehicleAmendTab","Unit0",RowNo));

		vehicleAmend.clickSearch();

		vehicleAmend.enterUnladenWeight(excelutil.getCellData("VehicleUpdate","unladen Weight",RowNo));

		vehicleAmend.clickTVR();
		vehicleAmend.selectSafetyChangedd(excelutil.getCellData("VehicleUpdate","Safety Change",RowNo));

		vehicleAmend.selectHVUTForm2290(excelutil.getCellData("VehicleUpdate","HVUT - Form 2290",RowNo));

		vehicleAmend.selectLeaseContract(excelutil.getCellData("VehicleUpdate","Lease Contract",RowNo));

		vehicleAmend.selectTitleDocument(excelutil.getCellData("VehicleUpdate","Title Document",RowNo));

		vehicleAmend.selectPlateReturndoc(excelutil.getCellData("VehicleUpdate","Plate Returned Document",RowNo));

		vehicleAmend.selectAffidavitDoc(excelutil.getCellData("VehicleUpdate","Affidavit document",RowNo));

		vehicleAmend.selectPropertyTax(excelutil.getCellData("VehicleUpdate","Property Tax",RowNo));

		commonobjects.clickProceed();
		//AMend Verification Screen
		commonobjects.clickProceed();
		//To move from Amend Screen to Renewal Vehicle Processing
		commonobjects.clickDoneBtn();
		//Delete the recently cancelled vehicle
		Vehicletabpage.clickDeleteVehicleRadioButton();
		log.info("**** Click DeleteVehicle ****");
		screenshotUtil.captureScreenshot("Click Delete Vehicle");

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		//below lines of code for deleting the vehicles from suggestion box
		String vehiclesCount=excelutil.getCellData("VehicleTab","NoOfVehiclesToDelete",RowNo);
		String plateStatus=excelutil.getCellData("VehicleTab","Delete_PlateStatus",RowNo);
		String plateReturnedDocument=excelutil.getCellData("VehicleTab","Delete_PlateReturnedDocument",RowNo);
		String affidavitDocument=excelutil.getCellData("VehicleTab","Delete_AffidavitDocument",RowNo);
		String Comments=excelutil.getCellData("VehicleTab","Delete_Comments",RowNo);
		vehicleDelete.enterUnitNo(excelutil.getCellData("VehicleDeleteTab","Unit0",RowNo));
		log.info("*** Delete vehicle Enter Unit number ***");
		screenshotUtil.captureScreenshot("Delete vehicle Enter Unit number");

		vehicleDelete.clickonSearch();
		vehicleDelete.ClickCheckBoxFromGrid();

		vehicleDelete.selectPlateStatus(plateStatus);
		log.info("***DeleteVehicle Select PlateStatus ***");
		screenshotUtil.captureScreenshot("DeleteVehicle Select PlateStatus");

		vehicleDelete.selectPlateReturnedDocument(plateReturnedDocument);
		log.info("***DeleteVehicle Select PlateReturndoc ***");
		screenshotUtil.captureScreenshot("DeleteVehicle Select PlateReturndoc");

		vehicleDelete.selectAffidavitDocument(affidavitDocument);
		log.info("***DeleteVehicle Select AffidavitDoc ***");
		screenshotUtil.captureScreenshot("DeleteVehicle Select AffidavitDoc");


		vehicleDelete.entercomments(Comments);
		log.info("*** DeleteVehicle Comment ***");
		screenshotUtil.captureScreenshot("DeleteVehicle Comment");

		commonobjects.clickProceed();
		commonobjects.clickProceed();
		commonobjects.clickDoneBtn();
		//TO move from Renewal Vehicle Processing to Billing Screen						
        CommonStep.scenario.log("Click Done from the supplement selection page");
		commonobjects.clickDoneBtn();

	}
	@Then("User will navigate to billing to verify as well to adjust the cost & Waive Fees {string}")
	public void user_will_navigate_to_billing_to_verify_as_well_to_adjust_the_cost_waive_fees(String expSucces) throws Exception {
		//Fetch values from Biling Screen
		CommonStep.scenario.log("Request TVR, enter comment & set Delivery Types as PDF. Click on proceed button");
		excelutilWrite.setCellData("Billing",billingtab.fetchRegisterMonthlbl(),RowNo,billingtab.fetchRegisterMonth());
		excelutilWrite.setCellData("Billing",billingtab.fetchNoOfVehiclesinSupplbl(),RowNo,billingtab.fetchNoOfVehiclesinSupp());
		excelutilWrite.setCellData("Billing",billingtab.fetchSupplementStatuslbl(),RowNo,billingtab.fetchSupplementStatus());
		excelutilWrite.setCellData("Billing",billingtab.fetchEnterpriseSystemCreditlbl(),RowNo,billingtab.fetchEnterpriseSystemCredit());
		excelutilWrite.setCellData("Billing",billingtab.fetchIRPSystemCreditlbl(),RowNo,billingtab.fetchIRPSystemCredit());
		excelutilWrite.setCellData("Billing",billingtab.fetchRenewalFeeEffectiveDatelbl(),RowNo,billingtab.fetchRenewalFeeEffectiveDate());
		excelutilWrite.setCellData("Billing",billingtab.fetchInvoiceDatelbl(),RowNo,billingtab.fetchInvoiceDate());
		excelutilWrite.setCellData("Billing",billingtab.fetchApplicationReceiptDatelbl(),RowNo,billingtab.fetchApplicationReceiptDate());
		excelutilWrite.setCellData("Billing",billingtab.fetchPaymentDatelbl(),RowNo,billingtab.fetchPaymentDate());
		excelutilWrite.setCellData("Billing",billingtab.fetchExchangeRatelbl(),RowNo,billingtab.fetchExchangeRate());

		excelutilWrite.setCellData("Billing",billingtab.fetchManualAdjBaseJurlbl(),RowNo,billingtab.fetchManualAdjBaseJur());
		excelutilWrite.setCellData("Billing",billingtab.fetchBilling_BatchBillinglbl(),RowNo,billingtab.fetchBilling_BatchBilling());
		excelutilWrite.setCellData("Billing",billingtab.fetchBilling_TVRlbl(),RowNo,billingtab.fetchBilling_TVR());
		excelutilWrite.setCellData("Billing",billingtab.fetchBilling_InstallmentPlanlbl(),RowNo,billingtab.fetchBilling_InstallmentPlan());
		excelutilWrite.setCellData("Billing",billingtab.fetchBilling_IsUseOneTimeMailinglbl(),RowNo,billingtab.fetchBilling_IsUseOneTimeMailing());
		excelutilWrite.setCellData("Billing",billingtab.fetchElectronicDeliveryTypelbl(),RowNo,billingtab.fetchElectronicDeliveryType());
		excelutilWrite.setCellData("Billing","Email",RowNo,billingtab.fetchBilling_Email());
		excelutilWrite.setCellData("Billing",billingtab.fetchInvoiceReportTypelbl(),RowNo,billingtab.fetchBilling_InvoiceReportType());

		ArrayList<String> TableFeeType=billingtab.FetchTable_FeeType();
		ArrayList<String> TableFeeAmount=billingtab.FetchTable_FeeAmount();

		for(int i=0;i<TableFeeType.size();i++) {
			excelutilWrite.setCellData("BillingGrid",billingtab.fetchBillingGridFeeType()+i,RowNo,TableFeeType.get(i));
			excelutilWrite.setCellData("BillingGrid",billingtab.fetchBillingGridFeeAmount()+i,RowNo,TableFeeAmount.get(i));
		}	
		log.info(commonobjects.validateInfoMsgs());
	
		billingtab.clickTVR();
		log.info("*** Click TVR ***");
		screenshotUtil.captureScreenshot("Click TVR");
	excelutilWrite.setCellData("Billing",billingtab.fetchBillingTVRNoOfDayslbl(),RowNo,billingtab.fetchBilling_TVRNoOfDays());
	    CommonStep.scenario.log("Check Installment Payment checkbox");
		billingtab.clickInstallmentPlan();
		log.info("*** Click Installement Plan ***");
		screenshotUtil.captureScreenshot("Click Installement Plan");

		billingtab.selectElectronicDeliveryType(excelutil.getCellData("BillingTab","Electronic Delivery Type",RowNo));
		log.info("*** Select Electronic DeliveryType ***");
		screenshotUtil.captureScreenshot("Select Electronic DeliveryType");

		commonobjects.provideComments(excelutil.getCellData("BillingTab","Billing_Comments",RowNo));
		commonobjects.clickProceed();
        CommonStep.scenario.log("Manually Adjust & Waive Fees with comments & set Delivery Types as PDF");
		billingtab.enterManualAdjBaseJur(excelutil.getCellData("BillingTab","Manual Adj. Base Jur.",RowNo));
		log.info("*** Enter ManualAdjBaseJur ***");
		screenshotUtil.captureScreenshot("Enter ManualAdjBaseJur");

		billingtab.clickReCalculate();
		log.info("*** Click Recalculate ***");
		screenshotUtil.captureScreenshot("Click Recalculate");
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Biling Screen"+ expSucces);
		
		log.info("Message in Biling Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Biling Screen 1");

		billingtab.expandManualAdjReason();
		billingtab.enterManualAdjReasonComments(excelutil.getCellData("BillingTab","ManualReason",RowNo));
		log.info("*** Enter ManualAdjReason Comments ***");
		screenshotUtil.captureScreenshot("Enter ManualAdjReason Comments");
		billingtab.clickManualAdjReasonDeleteAllowed();
		billingtab.clickManualAdjReasonAddorUpdateComments();

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		//Check whether Late Filing Penalty,Late Pay Penalty are greater than zero
		//Bicentennial Fee,Grade Crossing Fee,Replacement Plate Fee,Second Plate Fee,Late Filing Penalty,Late Pay Penalty,Transfer Fee,Transfer Revenue Fee,Wire Transfer Fee
		//S - System Error,M - MCE Agent Error,D - Natural Disaster,O - Other
		boolean LateFilingPenaltyAmount=billingtab.getAmount(excelutil.getCellData("BillingTab","Late Filing Penalty",RowNo));
		log.info("Late Filing Penalty Amount is Greater than zero - "+LateFilingPenaltyAmount);
		boolean LatePayPenaltyAmount=billingtab.getAmount(excelutil.getCellData("BillingTab","Late Pay Penaltys",RowNo));
		log.info("Late pay Penalty Amount is Greater than zero - "+LatePayPenaltyAmount);
		if(LateFilingPenaltyAmount==true &&LatePayPenaltyAmount==true) {
			String FeeDescriptiontoWaiveOff=excelutil.getCellData("BillingTab","Grade Crossing Fee",RowNo);
			String FeeWaiveOffReason=excelutil.getCellData("BillingTab","Grade Crossing Fee Waive Off",RowNo);
			billingtab.selectWaiveOff(FeeDescriptiontoWaiveOff,FeeWaiveOffReason);
			log.info("*** Waived off for "+FeeDescriptiontoWaiveOff +"  "+" with Reason "+ FeeWaiveOffReason + " ***");
			screenshotUtil.captureScreenshot("Waived off Fee");
		}
		/*billingtab.selectGradeCrossingFee(excelutil.getCellData("BillingTab","Grade Crossing Fee",RowNo));  
		log.info("*** Select GradeCrossingFee ***");
		screenshotUtil.captureScreenshot("Select GradeCrossingFee");*/

		billingtab.clickReCalculate();
		log.info("*** Click Recalculate ***");
		screenshotUtil.captureScreenshot("Click Recalculate");
		log.info(commonobjects.validateInfoMsgs());
		billingtab.expandFeeOverrideReason();

		billingtab.enterFeeOverrideReasonComments(excelutil.getCellData("BillingTab","FeeOverrideReasonComments",RowNo));

		log.info("*** Enter FeeOverrideReason Comments ***");
		screenshotUtil.captureScreenshot("Enter FeeOverrideReason Comments");

		billingtab.clickFeeOverrideReasonDeleteAllowed();
		billingtab.clickFeeOverrideReasonAddorUpdateComments();

		billingtab.clickReCalculate();
		log.info(commonobjects.validateInfoMsgs());
		CommonStep.scenario.log("Click on proceed button");
		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
	//	eleutil.CloseFirstChildWindow();
		String mainWindow=eleutil.GetParentWindow();
		commonobjects.clickProceed();
		commonobjects.waitForSpinner();
		eleutil.waitForTwoWindow(2);
		System.out.println("Waited for window to appear");
		String childWindow=eleutil.SwitchtoFirstChildWindow();
		eleutil.saveAsFile();
		System.out.println("save as");
		String desiredPath=eleutil.checkFileExistence(config.readDownloadFolder(),"Billing","pdf");
		System.out.println("desiredPath in RWC_001 is"+desiredPath);
		eleutil.uploadFile(desiredPath);
		System.out.println("uploaded File");
		System.out.println("window about to close"+childWindow);
		eleutil.closeSpecificWindow(childWindow);
		System.out.println("window has been closed");
		eleutil.SwitchSpecificWindow(mainWindow);
		System.out.println("Switched to window");
	}

	@Then("User will navigate to Payment Tab to input the data and validate message {string} {string} {string}")
	public void user_will_navigate_to_payment_tab_to_input_the_data_and_validate_message(String expSucces, String expSucces2, String expSucces3) throws Exception {
		//Fetch Values from Cart payment
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchEnterpriseSystemCreditlbl(),RowNo,paymenttab.FetchEnterpriseSystemCredit());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchIRPSystemCreditlbl(),RowNo,paymenttab.FetchIRPSystemCredit());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchInvoiceDatelbl(),RowNo,paymenttab.FetchInvoiceDate());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchInvoiceNumberlbl(),RowNo,paymenttab.FetchInvoiceNumber());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchPaymentReciptDatelbl(),RowNo,paymenttab.FetchPaymentReciptDate());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchManualAdjBaseJurlbl(),RowNo,paymenttab.FetchManualAdjBaseJur());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchBatchCredentiallbl(),RowNo,paymenttab.FetchBatchCredential());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchWireTransferFeelbl(),RowNo,paymenttab.FetchWireTransferFee());
		excelutilWrite.setCellData("PaymentTab",paymenttab.FetchElectronicDeliveryTypelbl(),RowNo,paymenttab.FetchElectronicDeliveryType());
		ArrayList<String> Payment_TableFeeType=paymenttab.FetchTable_FeeType();
		ArrayList<String> Payment_TableFeeAmount=paymenttab.FetchTable_FeeAmount();
		for(int i=0;i<Payment_TableFeeType.size();i++) {
			excelutilWrite.setCellData("PaymentTab",paymenttab.FetchHeaderFeeType()+i,RowNo,Payment_TableFeeType.get(i));
			excelutilWrite.setCellData("PaymentTab",paymenttab.FetchHeaderFeeAmount()+i,RowNo,Payment_TableFeeAmount.get(i));
		}
		log.info(commonobjects.validateInfoMsgs());
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Payment Screen"+ expSucces);
		
				log.info("Message in Payment Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Payment Screen 1");
		
		
		String actualmessage2 = commonobjects.fetchErrorMessage(expSucces2);
		try {
		Assert.assertEquals(actualmessage2, expSucces2);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		
		CommonStep.scenario.log("Message in Payment Screen"+ expSucces2);
		
		log.info("Message in Payment Screen"+ commonobjects.fetchErrorMessage(expSucces2));
		screenshotUtil.captureScreenshot("Message in Payment Screen 2");
		String actualmessage3 = commonobjects.fetchErrorMessage(expSucces3);
		try {
		Assert.assertEquals(actualmessage3, expSucces3);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Payment Screen"+ expSucces3);
	
		log.info("Message in Payment Screen"+commonobjects.fetchErrorMessage(expSucces3));
		screenshotUtil.captureScreenshot("Message in Payment Screen 3");
		pay.selectElectronicDeliverytype(excelutil.getCellData("Payment","ElectronicDeliveryType",RowNo));
		log.info("***Select Delivery type***");
		CommonStep.scenario.log("Verify the page & set Delivery Types as PDF Click on proceed button");
		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		CommonStep.scenario.log("Verify the page & Click Add to Cart button");
		paymenttab.clickAddtoCart();
		log.info("***Click Add to Cart**");
		log.info(commonobjects.validateInfoMsgs());
		commonobjects.validateInfoMsgs();
	}

	@Then("User will navigate to supplement continuance and validate the meesage {string}")
	public void user_will_navigate_to_supplement_continuance_and_validate_the_meesage(String expSucces) throws Exception, Exception {
		log.info(commonobjects.validateInfoMsgs());
		CommonStep.scenario.log("Go to Supplment Continuance & try to continue above record");
		paymenttab.clicksupplcont();
		log.info("***Click Supplement continue***");
		screenshotUtil.captureScreenshot("Click Supplement continue");
		fleetpage.enterAccountNo(excelutil.getCellData("PreSetup","AccountNumber",RowNo));
		commonobjects.clickProceed(); 
		log.info(commonobjects.validateInfoMsgs());
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Fleet Screen"+ expSucces);
		log.info("Message in Fleet Screen"+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Fleet Screen");
	}

	@Then("User will navigate to payment tab and fill the requirement")
	public void user_will_navigate_to_payment_tab_and_fill_the_requirement() throws Exception, Exception {

		//commonobjects.clickQuit();
		log.info(commonobjects.validateInfoMsgs());
		CommonStep.scenario.log("Click Cart icon");
		paymenttab.clickVerifyAddToCart();

		log.info("***Verify Cart***");
		screenshotUtil.captureScreenshot("Verify Cart");
		CommonStep.scenario.log("Select record & proceed");
		CommonStep.scenario.log("Click Proceed");
		CommonStep.scenario.log("Select multiple payment types and select PDF delivery type and click on proceed button");
		CommonStep.scenario.log("Click on pay now button");
		pay.clickPayNow();  

		log.info("***Click Paynow***");
		screenshotUtil.captureScreenshot("Click Paynow");
		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		//Fetch Values from 
		excelutilWrite.setCellData("PaymentScreen",pay.fetchMCECustomerIdLbl(),RowNo,pay.fetchMCECustomerId());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchMCECustomerId(),RowNo,pay.fetchLegalName());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchInvoiceDateLbl(),RowNo,pay.fetchInvoiceDate());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchEnterpriseSystemCreditLbl(),RowNo,pay.fetchEnterpriseSystemCredit());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchIRPSystemCreditLbl(),RowNo,pay.fetchIRPSystemCredit());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchIftaSystemCreditLbl(),RowNo,pay.fetchIftaSystemCredit());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchOpaSystemCreditLbl(),RowNo,pay.fetchOpaSystemCredit());
		excelutilWrite.setCellData("PaymentScreen",pay.fetchTotalAmountDueLbl(),RowNo,pay.fetchTotalAmountDue());

		ArrayList<String> TableHeadervalues=pay.fetchTableHeaders();
		ArrayList<String> Table_Invoice=pay.FetchTable_InvoiceDetails();
		for(int i=0;i<Table_Invoice.size();i++) {
			excelutilWrite.setCellData("PaymentScreen",TableHeadervalues.get(i),RowNo,Table_Invoice.get(i));
		}

		paymenttab.clickPaymenToAdd();
		for(int i=0; i<2;i++) {

			String PaymentType=excelutil.getCellData("Payment","PaymentType"+i,RowNo);
			String PaymentNumberValue=excelutil.getCellData("Payment","PaymentChequeNo",RowNo);
			pay.selectPaymentType(i,PaymentType);	
			log.info("***Payment Type***");
			screenshotUtil.captureScreenshot("Payment Type"+i);


			pay.enterpaymentNoBasedonType(i,PaymentType,PaymentNumberValue);
			log.info("***Payment Number based on Payment Type***");
			screenshotUtil.captureScreenshot("Payment Number based on  Payment Type"+i);

			String totalAmount=pay.FetchTotalAmount();
			log.info("totalAmount is "+totalAmount);
			String cashAmount=String.format("%.2f",(Double.valueOf(totalAmount)/2));

			if(i==0) {
				pay.enterPaymentAmountBasedonType(i,PaymentType,cashAmount);
			}

			if(i==1) {
				String RemainingAmount=pay.fetchRemainingBalance();
				pay.enterPaymentAmountBasedonType(i,PaymentType,RemainingAmount);
			}
			log.info("***Payment Amount based on Payment Type***");
			screenshotUtil.captureScreenshot("Payment Amount based on  Payment Type"+i);

		}

		pay.selectPaymentReceipt(excelutil.getCellData("Payment","Payment receipt",RowNo));
		log.info("***Enter Payment type and amount***");
		commonobjects.clickProceed();
		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
	//	eleutil.CloseFirstChildWindow();
		String mainWindow=eleutil.GetParentWindow();
		commonobjects.clickProceed();
		commonobjects.waitForSpinner();
		eleutil.waitForTwoWindow(2);
		String childWindow=eleutil.SwitchtoFirstChildWindow();
		eleutil.saveAsFile();
		String desiredPath=eleutil.checkFileExistence(config.readDownloadFolder(),"Billing","pdf");
		eleutil.uploadFile(desiredPath);
		eleutil.closeSpecificWindow(childWindow);
		eleutil.SwitchSpecificWindow(mainWindow);
	
	}
	@Then("user will validate message {string} {string}")
	public void user_will_validate_message(String expSucces, String expSucces2) throws Exception {
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		
		CommonStep.scenario.log("Message in Payment Screen "+ expSucces);
		
		log.info("Message in Payment Screen "+commonobjects.fetchErrorMessage(expSucces));
		screenshotUtil.captureScreenshot("Message in Payment Screen 1");
		
		String actualmessage1 = commonobjects.fetchErrorMessage(expSucces2);
		try {
		Assert.assertEquals(actualmessage1, expSucces2);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Payment Screen "+ expSucces2);
		log.info("Message in Payment Screen "+commonobjects.fetchErrorMessage(expSucces2));
		screenshotUtil.captureScreenshot("Message in Payment Screen 2");
	}

	@Then("User navigate to inventory tab to input the data and validate the message {string} {string}")
	public void user_navigate_to_inventory_tab_to_input_the_data_and_validate_the_message(String expSucces, String expSucces2) throws Exception {
		CommonStep.scenario.log("Check Inventory & Status Inquiry");
		inventorypage.clickOperation();
		inventorypage.clickOnInventory();
		inventorypage.clickNewInventory();
		log.info("***Click Inventory***");
		screenshotUtil.captureScreenshot("Click Inventory");
		log.info(commonobjects.validateInfoMsgs());
		inventorypage.selectNewInventoryType(excelutil.getCellData("InventoryTab","Inventory_Newintype",RowNo));
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Inventory Screen"+ expSucces);
		
		
		log.info("Message in Inventory Screen"+commonobjects.fetchErrorMessage(expSucces));

		screenshotUtil.captureScreenshot("Message in Inventory Screen");

		inventorypage.selectNewSubInventoryType(excelutil.getCellData("InventoryTab","Inventory_Subtype",RowNo));

		inventorypage.enterFromNo(excelutil.getCellData("InventoryTab","FromNo",RowNo)); //modify

		inventorypage.enterQuantity(excelutil.getCellData("InventoryTab","Quantity",RowNo));

		inventorypage.enterYear(excelutil.getCellData("InventoryTab","Year",RowNo));


		log.info("***Enter details for new inventory***");
		screenshotUtil.captureScreenshot("Enter details for new inventory");
		commonobjects.clickProceed();

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		String actualmessage2 = commonobjects.fetchErrorMessage(expSucces2);
		try {
		Assert.assertEquals(actualmessage2, expSucces2);
		
		}
		catch(Throwable e) {
			error.addError(e);
		}
		
		CommonStep.scenario.log("Message in Payment Screen"+ expSucces2);
	
		log.info("Message in Payment Screen"+commonobjects.fetchErrorMessage(expSucces2));
		screenshotUtil.captureScreenshot("Message in Inventory Screen 2");
		commonobjects.clickQuit();
	}
	@Then("Assign the inventory to proceed further {string} {string}")
	public void assign_the_inventory_to_proceed_further(String expSucces, String expSucces2) throws Exception, Exception {
        CommonStep.scenario.log("Go to Inventory - Assign Invetory & add required Inventory");
		inventorypage.clickAssignInventory();
		log.info(commonobjects.validateInfoMsgs());
		inventorypage.selectNewInventoryType(excelutil.getCellData("InventoryTab","Inventory_Newintype",RowNo));
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Inventory Screen "+ expSucces);
	
		log.info("Message in Inventory Screen "+commonobjects.fetchErrorMessage(expSucces));

		screenshotUtil.captureScreenshot("Message in Inventory Screen 1");

		inventorypage.selectNewSubInventoryType(excelutil.getCellData("InventoryTab","Inventory_Subtype",RowNo));

		inventorypage.enterFromNo(excelutil.getCellData("InventoryTab","FromNo",RowNo)); //modify

		inventorypage.enterQuantity(excelutil.getCellData("InventoryTab","Quantity",RowNo));

		inventorypage.enterYear(excelutil.getCellData("InventoryTab","Year",RowNo));

		log.info("***Enter details in Assign Inventory***");
		screenshotUtil.captureScreenshot("Enter details in Assign Inventory");

		commonobjects.clickProceed();

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		String actualmessage2 = commonobjects.fetchErrorMessage(expSucces2);
		try {
		Assert.assertEquals(actualmessage2, expSucces2);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Inventory Screen"+ expSucces2);
		
		log.info("Message in Inventory Screen"+commonobjects.fetchErrorMessage(expSucces2));
		screenshotUtil.captureScreenshot("Message in Inventory Screen 2");


		commonobjects.clickQuit();
	}

	@Then("user navigate to post payment for 2nd installment payment and fill the data and validate the message {string} {string}")
	public void user_navigate_to_post_payment_for_2nd_installment_payment_and_fill_the_data_and_validate_the_message(String expSucces, String expSucces2) throws Exception {

        CommonStep.scenario.log("Go to Finance - Post Payment & search above record & click Cart Id");
		financepage.clickfinance();

		financepage.clickpostpayment();
		log.info(commonobjects.validateInfoMsgs());
		financepage.enterMCEid(excelutil.getCellData("PreSetup","MCENumber",RowNo));

		financepage.clicksearch();

		financepage.clickoncartid();

		financepage.clickservice();

		financepage.clickIRP();
		CommonStep.scenario.log("Go to Payment - Installment Payment & serach above record & complete 2nd Installment payment");
		financepage.clickinstallmentpayment();

		financepage.clickandenterAccountNo(excelutil.getCellData("PreSetup","AccountNumber",RowNo));

		financepage.clickandenterfleet(excelutil.getCellData("PreSetup","FleetNumber",RowNo));

		financepage.clickandenterfleetyear(excelutil.getCellData("PreSetup","Vehicle and Installment Fleet Expiration Year",RowNo));

		commonobjects.clickProceed();

		financepage.clickgrid();

		commonobjects.clickProceed();

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		financepage.selectpaymenttype(excelutil.getCellData("Payment","PaymentType0",RowNo));

		String totalAmount=pay.FetchTotalAmount();

		financepage.entercashamount(totalAmount);

		pay.selectPaymentReceipt(excelutil.getCellData("Payment","Payment receipt",RowNo));

		log.info("Enter the details in installement payment and proceed");
		screenshotUtil.captureScreenshot("Enter the details in installement payment and proceed");

		commonobjects.clickProceed();

		commonobjects.clickProceed();
		log.info(commonobjects.validateInfoMsgs());
		String actualmessage = commonobjects.fetchErrorMessage(expSucces);
		try {
		Assert.assertEquals(actualmessage, expSucces);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in post Payment Screen"+ expSucces);
		
		log.info("Message in post Payment Screen"+commonobjects.fetchErrorMessage(expSucces));

		screenshotUtil.captureScreenshot("Message in post Payment Screen 1");
		
		String actualmessage1 = commonobjects.fetchErrorMessage(expSucces2);
		
		try {
		Assert.assertEquals(actualmessage1, expSucces2);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		CommonStep.scenario.log("Message in Post Payment Screen "+ expSucces2);
		
		log.info("Message in Post Payment Screen "+commonobjects.fetchErrorMessage(expSucces2));

		screenshotUtil.captureScreenshot("Message in post Payment Screen 2");

	}


}


