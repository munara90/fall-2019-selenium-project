package day6_css;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook_example {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://facebook.com");

        //starts w  id='u_0_m'
        WebElement box=driver.findElement(By.cssSelector("u_0_"));

    }
}
