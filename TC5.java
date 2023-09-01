import Utilties.BaseDriver;
import Utilties.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TC5 extends BaseDriver {

    @Test
    public void Test5 () throws AWTException {


        driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyMethods.myWait(3);
        WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
        Username.sendKeys("Admin");
        MyMethods.myWait(1);
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("admin123");
        MyMethods.myWait(1);
        driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
        MyMethods.myWait(2);
        //   driver.findElement(By.cssSelector("a[class='oxd-main-menu-item active']")).click();
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
        MyMethods.myWait(2);
        //driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Cavour");
        // MyMethods.myWait(3);

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstName']"));

        // Clear existing text using Ctrl + A and Delete keys
        firstNameInput.sendKeys(Keys.CONTROL + "a"); // Select all text

        firstNameInput.sendKeys(Keys.DELETE);         // Delete selected text

        // Now send the new text
        firstNameInput.sendKeys("Cavour");


        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
        MyMethods.myWait(10);

        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/img")).click();
        MyMethods.myWait(2);
        driver.findElement(By.cssSelector("i.oxd-icon.bi-plus")).click();
        MyMethods.myWait(4);


        StringSelection filePath = new StringSelection("C:\\Users\\cavou\\Desktop\\wp4697719.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        // Store the path of our documents
MyMethods.myWait(3);

        Robot robot= new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL); // press and hold control
        robot.keyPress(KeyEvent.VK_V); // press and hold v
        MyMethods.myWait(3);

        // Here we release keys
        // release V first then release Control

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        MyMethods.myWait(3);


        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyMethods.myWait(3);



        driver.quit();





    }
}
