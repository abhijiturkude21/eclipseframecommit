package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class ListenerEx extends BaseClass implements ITestListener{

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		log.info("test suite finished");
		
	}

	@Override
	public void onStart(ITestContext context) {
		log.info("test suite started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(test.getStatus().FAIL, "test failed");
		log.info("test case failed with name "+result.getName());
		log.info("caputuring screenshot on test failed");
		test.addScreenCaptureFromPath(getScreenshot(result.getName()));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(test.getStatus().SKIP, "test skipped");
		log.info("test case skipped with name "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		log.info("extent test initiated");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(test.getStatus().PASS, "test passed");
		log.info("test case passed with name "+result.getName());
	}

}
