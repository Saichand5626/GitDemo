package Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orangeHRM {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(); //img[@alt='company-branding']
		Assert.assertEquals(status, true);
	}
	/*void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}*/
	
	@Test(priority = 2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "orangeHRMM");
	}
	
	@Test(priority = 3, dependsOnMethods = {"testTitle"})
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "vaoidgasdgvb");
	}
	
	
	
}
