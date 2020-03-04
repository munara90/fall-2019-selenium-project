package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitLogin {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String exBookitTitle="bookit";
        String actualBookitTitle=driver.getTitle();

        if(exBookitTitle.equalsIgnoreCase(actualBookitTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected title was "+ exBookitTitle);
            System.out.println("Actual title = "+actualBookitTitle);
        }

        driver.close();

    }
}
