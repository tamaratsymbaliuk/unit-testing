package com.neutrinosvs.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        assertEquals(0, sum);

    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum, "Here could be a message");

    }


}
