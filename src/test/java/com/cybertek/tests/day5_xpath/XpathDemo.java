package day5_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        //go to google
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //open browser
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //WebElement represents element on the page
        //Where the elements come from? from findElement methods
        //how findElement finds elements?
        // using locators

        //locate button 1 and get text
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        String text1=button1.getText();
        System.out.println("text1 = " + text1);


        //locate button 2 and print text
        WebElement button2= driver.findElement(By.xpath("//button[@onclick='button2()']"));
        String text2= button2.getText();
        System.out.println("text2= "+text2);

        //locate button 4 and print text
        WebElement button4=driver.findElement(By.xpath("//button[@onclick='button4()']"));
        String text4=button4.getText();
        System.out.println("text4 = " + text4);


        //locate button 5 and print text
        WebElement button5=driver.findElement(By.xpath("//button[@onclick='button5()']"));
        String text5=button5.getText();
        System.out.println("text5 = " + text5);



        //locate button 6 and print text
        // element.getAttribute("value")  --> method to get text form element, used with input boxes a lot
        // get text of the element
        WebElement button6=driver.findElement(By.xpath("//button[@onclick='button6()']"));
        String valueOf=button6.getAttribute("name");
        System.out.println("valueOf = " + valueOf);
        String text=button6.getText();
        System.out.println("text = " + text);
        
        driver.quit();


        // if none of the works use outer HTML



    }
}
