package com.tutorialninja_testcases;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tutorialninja_pages.mainPage;
import com.tutorialninja_pages.registerPage;

public class registerTutorialNinja extends tutorialninja_BaseClass 
{

	registerPage rp;
	mainPage mp;
	
	@BeforeTest
	public void setupRegister() throws InterruptedException
	{
		LaunchBrowser();
		mp = new mainPage(d);
		//mp.My_Account().click();
		mp.Register().click();
		
	}
	
	@Test(priority =1, dataProvider = "registerInfo")
	public void registerNewAccountToTutorialNinja(String fn, String ln, String email, String telephoneno, String passwrd, String cnfpassword)
	{
		SoftAssert sf = new SoftAssert();
		rp = new registerPage(d);
		rp.firstName().sendKeys(fn);
		rp.lastName().sendKeys(ln);
		rp.registerEmail().sendKeys(email);
		rp.telephone().sendKeys(telephoneno);
		rp.registerPassword().sendKeys(passwrd);
		rp.confirmRegisterPassword().sendKeys(cnfpassword);
		rp.agreePrivacy().click();
		rp.registerContinue().click();
		sf.assertTrue(rp.accountCreatedMessage().isDisplayed(), "Account is Created Successfully");
		sf.assertAll();
	}
	
	@DataProvider(name="registerInfo")
	public Object[][] registerdetails()
	{
		Object[][] registerData = {{"Prashant", "Sharma", "pp@gmail.com", "9999999999", "ppsharma", "ppsharma"}};
		return registerData;
		
	}
	
	@Test(priority =2, dataProvider = "registerInfo")
	public void alreadyRgisterToTutorialNinja(String fn, String ln, String email, String telephoneno, String passwrd, String cnfpassword)
	{
		rp = new registerPage(d);
		rp.firstName().sendKeys(fn);
		rp.lastName().sendKeys(ln);
		rp.registerEmail().sendKeys(email);
		rp.telephone().sendKeys(telephoneno);
		rp.registerPassword().sendKeys(passwrd);
		rp.confirmRegisterPassword().sendKeys(cnfpassword);
		rp.agreePrivacy().click();
		rp.registerContinue().click();
		String test1 = rp.errorMessageAlreadyRegister().getText();
		assertEquals(test1, "Warning: E-Mail Address is already registered!");
	}
	
	@AfterTest
	public void clsBrowser()
	{
		closeBrowser();
	}
}
