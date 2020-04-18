package day3_Locators2;

import com.cybertek.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
         /*
        Locator link--> another way to locate element
        <a> a tag
        partialLinkText-->
        //ID, name, tagname, class , linkText
        //Locator --> LinkText
        //<a>  a tag is link . in this situation, we will use linkText locator
        //to locate the element

         */

         /* Task 1.
        1. Go to "http://practice.cybertekschool.com/dynamic_loading"
        2. Locate Example 3 by linkText(), provide whole text as a String
        3. Assign it to String and print, use getText()
        -> Always convert to String text and print
         //locate Cybertek School link as well
        */

       WebDriver driver= WebDriverFactory.getDriver("chrome");
       // 1. Go to "http://practice.cybertekschool.com/dynamic_loading"
       driver. get("http://practice.cybertekschool.com/dynamic_loading");

       //2. Locate Example 3 by linkText(), provide whole text as a String
        WebElement link= driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        String text=link.getText();
        System.out.println(text);
        Thread.sleep(2000);

        //locate Cybertek School
        WebElement partial= driver.findElement(By.partialLinkText("Cybertek"));
        String partailText=partial.getText();
        System.out.println(partailText);


        driver.close();


    }
}
