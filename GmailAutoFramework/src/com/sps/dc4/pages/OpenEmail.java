package com.sps.dc4.pages;

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

import com.sps.dc4.commons.Utility;
import com.sps.dc4.commons.WebDriverFactory;

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

	public void OpenEmail(String fics,
			/* String fReview,String sReview,String defectCnt, */ String log)
			throws AWTException, InterruptedException {

		Thread.sleep(3000);
		// search.clear();
		// search.sendKeys(fics);
		// Utility.waitForPageLoaded();
		// driver.navigate().to("https://atlassian.spscommerce.com/browse/"+fics);
		driver.get("https://atlassian.spscommerce.com/browse/" + fics);
		// Utility.waitForPageLoaded();

		Thread.sleep(12000);
		 

		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */

		// Utility.waitForPageElement("xpath", ".//*[@id='edit-issue']");
		/*
		 * clickEdit.click();
		 * 
		 * Thread.sleep(3000); fReviewAdd.clear(); fReviewAdd.sendKeys(fReview);
		 * 
		 * Thread.sleep(3000); sReviewAdd.clear(); sReviewAdd.sendKeys(sReview);
		 * 
		 * 
		 * Thread.sleep(3000); defect.clear(); defect.sendKeys(defectCnt);
		 */

		/*
		 * Thread.sleep(2000); clickMore.click();
		 * 
		 * Thread.sleep(2000); clickLogWork.click();
		 * 
		 * Thread.sleep(3000); addTime.clear(); addTime.sendKeys(log);
		 */

		/*
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * ".//*[@id='log-work-date-logged-date-picker']")).clear();
		 * driver.findElement(By.xpath(
		 * ".//*[@id='log-work-date-logged-date-picker']")).
		 * sendKeys("10/Sep/18 1:26 AM");
		 */

		// clickLog.click();

		// clickUpdate.click();

		long currentTime = getSystemTime();
		System.out.println("Current time " + currentTime);

		double randomTime = getRandomIntegerBetweenRange(595920, 765920); // this is final max time done for PDM 
		 
//		double randomTime = getRandomIntegerBetweenRange(455920, 625920); 

		System.out.println("Random time " + randomTime);

		long stopTime = (long) (currentTime + randomTime);
		System.out.println("Stop time " + stopTime);
		
		
		/*Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("ID"));
		actions.contextClick(elementLocator).perform();
		*/
		
//		Actions action= new Actions(driver);
//		action.contextClick(People).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

		Thread.sleep(8000);
		startTime.click();

		Thread.sleep(8000);
		addProject.click();

		Thread.sleep(8000);
		addBrist.click();

		Thread.sleep(8000);
		clickDone.click();

		while (true) {
			if (getSystemTime() >= stopTime) {

				/*Robot hal = new Robot();
				Random random = new Random();
				System.out.println("Imol");
				hal.delay(60000 * 4);
				int x = random.nextInt() % 640;
				int y = random.nextInt() % 480;
				hal.mouseMove(x, y);*/

				System.out.println("wait state");
				break;
			}
		}

		// need to click here for stop time

	}

}
