package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1_Index {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        // Trying to manipulate element in different frames directly does not work, gives NoSuchElementException
//        driver.findElement(By.xpath("/html/body/button")).click();

        driver.switchTo().frame(0); // Swaps to the first frame
        driver.findElement(By.xpath("/html/body/button")).click(); // Clicks on the Try it button

    }
}
