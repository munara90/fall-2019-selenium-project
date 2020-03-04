package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitURL {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String exBookitURL=driver.getCurrentUrl();
        String partialURL="cybertek-reservation";

        if(exBookitURL.contains(partialURL)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected URL  was "+ exBookitURL);
            System.out.println("Actual URL= "+  partialURL);
        }
        driver.close();
}
    }