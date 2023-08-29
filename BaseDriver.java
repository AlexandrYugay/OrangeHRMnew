
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    static {
        closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Expands the driver until the edges of the screen.

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        // It waits until our computer downloads all necessary files from the server
        // If it cannot download them in specified time Selenium throws an exception
        // that means there is a problem with the server side

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Waits until the browser translates all the document downloaded and converts them to html codes.
        // If it cannot convert them into HTML in specified time period Selenium throws an exception
        // that means your application is not compatible with the browser

    }

    public static void waitAndQuit() {
        MyMethods.myWait(3);
        driver.quit();
    }

    public static void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
