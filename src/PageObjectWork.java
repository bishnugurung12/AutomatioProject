import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageObjectWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Page-Object-Model/products.html");


        WebElement usedLaptop = driver.findElement(By.xpath("//*[@id=\"laptop2\"]"));
        usedLaptop.click();


//       For Proceed
//        WebElement proceed = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]"));
//        proceed.click();

//        For Close Button
      Thread.sleep(5000);

       WebElement close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]"));
       close.click();




    }
}
