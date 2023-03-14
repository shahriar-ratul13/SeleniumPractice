package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames3_WebElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        WebElement frame1 = driver.findElement(By.id("iframeResult")); // Create new WebElement for the frame
        driver.switchTo().frame(frame1); // Swaps to the frame with the given WebElement parameter
        driver.findElement(By.xpath("/html/body/button")).click(); // Clicks on the "Try it" button

    }
}
