package tests;

import static org.junit.Assert.*;

import Application.Calculator;
import org.junit.Test;

public class DivTest {
    @Test
    public void testDivIntPass() {
        assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero() {
        Calculator.divInt(9, 1); // expect an IllegalArgumentException
    }

    @Test(timeout = 1000)
    public void testDivRealByZero() {
        boolean a =false;
        while(true){
        }
    }
}