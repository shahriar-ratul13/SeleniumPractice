package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2_IDName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        driver.switchTo().frame("iframeResult"); // Swaps to the frame with the given string parameter id or name
        driver.findElement(By.xpath("/html/body/button")).click(); // Clicks on the "Try it" button

    }
}
