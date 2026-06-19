package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;
	
	//Locator
	By addCartButton = By.id("add-to-cart-sauce-labs-backpack");
	
	
	//Constructor
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void addToCart() {
		driver.findElement(addCartButton).click();
	}
	
	
	
	

}
