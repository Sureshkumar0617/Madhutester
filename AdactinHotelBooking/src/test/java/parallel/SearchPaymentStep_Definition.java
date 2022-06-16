package parallel;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.pages.SearchPaymentpage;
import com.qa.factory.Driver_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPaymentStep_Definition {
	
	private  SearchPaymentpage searchpaymentmethod =  new SearchPaymentpage(Driver_Factory.getDriver());


	
	
	
	
	@Given("user navigate to Payment method process")
	public void user_navigate_to_payment_method_process() {
		
		Driver_Factory.getDriver().get("http://adactinhotelapp.com/BookHotel.php");

	}
	@When("user enter first name {string}")
	public void user_enter_first_name(String FirstName) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jsonfile\\PaymentMethod.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject paymentmethods = (JSONObject)obj;
		String fstname= (String) paymentmethods.get("First Name");
		System.out.println("First Name: "+fstname);
		searchpaymentmethod.enterfirstname(FirstName);
	
		
	    
	}
	@When("user enter last name {string}")
	public void user_enter_last_name(String LastName) throws IOException, ParseException {
		
		
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jsonfile\\PaymentMethod.json");
		
		Object obj = jsonparser.parse(reader);

		JSONObject paymentmethods = (JSONObject)obj;

		String lstname= (String) paymentmethods.get("Last Name");
		System.out.println("Last Name: "+lstname);
		searchpaymentmethod.enterlastname(LastName);
		

	    
	}
	@Then("user enter billing address {string}")
	public void user_enter_billing_address(String BillingAddress) throws IOException, ParseException {
	    
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jsonfile\\PaymentMethod.json");
		
		Object obj = jsonparser.parse(reader);

		JSONObject paymentmethods = (JSONObject)obj;

		String Billadd=(String) paymentmethods.get("Billing Address");
		System.out.println("Billing Address"+Billadd);
		searchpaymentmethod.enterbillingaddress(BillingAddress);

		
		
		
		
		
	}
	@Then("user enter Credit card no {string}")
	public void user_enter_credit_card_no(String string) {
		
		searchpaymentmethod.entercreditcardnumber("5754788954621325");

	    
	}
	@Then("user enter Credit card type {string}")
	public void user_enter_credit_card_type(String CreditCardType) {
		
		searchpaymentmethod.enterctreditcardtype(CreditCardType);

	    
	}
	@Then("user enter expiry data {string}")
	public void user_enter_expiry_data(String June) {
		
		searchpaymentmethod.enterexpirydatemonth(June);
	    
	}
	@Then("user enter expriy data {string}")
	public void user_enter_expriy_data(String string) {
	    
		searchpaymentmethod.enterexpirydateyear("2023");
		
	}
	@Then("user enter Cvv number {string}")
	public void user_enter_cvv_number(String string) {
	    
		searchpaymentmethod.entercvvnumber("256");
	}
	@Then("user click on Book now tab")
	public void user_click_on_book_now_tab() {
		
		searchpaymentmethod.clickbutton();
	    
	}

	@Then("user click on logout")
	public void user_click_on_logout() {
	    
		searchpaymentmethod.clickonlogout();
	}


}