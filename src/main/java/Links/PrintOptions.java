package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintOptions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        // We find the option elements through its tag name
        List<WebElement> options = driver.findElements(By.tagName("option"));
        System.out.println("Total tags are:" + options.size());

        // We can iterate through the list to print them
        for (WebElement option : options) {
            System.out.println("Options are:" + option.getAttribute("value"));
            System.out.println("Options are:" + option.getText());
        }

    }
}
