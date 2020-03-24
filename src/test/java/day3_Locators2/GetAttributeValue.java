package day3_Locators2;

import com.cybertek.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class GetAttributeValue {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to http://practice.cybertekschool.com/login
        2. locate - username box  by name
        3. print the value of type-attribute, which is "text"
          - When i give attribute, it returns me value of that attribute, as a String
          - I want to get the value of type attribute
        --> type="text" --> w getAttibute("attribute name")
        4. print class attributes value
         */
        /*
        1.  go to http://practice.cybertekschool.com/login
        2. locate login button by id
        3. I want to print class attribute's value
         */

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/login");
    WebElement username=driver.findElement(By.name("username"));
    username.sendKeys("konkow");
    String valueOfType=username.getAttribute("type");
        System.out.println("valueOfType= "+valueOfType); //valueOfType= text
        Thread.sleep(2000);

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("jagu842");
        String value=password.getAttribute("type");
        System.out.println("value= "+value); //value= password
        Thread.sleep(2000);

    WebElement button=driver.findElement(By.id("wooden_spoon"));
    String valueOf=button.getAttribute("type");
        Thread.sleep(2000);
        System.out.println("valueOf = " + valueOf); //valueOf = submit
    button.submit();


driver.close();


    }
}
