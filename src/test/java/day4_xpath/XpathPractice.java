package day4_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
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

    WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
    username.sendKeys("muna@gmail.com");
        Thread.sleep(2000);
    WebElement passwordBox=driver.findElement(By.xpath("//input[@name=\"password\"]"));
    passwordBox.sendKeys("konkow");
        Thread.sleep(2000);
    WebElement loginBttn=driver.findElement(By.xpath("//button[@id=\"wooden_spoon\"]"));
    loginBttn.click();

    }
}