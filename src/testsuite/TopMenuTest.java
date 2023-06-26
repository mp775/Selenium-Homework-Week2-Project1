package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expectedElement = "Computers";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Computers text is not displayed", expectedElement,actualElement );
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        String expectedElement = "Electronics";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Electronics text is not displayed", expectedElement,actualElement );
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();
        String expectedElement = "Apparel";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Apparel text is not displayed", expectedElement, actualElement);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        String expectedElement = "Digital downloads";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Digital download text is not displayed",expectedElement,actualElement);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).click();
        String expectedElement = "Books";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Books text is not displayed",expectedElement,actualElement);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        String expectedElement = "Jewelry";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Jewelry text is not displayed",expectedElement,actualElement);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        String expectedElement = "Gift Cards";
        String actualElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Gift card text is not displayed",expectedElement,actualElement);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
