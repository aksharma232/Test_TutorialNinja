package com.tutorialninja_utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShots 
{

	public void takescreenshot(WebDriver d, String tcname) 
	{
		String savepath = System.getProperty("user.dir")+"\\sceenshots\\";
		
		TakesScreenshot scrn = ((TakesScreenshot)d);
		
		File src = scrn.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(savepath+tcname+"-"+currentDateTime()+"_"+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String currentDateTime()
	{
		Date date = new Date();
		
		return date.toString().replace(" ", "_").replace(":", "_");
	}
	
}
