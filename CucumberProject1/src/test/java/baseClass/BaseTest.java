package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	static Properties pro;
	static WebDriver driver;

	public BaseTest() {
      
		try {
			File src = new File ("C:\\Program Files\\Selenium\\Spring tool suite\\Code\\CucumberProject1\\ObjectRepository\\Application.Properties");
			  FileInputStream fis = new FileInputStream(src);
			  pro= new Properties();
			  pro.load(fis);
		} catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		  
	} 
      
	public  String initialization() {
		/*String browser = pro.getProperty("FirefoxDriver");
		if(browser.equals("FirefoxDriver"))
		{
			System.setProperty("webdriver.gecko.driver", "C://Program Files//Selenium//Geckodriver//geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equals("ChromeDriver"))
			System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium//Drivers//chromedriver.exe");
		    driver= new ChromeDriver();
		    
			
		*/
		String browser=pro.getProperty("FirefoxDriver");
		return browser;
	}
	public String URL()
	{
		String Url=pro.getProperty("URL");
		return Url;
				
	}
		
	}

	
		
	

