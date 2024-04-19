package AutomationDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCode {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriverfile\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement Search = driver.findElement(By.name("search_query"));
        Search.sendKeys("Post malone songs");
        Search.submit();
        driver.findElement(By.linkText("Post Malone - Psycho ft. Ty Dolla $ign")).click();
        driver.findElement(By.id("ad-text:7")).click();




    }
}
