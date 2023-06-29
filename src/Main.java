

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {
        String loaction = "/Users/rikeshgandharba/Downloads/chromedriver";

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        // driver.quit();
    }
}
// Write Automation Script to open amazon.
