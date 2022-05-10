package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepagestepdefinition {

	private LoginPage LoginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage HomePage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable logTable) {

		List<Map<String, String>> logList = logTable.asMaps();
		String userName = logList.get(0).get("username");
		String password = logList.get(0).get("password");

		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		HomePage = LoginPage.doLogin(userName, password);

	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {

		String title = HomePage.getHomePageTitle();
		System.out.println("Home Page title is: " + title);

		HomePage.getHomePageTitle();
	}

	@Then("user gets Home section")
	public void user_gets_home_section(DataTable sectionsTable) {
		List<String> expAccountSectionsList = sectionsTable.asList();

		System.out.println("Expected accounts section list: " + expAccountSectionsList);

		List<String> actualAccountSectionsList = HomePage.getHomeSectionsList();
		System.out.println("Actual accounts section list: " + actualAccountSectionsList);

		Assert.assertTrue(expAccountSectionsList.containsAll(actualAccountSectionsList));

	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {

		Assert.assertTrue(HomePage.getHomeSectionCount() == expectedSectionCount);

	}

}
