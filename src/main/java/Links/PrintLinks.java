package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintLinks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");

        // We find the elements through the tag name, the anchor tag a
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are:" + links.size());

        // We can iterate through the list to print them or their text value
        for (WebElement link : links) {
            System.out.println("Links are:" + link.getAttribute("href"));
            System.out.println("Link Texts are:" + link.getText());
        }

    }
}
