package com.commons;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 
 
public class Utility {
//	public static WebDriver driver = WebDriverFactory.getDriver();
	public static WebDriver driver;

	//WebDriver driver;
	
	/*public static boolean waitForPageElement(String locator, String locatorDescription)
	{
		int counter=0;
		while(counter<=20)
		try
		{
			switch(locator)
			{
				case "id": WebDriverFactory.getDriver().findElement(By.id(locatorDescription));
						   return true;
				case "xpath": WebDriverFactory.getDriver().findElements(By.xpath(locatorDescription));
						   return true;
				case "name": WebDriverFactory.getDriver().findElement(By.name(locatorDescription));
						   return true;
			}
		}
		catch(Exception e)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("The Element "+locatorDescription+" is not found in "+counter+" sec.");
				counter++;
			}
			catch(InterruptedException e1)
			{
				e1.getStackTrace();
			}
		}
		return false;
	}*/
	
	
	public static WebDriver startBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver  = new FirefoxDriver();
			return driver;
		} 
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Ganesh\\Data\\Framework\\JAR\\Automation Jars\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shriniwas.alle\\Desktop\\PTT_JAR_NEW\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		else if (browser.equalsIgnoreCase("ie")) {
			
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		else return null;
	}
	
	
	
	
	/*Wait for page element*/
	  public static boolean waitForPageElement(String locator, String locatorDescription) {
		  
//		System.out.println("In waitForPageElement");  
	    boolean matched = false;
	    for (int counter = 0; counter <= 20; counter++) {
	      try {
//	    	  System.out.println("In Try - waitForPageElement"); 
	    	  
	          switch (locator) {
	          case "id":
	            WebDriverFactory.getDriver().findElement(By.id(locatorDescription)); {
	            matched = true;
	            break;
	            }
	          case "xpath":
	            WebDriverFactory.getDriver().findElement(By.xpath(locatorDescription)); {
	            matched = true;
	            break;
	            }
	          case "name":
	            WebDriverFactory.getDriver().findElement(By.name(locatorDescription)); {
	            matched = true;
	            break;
	            }
	          }
	      } catch (Exception e) {
	        try {
	          Thread.sleep(1000);
	          System.out.println("The Element " + locatorDescription + " is not found in " + counter + " sec.");
	        } catch (InterruptedException e1) {
	          e1.getStackTrace();
	        }
	      }
	    }
	    if (matched)
	      return true;
	    else
	      return false;

	  }
	  
	  /*Wait for window pop up loaded*/
	  public static void waitForWindowpopUpLoaded() {
	        ExpectedCondition<Boolean> expectedCondition = new
	                ExpectedCondition<Boolean>() {
	                    @Override
	          public Boolean apply(WebDriver driver) {
	                      System.out.println("In waitForWindowpopUpLoaded");
	                        return (driver.getWindowHandles().size() != 1);
	                    }
	                };
	        try {
	            Thread.sleep(1000);
	            WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 30);
	            wait.until(expectedCondition);
	        } catch (Throwable error) {
	            Assert.fail("Timeout waiting for Window pop up complete to load");
	        }
	    }
	  
	  /*Wait for page loaded*/
		/*public static void waitForPageLoaded() {
	        ExpectedCondition<Boolean> expectation = new
	                ExpectedCondition<Boolean>() {
	                    @Override
						public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	                    }
	                };
	        try {
	            Thread.sleep(1000);
	            System.out.println("Waiting...");
	            WebDriverWait wait = new WebDriverWait(driver, 30);
	            wait.until(expectation);
	        } catch (Throwable error) {
	            Assert.fail("Timeout waiting for Page Load Request to complete.");
	        }
	    }*/
	  
	 
	
}
