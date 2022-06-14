package parallel;

import java.io.IOException;

import com.pages.Loginpage;
import com.qa.factory.Driver_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep_Definition {
	
	
   
	

	private Loginpage loginPage = new Loginpage(Driver_Factory.getDriver());
	


@Given("user is on login page")
public void user_is_on_login_page() {
    
	
	Driver_Factory.getDriver().get("https://adactinhotelapp.com/");
	
}



@When("user enter Username {string}")
public void user_enter_username(String userid) throws IOException {
    
	loginPage.enterUserName(userid);
}

@When("user enter Password {string}")
public void user_enter_password(String pswd) {
    
	loginPage.enterPassword(pswd);
}

@When("user click on login button")
public void user_click_on_login_button() {
	
	loginPage.clickOnLogin();
    
}




}
