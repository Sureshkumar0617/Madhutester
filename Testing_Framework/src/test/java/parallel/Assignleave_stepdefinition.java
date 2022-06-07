package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.Assignleave;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignleave_stepdefinition {
	
	public WebDriver driver;
	
	private Assignleave assignleave = new Assignleave(DriverFactory.getDriver());
	
	

@Given("user navigates to Leave page")
public void user_navigates_to_leave_page() {
	DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave");
}



@When("user click the Assign leave tab")
public void user_click_the_assign_leave_tab() {
	
	assignleave.clickonassignleavetab();
	
	
    
}
@When("user add employee name in employee name tab")
public void user_add_employee_name_in_employee_name_tab() {
	
	
	
}
@Then("user select the leave type")
public void user_select_the_leave_type() {
	
	assignleave.clickonleavetype();
	
	WebElement Leavetype = DriverFactory.getDriver().findElement(By.id("assignleave_txtLeaveType"));
	Select s = new Select(Leavetype);
			s.selectByValue("9");
	
    

}
@When("user select the from date")
public void user_select_the_from_date() {
	
	assignleave.enterFromdate("2022-05-31");

}
@When("user select the to date")
public void user_select_the_to_date() {
	
	assignleave.entertodate("2022-05-31");
    
}
@When("user enter the comment")
public void user_enter_the_comment(){
    assignleave.enterComment("sick leave");
	
}
@Then("user click on the Assign button")
public void user_click_on_the_assign_button() {
    assignleave.clickonassignleave();
	
	
	
}




}
