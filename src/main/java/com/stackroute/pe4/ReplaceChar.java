package com.stackroute.pe4;

public class ReplaceChar {
    public String replaceCharWords(String string) {
        if (string != null)
        {
            /*
            Here we are taking the one string and again compare with that string to new string and returning the
            string2
             */

            String string1 = string.replaceAll("d", "f");
            String string2 = string1.replaceAll("l", "t");

            return string2;
        }
        else
            {
            return string = null;
        }
    }
}
