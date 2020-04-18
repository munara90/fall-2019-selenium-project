package day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        /*
        "http://practice.cybertekschool.com/login"
         go to forgot password page
        locate retrieve password bttn
        print out submit value :
        type='submit'
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        WebElement retrieveBttn=driver.findElement(By.id("password"));
        String valueType=retrieveBttn.getAttribute("type");
        System.out.println(valueType);

        /*
        1. locate login button WebElement
        2. I want to print class attribute's value
        3. for that I provide attribute & it will print value

         */
//        WebElement loginBttn=driver.findElement(By.className("form_submit"));
//        loginBttn.getAttribute("class");
//        String classValue=loginBttn.getText();
//        System.out.println(classValue);

        driver.close();
    }
}
