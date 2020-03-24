package day4_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {

    /*
    1. "http://practice.cybertekschool.com/login")
    go to login page and locate username Box with xpath
    locate username Box with relative path and absolute path
    locate password box w xpath
    locate login button w xpath
     */
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input")).sendKeys("muna");



        //locate username Box with relative path and absolute path
        driver.findElement(By.xpath("//input[@name='username']"));

        //locate password box w relative xpath
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("esen");


        // locate login button w xpath
        WebElement button=driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        button.submit();

        driver.close();



    }
}