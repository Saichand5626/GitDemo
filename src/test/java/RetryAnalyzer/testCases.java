package RetryAnalyzer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCases {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(retryAnalyzer = reRunAutomation.class)
	public void valid() {
		
		String value = driver.getTitle();
		Assert.assertEquals(value, "google"); //try with Google to make the test pass
	}

}
