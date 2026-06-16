package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By error = By.id("login-button");
		
	
	//constructor
	public LoginPage(WebDriver driver)
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
	return driver.findElement(error).getText();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
