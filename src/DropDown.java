import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {



    WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().fullscreen();
        Select dropdown1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));

        dropdown1.selectByVisibleText("Python");

}
}
