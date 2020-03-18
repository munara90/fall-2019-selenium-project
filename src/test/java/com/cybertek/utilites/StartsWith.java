package com.cybertek.utilites;

public class StartsWith {
    public static void startsWith(String actualTitle, String expectedTitle){
        if(actualTitle.startsWith(expectedTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
