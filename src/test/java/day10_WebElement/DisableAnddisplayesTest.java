package day10_WebElement;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisableAnddisplayesTest {

    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");


    }

    @AfterMethod
    public void afterMethod() {
        driver.quit(); //should close when there is no error
    }

    /*
   go to driver.get("http://practice.cybertekschool.com/radio_buttons");
verify green is disabled
verify black is enabled
    */
    @Test
    public void disabledTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement green = driver.findElement(By.id("green"));
        WebElement black = driver.findElement(By.id("black"));

        green.click(); //doesnt work

        //isEnabled--> returns true if element is enabled or active
        System.out.println("Is green enabled? " + green.isEnabled()); //false
        System.out.println("Is black enabled? " + black.isEnabled()); //true

        Assert.assertFalse(green.isEnabled());
        Assert.assertTrue(black.isEnabled());
        //isEnabled() sometimes doesnt work, use getAttribute

    }

    @Test
    public void disabledTest2() throws InterruptedException {
        Thread.sleep(2000);
        WebElement green = driver.findElement(By.id("green"));
        WebElement black = driver.findElement(By.id("black"));
        System.out.println("black = "+black.getAttribute("disabled")); //null
        System.out.println("green = "+green.getAttribute("disabled"));//true
        //verify that certain value is equal to null
        //varify element is enalbled
        Assert.assertEquals(black.getAttribute("disabled"),null);
        Assert.assertNull(black.getAttribute("disabled"));

        //verify that certain value is equal to True
        //true answer is String not boolean
        Assert.assertEquals(green.getAttribute("disabled"),true);
        //convert String to boolean
        Assert.assertTrue(Boolean.parseBoolean(green.getAttribute("disabled")));



    }
    @Test
    public void testElementVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
WebElement username=driver.findElement(By.id("username"));
WebElement start=driver.findElement(By.id("button"));


    }
}