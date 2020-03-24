package com.cybertek.utilites;

public class StringEquals {
    public static void verifyEquals(String actual, String expected){
        if(actual.equalsIgnoreCase(expected)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
