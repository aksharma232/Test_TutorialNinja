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

import com.tutorialninja_pages.accountLoginLogoutPage;
import com.tutorialninja_pages.mainPage;
import com.tutorialninja_utility.screenShots;

public class tutorialninja_BaseClass 
{
	
	mainPage mp;
	accountLoginLogoutPage loinLogoutPage;
	//screenShots scrnCapture;
	

	public WebDriver d;
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
		
		loinLogoutPage = new accountLoginLogoutPage(d);
		
		//d.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		d.quit();
	}
}