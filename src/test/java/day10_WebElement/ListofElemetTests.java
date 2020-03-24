package day10_WebElement;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListofElemetTests {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {

        driver = WebDriverFactory.getDriver("chrome");


    }

    @AfterMethod
    public void afterMethod() {
       // driver.quit(); //should close when there is no error
    }

    /*
    go to pache radio buttons
    verify none of the sports radio buttons  are selected

     */
    @Test
    public void listOfRadioButtons() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //verify none of the sports radio buttons  are selected
        //find all of them at the sam time using findElements()
        //findElements()--> returns list of element,
        //elements should have same locators, common one
        //WebElement w findElements gives error thats why use List
        //findElements returns list, cant use isSelected
        //findElement returns single item
        //if no match
        Thread.sleep(4000);
        List<WebElement> sports = driver.findElements(By.name("sport"));
        System.out.println(sports.size()); //4, if list is empty means no match
        System.out.println(sports);

        //verify none of the sports radio buttons  are not selected
        //locating all of them in one, not separately
        for (WebElement radioButton : sports) { //we are dealing w element type not list type
            Assert.assertFalse(radioButton.isSelected());

        }


    }
    /*
    go to practice website "http://practice.cybertekschool.com"
    get all the linke in the page
    print their text
     */

    @Test
    public void getAllLink() {
        driver.get("http://practice.cybertekschool.com");
        //get all the link in a page, find command locator
        //g

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //get the text
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        /*
        go to amazon.com
        search for lysol disinfectant
        print the number of results
        print the first result
        print second result
         */
    }

    @Test
    public void amazonTest() {
        driver.get("https://amazon.com");
        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("paper towel" + Keys.ENTER);

        //print the number of results
        //inspect one result
        //find common locator btwn 2 paper towel, if this works rest will work
        //they both have span class should show around 60 results
        List<WebElement> allResults = driver.findElements(By.cssSelector("spane.a-size....."));

        //get the all result
        System.out.println(allResults.size());

        // print the first result
        System.out.println("First result: " + allResults.get(0).getText());

        System.out.println("Second result: " + allResults.get(1).getText());

        //get the last result
        System.out.println("Last result: " + allResults.get(allResults.size() - 1).getText());


    }

    /*
    go to http://practice.cybertekschool.com/radio_buttons
    verify the all sports checkboxes are NOT checked by default
    randomly click any sport
    verify that that sport is clicked
    verify that all others are not clicked
    repeat the last step for 5 times
*/

    @Test
    public void radioButtons() {

            driver.get(" http://practice.cybertekschool.com/radio_buttons");
            List<WebElement> checkBoxes=driver.findElements(By.cssSelector("input[name='sport']"));

        for (WebElement button : checkBoxes) { //we are dealing w element type not list type
            Assert.assertFalse(button.isSelected());

        }
            //randomly click any sport
        WebElement hockey=driver.findElement(By.id("hockey"));
        hockey.click();

        // verify that that sport is clicked and verify that all others are not clicked
        WebElement football =driver.findElement(By.id("hockey"));
        football.click();





        }
    }



