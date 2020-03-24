package day10_WebElement;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxes {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

    }

        @AfterMethod
        public void afterMethod(){
            driver.quit(); //should close when there is no error
        }
        @Test
     public void test(){
            WebElement one =driver.findElement(By.xpath("//input[1]"));
            WebElement two =driver.findElement(By.xpath("//input[2]"));
            //by default one is not checked, two is checked
            System.out.println("is one selected: "+one.isSelected());
            System.out.println("is two selected: "+two.isSelected());

            //verify
            Assert.assertFalse(one.isSelected());
            Assert.assertTrue(two.isSelected()); //true

            System.out.println("============");
            //check the
            System.out.println("check the first checkBox");
            one.click();
            //delete after below print statements
            System.out.println("is one selected: "+one.isSelected());
            System.out.println("is two selected: "+two.isSelected());

            Assert.assertTrue(one.isSelected());
            Assert.assertTrue(two.isSelected());





        }



    }

