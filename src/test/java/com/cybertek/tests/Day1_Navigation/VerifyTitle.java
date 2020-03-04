package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) throws Exception{
        /*
        0. do everything 1st manually then auto-y
        1. go to cybertek practice website, need to have URL
        2. Verify Title, we should have expected Title "Practice"
           Actual result? --> is whatever driver get for me
        3. Make a mistake in Title purposely to see the fail
        4. if expected Title & actual Title mathches PASS
            -> otherwise fail
        5.  close the browser or quit

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().to("http://practice.cybertekschool.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected title was "+expectedTitle);
            System.out.println("But the actual is "+actualTitle);
        }

        driver.close();

    }
}
