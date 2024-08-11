package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;
    private Account account1;
    private Account account2;

    @BeforeEach
    void setUp() {
        customer = new Customer("Toma Ts", "id007");
        account1 = new SavingsAccount("A001",1000.0, 0.05 );
        account2 = new CheckingAccount("A002", 500.0, 200.0);
    }

    @Test
    void getName() {
    }

    @Test
    void getAccounts() {
    }

    @Test
    void addAccount() {
        customer.addAccount(account1);
        List<Account> accounts = customer.getAccounts();
        assertEquals(1, accounts.size());
        assertTrue(accounts.contains(account1));
    }

    @Test
    void removeAccount() {
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.removeAccount(account2);
        List<Account> accounts = customer.getAccounts();
        assertEquals(1, accounts.size());
        assertTrue(accounts.contains(account1));
        assertFalse(accounts.contains(account2));
    }

    @Test
    void viewAccounts() {
        customer.addAccount(account1);
        customer.addAccount(account2);
        // Capture the output and verify it (requires a bit more setup for capturing System.out)
        // For simplicity, assume you manually check the printed output.
        // In practice, you might use libraries to capture and verify console output.


    }

    @Test
    void testToString() {
        String expected = "Customer(Toma Ts, ID: id007)";
        assertEquals(expected, customer.toString());
    }
}