package com.deepak.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testwithsumpostives() {
    	App app=new App();
    	int exp=30;
    	int act=app.Sum(10, 20);
        assertEquals(exp, act);
    }
    
    @Test
    public void testwithsumnegtives() {
    	App app=new App();
    	int exp=-30;
    	int act=app.Sum(-10, -20);
        assertEquals(exp, act);
    }
    
    @Test
    public void testwithsummixed() {
    	App app=new App();
    	int exp=-10;
    	int act=app.Sum(10, -20);
        assertEquals(exp, act);
    }
    @Test
    public void testwithsumofZeros() {
    	App app=new App();
    	int exp=0;
    	int act=app.Sum(0, 0);
        assertEquals(exp, act);
    }
}
