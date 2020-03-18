package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws Exception{


       /*
       go to cybertek okta login page
        "https://cybertekschool.okta.com/"
        1. find the text box first -->findelement() from WebDriver
        2. write email to the text box
        3. write your password to the password text box
        */

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://cybertekschool.okta.com/");
       Thread.sleep(2000);
      WebElement userNmae= driver.findElement(By.id("okta-signin-username"));
      userNmae.sendKeys("munara682@gmail.com");
      Thread.sleep(4000);

      WebElement password=driver.findElement(By.id("okta-signin-password"));
      password.sendKeys("Abdulla1970");
        Thread.sleep(4000);


        driver.close();



    }
}
