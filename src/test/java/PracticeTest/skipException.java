package PracticeTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipException {

	boolean dataSetUp = false;
	
	@Test(enabled=false) //here we are not skipping. Actually here we are not executing test.
	public void skipTest1() {
		System.out.println("skipping this test using enabled attribute as it is not completely written code");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("skipping this test forcefully");
		throw new SkipException("skipping this test");			//this line will skip the test
	}
	
	@Test
	public void skipTest3() {
		System.out.println("skipping this test based on condition");
		if(dataSetUp==true) {										//this is validating with line 8 based on condition it may skip. 
			System.out.println("execute the test");
		}else {
			System.out.println("will not execute the test");
			throw new SkipException("Do not execute further steps");
		}
	}
	
	
	
}
