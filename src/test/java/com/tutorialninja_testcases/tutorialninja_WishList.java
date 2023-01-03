package com.tutorialninja_testcases;

import org.testng.annotations.Test;

import com.tutorialninja_pages.accountLoginLogoutPage;

public class tutorialninja_WishList extends tutorialninja_BaseClass
{

	public tutorialninja_WishList()
	{
		super();
	}

@Test 
public void wishListProduct()
{
	mp.WishList();
	
	loinLogoutPage.Login_account(email,password);
	
	
}




}
