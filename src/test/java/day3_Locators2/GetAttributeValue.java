package day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("http://practice.cybertekschool.com/login");

     WebElement username=driver.findElement(By.name("username"));
     String text=username.getAttribute("type");
        System.out.println("Value of type =" +text);


        WebElement loginBttn=driver.findElement(By.id("wooden_spoon"));
        String classAtt=loginBttn.getAttribute("class");
        System.out.println("Value of Class attribute= " +classAtt);

        driver.close();


    }
}
