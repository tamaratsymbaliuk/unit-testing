package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    private CheckingAccount checkingAccount;
    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount("123456",100.0,50.0);
    }

    @Test
    void withdrawWithinBalance() {
        checkingAccount.withdraw(50.0);
        assertEquals(50.0, checkingAccount.getBalance());
    }
    @Test
    void withdrawExceedsOverdraftLimit() {
        checkingAccount.withdraw(120.0); // Overdraft by 20
        assertEquals(100.0, checkingAccount.getBalance());

    }
    @Test
    void withdrawNegativeAmount() {
        checkingAccount.withdraw(-20);
        assertEquals(100.0, checkingAccount.getBalance());
    }

    @Test
    void testToString() {
        String expected = "CheckingAccount(123456, Balance: 100.0, OverdraftLimit: 50.0)";
        assertEquals(expected, checkingAccount.toString());
    }
}