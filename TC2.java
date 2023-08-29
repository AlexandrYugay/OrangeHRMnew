import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2 extends BaseDriver {

    @Test
    public void test2(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement userName = driver.findElement(By.xpath("//*[@name=\"username\"]"));
        userName.sendKeys("Admin");

        WebElement Password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        Password.sendKeys("abc123");

        WebElement SubmitButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        SubmitButton.click();

        WebElement ErrorMessage = driver.findElement(By.xpath(" //*[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
        ErrorMessage.isDisplayed();

        // Verify that the expected message is displayed
        String expectedMessage = "Invalid credentials";
        Assert. assertEquals("Invalid credentials",expectedMessage);
    }

}



