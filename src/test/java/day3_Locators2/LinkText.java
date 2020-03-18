package day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
         /*
        Locator link--> another way to locate element
        <a> a tag
        partialLinkText-->
        //ID, name, tagname, class , linkText
        //Locator --> LinkText
        //<a>  a tag is link . in this situation, we will use linkText locator
        //to locate the element

         */

         /* Task 1.
        1. Go to "http://practice.cybertekschool.com/dynamic_loading"
        2. Locate Example 3 by linkText(), provide whole text as a String
        3. Assign it to String and print, use getText()
        -> Always convert to String text and print
        */

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("http://practice.cybertekschool.com/dynamic_loading");

       WebElement exampl3=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
       String examp=exampl3.getText();
        System.out.println(examp);

        WebElement exampl4=driver.findElement(By.partialLinkText("Example 4"));
        String exam4=exampl4.getText();
        System.out.println(exam4);

        WebElement homeLink=driver.findElement(By.linkText("Home"));
        String strLink=homeLink.getText();
        System.out.println(strLink);

driver.close();





    }
}
