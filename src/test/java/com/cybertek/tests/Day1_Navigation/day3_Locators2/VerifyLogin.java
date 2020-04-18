package day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args)throws Exception {
        /*
       1.  Go to http://practice.cybertekschool.com/login
       2.  locate the username by name box "tomsmith"
       3.  locate password box by name "SuperSecretPassword"
       4.  locate login by id button and click
       5.  Verify the welcome msg

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        WebElement usernameBox= driver.findElement(By.name("username"));
        usernameBox.sendKeys("tomsmith");
        Thread.sleep(1000);

        WebElement passwordBox=driver.findElement(By.name("password"));
        passwordBox.sendKeys("SuperSecretPassword");
        Thread.sleep(1000);

        WebElement loginBttn=driver.findElement(By.id("wooden_spoon"));
        loginBttn.click();
       Thread.sleep(2000);
        WebElement welcomeMsg=driver.findElement(By.tagName("h4"));
        String expectedelWelcomMsg="Welcome to the Secure Area. When you are done click logout below.";

        if(welcomeMsg.equals(expectedelWelcomMsg)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected was = "+expectedelWelcomMsg);
            System.out.println("Actual msg = "+ welcomeMsg);
        }

        driver.close();






    }
}
