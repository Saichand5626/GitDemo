package personal.practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartSearchBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("shoes");
		Thread.sleep(6000);
		List<WebElement> pro =  driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']")); // 1. //div[@class='YGcVZO _2VHNef']  2.//form[@class='_2rslOn header-form-search OpXDaO']/ul/li
		
		int count = pro.size();
		pro.get(count-1).click();
	}

}
