package com.comcast.ListenersUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer {

	
	private int retryCount=0;
	private static final int maxretrycount=5;
	
	
	public boolean retry(ITestResult result) {
		if(retryCount<=maxretrycount) {
			
			retryCount++;
			return true;
		}
		return false;
	}

}
