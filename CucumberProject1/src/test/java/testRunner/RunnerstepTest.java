package testRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseClass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ScreenshotUtility;

public class RunnerstepTest extends BaseTest
{
	WebDriver driver;

		@Given("user navigates to whitehatsec.com")
		public void open_firefox_and_navigate_to_whitehatsec_com() {
		    BaseTest bt= new BaseTest();
		    System.setProperty("webdriver.gecko.driver", "C://Program Files//Selenium//Geckodriver//geckodriver.exe");
			driver= new FirefoxDriver();
		    driver.get(bt.URLlink());
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    Set<Cookie> cook= driver.manage().getCookies();
		    System.out.println("count of cookies =" +cook.size());
		    ScreenshotUtility.Screenshot(driver, "homepage");
		    for(Cookie coo :cook)
		    {
		    	System.out.println("cookie =" +coo.getName());
		    	
		    }
		    driver.manage().deleteAllCookies();
		    
		    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    	 
		    	 driver.findElement(By.xpath(("	//div[@class='dialogContent']")));
		    	 driver.findElement(By.xpath("//div[@class='button small passive hover-red wide cropSides']"));
		    	 driver.findElement(By.xpath("//a[@class='menu-link middle inlineBlock padding-right-1 shift-left-5']")).click();
		}


		
		@When("user provides valid Jhansi123@mail.com and {int}")
		public void user_provides_valid_jhansi123_mail_com_and(Integer int1) {
			ScreenshotUtility.Screenshot(driver, "Login Page");
		    driver.findElement(By.name("username")).sendKeys("Jhansi123@mail.com");
		    driver.findElement(By.name("password")).sendKeys("1234");
		    driver.findElement(By.xpath("//button[contains(text(),'Login ->')]")).click();
		    //throw new io.cucumber.java.PendingException();
		}
		@Then("User should be able to login successfully.")
		public void user_should_be_able_to_login_successfully() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}
		@When("User provides invalid Jhansi123@mail.com and {int}.")
		public void user_provides_invalid_jhansi123_mail_com_and(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("User should not be able to login to the application.")
		public void user_should_not_be_able_to_login_to_the_application() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}



}
