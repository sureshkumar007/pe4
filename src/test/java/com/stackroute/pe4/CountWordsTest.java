package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordsTest
{
    CountWords countWords;
    @Before
    public void setUp() throws Exception {
        countWords=new CountWords();
    }

    @After
    public void tearDown() throws Exception {
        countWords=null;
    }
    @Test
    public void CountWordsTest()
    {
        assertEquals("count the 'a' words",2,countWords.counting("java is",'a'));
    }
    @Test
    public void setCountWords()
    {
        String str="a boy story";
        assertNotEquals("count the char of 'a",2,countWords.counting(str,'a'));
    }
}