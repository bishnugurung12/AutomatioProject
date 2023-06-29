import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
       //' driver.manage().window().fullscreen();



        WebElement button = driver.findElement(By.cssSelector("#button1"));

        button.click();
        Thread.sleep(5000);
        WebElement quit = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        quit.click();



    }

}