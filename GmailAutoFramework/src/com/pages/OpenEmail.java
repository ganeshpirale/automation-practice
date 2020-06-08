package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.commons.Utility;
import com.commons.WebDriverFactory;

public class OpenEmail {

	// public static WebDriver driver; // no need to make this as static, here
	// its creating new memory allocation and assigning the null value
	WebDriver driver = WebDriverFactory.getDriver();

	WebDriverWait wait = WebDriverFactory.waitFor();

	 

	 
	
	public OpenEmail() {
		PageFactory.initElements(driver, this);
	}

	 
	
	public void email() throws InterruptedException
	{

	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//tr[@class='zA yO'][@id=':32']"))).click();
	
	

	String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@name='^i']/preceding::h2[1]"))).getText();
	

	System.out.println(text);
	
	
//	 assertEquals(text, "Security alert");
	 
	Assert.assertEquals(text, "Security alert");
	
	System.out.println("Passed");


	}

}
