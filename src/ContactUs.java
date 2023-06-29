import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//     OPEN PAGE (Contact us)
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        driver.manage().window().fullscreen();

//        FIRST NAME BOX

        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Bishnu");
        firstName.click();

//    LAST NAME BOX

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Gurung");
        lastName.click();
//       EMAIL BOX
        WebElement emailAddress = driver.findElement(By.name("email"));
        emailAddress.sendKeys("Gurungbishnu582@gmail.com");
        emailAddress.click();

//      MESSAGE BOX
        WebElement comment = driver.findElement(By.name("message"));
        comment.sendKeys("Very Nice!!");
        comment.click();

//    RESET BOX
//        WebElement reset = driver.findElement(By.className("contact_button"))
//        reset.click();

//    SUBMIT BOX
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();

//driver.quit();




    }
}