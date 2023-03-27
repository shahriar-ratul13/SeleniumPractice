package SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1Single {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        // Create a web element of the select tag we want to manipulate, in this case ebay's search dropdown
        WebElement searchDropdown =  driver.findElement(By.xpath("//select[@aria-label=\"Select a category for search\"]"));
        // We create a new object of the Select class and provide the web element of the select dropdown tag
        Select select = new Select(searchDropdown);

        // We can see the default option as we did not select any ourselves
        WebElement firstOption = select.getFirstSelectedOption();
        System.out.println(firstOption.getText());

        // Value for Art category
        select.selectByValue("550");
        Thread.sleep(2000);

        // Text within the tag
        select.selectByVisibleText("Business & Industrial");
        Thread.sleep(2000);

        // Index (starting from 0) 4 should be Books
        select.selectByIndex(4);

        // This will return the currently selected option
        WebElement firstOption2 = select.getFirstSelectedOption();
        System.out.println(firstOption2.getText());
    }
}
