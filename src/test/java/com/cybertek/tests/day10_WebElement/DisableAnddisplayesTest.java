package day10_WebElement;

import base.TestBase;
import com.cybertek.utilites.ConfigurationReader;
import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisableAnddisplayesTest extends TestBase {
    /*
    go to "http://practice.cybertekschool.com/radio_buttons"
    verify green is disabled
    verify black is enabled
     */



    /*
   go to driver.get("http://practice.cybertekschool.com/radio_buttons");
   verify green is disabled
   verify black is enabled
   */

    @Test
    public void disabledTest(){
        String url= ConfigurationReader.getProperty("url");
        driver.get(url);

        //isEnabled--> returns true if element is enabled or active
        //isEnabled() sometimes doesn't work, use getAttribute


      //  verify green is disabled
        WebElement green=driver.findElement(By.id("green"));
        Assert.assertFalse(green.isEnabled());
        System.out.println("is green button enabled= "+ green.isEnabled());
        //is green button enabled= false

        WebElement black =driver.findElement(By.id("black"));
        Assert.assertTrue(black.isEnabled());
        System.out.println("is black enabled= "+black.isEnabled());
        //is black enabled= true


    }
    @Test
    public void disabledTest2() {

    //WebElement green=driver.findElement(By.)

        //verify that certain value is equal to null
        //verify element is enabled


        // VERIFY THAT VALUE OF black.getAttribute("disabled") IS NULL

        //verify that certain value is equal to True.verify element is DISALBED
        //true answer is String not boolean


        //convert String to boolean


    }



        // verify that username is not visible
        /// isDisplayed --> returns true element we found in HTML is visible on page





    }
