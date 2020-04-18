package day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.KeyStore;

public class VerifyErrorMsg {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to login page:
        http://practice.cybertekschool.com/login
        2. enter random invalid username
        - testers can gather test data in Excel sheet:
        - or generate data from dummy data websites(or generatedata.com) for username and password
        - or java faker --> class that will give us random data
        - I use java faker
        --> go to Maven repository-->search for java faker use 1.01 version
        --> copy dependency library--> add in pom.xml file-->inside the dependencies
        3. Enter random invalid password
        4. Verify error msg
         */

        Faker fakeData=new Faker();
        String username=fakeData.name().firstName();
        String password=fakeData.app().author();

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        WebElement invalidUserName=driver.findElement(By.name("username"));
        invalidUserName.sendKeys(username);
        Thread.sleep(2000);

        WebElement invalidPassword=driver.findElement(By.name("password"));
        invalidPassword.sendKeys(password+ Keys.ENTER);
        Thread.sleep(2000);

        WebElement errorMsg=driver.findElement(By.id("flash"));
        String actualErrMsg=errorMsg.getText();

        String extectedErrMsg="Your username is invalid!";

        if(extectedErrMsg.equalsIgnoreCase(actualErrMsg)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
}
