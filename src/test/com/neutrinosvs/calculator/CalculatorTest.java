package com.neutrinosvs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    public void canAddZeroPlusZero() {
        Calculator calc = new Calculator();
        int sum = calc.add(0, 0);
        assertEquals(0, sum);

    }

}
