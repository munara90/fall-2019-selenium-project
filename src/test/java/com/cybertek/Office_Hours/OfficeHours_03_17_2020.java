package com.cybertek.Office_Hours;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHours_03_17_2020 {
    /*
    1. Go to "http://qa3.vytrack.com"
    2. Locate username -> "salesmanager110"
    3. Locate password -> "UserUser123" and submit
    4. click on contacts
    5. create contact
    6. Use map to store information and use it later to enter in UI
    7. tag[@attribute = 'value']
    8. Verify title
    9. create list of contact info in key,value format
     */
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver=WebDriverFactory.getDriver("chrome");
        //1. Go to "http://qa3.vytrack.com"
        driver.get("http://qa3.vytrack.com");
        driver.manage().window().maximize();

       // 2. Locate username -> "salesmanager110"
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        Thread.sleep(2000);

        //3. Locate password -> "UserUser123" and submit
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123", Keys.ENTER);
        Thread.sleep(3000);

        //4. click on contacts
        WebElement contacts=driver.findElement(By.xpath("//span/following-sibling::a"));
        contacts.click();

        // 5. create contact
        Thread.sleep(4000);
        WebElement create_contact = driver.findElement(By.linkText("Create Contact"));
        create_contact.click();
      Thread.sleep(5000);







    }
}
