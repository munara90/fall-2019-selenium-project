package com.cybertek.utilites;

public class StringEndsWith {
    public static void endsWith(String actual, String expected){
        if(actual.endsWith(expected)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
