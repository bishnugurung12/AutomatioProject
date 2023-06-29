import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PriceComparison {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Rich dad poor dad");
        WebElement clickButton = driver.findElement(By.id("nav-search-submit-button"));
        clickButton.click();

//  we should separate the rice as eaach num is given with different xpath.
        WebElement findPrice = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span/span[2]/span[2]"));
        WebElement decimal = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span/span[2]/span[3]"));

        String price1 = findPrice.getText()+"."+decimal.getText();
        price1 = price1.replace("$","");

        System.out.println(price1);


        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement search1 = driver1.findElement(By.id("gh-ac"));
        search1.sendKeys("Rich dad poor dad");
        WebElement clickbutton1 = driver1.findElement(By.id("gh-btn"));
        clickbutton1.click();

        WebElement price2 = driver1.findElement(By.xpath("//*[@id=\"item59b62e3216\"]/div/div[2]/div[4]/div[1]/span"));
        //getting price as a text.
        String ebayPrice= price2.getText();
        ebayPrice= ebayPrice.replace("$","");
        System.out.println(ebayPrice);
        //Changing string into numeric.
        Double p1 = Double.parseDouble(price1);
        Double p2 = Double.parseDouble(ebayPrice);

        if(p1<p2){
            System.out.println("Amazon is cheaper for you.The price is: $"+p1 );


        }else {
            System.out.println("Ebay is cheaper for you. The price is : $" +p2);

        }
        driver1.quit();
        driver.quit();





//        Double ebay  = Double.parseDouble(ebayPrice);
//        System.out.println(ebay);
//
//        if (amazon > ebay){
//            System.out.println("Price in amazon is expensive");
//
//        } else if (amazon < ebay) {
//            System.out.println("Price in ebay is expensive");
//
//
//        }else {
//            System.out.println("test failed");
//        }


    }
}