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

import java.util.concurrent.TimeUnit;

public class RadioButtonTest extends TestBase {



    /* default behavior test
    go to http://practice.cybertekschool.com/radio_buttons
    verify that blue is selected
    verify red is not selected
     */

    @Test
    public void test1() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String url= ConfigurationReader.getProperty("url");
        driver.get(url);

        //isSelected --> returns true if element is selected
        //verify that blue is selected
        //printing not testing
        WebElement blue=driver.findElement(By.id("blue"));
        System.out.println(blue.isSelected()); //true
        Assert.assertTrue(blue.isSelected());




        //print red is not selected
       // verify red is not selected
        WebElement red=driver.findElement(By.id("red"));
       Assert.assertFalse(red.isSelected());
        System.out.println(red.isSelected());//false


        //verifies if the statement false.
        // if it is false, it passes. if true it fails.
    }
    /*
    go to http://practice.cybertekschool.com/radio_buttons
    click on red
    verify that Blue is not Selected
    red selected
        ----------------------------
     */
    @Test
    public void test2() throws InterruptedException {

        String url= ConfigurationReader.getProperty("url");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // click on red
        //make sure that blue is not selected
        //verify/make sure that red is selected

        WebElement red=driver.findElement(By.id("red"));
        red.click();
        Assert.assertTrue(red.isSelected());
        System.out.println(red.isSelected());//true

        WebElement blue=driver.findElement(By.id("blue"));
        Assert.assertFalse(blue.isSelected());
        System.out.println(blue.isSelected());//false






        //command+7=>Structure
        // ctrl+space=> to get the version of the browser in pom.xml
        //chrome is faster, if I have problem w browser like
        // =>firefox go t pom.xml and change the version of WebDriver

    }

}



