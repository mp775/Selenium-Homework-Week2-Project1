package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//a[@class = 'ico-register']")).click();
        String expectedTextRegister = "Register";
        String actualTextRegister = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals("Register text is not present", expectedTextRegister, actualTextRegister);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
       // click on register icon
        driver.findElement(By.xpath("//a[@class = 'ico-register']")).click();
        //select gender
        driver.findElement(By.id("gender-female")).click();
        //enter firstname
        driver.findElement(By.xpath("//input[@id = 'FirstName']")).sendKeys("Sonam");
        //enter last name
        driver.findElement(By.name("LastName")).sendKeys("Patel");
        //enter date of date
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("7");
        //enter birth of month
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");
        //enter birth of year
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1987");
        //enter email
        driver.findElement(By.id("Email")).sendKeys("sonam.patel@gmail.com");
        //user shoud able to enter password
        driver.findElement(By.id("Password")).sendKeys("Test123");
        //conform password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");
        //click on registration  button
        driver.findElement(By.id("register-button")).click();
        //verify Your registration completed message
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.className("result")).getText();
        Assert.assertEquals("Registration completed message is not displayed", expectedMessage, actualMessage);
    }



    @After
    public void tearDown() {
        closeBrowser();
    }
}
