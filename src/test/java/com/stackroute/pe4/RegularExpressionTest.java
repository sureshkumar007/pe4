package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    RegularExpression regularExpression;
    @Before
    public void setUp() throws Exception {
        this.regularExpression=new RegularExpression();
    }

    @After
    public void tearDown() throws Exception {
        regularExpression=null;
    }
    @Test
    public void setRegularExpressionTo()
    {
        //assertEquals("Is Harry here ? true",regularExpression.regularCheck("This is Harry."));
        assertEquals("Is Harry here ? true",regularExpression.regularCheck("This is Harry."));
    }
    @Test
    public void setRegularExpression()
    {
        assertNotEquals("Is Harry here ? false",regularExpression.regularCheck("This is Harry."));
    }
}