package com.tutorialninjaUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot 


{
	public void captureScreenshot(WebDriver d)
	{
		TakesScreenshot screen = ((TakesScreenshot)d);
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "//screenshots";
		File dest = new File(path+cdatetime()+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String cdatetime()
	{
		Date dt = new Date();
		String datetime = dt.toString().replace(":", "_").replace(" ", "_");
		return datetime;
	}
}
