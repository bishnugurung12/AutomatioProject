import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class PopUp {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
        //' driver.manage().window().fullscreen();

        WebElement modelPop = driver.findElement(By.cssSelector("#button2 > p"));
        modelPop.click();

        Thread.sleep(5000);

      WebElement close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
     close.click();
// Go to 2 online store website and search for same item.
        // Display price difference.

    }
}
