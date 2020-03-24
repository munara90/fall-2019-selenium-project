package day10_WebElement;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {
    WebDriver driver; // created to prevent for checked exception


    //Whatever is repeating we format them
    //We should have only one driver not 2 otherwise give exception
    @BeforeMethod
    public void beforemethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");


    }
    /*
    go to http://practice.cybertekschool.com/radio_buttons
    click on red
    verify that Blue is not Selected
    red selected

     */
    @Test
    public void test1() {

        WebElement blue = driver.findElement(By.id("blue"));
        //isSelected
        System.out.println(blue.isSelected());//printing not testing

        //verify if button is selected
        Assert.assertTrue(blue.isSelected()); //if passes I get nothing in console
        //when fails lots of red msgs

        WebElement red = driver.findElement(By.id("red"));
        //print red id not selected
        System.out.println(red.isSelected()); //false
        //  System.out.println(!red.isSelected()); //true

        //verifies if the statement false
        Assert.assertFalse(red.isSelected());
    }
        @Test
        public void test2(){
        //above tests doens effect, bc test2() is openning it is own test case, not related to above tests
        //red and blue is not created in class level thats why I used WebElement
        WebElement red=driver.findElement(By.id("red"));
        WebElement blue=driver.findElement(By.id("blue"));
        //driver.manage().timeouts();

        red.click();
        //make sure that blue is not selected
        Assert.assertFalse(blue.isSelected());

            //verify/make sure that red is selected
            Assert.assertTrue(red.isSelected());

    //command+7=>Structure
            // ctrl+space=> to get the version of the browser in pom.xml
            //chrome is faster, if I have problem w browser like
            // =>firefox go t pom.xml and change the version of WebDriver





        }








    @AfterMethod
    public void afterMethod(){
        driver.quit(); //should close when there is no error
    }
}
