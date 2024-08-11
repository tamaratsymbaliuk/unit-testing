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
        assertTrue(account.verifyPin("0000"));
        account.changePin("0000","1111");
        assertTrue(account.verifyPin("1111"));
        // Test changing PIN with incorrect old PIN
        account.changePin("0000", "2222");
        assertFalse(account.verifyPin("2222"));
    }

    @Test
    void deposit() {
        account.deposit(200.0);
        assertEquals(300.0, account.getBalance());

        // Test depositing a negative amount
        account.deposit(-300.0);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    void withdraw() {
        account.withdraw(20.0);
        assertEquals(80.0, account.getBalance());
        // Test withdrawing an amount greater than the balance
        account.withdraw(100.0);
        assertEquals(80.0, account.getBalance());

        // Test withdrawing a negative amount
        account.withdraw(-10.0);
        assertEquals(80.0, account.getBalance());

    }

    @Test
    void testToString() {
    }
}