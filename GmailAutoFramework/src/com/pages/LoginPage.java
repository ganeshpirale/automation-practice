package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.commons.WebDriverFactory;
import com.relevantcodes.extentreports.LogStatus; 

public class LoginPage {
	
	WebDriver driver = WebDriverFactory.getDriver();
	
	WebDriverWait wait = WebDriverFactory.waitFor();
	
	@FindBy(xpath=".//div[@class='h-c-header__cta h-c-header__cta--tier-two']/ul[1]/li/a[@ga-event-action='sign in']")
	WebElement signIn;
	
	@FindBy(xpath=".//input[@type='email']")
	WebElement username;
	
	
	@FindBy(xpath=".//span[@class='RveJvd snByac'][text()='Next']")
	WebElement usernameNext;
	
	
	@FindBy(xpath=".//div[@class='aXBtI I0VJ4d Wic03c']//input[@type='password']")
	WebElement password;
	
	
	@FindBy(xpath=".//span[@class='RveJvd snByac'][text()='Next']")
	WebElement passwordNext;
	 
	 
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void login() throws InterruptedException
	{
		System.out.println("In Login method of gmail");
		Thread.sleep(3000);
		
//		signIn.click();
		
		
		  signIn = driver.findElement(By.xpath(".//div[@class='h-c-header__cta h-c-header__cta--tier-two']/ul[1]/li/a[@ga-event-action='sign in']")); 
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", signIn);
		  
//		  signIn.click();
		 
		  
		  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    System.out.println(tabs.size());
		    driver.switchTo().window(tabs.get(1));
		    
		    
		    WebElement password;
			
			WebElement passwordNext;
			  
			
			driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("seleniumautomationpracticetest@gmail.com");
			
			driver.findElement(By.xpath(".//span[@class='RveJvd snByac'][text()='Next']")).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='aXBtI I0VJ4d Wic03c']//input[@type='password']"))).sendKeys("automation123");
			
 			passwordNext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[@class='RveJvd snByac'][text()='Next']")));
			
			passwordNext.click();
			
 			
			
	}

}
