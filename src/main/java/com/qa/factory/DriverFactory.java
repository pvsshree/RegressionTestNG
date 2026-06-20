package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	
public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

//DriverFactory to start the browser
public WebDriver init_driver(String browser) {
	
	System.out.println("browser" + browser);

    if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
    tldriver.set(new ChromeDriver());
    System.err.println("Accepted");
    
    } else if (browser.equalsIgnoreCase("edge")) {
        WebDriverManager.edgedriver().setup();
       // driver = new EdgeDriver();
    tldriver.set(new EdgeDriver());
    }
    
    else {
		System.out.println("Pls pass correct browser value" + browser);
		
	}

 //   driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
    getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
    
    return getDriver();
}
 
public static synchronized WebDriver getDriver()
{
    return tldriver.get();
}

	
	}

