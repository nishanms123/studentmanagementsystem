package com.sms.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener_implemantation implements ITestListener {
     
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		//executionstart from here
		String methodname = result.getMethod().getMethodName();
	      test=report.createTest(methodname);
	      Reporter.log(methodname+"------>testscript execution statred");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"----->passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failed= result.getMethod().getMethodName()+new JavaUtility().getSystemDateInFormat();
		//EventFiringWebDriver edriver=new EventFiringWebDriver(Base_Class.driver);
		  //   File src = edriver.getScreenshotAs(OutputType.FILE);
		    //   File dst=new File("./screenshot/failedscript1.png");
		    		       test.log(Status.FAIL, failed+"----->failed");
		       test.log(Status.FAIL,result.getThrowable());
		       test.addScreenCaptureFromPath(failed);
		       try {
					String failed1=WebDriverUtility.getScreenShot(Base_Class.driver,"failed");
					test.addScreenCaptureFromPath(failed1);
				} catch (Throwable e) {
				
					e.printStackTrace();
				}

		       Reporter.log(failed+"------>testScript failed");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"------>skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(methodname+"----->testScript skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("SDET-50");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("Student-management-system");
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("os","windows");
		report.setSystemInfo("Base-url","http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		report.setSystemInfo("reporter-name","nishan ms");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	//consolidate the report
		report.flush();
	}
	

}
