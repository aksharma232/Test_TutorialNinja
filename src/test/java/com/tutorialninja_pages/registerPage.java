package com.tutorialninja_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage 
{
	WebDriver d;
	
	public registerPage(WebDriver d)
	{
		this.d = d;
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "firstname")
	WebElement firstname;



	public WebElement firstName()
	{
		return firstname;
	}

	
	@FindBy(name = "lastname")
	WebElement lastname;
	
	public WebElement lastName()
	{
		return lastname;
	}
	
	@FindBy(name = "email")
	WebElement registerEmail;
	
	public WebElement registerEmail()
	{
		return registerEmail;
	}
	
	@FindBy(name = "telephone")
	WebElement telephone;
	
	public WebElement telephone()
	{
		return telephone;
	}
	
	
	
	@FindBy(name = "password")
	WebElement registerPassword;
	
	public WebElement registerPassword()
	{
		return registerPassword;
	}
	
	
	
	@FindBy(name = "confirm")
	WebElement confirmRegisterPassword;
	
	public WebElement confirmRegisterPassword()
	{
		return confirmRegisterPassword;
	}
	
	@FindBy(name = "agree")
	WebElement agree;
	
	
	public WebElement agreePrivacy()
	{
		return agree;
	}
	

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement registerContinue;
	
	public WebElement registerContinue()
	{
		return registerContinue;
	}
	

	@FindBy(xpath = "//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement accountCreatedMessage;
	
	public WebElement accountCreatedMessage()
	{
		return accountCreatedMessage;
	}


	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement errorMessageAlreadyRegister;
	
	public WebElement errorMessageAlreadyRegister()
	{
		return errorMessageAlreadyRegister;
	}








}
