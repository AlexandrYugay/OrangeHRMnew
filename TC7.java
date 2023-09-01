import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class TC7 extends BaseDriver{
    @Test
    public void test7() throws AWTException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.xpath("//*[@name=\"username\"]"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
        password.sendKeys("admin123");
        WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        login.click();

        WebElement adm = driver.findElement(By.linkText("Admin"));
        adm.click();

        WebElement addButton = driver.findElement(By.xpath("//button[@type=\"button\"and contains(@class,\"oxd-button oxd-button--medium\")]//i"));
        addButton.click();

        WebElement userRole = driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[1]"));
        Actions actions1 = new Actions(driver);
        Action action = actions1.click(userRole).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).release().build();
        action.perform();


        WebElement status = driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[2]"));
        Action actionstatus = actions1.click(status).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();
        actionstatus.perform();


        WebElement employeeName = driver.findElement(By.cssSelector("input[placeholder=\"Type for hints...\"]"));
        Action actionEmployee = actions1.click(employeeName).sendKeys("Li").build();
        actionEmployee.perform();
        MyMethods.myWait(4);//change this to durationofSeconds!!!!
        actionEmployee = actions1.sendKeys(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();
        actionEmployee.perform();

        WebElement userNameNew = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[1]"));
        String newUserName = "selman";
        userNameNew.sendKeys(newUserName);

        WebElement passwordNew = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));
        String newPassword = "selman123";
        passwordNew.sendKeys(newPassword);

        WebElement confirmpassword = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]"));
        confirmpassword.sendKeys(newPassword);

        MyMethods.myWait(2);

        WebElement saveButton = driver.findElement(By.xpath("//button[text()=\" Save \"]"));
        saveButton.click();

        MyMethods.myWait(2);

        WebElement paulCollings = driver.findElement(By.xpath("//img[@alt=\"profile picture\"]/../.."));
        paulCollings.click();
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();

        WebElement userNamesecond = driver.findElement(By.xpath("//*[@name=\"username\"]"));
        userNamesecond.sendKeys(newUserName);
        WebElement passwordsecond = driver.findElement(By.xpath("//*[@name=\"password\"]"));
        passwordsecond.sendKeys(newPassword);
        WebElement loginsecond = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        loginsecond.click();

//        WebElement PIM = driver.findElement(By.cssSelector("a[href=\"/web/index.php/pim/viewPimModule\"]"));
//        PIM.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement myInfo = driver.findElement(By.xpath("//span[text()=\"My Info\"]"));
        myInfo.click();

        WebElement employeeImage = driver.findElement(By.cssSelector("img[class=\"employee-image\"]"));
        employeeImage.click();

        WebElement addPicture = driver.findElement(By.xpath("(//button[@type=\"button\"])[3]/i"));
        Actions actions = new Actions(driver);
        Action actionAddPicture = actions.click(addPicture).build();
        actionAddPicture.perform();

        StringSelection filepath = new StringSelection("C:\\Users\\Faris\\OneDrive\\Desktop\\AccountingWorksheet.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement errorMessage = driver.findElement(By.xpath("//span[text()=\"File type not allowed\"] "));

        Assert.assertTrue(errorMessage.isDisplayed());
    }
    }

