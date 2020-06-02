package com.sps.dc4.testscripts;

import org.testng.annotations.Test;

import com.sps.dc4.commons.WebDriverFactory;
import com.sps.dc4.dataproviders.DataProviders;
 
import com.sps.dc4.pages.OpenEmail;
import com.sps.dc4.pages.LoginPage; 

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
//	@Test(dataProvider="CompanyNameProvider", dataProviderClass=DataProviders.class, priority = 2)
	public void successfulLogin(String ficsTask, /*String fReviewEmail,String sReviewEmail, String defectcntadd,*/String logadd) throws Exception
	{
		openEmail = new OpenEmail();
		openEmail.OpenEmail(ficsTask,/*fReviewEmail, sReviewEmail, defectcntadd,*/ logadd);
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is the extion in main method");
	}

}
