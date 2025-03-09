package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedofParametorization {
    @Parameters({"CourseName","CityName"})
    @Test
    public void SearchofMltpLetcies(String CourseName , String CityName) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement SearchBox = driver.findElement(By.id("APjFqb"));
        SearchBox.sendKeys( CourseName+ " " + CityName);
        SearchBox.sendKeys(Keys.ENTER);

    }
}