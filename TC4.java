import Utilties.BaseDriver;
import Utilties.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC4  extends BaseDriver {

    @Test
    public  void  Test4(){

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
        MyMethods.myWait(4);
        driver.quit();





        //input[@name="firstName"]
    }
}
