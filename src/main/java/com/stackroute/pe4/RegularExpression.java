package com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression
{
    String str="Is Harry here ? ";
    public String regularCheck(String string)
    {

        //Pattern.matches("Harry",regularCheck(string));

        /*
        here we are checking the whether string return true or false
        SO we are writing function with boolean
        */
        boolean b3 = string.matches(".*Har.y*.");
        return str+b3;
    }
}
