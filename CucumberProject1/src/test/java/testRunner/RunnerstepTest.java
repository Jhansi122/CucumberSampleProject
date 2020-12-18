package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseClass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunnerstepTest extends BaseTest
{
	WebDriver driver;

		@Given("Open firefox and navigate to whitehatsec.com")
		public void open_firefox_and_navigate_to_whitehatsec_com() {
		    BaseTest bt= new BaseTest();
		    System.setProperty("webdriver.gecko.driver", "C://Program Files//Selenium//Geckodriver//geckodriver.exe");
			driver= new FirefoxDriver();
		    driver.get(bt.URL());
		    throw new io.cucumber.java.PendingException();
		}


		
		@When("User provides valid Jhansi123@mail.com and {int}")
		public void user_provides_valid_jhansi123_mail_com_and(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("User should be able to login successfully.")
		public void user_should_be_able_to_login_successfully() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@When("User provides invalid Jhansi123@mail.com and {int}.")
		public void user_provides_invalid_jhansi123_mail_com_and(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("User should not be able to login to the application.")
		public void user_should_not_be_able_to_login_to_the_application() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}



}
