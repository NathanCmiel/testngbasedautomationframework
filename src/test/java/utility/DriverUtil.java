package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

    private static WebDriver driver;

    /**
     *  Call this method to initialize the driver object.
     *  Note that calling this method will result in browser startup.
     */
    public static void open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Call this method to terminate the driver object.
     * Note that calling this method will result in browser termination.
     */
    public static void close() {
        if(driver != null) {
            driver.quit();
        }
    }

    /**
     * Call this method to get access to driver object.
     *
     * @return WebDriver object
     */
    public static WebDriver driver() {
        if(driver == null) {
            open();
            return driver;
        }
        return driver;
    }
}
