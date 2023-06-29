import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoApp {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/To-Do-List/index.html");
        //' driver.manage().window().fullscreen();


        for(int i =1; i<=10; i++){
            WebElement textbox = driver.findElement(By.tagName("input"));

            textbox.sendKeys("Learn Automation");

            textbox.sendKeys(Keys.ENTER);

        }


    }
}
