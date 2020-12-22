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
			File src = new File ("src/main/resources/objectRepository/application.properties");
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
		
		String browser=pro.getProperty("FirefoxDriver");
		return browser;
	}
	public String URLlink()
	{
		String Url=pro.getProperty("url");
		return Url;
				
	}
		
	}

	
		
	

