package BankSystem;

public interface AccountOperations {

    double deposit(double amount);
    void withdraw(double amount);
    void changePin(String oldPin, String newPin);

}