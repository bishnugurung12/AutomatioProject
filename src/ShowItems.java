import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShowItems {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//     OPEN PAGE (Contact us)
        driver.get("http://www.webdriveruniversity.com/Page-Object-Model/products.html");

        List<WebElement> items = driver.findElements(By.className("sub-heading"));

        System.out.println(items.size());
        for(WebElement data: items){
            System.out.println(data.getText());

        }

    }
}
