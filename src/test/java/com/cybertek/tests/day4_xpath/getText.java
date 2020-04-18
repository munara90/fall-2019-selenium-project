package day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) throws InterruptedException {
         /*
        goto the forgot password page
        " http://practice.cybertekschool.com/forgot_password")
        enter any email
        click retrieve password button
        Verify that th confirmation text-- "Your e-mail's been sent!"

         */
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get(" http://practice.cybertekschool.com/forgot_password");

       WebElement emailBox=driver.findElement(By.name("email"));
       emailBox.sendKeys("muna@gmail.com"+ Keys.ENTER);
       Thread.sleep(2000);

       String expectedText="Your e-mail's been sent!";

       WebElement text=driver.findElement(By.name("confirmation_message"));
       String actualText=text.getText();

       if(expectedText.equalsIgnoreCase(actualText)) {
           System.out.println("pass");
       }else{
           System.out.println("fail");
       }


    }
}
