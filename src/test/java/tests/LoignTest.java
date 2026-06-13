package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoignTest extends BaseTest {
	
	
	@Test (groups = {"regression"})
	public void LoginMethodTest()
	{
		System.out.println("HEy");
		LoginPage login = new LoginPage(DriverFactory.getDriver());
		System.out.println("done");
		login.loginMethod("standard_user", "secret_sauce");
		System.err.println("error");
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("inventory"));
			
	}

	public void errormsgVerify() {
		LoginPage login = new LoginPage(DriverFactory.getDriver());
		login.errormsg();
		String actual = DriverFactory.getDriver().getTitle();
		Assert.assertTrue(actual.matches("Epic sadface: Username is required"));
		}

	
	
	
	
	
	
	
}
