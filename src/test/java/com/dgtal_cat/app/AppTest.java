package com.dgtal_cat.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkMinTest()
    {
        double min = 0.2;
        double max = 0.6;
        double i = minChecker.checkMin(max, min);
        assertTrue("The result is not min!", min <= i );
    }
}
