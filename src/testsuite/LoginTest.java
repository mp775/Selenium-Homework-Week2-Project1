package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.findElement(By.linkText("Log in")).click();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomeText = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals("Welcome message is not displayed", expectedWelcomeText, actualWelcomeText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.linkText("Log in")).click(); // find Log In button web element
        //find the Email field element
        driver.findElement(By.id("Email")).sendKeys("manya.patel@gmail.com");  // find the Email field web element
        //find the password field element
        driver.findElement(By.id("Password")).sendKeys("Test123");  // find the Password field web element
        //find login element
        driver.findElement(By.xpath("//button[text() ='Log in']")).click(); // find Log In button web element
        //verify log out button element is display
        String actualLogOutBtnText = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        Assert.assertEquals("Log out text is not displayed ", "Log out", actualLogOutBtnText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //find the login web element
        driver.findElement(By.linkText("Log in")).click();
        //find the email field element
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //find the password field element
        driver.findElement(By.name("Password")).sendKeys("Prime1");
        //click on login button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        //verify the error message is display
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error massage is displayed", expectedMessage, actualMessage);

    }

    @After

    public void tearDown() {
        closeBrowser();
}
}