package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitLogin {
    public static void main(String[] args) throws Exception {

        /*
        Task 1:
        1. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify the title of the page

        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        String expectedTitle="Bookit";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("I expected title= "+expectedTitle );
            System.out.println("The actual title was = "+ actualTitle);
        }

        driver.close();


    }
}
