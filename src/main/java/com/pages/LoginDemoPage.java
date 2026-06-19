package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDemoPage {
WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By error = By.xpath("//h3[contains(text(),'Epic sadface: Username is required')]");
		
	
	//constructor
	public LoginDemoPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	//Actions
	//login method
	public void loginMethod(String user, String pass)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();

	}
	
	public void clickLogin()
	{
	driver.findElement(loginButton).click();
	}
	
	public String errormsg() {
		WebDriverWait wait = new WebDriverWait(	driver, Duration.ofSeconds(50));
		String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(error)).getText();
		System.out.println(msg);
		return msg;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
