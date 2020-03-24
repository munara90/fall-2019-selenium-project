package day6_css;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 1. using css locator to get id of “Dont click “button, print Don't click!
        //use # and value of id
     WebElement donClickButton=driver.findElement(By.cssSelector("#disappearing_button"));
     System.out.println(donClickButton.getText()); //Don't click!

        // 2.print 'Home' using class value
        //in css i use dot, even if it has a space
     WebElement home=driver.findElement(By.cssSelector(".nav-link"));
     System.out.println(home.getText());//Home



        //3.Locate 'Result' using dot when a class name contains space(s):
        //find class attribute w spaces, print using css w multiple dot ex: class="col-4 col-md-4"
     WebElement result=driver.findElement(By.cssSelector(".col-4.col-md-4"));
     System.out.println(result.getText());//Result:


        //4. find 'Result' by tag name 'h4'
     WebElement result1=driver.findElement(By.cssSelector("h4"));
     System.out.println("result1= "+result1.getText()); //result1= Result:



        //5. if there multi button elements(or any multiple elements with the same name)
        // it will get the 1st one
        //print the text from button element -->'Button 1'
     WebElement button1=driver.findElement(By.cssSelector("button[onclick='button1()']"));
     System.out.println("button1= "+button1.getText()); //button1= Button 1


        //6. in css space indicates skipped child or descendant
        //I can use w or w- skipping in css
       //in CSS: The grater than sign (>) or space ( ) is used for describing relationship.
        //print link "Home" using scc path
     WebElement Home2=driver.findElement(By.cssSelector("html>body>nav>ul a"));
     System.out.println(Home2.getText()); //Home

        // 7.find any 'button' element has attribute 'onclick' w exact value 'button3()' using css
        //css path just like relative xpath, but more simple
        // formula E[A='t]
     WebElement button3=driver.findElement(By.cssSelector("button[onclick='button3()']"));
     System.out.println(button3.getText()); //Button 3


        // 8.CSS --> Locating element with a dynamic ID:  E[A^='t'] --> use ^ for starts with...
        //dynamic values: starts with: button[id^='button_']
        //'button_' --> is fixed part
        //fixed part of the value will be used in css path, not the dynamic part
        //Task 1: locate the element 'button' which id starts with static button_
        //-->and get the text
     WebElement startsWith=driver.findElement(By.cssSelector("button[id^='button_']"));
     System.out.println("starts with= "+startsWith.getText());

        // Task2. locate element div which class starts with 'large'
     WebElement starts=driver.findElement(By.cssSelector("div[class^='large']"));
     System.out.println("Div starts with= "+starts); //no text msg


        // 9. CSS --> Locating element by ends with:  E[A$='t'] --> use $ for ends with
        //print the text -->Button 4
     WebElement endsWith=driver.findElement(By.cssSelector("button[id$='_button']"));
     System.out.println("ends with= "+endsWith.getText()); //ends with= Button 4

        // 10. CSS --> locate by Index: E:nth-of-type(2)
        //Task.1: locate fifth button element(used when there r a lot of button elements)
        //Task.2: get the fourth button element
        WebElement button5=driver.findElement(By.cssSelector("button[onclick='button5()']"));
        System.out.println("button 5 = "+ button5.getText()); //button 5 = Button 5



        //Task.2:get the fourth button element
        WebElement button4=driver.findElement(By.cssSelector("button[onclick='button4()']"));
        System.out.println("button 5 = "+ button4.getText());





        // 11. CSS --> locate the following sibling: ==>   E+*
        // in css find older one then younger E2~E1
        // Task: find 'p' then any 'button' that comes after 'p' and print the text
        WebElement anybutton=driver.findElement(By.cssSelector("p+*"));
        System.out.println("anybutton= "+ anybutton.getText()); //anybutton= Button 1



        driver.close();

    }
}
