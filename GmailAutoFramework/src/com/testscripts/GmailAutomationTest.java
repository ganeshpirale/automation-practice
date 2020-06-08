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
	public void irnit1() throws Exception
	{
		login = new LoginPage();
		
		login.login();
		Thread.sleep(2000);
	}
 
	
	
	@Test(priority = 2)
	public void irnit2() throws Exception
	{
		openEmail = new OpenEmail();
		openEmail.email();
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) {
		System.out.println("This is the extion in main method");
	}

}
