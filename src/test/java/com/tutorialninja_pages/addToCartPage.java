package com.tutorialninja_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addToCartPage 
{
	WebDriver d;
	public addToCartPage(WebDriver d)
	{
		this.d = d;
		PageFactory.initElements(this.d, d);
	}
	
	@FindBy(name = "search")	
	WebElement searchProductTextBox;
	
	public WebElement searchProductTextBox()
	{
		return searchProductTextBox;
	}
	
	@FindBy(linkText = "Iphone")
	WebElement searchProductResult;
	
	public WebElement searchProductResult()
	{
		return searchProductResult;
		
	}

	@FindBy(xpath = "//*[text()=\"Add to Cart\"]")
	WebElement addToCartFromSearchPage;
	
	public WebElement addToProductButton()
	{
		return addToCartFromSearchPage;
	}

	@FindBy(xpath = "div[@class=\"alert alert-success alert-dismissible\"]")
	WebElement productAddedConfirmationMessage;
	
	public WebElement productConfirmationMessage()
	{
		return productAddedConfirmationMessage;
	}
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement clickOnSearchProduct;
	
	public WebElement clickOnSearchButton()
	{
		return clickOnSearchProduct;
		
	}

	@FindBy(id = "button-cart")
	WebElement addToCart;
	
	public WebElement addToCart()
	{
		return addToCart;
	}
	
	@FindBy(id= "cart-total")
	WebElement cartItems;
	
	public WebElement cartItems()
	{
		return cartItems;
	}
	
	@FindBy(xpath = "(//*[@class =\"fa fa-share\"])[2]")
	WebElement checkOutFromItemsPopup;
	
	public WebElement checkOutFromItemsPopup()
	{
		return checkOutFromItemsPopup;
	}
	
	
	@FindBy(xpath = "//p[@class =\"text-right\"]//i[@class=\"fa fa-shopping-cart\"]")
	WebElement viewCartItemsPopup;
	
	public WebElement viewCartItemsPopup() 
	{
		return viewCartItemsPopup;
	}
	
	
	
}
