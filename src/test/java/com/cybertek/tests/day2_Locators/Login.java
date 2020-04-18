package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args)throws Exception {

        /*
        Test login successfully
        1. go to VyTrack login page "https://app.vytrack.com"
        2. write username data : "storemanager52"
        3. write password: "UserUser123"
        4. click login button
        5. Verify if you are in correct home page: Title, URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vytrack.com");
        Thread.sleep(2000);

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");









         }
}
