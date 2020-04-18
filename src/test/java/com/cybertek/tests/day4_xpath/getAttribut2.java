package day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribut2 {
    public static void main(String[] args) {
        /*
        goto : http://practice.cybertekschool.com/dynamic_loading
        locate the Example 1

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement example1=driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        //String text=example1.getText();
     //  System.out.println(example1);

        System.out.println(example1.getAttribute("href"));

        driver.close();

    }
}
