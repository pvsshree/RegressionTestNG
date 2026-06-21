package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDemoPage {
WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By error = By.xpath("//h3[[data-test='error']");
		
	
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
	}
	
	
	
	public void wrongUser(String user_name, String pass_word) {
		driver.findElement(username).sendKeys(user_name);
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(loginButton).click();	
	}
	
	public String errormsg() {
		WebDriverWait wait = new WebDriverWait(	driver, Duration.ofSeconds(50));
		String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(error)).getText();
		System.out.println(msg);
		return msg;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
