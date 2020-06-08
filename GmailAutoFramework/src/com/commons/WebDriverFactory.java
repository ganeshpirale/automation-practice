package com.commons;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class WebDriverFactory {
	
	public static WebDriver driver;
	public static String chromeDriverPath = "C:\\Users\\ganesh.pirale\\git\\repository\\GmailAutoFramework\\ChromeDriver\\chromedriver.exe";
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static WebDriverWait wait;
	
 
//	@BeforeSuite
	public void beforeSuite()
	{
		String extentReportFile = System.getProperty("user.dir") + "\\extentReportFile.html";
		extent = new ExtentReports(extentReportFile,true);
	}
	
	@BeforeTest
	public void setDriver() throws InterruptedException, AWTException/* , FindFailed */
	{
		 
		
//		driver = new ChromeDriver();
		
		 
		
		//************ Newly created code for extension *************************//
		
//		WebDriver driver = null;
		
		System.out.println("launch chrome: in before test");
		
		System.setProperty("webdriver.chrome.driver",
				chromeDriverPath);
		
		
		Thread.sleep(3000);
		 
//		ChromeOptions chromeOptions = new ChromeOptions();
		
		driver=new ChromeDriver();
		
		

//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

//		driver = new ChromeDriver(capabilities);
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

		driver.manage().window().maximize();

		Thread.sleep(2000); 
		
		
		wait = new WebDriverWait(driver,10);
		 
	}
		
		
	
	
	/*@AfterMethod
	public void testClosure()
	{
		dr.close();
		dr.quit();
		test.log(LogStatus.INFO, "Browser Closed successfully...");
		
		extent.endTest(test);	
	}*/
	
//	@AfterSuite
	public void afterSuite()
	{
		extent.flush();
		extent.close();
	}
	
	public static WebDriver getDriver()
	{
		System.out.println("in getDriver");
		return driver;
	}
	
	public static WebDriverWait waitFor()
	{
		System.out.println("in getDriver");
		return wait;
	}
	
	
	
	
	
	
	
	
	 
	/*@AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = capture(driver, result.getMethod().getMethodName());
            test.log(LogStatus.FAIL, result.getThrowable());
            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
        }
       // driver.close();
       // driver.quit();
		test.log(LogStatus.INFO, "Browser Closed successfully...");
        extent.endTest(test);
    }*/
	
}
