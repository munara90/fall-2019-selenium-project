package day4_xpath;

import com.cybertek.utilites.StringEquals;
import com.cybertek.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("muna@gmail.com",Keys.ENTER);
        Thread.sleep(3000);

        String actualURL= driver.getCurrentUrl();
        Thread.sleep(4000);
        StringEquals.verifyEquals(actualURL, " http://practice.cybertekschool.com/email_sent");
        Thread.sleep(2000);
        driver.close();

    }
}
