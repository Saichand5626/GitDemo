package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class reRunAutomation implements IRetryAnalyzer{  // IRetryAnalyzer interface has only one abstract method i.e retry
	
	private int retryCount = 0;
	private static final int maxCount = 5;
	
	public boolean retry(ITestResult result) {
		if(retryCount<maxCount) {
			retryCount++;
			return true;  // if test pass it will come out from this override method (retry)
		}
		return false;  //if test fail, then the test will get retry
	}
	
}
