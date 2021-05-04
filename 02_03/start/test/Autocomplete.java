import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ben17\\Desktop\\Exercise Files\\Selenium essential training\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.click();
        address.sendKeys("1055GJ hofwijckstraat 62");
        Thread.sleep(1000);

        WebElement addressResult = driver.findElement(By.className("pac-item"));
        addressResult.click();

        driver.quit();
    }
}
