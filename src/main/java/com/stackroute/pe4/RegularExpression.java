package com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression
{
    String str="Is Harry here ? ";
    public String regularCheck(String string)
    {

        //Pattern.matches("Harry",regularCheck(string));
        boolean b3 = string.matches(".*Har.y*.");
        return str+b3;
    }
}
