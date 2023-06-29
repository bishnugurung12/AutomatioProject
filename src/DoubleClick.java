import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Actions/index.html");

        WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));


        Actions actions = new Actions(driver);


        actions.doubleClick(doubleClick).build().perform();




    }
}
