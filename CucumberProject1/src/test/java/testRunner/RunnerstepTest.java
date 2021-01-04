package testRunner;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baseClass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ScreenshotUtility;

public class RunnerstepTest extends BaseTest {

	WebDriver driver;
	BaseTest bt = new BaseTest();
	ExtentReports extent;
	 ExtentTest logger;
	 
	//private Scenario scenario;
	
	@Before
	public void setup()
	{
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter
	    		("src/main/resources/extent_reports/cucumber_extentReport.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("LoginTest");
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String temp=ScreenshotUtility.Screenshot(driver, "homepage");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush();
		driver.quit();
		
	}

				
	
	
	@Given("^user navigates to designmodo.com$")
	public void open_firefox_and_navigate_to_whitehatsec_com() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver87.exe");
		driver = new ChromeDriver();
		driver.get(bt.URLlink());

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// scenario.log("In browser");
		Set<Cookie> cook = driver.manage().getCookies();
		System.out.println("count of cookies =" + cook.size());
		ScreenshotUtility.Screenshot(driver, "homepage");
		for (Cookie coo : cook) {
			System.out.println("cookie =" + coo.getName());

		}
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(bt.Dialouge())).click();
		driver.findElement(By.xpath(bt.disagreeButton())).click();
		WebElement loginOption = driver.findElement(By.xpath(bt.Login()));
		loginOption.click();

	}

	@When("^user provides valid (.*) and (.*)$")
	public void user_provides_valid_username_and_pass(String Username, String Password) {

		driver.findElement(By.name(bt.UserN())).sendKeys(Username);
		driver.findElement(By.name(bt.pass())).sendKeys(Password);
		driver.findElement(By.xpath(bt.click())).click();
		ScreenshotUtility.Screenshot(driver, "Login Page");
		// throw new io.cucumber.java.PendingException();
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
	
	@Given("user navigates back to the home page")
	public void user_navigates_back_to_the_home_page() {
		System.out.println("then");
	}

	@Then("selects the slides product from the view")
	public void selects_the_slides_product_from_the_view() {
		System.out.println("then");
	    
	}

	@Then("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
		System.out.println("then");
	}
	
	

}
