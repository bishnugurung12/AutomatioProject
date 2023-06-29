import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoComplete {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

        WebElement foodItem = driver.findElement(By.cssSelector("#myInput"));
        foodItem.sendKeys("Carrot");
        foodItem.submit();

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        submit.click();




    }
}
