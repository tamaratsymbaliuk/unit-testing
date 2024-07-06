package com.neutrinosvs.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        // before each test runs our Junit calls this method so we don't do GuessingGame game = new  GuessingGame(); in each class
        game = new  GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it", message);

    }
    @Test
    public void testOneNegWrongGuessSituation() {
        String message = game.guess(-5);
        assertEquals("You didn't get it", message);

    }
    @Test
    public void testOneWrongPosGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it", message);

    }
    @RepeatedTest(5)
    public void testRandomNumberGeneration() {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 0 1 0 1 1 1 0 1  1 = 10
        int[] rndNumCount = new int[11];
        for (int i = 0; i < 60; i++) {
            GuessingGame game = new GuessingGame();
            int randomNum = game.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += rndNumCount[i];
        }

        assertEquals(10, sum);

    }
}
