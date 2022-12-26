package com.tutorialninja_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountLoginLogoutPage 
{

	WebDriver d;
	
	public accountLoginLogoutPage(WebDriver d)
	{
		this.d = d;
		PageFactory.initElements(d, this);
	}	

	@FindBy(id = "input-email")
	WebElement emailid;
	
	public void enter_email(String email)
	{
		emailid.sendKeys(email);
		
	}
		
	@FindBy(id = "input-password")
	WebElement password;
	
	public void enter_password(String pwd)
	{
		password.sendKeys(pwd);
	}

	@FindBy(xpath = "//input[@value=\"Login\"]")
	WebElement Loginbutton;
	
	public void Log_In()
	{
		Loginbutton.click();
	}


	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement noMatchErrorMessage;
	
	public WebElement noMatchErrorMessage()
	{
		 return noMatchErrorMessage;
	}

	@FindBy(xpath = "//h2[text()= 'My Account']")
	WebElement successfulLogin;
	
	public WebElement successfulLogin()
	{
		return successfulLogin;
	}
	

	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public WebElement logoutTutorialNinja()
	{
		return logout;
	}

	@FindBy(xpath = "//h1[text()='Account Logout']")
	WebElement afterLogoutConfirmation;

	public WebElement afterLogoutConfirmation()
	{
		return afterLogoutConfirmation;
	}

	public void Login_account(String email_id, String password) {
		enter_email(email_id);
		enter_password(password);
		Log_In();
	}
}

