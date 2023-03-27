package SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown3AutoSuggestion {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://singaporeair.com");
        driver.manage().window().maximize();

        // Create a reusable web element for the From field using id locator
        WebElement from = driver.findElement(By.id("flightOrigin1"));

        // Steps to "select" Sydney as destination
        from.click();
        from.sendKeys("Sydney");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
    }

}
