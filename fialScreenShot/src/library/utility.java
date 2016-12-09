package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class utility {
	
	public static void capturescreenshot(WebDriver driver,String screenshotname)
	{
		
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src, new File("./screenshot/"+"screenshotname"+".png"));
		} catch (Exception e) {
			
			System.out.println("Exception while taking screenshot"+e.getMessage());
			
			
		} 
		
		
	}

}
