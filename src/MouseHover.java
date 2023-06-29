import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
            public static void main(String[] args) throws InterruptedException {
                WebDriver driver= new ChromeDriver();
                driver.get("https://www.webdriveruniversity.com/Actions/index.html#");
                WebElement menu = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));

                WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
                Actions act = new Actions(driver);
                act.moveToElement(menu).moveToElement(subMenu).click().perform();
                Thread.sleep(5000);
                driver.quit();

                WebDriver driver1= new ChromeDriver();
                driver1.get("https://www.webdriveruniversity.com/Actions/index.html#");

                WebElement menu1 = driver1.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
                WebElement submenu1 = driver1.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div/a"));
                Actions act1 = new Actions(driver1);
                act1.moveToElement(menu1).moveToElement(submenu1).click().perform();
//                driver1.quit();




    }
}
