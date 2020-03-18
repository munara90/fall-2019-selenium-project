package day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickVSsubmit {
    public static void main(String[] args) throws InterruptedException {
         /*
        click(), submit()
      Submit ,is used when attribute values has word "submit"
      1.  go to forgot password web page
           http://practice.cybertekschool.com/forgot_password
      2.   enter any email
      3.  click "retrieve password “ button
      4.  verify the URL is:
         http://practice.cybertekschool.com/email_sent

        */
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.get(" http://practice.cybertekschool.com/forgot_password");
         WebElement email=driver.findElement(By.name("email"));
         email.sendKeys("muna@gmail.com");

         WebElement button=driver.findElement(By.id("form_submit"));
         button.click();
         Thread.sleep(2000);

         String expectedUrl="http://practice.cybertekschool.com/email_sent";
         String actualUrl=driver.getCurrentUrl();

         if(expectedUrl.equalsIgnoreCase(actualUrl)) {
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
             ;
         }

        driver.close();

    }
}
