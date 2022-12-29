package com.tutorialninja_testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninjaUtil.TestUtil;
import com.tutorialninja_pages.accountLoginLogoutPage;
import com.tutorialninja_pages.addToCartPage;
import com.tutorialninja_pages.mainPage;
import com.tutorialninja_pages.registerPage;


public class tutorialninja_BaseClass 
{
	
	mainPage mp;
	accountLoginLogoutPage loinLogoutPage;
	registerPage rp;
	addToCartPage acp;
	TestUtil tutil;
	public static WebDriver d;
	
	String email_id;
	String password;
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		
		d = new ChromeDriver(options);
		
		
		loinLogoutPage = new accountLoginLogoutPage(d);
		
		//scrnCapture = new screenShots(d);		
		
		d.get("http://www.tutorialsninja.com/demo/");
		
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.manage().window().maximize();
						
		mp = new mainPage(d);
		
		email_id = "ajaysharma@gmail.com";
		password = "ajaysharma";
		
		loinLogoutPage = new accountLoginLogoutPage(d);
		
		rp = new registerPage(d);
		
		acp = new addToCartPage(d);
		
		tutil = new TestUtil();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		d.quit();
	}
}