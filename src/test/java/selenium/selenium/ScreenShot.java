
package selenium.selenium;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.filesystem.model.File;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ScreenShot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        java.io.File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //File dest =new File("C:\\Users\\Arpita\\Pictures\\APTA.JPG_"+Timetamp()+"jfif");
        //FileUtils.copyFile(src,dest);
    }
    public static  String Timetamp(){
        return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
    }


}
