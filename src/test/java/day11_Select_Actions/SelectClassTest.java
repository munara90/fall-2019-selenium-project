package day11_Select_Actions;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClassTest {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


    }

    @AfterMethod
    public void afterMethod() {
        driver.quit(); //should close when there is no error
    }
 @Test
    public void getSelectOption(){
        /*
        1. find the element that has select tag
         */
     WebElement dropdown=driver.findElement(By.id("dropdown"));

     //locate a Select class using web element
     Select dropdownList=new Select(dropdown); //pass as constructor

     //get the selected option
    WebElement selectedOptions= dropdownList.getFirstSelectedOption();

    //verify
     Assert.assertEquals(selectedOptions.getText(), "Please select an option");




 }
 @Test
    public void selectFromList() throws InterruptedException {
        WebElement dropdown=driver.findElement(By.id("state"));
        Select states=new Select(dropdown);

        //selecting one at a time
        states.selectByVisibleText("Iowa");
        Thread.sleep(1000);

     states.selectByVisibleText("New York");
     Thread.sleep(1000);

     states.selectByVisibleText("Pennsylvania");
     Thread.sleep(1000);

     //TODO selectByIndex -->
     states.selectByIndex(0);
     Thread.sleep(2000);

     states.selectByIndex(10);
     Thread.sleep(2000);

     states.selectByIndex(40);


     //TODO  selectByValue()-->
     states.selectByValue("VA"); //Value is always abbreviation
     Thread.sleep(2000);
     states.selectByValue("SC");
     Thread.sleep(2000);
     states.selectByValue("CO");
     Thread.sleep(2000);

 }
 @Test
    public void getAllAvailableOptions(){
        Select monthList=new Select(driver.findElement(By.id("month")));
        //print the current selection
     System.out.println(monthList.getFirstSelectedOption().getText());




 }

}
