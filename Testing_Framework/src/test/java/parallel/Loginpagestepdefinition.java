package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagestepdefinition {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
		.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));

	}

	@When("user enter username {string}")
	public void user_enter_username(String username) {
		loginPage.enterUserName(username);

	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		loginPage.enterPassword(password);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLogin();


	}

}
