package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

	
	@Test
	public void clickOnCart() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginMethod("standard_user", "secret_sauce");
		Thread.sleep(500);
		ProductPage p = new ProductPage(driver);
		p.addToCart();
		Thread.sleep(1000);
		
	}
	
	
	
	
}
