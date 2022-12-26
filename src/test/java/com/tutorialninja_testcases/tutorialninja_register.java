package com.tutorialninja_testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tutorialninjaUtil.TestData;

public class tutorialninja_register extends tutorialninja_BaseClass
{

	private String Testcasename = "getRegisterValiadData";
	//String testcase = getRegisterValiadData;
	public tutorialninja_register()
	{
		super();
	}

	@Test(dataProvider = "getregistertionadata", dataProviderClass = TestData.class)
	public void getRegisterValidData(String fn, String ln, String emailid, String phone, String pwd, String cpwd) throws InterruptedException, IOException
	{
		SoftAssert sf = new SoftAssert();
		mp.My_Account();
		mp.Register();
		Thread.sleep(3000);
		rp.firstName(fn);
		rp.lastName(ln);
		rp.registerEmail(emailid);
		rp.telephone(phone);
		rp.registerPassword(pwd);
		rp.confirmRegisterPassword(cpwd);
		rp.agreePrivacy();
		tutil.TakeScreenshotAfterTest(Testcasename);
		
		rp.registerContinue();
		sf.assertTrue(rp.accountCreatedMessage().isDisplayed());
		sf.assertAll();
				
	}
}