package tests;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import Application.Calculator;

public class AddSubTest {
    @Test
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        Assert.assertEquals("error in add()",  3, Calculator.add(1, 2));
        Assert.assertEquals("error in add()", -3, Calculator.add(-1, -2));
        Assert.assertEquals("error in add()",  9, Calculator.add(9, 0));
    }

    @Test
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        Assert.assertNotEquals("error in add()", 0, Calculator.add(1, 2));
    }

    @Test
    public void testSubPass() {
        assertEquals("error in sub()",  0, Calculator.sub(2, 2));
    }
}