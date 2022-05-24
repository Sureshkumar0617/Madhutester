package parallel;

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
	public void user_enter_first_name_in_first_name_tab(String Firstname) {
		
		addingemployeepage.enterFirstname(Firstname);
	    
	}
	@Then("user enter lastname {string}")
	public void user_enter_lastname_in_lastame_tab(String Lastname) {
		
		addingemployeepage.enterLastname(Lastname);
		
	    
	}
	@Then("user enter emailid {string}")
	public void user_enter_emailid_in_email_id_tab(String Emailid) {
		
		addingemployeepage.enterEmailid(Emailid);
	    
	}
	@Then("user click save button")
	public void user_click_save_button() {
		
		addingemployeepage.clickonSavebutton();
	    
	}



}
