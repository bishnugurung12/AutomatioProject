import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class HoverWork {
        public static void main(String[] args) {


            // Create a new instance of the Chrome driver
            WebDriver driver = new ChromeDriver();

            // Open the webpage
            driver.get("http://www.webdriveruniversity.com/Actions/index.html");

            // Find the element to hover over
            WebElement hover = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]"));
//            WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
//            WebElement hover3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));



            // Create an instance of the Actions class
            Actions actions = new Actions(driver);

            // Perform the hover action
            actions.moveToElement(hover).perform();

        }
    }


