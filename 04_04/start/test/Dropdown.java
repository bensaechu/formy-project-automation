import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ben17\\Desktop\\Exercise Files\\Selenium essential training\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();

        WebElement buttonsItem = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        buttonsItem.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
