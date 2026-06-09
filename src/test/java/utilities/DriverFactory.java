package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
public static WebDriver driver;
//DriverFactory to staart the browser
public static WebDriver initDriver(String browser) {

    if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("edge")) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

    return driver;
}

/*public static void quitDriver() {
    if (driver != null) {
        driver.quit();
    }}*/





}
