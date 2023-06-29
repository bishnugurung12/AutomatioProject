import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.util.List;

public class MovieChart {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.imdb.com/chart/top/");
        //' driver.manage().window().fullscreen();
        WebElement list = driver.findElement(By.className("lister"));
        List<WebElement>allMovies=list.findElements(By.tagName("a"));


//        System.out.println(allMovies.size());
        String allmovies = "";
        for(WebElement a: allMovies){
            System.out.println(a.getText());
            allmovies+=a.getText()+"\n";
        }
        try {
            FileWriter myWriter = new FileWriter("movies.txt");
            myWriter.write(allmovies);
            myWriter.close();
            System.out.println("Write to file successful.");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }



    }
}
