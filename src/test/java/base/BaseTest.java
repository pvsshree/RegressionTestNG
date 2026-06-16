package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class BaseTest {


	   // protected WebDriver driver;
	    ConfigReader config = new ConfigReader();

	    @BeforeMethod
	    public void setup() {
String browser = config.get("browser");
System.out.println(browser);
	        DriverFactory.startDriver(browser);
	        System.out.println("Got it");
	        DriverFactory.getDriver().get(config.get("url"));
	        System.out.println("URL is ");
	    }

	    @AfterMethod
	    public void tearDown() {
	        DriverFactory.quitDriver();
	
	
	
	    }}
