package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitle {
    public static void main(String[] args) throws Exception{
       /*
       - setup your chromedriver
        - create new object
        - Create String variables & store URL of Etsy
        1. go to Etsy and maximize the window
        2. get the Etsy Title and ass to String expected Etsy Title var
        3. create actual Etsy Title and ass to String
        4. compare expected Etsy Title w actual Etsy Title
        5. close

        */
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

       String url="http://etsy.com";

       driver.get(url);
       driver.manage().window().maximize();

       String expectedTitle="Ets - Shop for handmade, vintage, custom, and unique gifts for everyone";
       Thread.sleep(3000);
       String actualTitle=driver.getTitle();
       String actualURL=driver.getCurrentUrl();

       if(expectedTitle.equalsIgnoreCase(actualTitle)) {
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
           System.out.println("I expected "+expectedTitle);
           System.out.println("But the actual title is "+ actualTitle);
           System.out.println(expectedTitle+" versus "+ actualTitle);
       }



        driver.close();

    }
}
