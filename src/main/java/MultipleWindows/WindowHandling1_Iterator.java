package MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling1_Iterator {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");

        // Click on start my free trial to open a new window
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();

        Thread.sleep(3000); // Note: just for practice, best not to use hard wait like sleep in actual testing

        Set<String> windowHandles =  driver.getWindowHandles(); // gets a set of strings of the windows
//        System.out.println(windowHandles);

        Iterator<String> iterator = windowHandles.iterator(); // iterates through the set of window handles
        String parentWindow = iterator.next(); // stores the parent window
//        System.out.println(parentWindow);
        String childWindow = iterator.next(); // stores the child window
//        System.out.println(childWindow);

        driver.switchTo().window(childWindow); // switches to child window

        driver.findElement(By.name("UserFirstName")).sendKeys("Potato");
        driver.findElement(By.name("UserLastName")).sendKeys("Head");

        // switches back to first window
        driver.switchTo().window(parentWindow);


    }
}
