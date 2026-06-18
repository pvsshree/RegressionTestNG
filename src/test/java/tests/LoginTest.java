package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginTest extends BaseTest {
	
	
	@Test (groups = {"regression"})
	public void LoginMethodTest() throws InterruptedException
	{
		System.out.println("HEy");
		LoginPage login = new LoginPage(driver);
		System.out.println("done");
		login.loginMethod("standard_user", "secret_sauce");
		System.err.println("error");
		System.out.println(
			    "Running " + Thread.currentThread().getName());
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("inventory"));
		Thread.sleep(2000);
			
	}

	@Test (groups = {"Smoke"})
	public void loginClick() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.clickLogin();
		String actual = login.errormsg();
		System.out.println("Actual Error Message = [" + actual + "]");
		System.out.println(actual);
		Assert.assertEquals(actual, "Epic sadface: Username is required");
		System.out.println("passed");
		System.out.println(
			    "Running " + Thread.currentThread().getName());
	    
		Thread.sleep(2000);
		}

	
	
	
	
	
	
}
