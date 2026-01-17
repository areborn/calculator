package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Calculator test.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}

