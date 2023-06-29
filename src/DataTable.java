import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DataTable {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[1]"));
        firstName.sendKeys("Bishnu");
        firstName.submit();

//        Thread.sleep(7000);

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[2]"));
        lastName.sendKeys("Gurung");
        lastName.submit();


        WebElement input = driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/textarea"));
       input.sendKeys(" Bihsnu Gurung");
       input.submit();
    }
}
