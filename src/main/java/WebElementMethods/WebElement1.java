package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElement1 {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/form/signup/freetrial-sales/");

        driver.findElement(By.name("UserFirstName")).sendKeys("Testing");
        // Clears the text in the field
        driver.findElement(By.name("UserFirstName")).clear();
        // Get attribute
        String attribute = driver.findElement(By.name("UserFirstName")).getAttribute("type");
        System.out.println(attribute);
        // Get the value of the CSS property
        String css = driver.findElement(By.name("start my free trial")).getCssValue("background-color");
        System.out.println(css);
        // Size
        System.out.println(driver.findElement(By.name("start my free trial")).getSize());
        // Text
        System.out.println(driver.findElement(By.name("start my free trial")).getText());
        // Tag Name
        System.out.println(driver.findElement(By.name("start my free trial")).getTagName());
        // isDisplayed boolean result
        System.out.println(driver.findElement(By.name("start my free trial")).isDisplayed());
        // Enabled
        System.out.println(driver.findElement(By.name("start my free trial")).isEnabled());
        // Selected
        System.out.println(driver.findElement(By.name("start my free trial")).isSelected());


        driver.quit();

    }


}
