package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        account.deposit(50.0);
        account.withdraw(20.0);
        List<String> history = account.getTransactionHistory();

        assertEquals(2, history.size());
        assertTrue(history.contains("Deposited 50.0. New balance: 150.0"));
        assertTrue(history.contains("Withdrew 20.0. New balance: 130.0"));
    }

    @Test
    void addTransaction() {
        account.addTransaction("Test transaction");
        assertEquals(1,account.getTransactionHistory().size());
        assertEquals("Test transaction", account.getTransactionHistory().get(0));
    }

    @Test
    void verifyPin() {
        // Test correct PIN
        assertTrue(account.verifyPin("0000"));
        // Test incorrect PIN
        assertFalse(account.verifyPin("2222"));
        // Test null PIN
        assertFalse(account.verifyPin(null));
        // Test PIN when account PIN is not set (null)
        Account accountWithoutPin = new TestAccount("654321", 100.0, null);
        assertFalse(accountWithoutPin.verifyPin("0000"));
        assertFalse(accountWithoutPin.verifyPin(null));

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
        assertEquals("Account(123456789, Balance: 100.0)", account.toString());
    }
}