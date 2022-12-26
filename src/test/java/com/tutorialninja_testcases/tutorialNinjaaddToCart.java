package com.tutorialninja_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tutorialNinjaaddToCart extends tutorialninja_login 
{
	@BeforeTest	
	public void setup() throws InterruptedException, IOException
	{
		//LaunchBrowser();
		
		tutorialninja_login loginf = new tutorialninja_login();
		
		loginf.loginWith_Valid_Credentials("ajaysharma@gmail.com", "ajay123");
	}

	@Test
	public void test1()
	{
		System.out.println("testest");
	}
	
	
	
	
}
