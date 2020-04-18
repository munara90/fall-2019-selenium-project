package day10_WebElement;

import base.TestBase;
import com.cybertek.utilites.ConfigurationReader;
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
import java.util.Random;

public class ListofElemetTests extends TestBase {

    /*
    go to pache radio buttons
    verify none of the sports radio buttons  are selected

     */

    @Test
    public void listOfRadioButtons() throws InterruptedException {
        String url= ConfigurationReader.getProperty("url");
        driver.get(url);

        //verify none of the sports radio buttons  are selected
        //find all of them at the same time using findElements()
        //findElements()--> returns list of element,
        //elements should have same locators, common one
        //WebElement w findElements gives error thats why use List
        //findElements returns list, cant use isSelected
        //findElement returns single item
        //if no match

        //   driver.findElements --> returns a LIST of element
        // returns all the elements that match the given locator
        // if the locator does not match any thing, it does not throw exception, it just returns empty list

       List< WebElement> sports=driver.findElements(By.name("sport"));
        for (int i = 0; i < sports.size(); i++) {
            Assert.assertFalse(sports.get(i).isSelected());

            System.out.println("is any button selected? = " + sports.get(i).isSelected());

        }

        //verify none of the sports radio buttons  are not selected
        //locating all of them in one, not separately


    }

    /*
    go to practice website "http://practice.cybertekschool.com"
    get all the link in the page
    print their text
     */

    @Test
    public void getAllLink() {
         //get all the link in a page, find command locator
        String url= ConfigurationReader.getProperty("url");
        driver.get(url);
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());//50

        //get the text of each link and print
        for (WebElement element : list) {
            System.out.println(element.getText());
        }




        /*
        go to amazon.com
        search for lysol disinfectant
        print the number of results
        print the first result
        print second result
        print the last result
         */
    }

    @Test
    public void amazonTest() {


        //print the number of results
        //inspect one result
        //find common locator btwn 2 paper towel, if this works rest will work
        //they both have span class should show around 60 results

        //get the all result


        // print the first result

        //get the last result


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
    public void radioTest() throws InterruptedException {

    }


}



