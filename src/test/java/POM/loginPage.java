package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	//constructor
	loginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locators
	@FindBy(xpath = "//input[@name='username']") WebElement txt_username;
	@FindBy(xpath = "//input[@name = 'password']") WebElement txt_password;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") WebElement btn_login;
	
	
	//Action methods
	public void setUserName(String user) {
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pws) {
		txt_password.sendKeys(pws);
	}
	
	public void clickLogin() {
		btn_login.sendKeys(Keys.ENTER);
	}
}
