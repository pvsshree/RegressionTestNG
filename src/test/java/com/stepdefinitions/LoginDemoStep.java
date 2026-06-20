package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.LoginDemoPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStep {
	WebDriver driver;
	LoginDemoPage demo = new LoginDemoPage(DriverFactory.getDriver());
	
	@Given("User is on Sauce demo login page")
	public void user_is_on_sauce_demo_login_page() {
	  DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	@When("User gets the title of page")
	public void user_gets_the_title_of_page() {
	    System.out.println(DriverFactory.getDriver().getCurrentUrl());
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Swag Labs");
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_usernandpswd_as(String user, String pswd) {
	    demo.loginMethod(user, pswd);
	    Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("inventory"));
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    demo.clickLogin();
	}


	@Then("User gets error message as {string}")
	public void user_gets_error_message_as(String string) {
		String msg = demo.errormsg();
	    Assert.assertTrue(msg.contains("Epic sadface: Username and password do not match any user in this service"));
	    }

	@When("User clicks on Login button without entering username and password")
	public void user_clicks_on_login_button_without_entering_username_and_password() {
	   demo.clickLogin();
	}



	
	

}
