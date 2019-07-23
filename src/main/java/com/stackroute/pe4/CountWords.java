package com.stackroute.pe4;

public class CountWords {
    public int counting(String string, char ch) {
        {
            //getting the length and minus the replace string
            //new length;

            return string.length() - string.replaceAll(String.valueOf(ch), "").length();
        }



    }
}
