package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.AddcandidatePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Addcandidatestepdefinition {

	
	
private AddcandidatePage addcandidatepage= new AddcandidatePage(DriverFactory.getDriver());

	
@Given("user navigates to candidate page")
public void user_navigates_to_candidate_page() {
   
	DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/recruitment/addCandidate");

	
}



@When("user fills the form from given sheetname {string} and rownumber {int}")
public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
    

	ExcelReader reader = new ExcelReader();
	List<Map<String,String>> testData = 
			reader.getData("C:\\Users\\HP\\Desktop\\sureshtest.xlsx", sheetName);
	
	
	
	String frtname = testData.get(rowNumber).get("FirstName");
	String LstName = testData.get(rowNumber).get("LastName");
	String emailid = testData.get(rowNumber).get("Emailid");
	
	addcandidatepage.fillContactUsForm(frtname, LstName, emailid);
	

	
}
@When("user clicks on send button")
public void user_clicks_on_send_button() {
    
addcandidatepage.clickonSavebutton();
}




}
