import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppearOrDisappear {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");

        WebElement manualTesting = driver.findElement(By.id("manual-testing-accordion"));
        manualTesting.click();

        WebElement cucumber = driver.findElement(By.id("cucumber-accordion"));
        cucumber.click();

        WebElement automationTesting = driver.findElement(By.id("automation-accordion"));
        automationTesting.click();

        WebElement keepClicking = driver.findElement(By.id("click-accordion"));
        keepClicking.click();

        Thread.sleep(5000);


        WebElement loadingButton= driver.findElement(By.id("hidden-text"));
       loadingButton.click();


    }
}
