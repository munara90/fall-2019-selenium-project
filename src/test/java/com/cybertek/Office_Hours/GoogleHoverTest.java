package com.cybertek.Office_Hours;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");


    }

    @AfterMethod
    public void tearDown() {

        driver.quit(); //should close when there is no error
    }


    @Test
    public void test() {
        driver.get("https://google.com");

    }
}