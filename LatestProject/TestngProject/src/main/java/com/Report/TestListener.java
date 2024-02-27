package com.Report;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.utils.Screenshots;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class TestListener  implements ITestListener {
	Screenshots screenshot=new Screenshots();

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	// Before starting all tests, below method runs.
	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart method " + iTestContext.getName());
		// iTestContext.setAttribute("WebDriver", this.getWebDriver());
	}

	// After ending all tests, below method runs.
	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());
		ReportManager.getInstance().flush();
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println(iTestResult.getTestName());
		String description = iTestResult.getMethod().getDescription();
		System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
		if (iTestResult.getTestName() != null) {
			ReportTestManager.startTest(iTestResult.getTestName(),
					iTestResult.getInstance().getClass().getCanonicalName());
		}else if (description != null)
			ReportTestManager.startTest(iTestResult.getMethod().getMethodName() + "( " + description + ")",
					iTestResult.getInstance().getClass().getCanonicalName());
		else {
			ReportTestManager.startTest(iTestResult.getMethod().getMethodName(),
					iTestResult.getInstance().getClass().getCanonicalName());
		}
		System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		//ReportTestManager.getTest().log(Status.PASS, "Test passed");
		
		Object testClass = iTestResult.getInstance();
		WebDriver webDriver = ((BaseClass)testClass).getWebDriver();

		// Take base64Screenshot screenshot.
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);

		ReportTestManager.getTest().log(Status.PASS, "Test passed");
		ReportTestManager.getTest().pass("details",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

	}




		@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");

		Object testClass = iTestResult.getInstance();
		WebDriver webDriver = ((BaseClass)testClass).getWebDriver();

		// Take base64Screenshot screenshot.
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);

		ReportTestManager.getTest().log(Status.FAIL, iTestResult.getThrowable());
		ReportTestManager.getTest().fail("details",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");

		// Extentreports log operation for skipped tests.
		//ReportTestManager.getTest().log(Status.SKIP, "Test Skipped");
		Object testClass = iTestResult.getInstance();
		WebDriver webDriver = ((BaseClass)testClass).getWebDriver();

		// Take base64Screenshot screenshot.
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);

		ReportTestManager.getTest().log(Status.SKIP, "Test Skipped");
		ReportTestManager.getTest().skip("details",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}
}
