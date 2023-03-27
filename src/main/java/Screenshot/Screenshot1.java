package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Screenshot1 {

    public static void main(String[] args) throws IOException {

        // Create an object of the Date class for timestamps
        Date currentDate = new Date();
//        System.out.println(currentDate);
        // Save the timestamp to our variable and replace the spaces and colons with a hyphen
        String screenshotName = currentDate.toString().replace(" ", "-").replace(":", "-");
//        System.out.println(screenshotName);

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        // This is the only line we need to TAKE a screenshot, but need additional code for viewing/saving
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // We copy/save the screenshot file into a NEW file in our chosen directory. File name is hard-coded
//        FileUtils.copyFile(screenshotFile, new File("src/main/java/Screenshot/screen1.png"));
        // Non hardcoded filename by appending the png file with our name variable
        FileUtils.copyFile(screenshotFile, new File("src/main/java/Screenshot/" + screenshotName + ".png"));
    }

}
