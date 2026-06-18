package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

//DriverFactory to start the browser
public static void startDriver(String browser) {

    if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
    driver.set(new ChromeDriver());
    
    } else if (browser.equalsIgnoreCase("edge")) {
        WebDriverManager.edgedriver().setup();
       // driver = new EdgeDriver();
    driver.set(new EdgeDriver());
    }

 //   driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
}
 
public static WebDriver getDriver()
{
    return driver.get();
}

public static void quitDriver() {
    if (driver.get() != null) {
        driver.get().quit();
        driver.remove();
    }}





}
