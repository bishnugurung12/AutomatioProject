import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZeroOpacity {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Hidden-Elements/index.html");

        WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
        doubleClick.click();

        Thread.sleep(7000);

        WebElement close = driver.findElement(By.className("btn btn-default"));
        close.click();
    }
    }

