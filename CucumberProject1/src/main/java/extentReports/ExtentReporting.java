package extentReports;

import java.io.IOException;

import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting 
{
	@Test
	public void loginTest() throws IOException
	{    
            
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter
	    		("src/main/resources/extent_reports/cucumber_extentReport.html");
		
           
	    ExtentReports extent = new ExtentReports();
	    
            
	    extent.attachReporter(reporter);
	    
        
	    ExtentTest logger=extent.createTest("^user navigates to designmodo.com$");
	    
       
	    logger.log(Status.INFO, "^user navigates to designmodo.com$");
	   
	    //logger.log(Status.PASS, "Title verified");
	   
              
	    extent.flush();
		
            // You can call createTest method multiple times depends on your requirement
            // In our case we are calling twice which will add 2 testcases in our report
	    ExtentTest logger2=extent.createTest("^user provides valid (.*) and (.*)$");
	    
	    logger2.log(Status.FAIL, "Title verified");
	    
	    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("src/main/resources/extent_reports/cucumber_extentReport.html").build());
        
	    logger2.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/logo.jpg").build());
 
            // This will add another test in report
	    extent.flush();
	    	
	}
	
}

