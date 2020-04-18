package day3_Locators2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        /*
            create object fr faker class
            I need first name
             */
    Faker fakeData=new Faker();
    String name=fakeData.name().firstName();
        System.out.println(name); //I will have random names everytime I run


    }

}
