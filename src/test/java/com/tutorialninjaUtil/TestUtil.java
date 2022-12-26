package com.tutorialninjaUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.zip.DataFormatException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tutorialninja_testcases.tutorialninja_BaseClass;



public class TestUtil extends tutorialninja_BaseClass
{
	
	static String filepath = System.getProperty("user.dir")+ "\\src\\test\\java\\com\\tutorialninjaUtil\\Testingdata.xlsx";
 	static XSSFWorkbook book;
 	static Sheet sheet;
 	
 	
 	/*
 	 * Get Test data from given sheet
 	 */
	public static Object[][] getTestData(String sheetname) throws EncryptedDocumentException, InvalidFormatException {
		
		FileInputStream file = null;
		try {
			
			file = new FileInputStream(filepath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			for(int j = 0; j< sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
			
		
		return data;
		
	}


	private static Workbook XSSFWorkbook(FileInputStream file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * take screenshot and save it in given path
	 * @param TestCaseName
	 * @return file path
	 * @throws IOException
	 */
	
	public void TakeScreenshotAfterTest(String TestCaseName) throws IOException {
		File sc = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		String curdir = System.getProperty("user.dir");
		String destination = curdir + "//screenshots//" + TestCaseName + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(sc, new File(destination));
		//return destination;
		
	/*	TakesScreenshot screen = ((TakesScreenshot)d);
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "//screenshots";
		File dest = new File(path+cdatetime()+".png");
		*/
	}
	
	
}

