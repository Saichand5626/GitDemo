package personal.practicess;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOn {
	
	@Test(priority = 1)
	public void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods= {"login"})
	public void search() {
		Assert.assertTrue(false);
	}
	
	@Test(priority = 3, dependsOnMethods = {"search"})
	public void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 4, dependsOnMethods = "login",enabled = true) //enabled = true will execute the test case , enabled = false will not execute the test case
	public void logout() {
		Assert.assertTrue(true);
	}

}
