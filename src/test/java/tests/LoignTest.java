package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoignTest extends BaseTest {
	
	
	@Test (groups = {"regression"})
	public void LoginMethodTest()
	{
		System.out.println("HEy" + driver);
		LoginPage login = new LoginPage(driver);
		System.out.println("done");
		login.loginMethod("standard_user", "secret_sauce");
		System.err.println("error");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
			
	}

	
	
	
	
	
	
	
}
