package personal.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAllButton { //*** 	DROPDOWN SELECTON USING SENDKEYS 	***  WITHOUT SELECT CLASS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//select[contains(@class,'nav-progressive-search-dropdown')]"));
		//element.click();
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.click();

	}

}
