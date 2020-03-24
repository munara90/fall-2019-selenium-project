package com.cybertek.Office_Hours;

import com.cybertek.utilites.StringEquals;
import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

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
      //  driver.manage().window().maximize();

       // 2. Locate username -> "salesmanager110"
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        Thread.sleep(2000);

        //3. Locate password -> "UserUser123" and submit
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123", Keys.ENTER);
        Thread.sleep(3000);

        //4. click on contacts
        WebElement contacts=driver.findElement(By.xpath("//span[.='Contacts']/following-sibling::a"));
        contacts.click();

        // 5. create contact
        Thread.sleep(4000);
        WebElement create_contact = driver.findElement(By.linkText("Create Contact"));
        create_contact.click();
      Thread.sleep(5000);

      //8. Verify title
      String currentTitle = driver.getTitle();
      String expectedTitle="Create Contact - Contacts - Customers";
      StringEquals.verifyEquals(currentTitle, expectedTitle);


      Thread.sleep(1000);
      // 9. create list of contact info in key,value format
      HashMap<String,String> contact1= new HashMap<>();
      contact1.put("First Name","John");
      contact1.put("Last Name ","Smith");
      contact1.put("Phone","571-236-4545");
      contact1.put("Street","400 Main Street");
      contact1.put("City","Tysons");
      contact1.put("State","VA");
      contact1.put("ZipCode","22102");
      contact1.put("Sales Group","true");
      contact1.put("Country","United States");

      System.out.println("contact 1: " + contact1);

      WebElement first_name = driver.findElement(By.xpath("(//input[@data-name = 'field__first-name'])[1]"));
      WebElement last_name = driver.findElement(By.xpath("(//input[@data-name = 'field__last-name'])[1]"));
      WebElement phone = driver.findElement(By.name("oro_contact_form[phones][0][phone]"));
      WebElement street = driver.findElement(By.name("oro_contact_form[addresses][0][street]"));
      WebElement city = driver.findElement(By.name("oro_contact_form[addresses][0][city]"));
      WebElement state = driver.findElement(By.xpath("//input[@data-name = 'field__region-text']"));
      WebElement zipCode = driver.findElement(By.name("oro_contact_form[addresses][0][postalCode]"));
      WebElement salesGroup = driver.findElement(By.xpath("(//input[@data-name = 'field__1'])[2]"));
      first_name.sendKeys(contact1.get("First Name"));
      last_name.sendKeys(contact1.get("Last Name"));
      phone.sendKeys(contact1.get("Phone"));
      street.sendKeys(contact1.get("Street"));
      city.sendKeys(contact1.get("City"));
      state.sendKeys(contact1.get("State"));
      zipCode.sendKeys(contact1.get("Zip Code"));
        /*
            To handle dropdowns in selenium we are using Select class
            to use it we have to ensure we have <select></select> tag in our dropdown
            to create Select class we are using webelement of <select></select> element from html (we need to locate our
            dropdown which should have select tag)
         */
      WebElement country = driver.findElement(By.name("oro_contact_form[addresses][0][country]"));
      Select country_dropdwn = new Select(country); //this is special class in selenium to handle dropdowns
        /*
        it has different methods that help us interact with dropdown
         */
      country_dropdwn.selectByVisibleText(contact1.get("Country"));
      if (contact1.get("Sales Group").equalsIgnoreCase("true")){
        salesGroup.click();
      }


      driver.close();


    }
}
