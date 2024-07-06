package com.neutrinosvs.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach //multiple instances for each method; this method get called every time before each method
    void setUp() {
        calc = new Calculator();
    }

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
    @Test()
    @Disabled
    public void canAddMaxInputPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1); // 2147483647
        System.out.println(sum);
        assertEquals(Integer.MAX_VALUE + 1L, sum, "INT can only hold 32 bits");

    }
    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, ".06", 1);
        assertEquals("$184,664.43",answer);
    }
    @Test
    public void annuityPractice2() {
        String answer = calc.calcAnnuity("1200", 10, ".08", 4);
        assertEquals("$72,482.38",answer);
    }
    

}
