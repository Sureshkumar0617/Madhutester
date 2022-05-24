package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagestepdefinition {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
public static WebDriver driver;
	
		public ExtentTest log = null;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
		.get("https://opensource-demo.orangehrmlive.com/");
			
			}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page()  {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
		
			}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));

	}

	@When("user enter username {string}")
	public void user_enter_username(String username) throws IOException, InterruptedException {
		
		loginPage.enterUserName(username);
        log.log(Status.INFO, "username"+log.addScreenCaptureFromPath(screenshot()));
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) throws IOException {
		loginPage.enterPassword(password);
		  log.log(Status.INFO, "pwd"+log.addScreenCaptureFromPath(screenshot()));
			
	

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLogin();


	}
	
	
public static String screenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\Screenshots\\login.png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
				
		return dest;
	
}
}
