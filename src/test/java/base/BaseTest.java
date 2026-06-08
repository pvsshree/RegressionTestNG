package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class BaseTest {


	    protected WebDriver driver;
	    ConfigReader config = new ConfigReader();

	    @BeforeMethod
	    public void setup() {

	        driver = DriverFactory.initDriver(
	                config.get("browser")
	               
	        );

	        driver.get(config.get("url"));
	    }

	    @AfterMethod
	    public void tearDown() {
	        DriverFactory.quitDriver();
	
	
	
	    }}
