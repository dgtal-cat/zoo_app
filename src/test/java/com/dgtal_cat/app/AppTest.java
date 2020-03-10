package com.dgtal_cat.app;

import static org.junit.Assert.assertEquals;
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
        double max = 0.6;
        double min = 0.2;
        double i = minChecker.checkMin(max, min);
        assertEquals("The result is not min!", min, i, 0.0);
    }
}
