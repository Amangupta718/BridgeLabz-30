package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(2000);
        System.out.println(acc.getBalance());

        acc.deposit(1500);
        System.out.println(acc.getBalance());

        try {
            acc.withdraw(1000);
            System.out.println(acc.getBalance());

            acc.withdraw(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount(2000);
        acc.deposit(1500);
        assertEquals(3500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(500);
        assertEquals(500, acc.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount acc = new BankAccount(5000);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(5100));
    }
}
