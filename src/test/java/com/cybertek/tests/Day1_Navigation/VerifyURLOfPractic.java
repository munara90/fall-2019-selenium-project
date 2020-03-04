package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPractic {
    public static void main(String[] args) throws Exception{

       /*
        - setup your chromedriver
        - create new object
        - Create String variables & store URLs
       1. go to "http://practice.cybertekschool.com/"
          and maximize the window
       2. compare expected and actual URL
       3. close

        */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);

        String expectedURL="http://practice.cybertekschool.com/";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equalsIgnoreCase(actualURL)) {
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("I Expected to see "+expectedURL);
            System.out.println("The actual URL is "+actualURL);
        }




        driver.close();


    }
}
