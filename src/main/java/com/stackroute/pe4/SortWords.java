package com.stackroute.pe4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class SortWords
{
    public List<String> sort(String inputString) {

        if (inputString.length() == 0) {
            return Collections.singletonList("Text is empty");
        }

        if (inputString.matches("[0-9]*")) {
            return Collections.singletonList("Text contains digits");
        }

        ArrayList<String> output = new ArrayList<String>(Arrays.asList(inputString.split(" ")));
        Collections.sort(output);
        return output;

    }
    }