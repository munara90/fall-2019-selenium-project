package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws Exception{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();

       //go to cybertek okta login page
        // write email to the text box
        driver.get("https://cybertekschool.okta.com/");


        /*
        1. find the text box first -->findelement() from WebDriver
        2. write email to the text box
         */

        String word="java";
        Thread.sleep(3000);
        WebElement emailBox=driver.findElement(By.id("okta-signin-username"));
        //WebElement is a interface, to store element
        emailBox.sendKeys("munara682@gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //write your password to the password text box
        //id
        driver.findElement(By.id("okta-signin-password")).sendKeys("Abdulla1970");
        Thread.sleep(5000);


       driver.close();







    }
}
