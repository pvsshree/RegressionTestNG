package com.apphooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.Before;

public class ApplicationHooks {
	private WebDriver driver;
   private DriverFactory driverFactory;
   private ConfigReader config ;
   Properties prop;
   
   
   @Before(order=0)
   public void getProperty() {
	   ConfigReader config = new ConfigReader();
	   prop = config.init_prop();
   }
   
   
   @Before(order = 1)
   public void launchBrowser() {
	   String browserName = prop.getProperty("browser");
	   String url = prop.getProperty("url");
	   driverFactory = new DriverFactory();
	   driver = driverFactory.init_driver(browserName);
	   
	   
	   
   }
   
   }
