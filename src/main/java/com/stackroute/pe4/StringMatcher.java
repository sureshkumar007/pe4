package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher
{
    public String matching(String inputString,String givenString)
    {
        //string buffer is immutable so we are using string buffer...

        StringBuffer stringBuffer=new StringBuffer();
        //CASE_INSENSITIVE purpose is to ignore whether the string is upper or lower
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        //Matcher is a class and we are trying to match with pattern
        Matcher matcher=pattern.matcher(inputString);
        //we are checking whether the string is found or not....?
        while (matcher.find()){
            System.out.println(stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n"));
        }
        //returning the string and trimming it.......
        return stringBuffer.toString().trim();
    }
}
