package parallel;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.Loginpage;
import com.pages.SearchHotelpage;
import com.qa.factory.Driver_Factory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelStep_Definition {
	
	private Loginpage loginPage = new Loginpage(Driver_Factory.getDriver());
	private SearchHotelpage SearchHotelpage;
	

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable logTable) {
		
		List<Map<String, String>> logList = logTable.asMaps();
		
		String userName = logList.get(0).get("Username");
		String password = logList.get(0).get("Password");

		
		Driver_Factory.getDriver().get("http://adactinhotelapp.com/");
		
		SearchHotelpage = loginPage.doLogin(userName, password);

		
	}



	@Given("user navigates to Search Hotel Page")
	public void user_navigates_to_search_hotel_page() {
	    
		Driver_Factory.getDriver().get("http://adactinhotelapp.com/SearchHotel.php");

	}
	
	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber_row_number(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\HP\\eclipse-workspace\\AdactinHotelBooking\\src\\test\\resources\\DataProvider\\DataSearchHotel.xlsx", sheetName);

		String lction = testData.get(rowNumber).get("Location");
		String Hotel = testData.get(rowNumber).get("Hotels");
		String RoomTyp = testData.get(rowNumber).get("Room Type");
		String NoofRooms = testData.get(rowNumber).get("Number of Rooms");
		String CheckIndate = testData.get(rowNumber).get("Check In Date");
		String CheckOutDate = testData.get(rowNumber).get("Check Out Date");
		String Aultsperroom = testData.get(rowNumber).get("Adults per Room");
		String Childrenperroom = testData.get(rowNumber).get("Children per Room");
		
		SearchHotelpage.fillContactUsForm(lction, Hotel, RoomTyp, NoofRooms, CheckIndate, CheckOutDate, Aultsperroom, Childrenperroom);
		
		
		
		
		
	    
	}
	@When("user clicks on Search")
	public void user_clicks_on_search() {
		
		SearchHotelpage.clickOnSearch();
		
	}

	@Then("user clicks on Select")
	public void user_clicks_on_select() {
	    
		SearchHotelpage.clickonsearch();
	}



	@Then("user clicks on continue")
	public void user_clicks_on_continue() {
	    
		SearchHotelpage.clickoncontinue();
	}




	
	
}
