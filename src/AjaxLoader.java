import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxLoader {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Ajax-Loader/index.html");

        // driver.manage().window().fullscreen();

        Thread.sleep(5000);

        WebElement clickMe = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        clickMe.click();

        Thread.sleep(5000);

        WebElement close = driver.findElement(By.cssSelector("#myModalClick > div > div > div.modal-footer > button"));
       close.click();
   }
}
