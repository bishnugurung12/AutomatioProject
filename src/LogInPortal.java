import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPortal {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
        driver.manage().window().fullscreen();
//   for username
        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("Bishnu Gurung");
        userName.click();
//   for password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1234567@2");
        password.click();
//   for login
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
    }
}
