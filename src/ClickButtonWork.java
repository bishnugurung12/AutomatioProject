import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickButtonWork {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();



        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
        //' driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement button = driver.findElement(By.cssSelector("#button1"));
        button.click();



        WebElement quit = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        quit.click();

    }
}