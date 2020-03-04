package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstClass {
    public static void main(String[] args) throws Exception{
        //setup your chromedriver
        //create new object
        //open the website -> we driver object needs to be created
        //WebDriver object is Interface, use polymorphism
        //I can use Safari driver too
        //binary the driver & browsers


        /*
        1. I want to open google home page
        2. Go to cybertekschool.com, wait 2 seconds
         -how do u launch/open a web page?
         -By using get(), providing URL as a String
        3. Navigate back to google
        4. Navigate forward & wait 2 sec
        5. Go back to google
        5. close the browser
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://google.com";
        String url2="http://practice.cybertekschool.com";

      //  3. Navigate back to google
        driver.get(url);
        driver.navigate().to(url2);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().back();




        driver.close();






    }
}
