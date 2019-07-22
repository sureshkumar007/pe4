package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest
{
    ReplaceChar replaceChar;

    @Before
    public void setUp() throws Exception
    {
        replaceChar=new ReplaceChar();
    }

    @After
    public void tearDown() throws Exception
    {
        replaceChar=null;
    }
    @Test
    public void replaceCheckTest()
    {
        String actual="daily dry";
        String expected="faity fry";
        String string=replaceChar.replaceCharWords(actual);
        assertEquals(expected,string);
    }
    @Test
    public void nullChecker()
    {
        String actual=null;
        String string=replaceChar.replaceCharWords(actual);
        assertNull(actual);
    }
    @Test
    public void changeString()
    {
        String actual="ismart";
        String expected="ismart";
        assertEquals(expected,replaceChar.replaceCharWords(actual));
    }

}