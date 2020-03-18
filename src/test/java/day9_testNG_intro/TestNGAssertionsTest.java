package day9_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    @Test
    public void test1(){
        String expected="one";
        String actual="one";

        Assert.assertEquals(actual, expected);//prints nothing
        //when it prints nothing means pass
        //basically it is if else

        //verify 1 equal 2
        //verify true equal true
        Assert.assertEquals(1, 2);
        Assert.assertEquals(true, true);
        System.out.println("test1 complete");

    }
    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";
        System.out.println("Starting to compare");

        Assert.assertEquals(actual, expected); //fail
        System.out.println("test2 complete"); //ignored, bc above is failed

    }
    @Test
    public void test3(){
        //verify not equal
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected, actual);
        Assert.assertNotEquals(1,2); //passes
        //it passes if not equals
    }
    @Test
    public void test4(){
        String expected = "one";
        String actual = "one";
        Assert.assertTrue(expected.equals(actual));//true
        //assertTrue similar to assertEquals

        int e = 100;
        int a = 200;
        Assert.assertTrue(a>e);//true->passes
        //pass-->prints nothing


    }
    @Test
    public  void Test5(){
        //verify that url is equal to google.com

        String expected="";
    }
}
