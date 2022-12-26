package com.tutorialninjaUtil;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class TestData 
{

	String getregistertion = "Registertion";
	
	@DataProvider
	public Object[][] getregistertionadata() throws EncryptedDocumentException, InvalidFormatException
	{
		Object[][] data = TestUtil.getTestData(getregistertion);
		return data;
		
	}
	
}
