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
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "search")	
	WebElement searchProductTextBox;
	
	public void searchProductTextBox(String product)
	{
		//searchProductTextBox.click();
		searchProductTextBox.sendKeys(product);
	}
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement searchProductResult;
	
	public void searchbutton()
	{
		searchProductResult.click();
		
	}

	@FindBy(xpath = "//*[text()=\"Add to Cart\"]")
	WebElement addToCartFromSearchPage;
	
	public void addToCartButton()
	{
		addToCartFromSearchPage.click();
	}

	@FindBy(xpath = "div[@class=\"alert alert-success alert-dismissible\"]")
	WebElement productAddedConfirmationMessage;
	
	public void productConfirmationMessage()
	{
		productAddedConfirmationMessage.click();
	}
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement clickOnSearchProduct;
	
	public void clickOnSearchProduct()
	{
		clickOnSearchProduct.click();
		
	}

	@FindBy(id = "button-cart")
	WebElement addToCart;
	
	public void addToCart()
	{
		addToCart.click();
	}
	
	@FindBy(id= "cart-total")
	WebElement cartItems;
	
	public void cartItems()
	{
		cartItems.click();
	}
	
	@FindBy(xpath = "(//*[@class =\"fa fa-share\"])[2]")
	WebElement checkOutFromItemsPopup;
	
	public void checkOutFromItemsPopup()
	{
		checkOutFromItemsPopup.click();
	}
	
	
	@FindBy(xpath = "//p[@class =\"text-right\"]//i[@class=\"fa fa-shopping-cart\"]")
	WebElement viewCartItemsPopup;
	
	public WebElement viewCartItemsPopup() 
	{
		return viewCartItemsPopup;
	}
	
	
	
}
