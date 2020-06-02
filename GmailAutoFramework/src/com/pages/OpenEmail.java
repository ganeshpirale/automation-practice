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

import com.commons.Utility;
import com.commons.WebDriverFactory;

public class OpenEmail {

	// public static WebDriver driver; // no need to make this as static, here
	// its creating new memory allocation and assigning the null value
	WebDriver driver = WebDriverFactory.getDriver();

	/*
	 * @FindBy(xpath=".//*[@id='quickSearchInput']") WebElement search;
	 * 
	 * @FindBy(xpath=".//*[@id='edit-issue']") WebElement clickEdit;
	 * 
	 * 
	 * @FindBy(xpath=".//*[@id='customfield_24501']") WebElement fReviewAdd;
	 * 
	 * @FindBy(xpath=".//*[@id='customfield_24502']") WebElement sReviewAdd;
	 */

	/*
	 * @FindBy(xpath=".//*[@id='opsbar-operations_more']/span") WebElement
	 * clickMore;
	 * 
	 * @FindBy(xpath=".//*[@id='log-work']/a/span") WebElement clickLogWork;
	 * 
	 * @FindBy(xpath=".//*[@id='log-work-time-logged']") WebElement addTime;
	 * 
	 * @FindBy(xpath=".//*[@id='log-work-submit']") WebElement clickLog;
	 */

	/*
	 * @FindBy(xpath=".//*[@id='customfield_22410']") WebElement defect;
	 * 
	 * 
	 * @FindBy(xpath=".//*[@id='edit-issue-submit']") WebElement clickUpdate;
	 */

	@FindBy(xpath = "//a[text()='Start timer']")
	WebElement startTime;

	// @FindBy(xpath="//div[@title='Add project")
	@FindBy(xpath = "//div[text()='Add project']")
	WebElement addProject;

	@FindBy(xpath = "//span[text()='Bristlecone']")
	// ul[@class='client-list']//li[2]
	WebElement addBrist;

	@FindBy(xpath = "//div[@id='toggl-button-update']")
	WebElement clickDone;

	 
	
	public OpenEmail() {
		PageFactory.initElements(driver, this);
	}

	public long getSystemTime() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		// System.out.println("Current date and time is " + date1);
		long currentTime = date.getTime();
		return currentTime;
	}

	public double getRandomIntegerBetweenRange(double min, double max) {
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}

	 

}
