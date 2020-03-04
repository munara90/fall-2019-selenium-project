package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws Exception{

        /*
        - setup your chromedriver
        - create new object
        - Create String variables & store URLs
        1. I want to open google home page
        2. Go to practice.cybertekschool.com,
        3. Make full size window, or use maximize the window
        4 wait 2 seconds
        5. Navigate back to google
        6. Navigate forward & wait 2 sec
        5. Go back to google
        5. close the browser or quit(closes whole window(all the webs that is open))
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="http://google.com";
        String url2="http://practice.cybertekschool.com";
        driver.get(url); //ggl
        Thread.sleep(3000);
        driver.navigate().to(url2);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward(); //practice
        Thread.sleep(3000);
        driver.navigate().back(); //google

        driver.close();







    }
}
