import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.get("http://www.webdriveruniversity.com/File-Upload/index.html");

        //' driver.manage().window().fullscreen();
        WebElement file = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
        file.sendKeys("/Users/rikeshgandharba/Desktop/daraz.png ");
        file.click();


       WebElement submit = driver.findElement(By.cssSelector("#submit-button"));
       submit.click();





    }
}
