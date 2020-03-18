package com.cybertek.utilites;

public class StringContains {
    public static void verifyContains(String expected, String actual){
        if(actual.contains(expected)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
