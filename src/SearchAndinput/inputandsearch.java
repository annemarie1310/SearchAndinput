package SearchAndinput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputandsearch {
    public static void main(String[] args) {

        // Amazon = Open website,search,product,and add to cart.

        System.setProperty("webdriver.chrome.driver","D:\\chromedriverfile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("iphone");
//        driver.findElement(By.id("nav-search-submit-button")).click();
        search.submit();
        driver.findElement(By.linkText("Apple iPhone 12 (64GB) - Blue")).click();
        driver.findElement(By.id("buy-now-button")).click();

        //




    }


}
