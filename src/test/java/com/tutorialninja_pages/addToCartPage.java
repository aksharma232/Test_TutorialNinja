package com.tutorialninja_pages;

import org.openqa.selenium.By;
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
		searchProductTextBox.sendKeys(product);
		searchbutton();
		
		WebElement productname = d.findElement(By.xpath("//a[contains(text(),'"+ product +"')]"));
		
		System.out.println(productname.getText());
		
		String productresult = productname.getText();
		if(productresult.contains(product))
		{
			System.out.println("Product found");
		}
		else 
		{
			System.out.println("Product Not found");
			
		}
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
	
	@FindBy(xpath = "//button[@data-original-title = 'Add to Wish List']")
	WebElement productToWishList;
	
	public void productToWishList()
	{
		productToWishList.click();
	}
	
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	WebElement removeButton;
	
	public void removeButton() throws InterruptedException
	{
		Thread.sleep(3000);
		removeButton.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertConfirmation;
	
	public WebElement removedConfirmation()
	{
		return alertConfirmation;
	}
	
	public WebElement addConfirmation()
	{
		return alertConfirmation;
	}

}

