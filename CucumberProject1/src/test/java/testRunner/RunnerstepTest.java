package testRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseClass.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ScreenshotUtility;

public class RunnerstepTest extends BaseTest
{
	
	WebDriver driver;
	 BaseTest bt= new BaseTest();
@Before
public void setup()
{
	System.setProperty("webdriver.gecko.driver", "C://Program Files//Selenium//Geckodriver//geckodriver.exe");
	driver= new FirefoxDriver();
    
}
		@Given("user navigates to whitehatsec.com")
		public void open_firefox_and_navigate_to_whitehatsec_com() {
		   
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
		    	 driver.findElement(By.xpath("//div[@class='dialogContent']")).click();
		   		driver.findElement(By.xpath("//div[@class='button small passive hover-red wide cropSides']")).click();
		    		
		    	 //driver.findElement(By.xpath(("	//div[@class='dialogContent']")));
		    	 //driver.findElement(By.xpath("//div[@class='button small passive hover-red wide cropSides']"));
		    WebElement loginOption=	 driver.findElement(By.xpath(bt.Login()));
		    loginOption.click();
		    
		}


		
		@When("^user provides valid (.*) and (.*)$")
		public void user_provides_valid_username_and_pass(String Username,String Password) {
			
		    driver.findElement(By.name(bt.UserN())).sendKeys(Username);
		    driver.findElement(By.name(bt.pass())).sendKeys(Password);
		    driver.findElement(By.xpath(bt.click())).click();
		    ScreenshotUtility.Screenshot(driver, "Login Page");
		    //throw new io.cucumber.java.PendingException();
		}
		@Then("user should be able to login successfully.")
		public void user_should_be_able_to_login_successfully() {
		    System.out.println("then");
		}

		@When("user provides invalid Jhansi123@mail.com and {int}.")
		public void user_provides_invalid_jhansi123_mail_com_and(Integer int1) {
			System.out.println("when");
		}

		@Then("user should not be able to login to the application.")
		public void user_should_not_be_able_to_login_to_the_application() {
			System.out.println("then");
		}

		@When("user provides invalid user456@mail.com and 1bc123.")
		public void user_provides_invalid_user456_mail_com_and_1bc123() {
			System.out.println("when");
		}



}
