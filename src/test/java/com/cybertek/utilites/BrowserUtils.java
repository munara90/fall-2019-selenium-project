package com.cybertek.utilites;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    //method that takes list of web elements
    //retuns list of string
    public  static List<String> getElementsText(List<WebElement>listEl){
        //given a list of web elements, extract the text of the elements into new list of strings
        List<String>listSt=new ArrayList<>();
        for(WebElement element : listEl){
            listSt.add((element.getText()));

        }
        return listSt;


    }
}
