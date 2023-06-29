import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("Think And Grow Rich");
        searchBox.submit();

    }
}