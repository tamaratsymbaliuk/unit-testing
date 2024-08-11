package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    private SavingsAccount savingsAccount;

    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount("654321",1000.00, 0.05); // 5% interest rate
    }
    @Test
    void applyInterest() {
        savingsAccount.applyInterest();
        // Interest should be 1000.0 * 0.05 = 50.0
        assertEquals(1050.0,savingsAccount.getBalance(),0.01);
    }
    @Test
    void InterestRateInitialization() {
        // Verify that the interest rate is set correctly
        assertEquals(0.05, savingsAccount.getInterestRate());
    }


    @Test
    void testToString() {
        String expected = "SavingsAccount(654321, Balance: 1000.0, InterestRate: 0.05%)";
        assertEquals(expected, savingsAccount.toString());
    }
}