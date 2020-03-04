package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    /*
    1. Go to google website
    2. save the title in a string variable
    3. go to Etsy
    4. save the Etsy Title in a String
    5. Navigate back to previouse page
    6. Verify the title is same as step 2
    7. Navigate forward to previous page
    8.Verify the title is same as step 4

     */

public class NavigationPractice {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1. Go to google website
        String gglUrl="http://www.google.com";
        driver.get(gglUrl);

       // 2. save the Google title in a string variable
        String gglExpectedtitle="Google";
        Thread.sleep(3000);

        // 3. go to Etsy full screen
        driver.navigate().to("http://www.etsy.com/");
        driver.manage().window().maximize();

       // 4. save the Etsy Title in a String
        String etsyExpectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String etsyActualTitle=driver.getTitle();
        Thread.sleep(3000);

        // 5. Navigate back to previouse page
        driver.navigate().back(); //google
        Thread.sleep(3000);

        //6. Verify the Google title is same as step 2
        String actualGGLTitle=driver.getTitle();
        if(gglExpectedtitle.equalsIgnoreCase(actualGGLTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("I expected title "+gglExpectedtitle);
            System.out.println("The actual title was "+actualGGLTitle);
            System.out.println("The google url "+gglUrl);
        }

       // 7. Navigate forward to previous page and refresh
        driver.navigate().forward(); //etsy
        Thread.sleep(3000);

       // 8.Verify the Etsy title is same as step 4
        if(etsyExpectedTitle.equalsIgnoreCase(etsyActualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected title was "+ etsyExpectedTitle);
            System.out.println("Actual title is "+ etsyActualTitle);
        }
        driver.navigate().refresh(); //etsy
        Thread.sleep(3000);




        driver.close();

    }
}
