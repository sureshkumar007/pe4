package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest
{
    ReverseWords reverseWords;

    @Before
    public void setUp() throws Exception {
        reverseWords=new ReverseWords();
    }

    @After
    public void tearDown() throws Exception {
        reverseWords=null;
    }
    @Test
    public void checkReverse()
    {
        String string="a boy story";
        String expected="a yob yrots";
        assertEquals(expected,reverseWords.reverseSting(string));

    }
    @Test
    public void CheckNull()
    {
        assertNull("null check",reverseWords.reverseSting(null));
    }
}