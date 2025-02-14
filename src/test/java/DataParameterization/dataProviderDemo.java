package DataParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String psw) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(psw);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		boolean status = driver.findElement(By.xpath("//div[@id='content']/h2[.='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[.='Newsletter']/following-sibling::a")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	
	@DataProvider(name="dp")
	Object[][] loginData(){
		Object[][] data	= {{"saichand","saichand@123"},
							{"kukka@gmail.com","kukka"},
							{"lavanya","lavi"}
							};
		return data;
	
}
}
