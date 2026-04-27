package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testCalc() {
        Calculator calc = new Calculator();
        assertEquals(0.15, calc.calculateSumProductRatio(10, 20), 0.001);
    }
}
