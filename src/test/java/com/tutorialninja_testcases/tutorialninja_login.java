package com.tutorialninja_testcases;


import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tutorialninja_pages.accountLoginLogoutPage;
import com.tutorialninja_pages.mainPage;
import com.tutorialninja_utility.screenShots;

public class tutorialninja_login extends tutorialninja_BaseClass {

	public tutorialninja_login()
	{
		super();
	}
	
	@Test(priority =1, dataProvider = "logindetials")
	public void loginWith_Valid_Credentials(String emailid, String password) throws InterruptedException, IOException
	{
		SoftAssert sf = new SoftAssert();
		
		mp.My_Account();
		mp.Login();
		loinLogoutPage.Login_account(emailid, password);
		
		//sf.assertTrue(loinLogoutPage.successfulLogin().isDisplayed());
		//sf.assertAll();
		//scrnCapture = new screenShots();
		//scrnCapture.takescreenshot(d, "loginTuturialNinja");				
		
	}
	
	@DataProvider(name = "logindetials")
	public Object[][] logindata()
	{
		Object[][] logindata = {
				{"ajaysharma@gmail.com", "ajaysharma"}};
		return logindata;		
	}
	
	/*	@Test(dependsOnMethods = "loginWith_Valid_Credentials")
		public void logoutTutorialNinja()
		{
			lp = new accountLoginLogoutPage(d);
			lp.logoutTutorialNinja().click();
			lp.afterLogoutConfirmation();
			Assert.assertTrue(lp.afterLogoutConfirmation().isDisplayed(), "Logout Successfully");
			scrnCapture = new screenShots();
			scrnCapture.takescreenshot(d, "logoutTutorialNinja");		
			
			}
*/

	@Parameters ({ "email","passwd"})	
	@Test()
	public void loginWith_InvalidCredentails(String email, String passwd)
	//public void loginwINC(String email, String passwd)
	{
		mp.My_Account();
		mp.Login();
		loinLogoutPage.Login_account(email, passwd);
		
	}
	

}
