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

	public void firstName(String fn)
	{
		firstname.sendKeys(fn);
	}

	
	@FindBy(name = "lastname")
	WebElement lastname;
	
	public void lastName(String ln)
	{
		lastname.sendKeys(ln);
	}
	
	@FindBy(name = "email")
	WebElement registerEmail;
	
	public void registerEmail(String remail)
	{
		registerEmail.sendKeys(remail);
	}
	
	@FindBy(name = "telephone")
	WebElement telephone;
	
	public void telephone(String tphone)
	{
		telephone.sendKeys(tphone);
	}
	
		
	@FindBy(name = "password")
	WebElement registerPassword;
	
	public void registerPassword(String pwd)
	{
		registerPassword.sendKeys(pwd);
	}
	
		
	@FindBy(name = "confirm")
	WebElement confirmRegisterPassword;
	
	public void confirmRegisterPassword(String Confirmpwd)
	{
		confirmRegisterPassword.sendKeys(Confirmpwd);
	}
	
	@FindBy(name = "agree")
	WebElement agree;
	
	
	public void agreePrivacy()
	{
		agree.click();
	}
	

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement registerContinue;
	
	public void registerContinue()
	{		registerContinue.click();
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
