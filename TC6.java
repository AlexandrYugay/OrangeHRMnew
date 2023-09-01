import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class TC6 {
        @Test
    public void uploadPNGformatImageTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name=\"username\"]")));
        WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
        username.sendKeys("JohnSnow");
        WebElement password = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        password.sendKeys("JohnSnow123");
        WebElement loginButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        loginButton.click();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p[class=\"oxd-text oxd-text--p\"]"), "Time at Work"));
        WebElement MyInfoPage = driver.findElement(By.xpath("//span[text()=\"My Info\"]"));
        MyInfoPage.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("employee-image")));

        WebElement profilePicture = driver.findElement(By.className("employee-image"));
        profilePicture.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i[class=\"oxd-icon bi-plus\"]")));
        WebElement addPicture = driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-plus\"]"));
        addPicture.click();
            StringSelection filePath =new StringSelection("C:\\Users\\ancho\\Desktop\\SDET course\\Friday project 2\\pngimg.com - mario_PNG125.png");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
        Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL); // press and hold CTRL button
            robot.keyPress(KeyEvent.VK_V); // press and hold V button

            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress((KeyEvent.VK_ENTER));
            MyMethods.myWait(1);

        WebElement submitPicture = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        submitPicture.click();



            }
    }


