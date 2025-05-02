package com.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 sollte 5 ergeben");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 sollte 0 ergeben");
        assertEquals(-5, calculator.add(-2, -3), "-2 + -3 sollte -5 ergeben");
    }

    @Test
    void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.sub(2, 3), "2 - 3 sollte -1 ergeben");
        assertEquals(-4, calculator.sub(-2, 2), "-2 - 2 sollte -4 ergeben");
        assertEquals(1, calculator.sub(-2, -3), "-2 - (-3) sollte 1 ergeben");
        System.out.println("Test passed.");
    }
}
