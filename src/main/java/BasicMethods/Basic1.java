package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

    public static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Loads the webpage with the given address
        driver.get("https://www.saucedemo.com");

        // Maximizes the window
        driver.manage().window().maximize();

        // Retrieves the url from the address bar for the current window
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        // Retrieves the title of the current browser window
        String title = driver.getTitle();
        System.out.println(title);

        // Retrieves the page source (the code)
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        // Goes to a given website
        driver.navigate().to("https://www.google.com");

        // Closes the current window
        driver.close();

    }

}
