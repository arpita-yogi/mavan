package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestngIntro {
    public static WebDriver driver;

    @BeforeMethod
    public void preReqest(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
    }
    @Test
    public void flipkart() {
        driver.get("https://www.flipkart.com/  ");

    }
    @Test
    public void amazon() {
        driver.get("https://www.amazon.in/  ");

    }
    @AfterMethod
    public void CloseBrowser(){
        driver.close();
    }
}
