package com.stackroute.pe4;
/*
here we are changing the each word to reverse
 */

public class ReverseWords {
    public String reverseSting(String string) {
        if (string != null) {
            String[] words = string.split(" ");

            String word = "";
            //String reverse="";
            for (int i = 0; i < words.length; i++) {
                String reverse = "";
                String getWords = words[i];

                for (int j = getWords.length() - 1; j >= 0; j--) {
                    reverse = reverse + getWords.charAt(j);


                }
                //here we are adding the space to the word................
                word = word + reverse + " ";

            }
            return word.trim();
        } else {
            return null;
        }

    }
}
