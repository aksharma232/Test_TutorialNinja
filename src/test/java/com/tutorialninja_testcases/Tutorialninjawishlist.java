package com.tutorialninja_testcases;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tutorialninjawishlist extends tutorialninja_BaseClass {


@Test(dataProvider = "products")
  public void wishListProduct(String product) throws InterruptedException, IOException 
  {
	//String TCName = "wishListProduct";
	
	mp.wishList();
	
	loinLogoutPage.Login_account(email_id, password);
	
	acp.searchProductTextBox(product);
	
	acp.productToWishList();
	
	assertTrue(acp.addConfirmation().isDisplayed());
	
	System.out.println(acp.addConfirmation().getText());
	
	mp.wishList();
	
	acp.removeButton();
		
	assertTrue(acp.removedConfirmation().isDisplayed());
	
	System.out.println(acp.removedConfirmation().getText());
		
  }

@DataProvider(name = "products")
public Object[] product()
{
	Object[] product = {"zsdgsdgdxgdxg"};
	return product;		
}
}
