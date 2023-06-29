import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com/");
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("Think and Grow Rich");
        amazonSearchBox.submit();
        WebElement amazonSearchButton = driver.findElement(By.id("a-autoid-8-announce"));
        amazonSearchButton.click();


    }
}
