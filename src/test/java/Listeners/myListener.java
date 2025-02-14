package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test go skipped");
	}

	public void onTestFinish(ITestContext context) {
		System.out.println("Test finished");
	}

}
