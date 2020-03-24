package com.cybertek.Office_Hours;

import com.cybertek.utilites.BrowserUtils;
import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SelectClassPractice {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");



    }

    @AfterMethod
    public void tearDown() {

        driver.quit(); //should close when there is no error
    }
    /*
    go to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable"
    verify that has dropdown with values Family, Friends, Coworkers, Businesses, Contacts
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");

        //verify that has dropdown with values Family, Friends, Coworkers, Businesses, Contacts
        //locate the dropdown first
        //use css or xpath-->select[tabindex='-1']
        Thread.sleep(3000);
        Select categories=new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));

        //option+Enter--> to get the shortcut
        List<WebElement> allOptionsEl = categories.getOptions();
        System.out.println("Number of options: "+allOptionsEl);

        List<String>expectedOptions= Arrays.asList("Family", "Friends", "Coworkers", "Businesses", "Contacts");

        //given a list of web elements, extract the text of the elements into new list of strings
       List<String> allOptionsStr= BrowserUtils.getElementsText(allOptionsEl);

       Assert.assertEquals(allOptionsStr, expectedOptions);


    }
    /*
    go to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable"

     select option coworkers
    verify that Coworkers is now selected

    selected options Contacts
    verify that Contacts selected
     */
    @Test
    public  void test2() throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
        Thread.sleep(2000);
        Select categories=new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        //select option coworkers
        categories.selectByVisibleText("Coworkers");

        //verify that Coworkers is now selected
        String actual=categories.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, "Coworkers");

        //selected options Contacts
        categories.selectByVisibleText("Contacts");
        Thread.sleep(4000);

        //    verify that Contacts selected
        //
        categories=new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
        String actual1 = categories.getFirstSelectedOption().getText();
        Assert.assertEquals(actual1, "Contacts");



    }
    /*
    go to http://practice.cybertekschool.com/dropdown
     */
    @Test
    public void test3(){
        driver.get("http://practice.cybertekschool.com/dropdown");
       Select days=new Select( driver.findElement(By.id("day")));
       List<WebElement> options= days.getOptions();
        System.out.println("Number of options= "+options.size());//31

        //I have a list of web elements , I need to verify if
        //I have to go from WebElement to numbers

        //list of webelement to list of string
        List<String> elementsText = BrowserUtils.getElementsText(options);

        //list of string to lisgt of int
        List<Integer> ints=new ArrayList<>();
        for(String string : elementsText){
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);

        //verify list of ints is sorted
        //get Marufjon's code


    }





    }

