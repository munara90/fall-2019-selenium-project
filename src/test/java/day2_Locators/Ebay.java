package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) throws Exception {
        /*
        Go to amazon "https://www.amazon.com/"
         Then Go to Ebay   https://www.ebay.com/
         In order to search item, we have to locate it 1st fr HTML
        Enter a search term
        Click on search button
        Verify title contains search(whatever item I am searching) term

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.ebay.com/");

        WebElement searchBox=driver.findElement(By.name("_nkw"));
        searchBox.sendKeys("vitamin C");
        Thread.sleep(2000);

        WebElement searchBttn=driver.findElement(By.id("gh-btn"));
        searchBttn.click();
        Thread.sleep(4000);

        String expectedTitle="vitamin C";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected title was = "+ expectedTitle);
            System.out.println("Actual title is = "+ actualTitle);
        }

    driver.close();



    }
}
