import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zzzzz {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriverfile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        WebElement Search = driver.findElement(By.linkText("Home"));

    }
}
