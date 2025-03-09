package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class HardAssertExe {
    @Test
    public void VerifyDemoApplications(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement swagLabsElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assert.assertTrue(swagLabsElement.isDisplayed(),"swag element should be displayed" );
        WebElement poductele= driver.findElement(By.xpath("//span[text()='Products']"));
        Assert.assertEquals(poductele.getText(), "Products",  "swag element should be displayed" );
        driver.close();




    }
}
