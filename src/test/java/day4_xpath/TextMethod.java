package day4_xpath;

import com.cybertek.utilites.StringEquals;
import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethod {
    public static void main(String[] args) {

        /*
        go to "http://practice.cybertekschool.com/context_menu"
        verify Context Menu is on the page using relative xpath

         */
       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/context_menu");
       WebElement context=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h3"));
       String text=context.getText();
        System.out.println("text = " + text);

        StringEquals.verifyEquals(text,"Context Menu" );

        driver.close();


    }
}
