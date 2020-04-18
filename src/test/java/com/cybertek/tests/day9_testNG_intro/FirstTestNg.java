package day9_testNG_intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test; //import that we need

public class FirstTestNg {
    @Test  // w- @Test we cant run, it is like main method
    public void test1(){ //unit test
        System.out.println("test one");
    }
    @Ignore // to ignore the below code, doesn't run
    @Test
    public void test2(){
        System.out.println("test two");
    }
    @Test
    public void test3(){
        System.out.println("test three");
    }


}
