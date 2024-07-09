package com.neutrinosvs.exercises;

import com.neutrinosvs.exercieses.Ex1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {
    @Test
    public void testToUpperCaseLetter() {
       String result = Ex1.everyOtherUpperCase("cat");
       assertEquals("cAt", result,"Should return every other upper case");
    }

    @Test
    public void testEmptyString() {
        String result = Ex1.everyOtherUpperCase("");
        assertEquals("", result,"Empty string should return empty string ");
    }

}

