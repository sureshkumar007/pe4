package com.stackroute.pe4;

public class CountWords {
    public int counting(String string, char ch) {
        {

            return string.length() - string.replaceAll(String.valueOf(ch), "").length();
        }

//    for(int i=0;i<string.length();i++)
//    {
//        if(string.charAt(i)==ch)
//        {
//    }


    }
}
