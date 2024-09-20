package com.comcast.ListenersUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.BaseclassUtility.TreadUsage;
import com.generic.Javautility.JavaUtility;
import com.generic.WebDriverutility.WebdriverUtility;


public class Listenersusage implements ITestListener, ISuiteListener, IRetryAnalyzer {
	WebdriverUtility wutil= new WebdriverUtility();
	JavaUtility jutil=new JavaUtility();
	public ExtentReports reports;
	public ExtentTest test;
	
	private int retryCount=0;
	private static final int maxretrycount=5;
	
	public void onStart(ISuite suite) {
		String time= new Date().toString().replace(':', '_');
		ExtentSparkReporter esk = new ExtentSparkReporter("./AdvanceReport/Report"+time+".html");
		esk.config().setDocumentTitle("Crm_Test_suite_result");
		esk.config().setReportName("Crm Report");
		esk.config().setTheme(Theme.DARK);
		reports = new ExtentReports();
		reports.attachReporter(esk);
		// reports.setSystemInfo("browser", "Chrome");
		reports.setSystemInfo("os", "Windows");

		System.out.println("connected");

		

		System.out.println("on  suite start");
	}

	public void onFinish(ISuite suite) {
		reports.flush();
		System.out.println("on suite finish");
		
		}

	public void onTestStart(ITestResult result) {
		
	test=reports.createTest(result.getMethod().getMethodName());
	TreadUsage.setTest(test);
		
		
		System.out.println("on Test start");
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("on  test sucess");
	}

	public void onTestFailure(ITestResult result){
		//String name= result.getMethod().getMethodName();
		System.out.println(jutil.GetSystemDate("yyyy-MM-dd").replace(':', '_'));
			TakesScreenshot sh= (TakesScreenshot)TreadUsage.getDriver();
		String takenpath=	sh.getScreenshotAs(OutputType.BASE64);
		TreadUsage.getTest().addScreenCaptureFromBase64String(takenpath, "crmReportSS");		
		System.out.println("on test fail");
		
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("on test skipped");
	}

	public boolean retry(ITestResult result) {		
			if(retryCount<=maxretrycount) {				
				retryCount++;
				return true;
			}		
		return false;
	}
	
	

	

}
