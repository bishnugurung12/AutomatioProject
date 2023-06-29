import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
        //' driver.manage().window().fullscreen();


        WebElement date = driver.findElement(By.cssSelector("#datepicker > input"));
       date.click();


        Thread.sleep(5000);

        WebElement selectDate = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]"));
      selectDate.click();



    }
}
