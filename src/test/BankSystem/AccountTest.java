package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    // A simple concrete subclass of Account for testing purposes since Account is abstract
    class TestAccount extends Account {
        public TestAccount(String accountNumber, double balance, String pin) {
            super(accountNumber, balance, pin);
        }
    }

    @BeforeEach
    void setup() {
        account = new TestAccount("123456789", 100.00, "0000");
    }


    @Test
    void getBalance() {
        assertEquals(100.00, account.getBalance());
    }

    @Test
    void getAccountNumber() {
        assertEquals("123456789", account.getAccountNumber());
    }

    @Test
    void getTransactionHistory() {
    }

    @Test
    void addTransaction() {
    }

    @Test
    void verifyPin() {
    }

    @Test
    void changePin() {
    }

    @Test
    void deposit() {
        account.deposit(200.00);
        assertEquals(300.00, account.getBalance());
    }

    @Test
    void withdraw() {
    }

    @Test
    void testToString() {
    }
}