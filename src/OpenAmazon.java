import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Book");
        searchBox.submit();
        //driver.manage().window().fullscreen();


        System.out.println(driver.getTitle());

    }
}
