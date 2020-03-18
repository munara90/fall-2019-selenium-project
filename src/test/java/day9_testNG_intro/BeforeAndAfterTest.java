package day9_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\tBEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\tBefore method");
        //it runs every time
        //it doent run if nothing after this method

    }
    @AfterClass
    public void afterClass(){
        System.out.println("\tAFTER CLASS");
    }

    @AfterMethod //doesn't matter where it will be, but will come after the next method
    public void afterMethod(){
        System.out.println("\tAFTER METHOD");
    }

    @Test
    public void test1(){
        Assert.assertEquals(2, 2);
        System.out.println("this is test one");

    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("this is test two");

    }


}
