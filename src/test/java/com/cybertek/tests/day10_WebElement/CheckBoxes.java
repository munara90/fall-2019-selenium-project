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

public class CheckBoxes extends TestBase {
    /*
    go to "http://practice.cybertekschool.com/checkboxes"
    verify  one is not checked, two is checked
    by default one is not checked, two is checked
    //check/click the first checkbox
     // verify one is selected
     // verify two is selected

     */




    @Test
    public void test() {

        //check/click the first checkbox
        // verify one is selected
        // verify two is selected
        String url= ConfigurationReader.getProperty("url");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement one = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        Assert.assertFalse(one.isSelected());
        System.out.println("Is one selected = "+one.isSelected());//false


        WebElement two=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Assert.assertTrue(two.isSelected());
        System.out.println("Is two selected= "+two.isSelected());//true

        //check/click the first checkbox
        // verify one is selected
        // verify two is selected

        one.click();

        System.out.println("Is one selected = "+one.isSelected());//true
        System.out.println("Is one selected = "+two.isSelected()); //false


    }
        }





