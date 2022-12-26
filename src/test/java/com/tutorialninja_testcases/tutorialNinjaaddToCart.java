package com.tutorialninja_testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tutorialNinjaaddToCart extends tutorialninja_BaseClass 
{
	
	public tutorialNinjaaddToCart()
	{
		super();
	}

		
	@Test
	public void addToCard() throws InterruptedException
	{
		
		String product = "hp";
		acp.searchProductTextBox(product);
		acp.searchbutton();
		acp.addToCartButton();
		
	}
	
}
