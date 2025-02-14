package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {

	WebDriver driver;
	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test
	void login() throws InterruptedException {
		loginPage lp = new loginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		Thread.sleep(5000);
		lp.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
}
