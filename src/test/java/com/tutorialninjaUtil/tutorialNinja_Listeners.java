package com.tutorialninjaUtil;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class tutorialNinja_Listeners implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testcase is started - " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Testcase is Pass - " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase is Fail - " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Testcase is skipped - " +result.getName());
		
	}

	
}
