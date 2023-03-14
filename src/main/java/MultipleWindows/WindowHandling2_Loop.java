package MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling2_Loop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");

        // Click on start my free trial to open a new window
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();

        Set<String> windowHandles =  driver.getWindowHandles(); // gets a set of strings of the windows

        String parentWindow = driver.getWindowHandle(); // stores handle/id of parent window

        // iterates through the stored window handles like the parent and child
        for (String handles : windowHandles) {
            // when iteration reaches child handle, swaps to it
            if (!handles.equals(parentWindow)) {
                driver.switchTo().window(handles);
            }
        }

        driver.findElement(By.name("UserFirstName")).sendKeys("Potato");
        driver.findElement(By.name("UserLastName")).sendKeys("Head");

        Thread.sleep(3000);

        // switches back to first window
        driver.switchTo().window(parentWindow);


    }
}
