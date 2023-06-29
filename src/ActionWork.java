import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionWork {
    public static void main(String[] args) {

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Actions/index.html");

        // Locate the source element to be dragged
        WebElement dragMe = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

        // Locate the target element where the source element will be dropped
        WebElement dropHere = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the drag and drop action
        actions.dragAndDrop(dragMe,dropHere).build().perform();



    }
}
