import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        Select dropdown1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        dropdown1.selectByIndex(3);


        Select dropdown2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
        dropdown2.selectByVisibleText("JUnit");


        Select dropdown3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
        dropdown3.selectByVisibleText("CSS");



    }
}
