package day5_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LinkedText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //example for linked and partial texts


        //identify button1,2, 3...
        //<button class="btn btn-primary" onclick="button1()">Button 1</button>
        //what kind of xpath I use?
        // formula of relative xpath --> //button[@onlick='button1()']-->search fr html search box
        //-->to make sure
        //    --> //button[@onlick='button2()']
        //    --> //button[@onlick='button3()']  '//' means any
        // ----> //* instead of tag name also works
        //----> //* means any
        // //---> button[@*='button3()]




    }
}
