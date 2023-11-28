package com.saucedemo.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseTest {
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void OpenBrowser(String Browsername) throws FileNotFoundException, IOException 
	{  
		if(Browsername.equals("firefox")) {
			driver =new FirefoxDriver();
            }
		else if (Browsername.endsWith("chrome")) {
			driver=new ChromeDriver();
		}
		
}
	@BeforeMethod
   public void OpenApp() {
		
	   driver.get("https://www.saucedemo.com/");
   }
	@AfterMethod
	public void testmethodresult(ITestResult result)
	{
		if(result.getStatus()==1)
		{
			Reporter.log(result.getName()+" is passed",true);
		}
		else if(result.getStatus()==2)
		{
			Reporter.log(result.getName()+" is failed",true);
		}
	}
	@AfterMethod
   public void CloseBrowser()
   {
	   driver.close();
   }

}
