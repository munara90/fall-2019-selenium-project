package day5_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/login");
    //get the text of the link Home
        WebElement link=driver.findElement(By.className("nav-link"));
        System.out.println(link.getText());

        //classname does not work if the value of the class attribute has a space
        // click the login bttn
        //this loginBttn fails cuz of space, look for the exception fr console
        //better use diff locator, like tag name
        WebElement loginBttn=driver.findElement(By.className("btn btn-primary"));
        loginBttn.click();







    }
}
