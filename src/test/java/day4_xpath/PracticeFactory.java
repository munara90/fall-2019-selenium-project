package day4_xpath;

import com.cybertek.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) throws InterruptedException {

        //go to google using WebDriverFactory
        //go to firefox using WebDriverFactory
        //go to ie using WebDriverFactory

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        driver.close();

        WebDriver driver1=WebDriverFactory.getDriver("firefox");
        driver1.get("https://firefox.com");
        driver.close();

        WebDriver driver2=WebDriverFactory.getDriver("ie");
        driver2.get("https://internetexplorer.com");
    }
}