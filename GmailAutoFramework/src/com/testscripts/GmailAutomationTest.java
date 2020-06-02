package com.testscripts;

import org.testng.annotations.Test;

import com.commons.WebDriverFactory;
import com.dataproviders.DataProviders;
import com.pages.LoginPage;
import com.pages.OpenEmail; 

// This is final script to edit jira 

public class GmailAutomationTest extends WebDriverFactory {
	 
	LoginPage login;
	OpenEmail openEmail;
	 
	
	@Test(priority = 1)
	public void irnit2() throws Exception
	{
		login = new LoginPage();
		
		login.login();
		Thread.sleep(2000);
	}
//	@Test(dataProvider="CompanyNameProvider", dataProviderClass=DataProviders.class, priority = 2)  // this is not yet used
	public void successfulLogin(String ficsTask, /*String fReviewEmail,String sReviewEmail, String defectcntadd,*/String logadd) throws Exception
	{
		openEmail = new OpenEmail();
//		openEmail.OpenEmail();
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is the extion in main method");
	}

}
