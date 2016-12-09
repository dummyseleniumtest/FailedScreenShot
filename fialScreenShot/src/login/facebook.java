package login;

import org.testng.annotations.Test;

import library.utility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class facebook {
	WebDriver driver;
	Logger logger=Logger.getLogger("facebook");

  @Test
  public void f() throws Exception {
	  PropertyConfigurator.configure("log4j.properties");
	   driver=new FirefoxDriver();
	   logger.info("Opening Browser");
	  
	  driver.navigate().to("https://www.facebook.com/");
	  logger.info("App Launched");
	  driver.manage().window().maximize();
	  logger.info("Window Maximized");
	  driver.findElement(By.xpath("//*[@id='emailsssss']")).sendKeys("facebook login");
	  
	  logger.info("Enter UserName");
		
	  driver.findElement(By.xpath("//*[@id='u_0_m']")).click();
	  logger.info("Click on Submit Button");
	  
	  
  }
 
 

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		  utility.capturescreenshot(driver, result.getName());
	  }
	  logger.info("Screecnshot Capture");
	  
  }

}
