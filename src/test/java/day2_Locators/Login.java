package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        /*
        Test login successfully
        1. go to VyTrack login page
        2. write username data : storemanager52
        3. write password: " UserUser123
        4. click login button
        5. Verify if you are in correct home page: Title, URL
         */
        driver.get("https://app.vytrack.com");
        Thread.sleep(2000);
        //in order to find element write username
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        Thread.sleep(3000);

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        Thread.sleep(2000);
        //Verify if you are in correct home page: Title, URL
        String expectedTitle="Dashboard";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected title = "+expectedTitle);
            System.out.println("Acutal title= "+actualTitle);
        }
        Thread.sleep(2000);

        String expectedURL="https://app.vytrack.com/";
        String actualURL=driver.getCurrentUrl();
        if(expectedURL.equalsIgnoreCase(actualURL)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected URL= "+ expectedURL);
            System.out.println("Actual URL= "+actualURL);
        }
        Thread.sleep(2000);

        driver.close();
    }
}
