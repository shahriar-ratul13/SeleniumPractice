package SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown2Multiple {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select select = new Select(dropdown);

        select.selectByValue("Florida");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        // We get back a LIST of all the selected options
        List<WebElement> multiItems = select.getAllSelectedOptions();

        System.out.println(multiItems.size());
        // Deselects all the items
        select.deselectAll();
        Thread.sleep(2000);

        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);
        // Deselects one item through index
        select.deselectByIndex(5);
        Thread.sleep(2000);

        List<WebElement> multiItems2 = select.getAllSelectedOptions();
        System.out.println(multiItems2.size());

    }

}
