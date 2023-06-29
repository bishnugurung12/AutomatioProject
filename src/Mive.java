import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Mive {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.imdb.com/chart/top/");
        WebElement list = driver.findElement(By.className("lister"));
        List<WebElement> allMovies=list.findElements(By.tagName("a"));


    }
}
