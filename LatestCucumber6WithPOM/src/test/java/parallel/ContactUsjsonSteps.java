package parallel;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.pages.ContactUsjsonPage;
import com.qa.factory.DriverFactorys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsjsonSteps {

	private ContactUsjsonPage contactUsjsonPage = new ContactUsjsonPage(DriverFactorys.getDriver());

	@Given("^user navigates to contact us page$")
	public void user_navigates_to_contact_us_page() throws Throwable {
		DriverFactorys.getDriver().get("http://automationpractice.com/index.php?controller=contact");
		
	    
	}

	@When("^user click on the Contact us Page$")
	public void user_click_on_the_Contact_us_Page() throws Throwable {
	    
		DriverFactorys.getDriver().get("http://automationpractice.com/index.php?controller=contact");

	}

	@Then("^user enter the Subject Heading \"([^\"]*)\"$")
	public void user_enter_the_Subject_Heading(String arg1) throws Throwable {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		Object obj = jsonparser.parse(reader);
		
		
        JSONObject contactus = (JSONObject)obj;
		
		String subhead= (String) contactus.get("Subject Heading");
		System.out.println("Subject Heading: "+subhead);
		contactUsjsonPage.clickonsubjectheading("Customer service");
	
	}

	@Then("^user enter the Email address \"([^\"]*)\"$")
	public void user_enter_the_Email_address(String arg1) throws Throwable {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		
        Object obj = jsonparser.parse(reader);
		
		
        JSONObject contactus = (JSONObject)obj;
		
		String emailid= (String) contactus.get("Email address");
		System.out.println("Email address: "+emailid);
		contactUsjsonPage.clickonemailaddress("suresh1047@gmail.com");
	}

	@Then("^user enter the Order reference \"([^\"]*)\"$")
	public void user_enter_the_Order_reference(String arg1) throws Throwable {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		
Object obj = jsonparser.parse(reader);
		
		
        JSONObject contactus = (JSONObject)obj;
		
		String ordref=(String) contactus.get("Order reference");
		System.out.println("Order reference:"+ordref);
		contactUsjsonPage.clickonorderRef("1");
	}

	@Then("^user enter the message \"([^\"]*)\"$")
	public void user_enter_the_message(String arg1) throws Throwable {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
Object obj = jsonparser.parse(reader);
		
		
        JSONObject contactus = (JSONObject)obj;
		
        String Msg= (String) contactus.get("Message");
		System.out.println("Message:"+Msg);
		contactUsjsonPage.clickonmessageText("Hi this is our team");
	}

	@Then("^user click on send$")
	public void user_click_on_send() throws Throwable {
		contactUsjsonPage.clickonsendButton();
	    
	}


	
	
}
