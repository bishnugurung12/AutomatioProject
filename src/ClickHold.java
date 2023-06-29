import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

        public class ClickHold {
            public static void main(String[] args) {
                // Set the path to the ChromeDriver executable
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

                // Create a new instance of the ChromeDriver
                WebDriver driver = new ChromeDriver();

                // Navigate to the web page
                driver.get("https://www.example.com");

                // Find the element to click and hold
                WebElement element = driver.findElement(By.id("myElement"));

                // Create an instance of the Actions class
                Actions actions = new Actions(driver);

                // Click and hold on the element
                actions.clickAndHold(element).perform();

                // Release the mouse button
                actions.release().perform();

                // Close the browser
                driver.quit();
            }
        }



