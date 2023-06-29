import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
//        driver.manage().window().fullscreen();

//  For email address

        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("bishnugurung199@ymail.com");
//        userName.click();

//    For password
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("hghghghg");

//         To erase text.
//        userName.clear();

//        password.click();
//         For Login
        WebElement login = driver.findElement(By.name("login"));

        userName.clear();
       // login.click();
        driver.quit();

        }


    }


