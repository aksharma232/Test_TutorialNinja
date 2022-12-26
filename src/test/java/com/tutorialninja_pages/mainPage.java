package com.tutorialninja_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage 
{
	public WebDriver d;
	
	public mainPage(WebDriver d)
	{
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(xpath = "//span[text()= 'My Account']")		
	WebElement My_Account;
	
	public void My_Account()
	{
		My_Account.click();
	}

	@FindBy(linkText = "Register")
	WebElement Register;
	
	public WebElement Register()
	{
		return Register;
	}

	
	@FindBy(linkText = "Login")
	WebElement Login;
	
	public void Login()
	{
		Login.click();
	}



}

