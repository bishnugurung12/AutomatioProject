import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        Select checkboxes = new Select(driver.findElement(By.id("checkboxes")));
       checkboxes.selectByIndex(2);

    }
}
