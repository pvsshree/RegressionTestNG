package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.LoginDemoPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStep {
	WebDriver driver;
	LoginDemoPage demo = new LoginDemoPage(DriverFactory.getDriver());
	
	

	@Given("User is on Sauce demo login page")
	public void user_is_on_sauce_demo_login_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com");
	}

	@When("User gets the title of page")
	public void user_gets_the_title_of_page() {
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	   Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Swag Labs");
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String user, String pswd) {
	    demo.loginMethod(user, pswd);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    demo.clickLogin();
	}

	//-------test 2------
	
	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String user, String pass) {
	    demo.wrongUser(user, pass);
	}

	@Then("{string} Error message should be displayed")
	public void error_message_should_be_displayed(String error) {
	   Assert.assertEquals(error,demo.errormsg());
	}





	
	

}
