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
		
		String browser=pro.getProperty("ChromeDriver");
		return browser;
	}
	public String URLlink()
	{
		String Url=pro.getProperty("url");
		return Url;
				
	}
	public String Login()
	{
		String loginXpath = pro.getProperty("LoginButton");
		return loginXpath;
	}
	public String UserN()
	{
		String Uname= pro.getProperty("UserName");
		return Uname;
	}
		public String pass()
		{
			String Passw = pro.getProperty("Password");
			return Passw;
		}
		public String click() {
			String loginClick = pro.getProperty("LoginClick");
			return loginClick;
		}
		public String Dialouge()
		{
			String box =pro.getProperty("Dialougebox");
			return box;
		}
		public String disagreeButton()
		{
			String button =pro.getProperty("Disagreebutton");
			return button;
		}
	}


	
		
	

