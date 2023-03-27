package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Basic2 {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        // Singular findElement usage to log in to the website
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();

        // This xpath is for the 6 items under inventory container, returns a LIST of web elements
        List<WebElement> inventory = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println(inventory);

        // Go to this website to test window handling
        driver.navigate().to("https://www.salesforce.com/au/");

        // Store the window handle of the current window
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        // Click on add-ons to open a new window/tab
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();

        // Get a SET of window handles of all the open windows/tabs
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
    }
}
