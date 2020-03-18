package com.cybertek.utilites;

public class StringEquals {
    public static void verifyEquals(String expected, String actual){
        if(expected.equalsIgnoreCase(actual)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
