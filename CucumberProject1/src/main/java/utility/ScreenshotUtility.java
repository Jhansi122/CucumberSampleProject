package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public static void Screenshot(WebDriver driver, String ScreenshotName) {
      try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File("./ScreenShots/" +ScreenshotName+".png"));
	
	} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
      
	}
}
