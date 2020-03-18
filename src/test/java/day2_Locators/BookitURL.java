package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitURL {
    public static void main(String[] args) throws Exception {

        /*
        Task 2:
        2. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify that URL contains “cybertek-reservation”

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        Thread.sleep(3000);
        driver.manage().window().maximize();


        String expectedURL=driver.getCurrentUrl();
        String partialURL="cybertek-reservation";

        if(expectedURL.contains(partialURL)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Partial URL was= "+partialURL);
            System.out.println("Expected URL = "+ expectedURL);
        }

        driver.close();


}
    }