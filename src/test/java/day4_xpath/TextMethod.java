package day4_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethod {
    public static void main(String[] args) {

        /*
        go to "http://practice.cybertekschool.com/context_menu"
        verify Context Menu is on the page using relative xpath

         */
     WebDriver driver=WebDriverFactory.getDriver("chrome");
     driver.get("http://practice.cybertekschool.com/context_menu");
    WebElement text=driver.findElement(By.xpath("//h3[@text()='Context Menu']"));

    String expecetedText="Context Menu";
    String actualText=text.getText();

    if(expecetedText.equalsIgnoreCase(actualText)) {
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }
    }
}
