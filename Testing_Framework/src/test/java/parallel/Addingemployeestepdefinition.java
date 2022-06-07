package parallel;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.pages.AddingemployeePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addingemployeestepdefinition {

	private AddingemployeePage addingemployeepage =  new AddingemployeePage(DriverFactory.getDriver());


	
	@Given("user click Recuritment Tab")
	public void user_click_recuritment_tab() {
		
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates");
	    addingemployeepage.clickonrecruitment();
	
	    
	    
	}
	



	@When("user click Candidate tab")
	public void user_click_candidate_tab() {
		
	addingemployeepage.clickoncandidate();
	    
	}
	
	@When("user click Add tab")
	public void user_click_add_tab() {
		
		addingemployeepage.clickonadd();
	    
	}
	
	@Then("user enter first name {string}")
	public void user_enter_first_name_in_first_name_tab(String Firstname) throws IOException, ParseException {
		
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject addcandidateemployee = (JSONObject)obj;
		
		String fstname= (String) addcandidateemployee.get("FirstName");
		System.out.println("First Name: "+fstname);
		addingemployeepage.enterFirstname(Firstname);

	    
	}
	@Then("user enter lastname {string}")
	public void user_enter_lastname_in_lastame_tab(String Lastname) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject addcandidateemployee = (JSONObject)obj;
		
		String lstname= (String) addcandidateemployee.get("LastName");
		System.out.println("Last Name: "+lstname);
		addingemployeepage.enterLastname(Lastname);

	    
	}
	@Then("user enter emailid {string}")
	public void user_enter_emailid_in_email_id_tab(String Emailid) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject addcandidateemployee = (JSONObject)obj;
		
		String emid= (String) addcandidateemployee.get("Email");
		System.out.println("Email: "+emid);
		
		addingemployeepage.enterEmailid(Emailid);

	    	    
	}
	@Then("user click save button")
	public void user_click_save_button() {
		
		addingemployeepage.clickonSavebutton();
	    
	}



}
